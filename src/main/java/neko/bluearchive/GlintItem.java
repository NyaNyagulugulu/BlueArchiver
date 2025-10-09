package neko.bluearchive;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.text.Style;
import net.minecraft.util.Formatting;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

import java.util.*;

public class GlintItem extends Item {

    // 📌 用于延迟触发飞行效果
    private static final Map<UUID, Integer> levitationQueue = new HashMap<>();

    // 📌 玩家冷却记录，单位 tick（20 tick = 1 秒）
    private static final Map<UUID, Integer> cooldownMap = new HashMap<>();
    private static final int COOLDOWN_TICKS = 20 * 30; // 30 秒

    public GlintItem(Settings settings) {
        super(settings);
    }

    /**
     * 每 tick 被服务器调用：处理飞天和冷却倒计时
     */
    public static void tickServer(net.minecraft.server.MinecraftServer server) {
        // 🚀 处理延迟飞天队列
        Iterator<Map.Entry<UUID, Integer>> iterator = levitationQueue.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<UUID, Integer> entry = iterator.next();
            UUID uuid = entry.getKey();
            int ticksLeft = entry.getValue() - 1;

            if (ticksLeft <= 0) {
                ServerPlayerEntity player = server.getPlayerManager().getPlayer(uuid);
                if (player != null) {
                    // 🧠 如果佩戴的是优香的光环，就不飞
                    if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() == Bluearchive.YUUKA_HALO) {
                        player.sendMessage(Text.literal("§7优香：§c让你感受一下来自100kg的负重感"), false);
                    } else {
                        player.addStatusEffect(new StatusEffectInstance(StatusEffects.LEVITATION, 30, 6000)); // 飞升
                    }
                }
                iterator.remove(); // 移除已执行的玩家
            } else {
                entry.setValue(ticksLeft); // 倒计时 -1
            }
        }

        // ⏳ 冷却时间 -1 tick
        cooldownMap.replaceAll((uuid, ticks) -> Math.max(0, ticks - 1));
    }

    /**
     * 玩家右键使用物品触发
     */
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity user, Hand hand) {
        UUID uuid = user.getUuid();
        int remaining = cooldownMap.getOrDefault(uuid, 0); // 读取剩余冷却

        if (!world.isClient) {
            // 🔐 服务端：处理冷却检查、药水效果、飞天、冷却启动
            if (remaining > 0) {
                int secondsLeft = (int) Math.ceil(remaining / 20.0);
                user.sendMessage(Text.literal("§7爱丽丝： §c爱丽丝错了求求你不要盒爱丽丝（冷却还有 " + secondsLeft + " 秒）"), true);
                return TypedActionResult.fail(user.getStackInHand(hand));
            }

            // 添加药水状态：缓慢 + 失明
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 40, 1000)); // 2秒缓慢
            user.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 40, 2)); // 2秒失明

            // 35 tick 后触发漂浮效果
            levitationQueue.put(uuid, 35);

            // 启动服务端冷却
            cooldownMap.put(uuid, COOLDOWN_TICKS);
        } else {
            // 🎮 客户端：处理视觉、标题、音效

            if (remaining > 0) {
                return TypedActionResult.fail(user.getStackInHand(hand)); // 冷却中，阻止盒事件
            }

            MinecraftClient client = MinecraftClient.getInstance();

            // 播放音效（注意音效已在主类中注册）
            client.player.playSound(Bluearchive.BOX_SOUND, 1.0F, 1.0F);

            // 设置客户端冷却动画，防止再次点击
            client.player.getItemCooldownManager().set(this, 600); // 30 秒动画

            // 显示主标题 “我超，盒”
            client.inGameHud.setTitle(
                    Text.literal("我超，盒").copy().setStyle(Style.EMPTY.withColor(Formatting.BLUE).withBold(true))
            );
            client.inGameHud.setTitleTicks(10, 60, 10);

            // 延迟 2 秒显示副标题 “装逼我让你飞起来！”
            new Thread(() -> {
                try {
                    Thread.sleep(2000); // 等待 2 秒（建议 1~2s 以内）
                } catch (InterruptedException ignored) {}

                client.execute(() -> {
                    client.inGameHud.setTitle(
                            Text.literal("装逼我让你飞起来！")
                                    .copy().setStyle(Style.EMPTY.withColor(Formatting.AQUA).withBold(true))
                    );
                    client.inGameHud.setTitleTicks(10, 60, 10);
                });
            }).start();
        }

        return TypedActionResult.success(user.getStackInHand(hand), world.isClient);
    }

    /**
     * 是否拥有附魔光效
     */
    @Override
    public boolean hasGlint(ItemStack stack) {
        return true;
    }

    // 自定义物品名称显示
    @Override
    public Text getName(ItemStack stack) {
        return Text.literal("§d§l爱丽丝的身份证")
                .copy().setStyle(Style.EMPTY.withColor(Formatting.BLUE).withBold(true));
    }
}
