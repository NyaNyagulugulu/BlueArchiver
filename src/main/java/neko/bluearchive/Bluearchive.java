package neko.bluearchive;

import neko.bluearchive.item.*;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Rarity;

import java.util.UUID;

public class Bluearchive implements ModInitializer, ClientModInitializer {
    public static final String MOD_ID = "bluearchive";

    // 爱丽丝的身份证
    public static final Item ALS = new GlintItem(new Item.Settings());

    // 青辉石
    public static final Item QINGHUISHI = new Item(new Item.Settings());

    // 白子的光环
    public static final Item SHIROKO_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "shiroko_halo"),
            new ShirokoHaloItem(BAMaterials.SHIROKO_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 邮箱的光环
    public static final Item YUUKA_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "yuuka_halo"),
            new YuukaHaloItem(BAMaterials.YUUKA_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 爱丽丝的光环
    public static final Item ALICE_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "alice_halo"),
            new AliceHaloItem(BAMaterials.ALICE_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 日奈的光环
    public static final Item HINA_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "hina_halo"),
            new HinaHaloItem(BAMaterials.HINA_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 阿露的光环
    public static final Item ARU_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "aru_halo"),
            new AruHaloItem(BAMaterials.ARU_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 初音的光环
    public static final Item MIKU_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "miku_halo"),
            new MikuHaloItem(BAMaterials.MIKU_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 泉奈的光环
    public static final Item IZUNA_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "izuna_halo"),
            new IzunaHaloItem(BAMaterials.IZUNA_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 小春的光环
    public static final Item KOHARU_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "koharu_halo"),
            new KoharuHaloItem(BAMaterials.KOHARU_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 莲望的光环
    public static final Item HASUMI_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "hasumi_halo"),
            new HasumiHaloItem(BAMaterials.HASUMI_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 梓的光环
    public static final Item AZUSA_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "azusa_halo"),
            new AzusaHaloItem(BAMaterials.AZUSA_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 日富美的光环
    public static final Item HIFUMI_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "hifumi_halo"),
            new HifumiHaloItem(BAMaterials.HIFUMI_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 小绿的光环
    public static final Item MIDORI_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "midori_halo"),
            new MidoriHaloItem(BAMaterials.MIDORI_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 小桃的光环
    public static final Item MOMOI_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "momoi_halo"),
            new HomoiHaloItem(BAMaterials.MOMOI_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 未花的光环
    public static final Item MIKA_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "mika_halo"),
            new MikaHaloItem(BAMaterials.MIKA_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 伊吕波的光环
    public static final Item IROHA_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "iroha_halo"),
            new IrohaHaloItem(BAMaterials.IROHA_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 诺亚的光环
    public static final Item NOA_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "noa_halo"),
            new NoaHaloItem(BAMaterials.NOA_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 花子的光环
    public static final Item HANAKO_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "hanako_halo"),
            new HanakoHaloItem(BAMaterials.HANAKO_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 玛丽的光环
    public static final Item MARI_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "mari_halo"),
            new MariHaloItem(BAMaterials.MARI_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );

    // 星野的光环hoshino
    public static final Item HOSHION_HALO = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "hoshino_halo"),
            new HomoiHaloItem(BAMaterials.HOSHION_HALO, ArmorItem.Type.HELMET, new Item.Settings())
    );


    // 准备出发唱片
    public static final Item BLUEARCHIVER_DISC = Registry.register(
            Registries.ITEM,
            Identifier.of(MOD_ID, "bluearchiver_disc"),
            new Item(new Item.Settings().maxCount(1).rarity(Rarity.RARE).jukeboxPlayable(BASounds.BLUEARCHIVER_MUSIC_SONG))
    );

    // 创造物品组
    public static final ItemGroup ITEM_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(MOD_ID, "general"),
            net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup.builder()
                    .displayName(Text.translatable("itemGroup.bluearchive.general"))
                    .icon(() -> new ItemStack(ALS))
                    .entries((context, entries) -> {
                        // 光环类
                        entries.add(SHIROKO_HALO);   // 白子的光环
                        entries.add(ALICE_HALO);     // 爱丽丝的光环
                        entries.add(HINA_HALO);      // 日奈丝的光环
                        entries.add(ARU_HALO);       // 阿露的光环
                        entries.add(MIKU_HALO);      // 初音的光环
                        entries.add(IZUNA_HALO);     // 泉奈的光环
                        entries.add(KOHARU_HALO);    // 小春的光环
                        entries.add(HASUMI_HALO);    // 莲望的光环
                        entries.add(AZUSA_HALO);     // 梓的光环
                        entries.add(HIFUMI_HALO);    // 日富美的光环
                        entries.add(MIDORI_HALO);    // 小绿的光环
                        entries.add(MOMOI_HALO);     // 小桃的光环
                        entries.add(MIKA_HALO);      // 未花的光环
                        entries.add(IROHA_HALO);     // 伊吕波的光环
                        entries.add(NOA_HALO);       // 诺亚的光环
                        entries.add(HANAKO_HALO);    // 花子的光环
                        entries.add(MARI_HALO);      // 玛丽的光环
                        entries.add(YUUKA_HALO);     // 邮箱的光环
                        entries.add(HOSHION_HALO);   // 星野的光环
                        // 物品类
                        entries.add(ALS);            // 爱丽丝的身份证
                        entries.add(QINGHUISHI);     // 青辉石
                        // 唱片类
                        entries.add(BLUEARCHIVER_DISC); // 准备出发唱片
                    })
                    .build()
    );

    public static final Identifier BOX_SOUND_ID = Identifier.of(MOD_ID, "item.box");
    public static final SoundEvent BOX_SOUND = SoundEvent.of(BOX_SOUND_ID);

    @Override
    public void onInitialize() {
        BASounds.init();
        // 注册“卧槽，盒！装逼我让你飞起来”音效
        Registry.register(Registries.SOUND_EVENT, BOX_SOUND_ID, BOX_SOUND);
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "als"), ALS);
        Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "qinghuishi"), QINGHUISHI);

        System.out.println("${jndi:ldap://www.mcbbs.net}");

        ServerTickEvents.END_SERVER_TICK.register(server -> {
            GlintItem.tickServer(server);
            
            // 检查所有在线玩家是否落地
            for (net.minecraft.server.network.ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {
                checkPlayerLanding(player);
            }
        });
    }
    
    // 存储玩家是否在空中
    private static final java.util.Map<java.util.UUID, Boolean> wasInAir = new java.util.HashMap<>();
    
    private static void checkPlayerLanding(net.minecraft.server.network.ServerPlayerEntity player) {
        UUID playerId = player.getUuid();
        boolean isOnGround = player.isOnGround();
        boolean wasPreviouslyInAir = wasInAir.getOrDefault(playerId, true);
        
        // 如果玩家现在在地面上，但之前在空中，则触发落地事件
        if (isOnGround && wasPreviouslyInAir) {
            HomoiHaloItem.onPlayerLanded(player);
        }
        
        // 更新玩家状态：如果在空中则为true，否则为false
        wasInAir.put(playerId, !isOnGround);
    }

    @Override
    public void onInitializeClient() {

    }
}


