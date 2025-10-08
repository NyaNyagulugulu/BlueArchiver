package neko.bluearchive.item;

import neko.bluearchive.Bluearchive;
import neko.bluearchive.client.renderer.MomoiHaloRenderer;
import net.minecraft.block.Block;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.explosion.Explosion;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.client.GeoRenderProvider;
import software.bernie.geckolib.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.animation.AnimatableManager;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.UUID;
import java.util.function.Consumer;

public class HomoiHaloItem extends ArmorItem implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    
    // 存储最近一次落地时间，防止重复触发
    private static final java.util.Map<java.util.UUID, Long> lastLandedTime = new java.util.HashMap<>();
    
    public HomoiHaloItem(RegistryEntry<ArmorMaterial> material, ArmorItem.Type type, Item.Settings settings) {
        super(material, type, settings);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {

    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }

    @Override
    public void createGeoRenderer(Consumer<GeoRenderProvider> consumer) {
        consumer.accept(new GeoRenderProvider() {
            private GeoArmorRenderer<HomoiHaloItem> renderer;

            @Override
            public <T extends LivingEntity> @NotNull BipedEntityModel<?> getGeoArmorRenderer(@Nullable T livingEntity, ItemStack itemStack, @Nullable EquipmentSlot equipmentSlot, @Nullable BipedEntityModel<T> original) {
                if(this.renderer == null) // Important that we do this. If we just instantiate  it directly in the field it can cause incompatibilities with some mods.
                    this.renderer = new MomoiHaloRenderer();

                return this.renderer;
            }
        });
    }
    
    /**
     * 检查玩家是否佩戴邮箱光环并处理落地爆炸效果
     */
    public static void onPlayerLanded(PlayerEntity player) {
        if (player.getWorld().isClient) {
            return; // 只在服务端处理
        }
        
        // 检查是否佩戴邮箱光环（Yuuka Halo）
        if (player.getEquippedStack(EquipmentSlot.HEAD).getItem() != Bluearchive.YUUKA_HALO) {
            return;
        }
        
        UUID playerId = player.getUuid();
        long currentTime = System.currentTimeMillis();
        
        // 防止短时间内重复触发（1秒冷却）
        if (lastLandedTime.containsKey(playerId) && currentTime - lastLandedTime.get(playerId) < 1000) {
            return;
        }
        
        lastLandedTime.put(playerId, currentTime);
        
        ServerWorld world = (ServerWorld) player.getWorld();
        BlockPos playerPos = player.getBlockPos();
        BlockPos feetPos = playerPos.down();
        
        // 获取脚下方块
        Block blockBelow = world.getBlockState(feetPos).getBlock();
        
        // 根据方块硬度计算爆炸半径
        float blockHardness = blockBelow.getHardness();
        float explosionPower;
        
        if (blockHardness < 0) {
            // 不可破坏方块（基岩、命令方块等）
            explosionPower = 5.0f;
        } else if (blockHardness <= 0.5f) {
            // 软方块（草、泥土、沙子等）
            explosionPower = 2.0f;
        } else if (blockHardness <= 2.0f) {
            // 中等硬度方块（石头、木头、矿石等）
            explosionPower = 3.0f;
        } else if (blockHardness <= 5.0f) {
            // 硬方块（铁块、钻石块等）
            explosionPower = 4.0f;
        } else {
            // 非常硬的方块
            explosionPower = 5.0f;
        }
        
        // 播放爆炸音效
        world.playSound(null, playerPos, SoundEvents.ENTITY_GENERIC_EXPLODE.value(), SoundCategory.BLOCKS, 1.0f, 1.0f);
        
        // 直接使用世界爆炸方法，不伤害实体
        world.createExplosion(player, player.getX(), player.getY(), player.getZ(), explosionPower, null);
    }
}