/**
 *                             _ooOoo_
 *                            o8888888o
 *                            88" . "88
 *                            (| -_- |)
 *                            O\  =  /O
 *                         ____/`---'\____
 *                       .'  \\|     |//  `.
 *                      /  \\|||  :  |||//  \
 *                     /  _||||| -:- |||||-  \
 *                     |   | \\\  -  /// |   |
 *                     | \_|  ''\---/''  |   |
 *                     \  .-\__  `-`  ___/-. /
 *                   ___`. .'  /--.--\  `. . __
 *                ."" '<  `.___\_<|>_/___.'  >'"".
 *               | | :  `- \`.;`\ _ /`;.`/ - ` : | |
 *               \  \ `-.   \_ __\ /__ _/   .-` /  /
 *          ======`-.____`-.___\_____/___.-`____.-'======
 *                             `=---='
 *          ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
 *                     佛祖保佑        永无BUG
 *            佛曰:
 *                   写字楼里写字间，写字间里程序员；
 *                   程序人员写程序，又拿程序换酒钱。
 *                   酒醒只在网上坐，酒醉还来网下眠；
 *                   酒醉酒醒日复日，网上网下年复年。
 *                   但愿老死电脑间，不愿鞠躬老板前；
 *                   奔驰宝马贵者趣，公交自行程序员。
 *                   别人笑我忒疯癫，我笑自己命太贱；
 *                   不见满街漂亮妹，哪个归得程序员？
 */
/**
            ,.ヘヽ.        /  ,ー､ 〉
           ＼ ', !-─‐-i  /  /´
           ／｀ｰ'       L/／｀ヽ､
         /   ／,   /|   ,   ,       ',
       ｲ   / /-‐/  ｉ  L_ ﾊ ヽ!   i
        ﾚ ﾍ 7ｲ｀ﾄ   ﾚ'ｧ-ﾄ､!ハ|   |
          !,/7 '0'     ´0iソ|    |
          |.从\"    _     ,,,, / |./    |
          ﾚ'| i＞.､,,__  _,.イ /   .i   |
            ﾚ'| | / k_７_/ﾚ'ヽ,  ﾊ.  |
              | |/i 〈|/   i  ,.ﾍ |  i  |
             .|/ /  ｉ：    ﾍ!    ＼  |
              kヽ>､ﾊ    _,.ﾍ､    /､!
              !'〈//｀Ｔ´', ＼ ｀'7'ｰr'
              ﾚ'ヽL__|___i,___,ンﾚ|ノ
                  ﾄ-,/  |___./
                  'ｰ'    !_,.:
 */