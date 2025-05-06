package neko.bluearchive.item;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvents;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class BAMaterials {

    private static RegistryEntry<ArmorMaterial> registerMaterial(
            String id,
            Map<ArmorItem.Type, Integer> defensePoints,
            int enchantability,
            RegistryEntry<SoundEvent> equipSound,
            Supplier<Ingredient> repairIngredientSupplier,
            float toughness,
            float knockbackResistance,
            boolean dyeable
    ) {
        Identifier idObj = Identifier.of("bluearchive", id);

        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(idObj, "", dyeable)
        );

        ArmorMaterial material = new ArmorMaterial(
                defensePoints,
                enchantability,
                equipSound,
                repairIngredientSupplier,
                layers,
                toughness,
                knockbackResistance
        );

        return Registry.registerReference(Registries.ARMOR_MATERIAL, idObj, material);
    }

    // 白子的光环
    public static final RegistryEntry<ArmorMaterial> SHIROKO_HALO = registerMaterial(
            "shiroko_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, // ✅ 已经是 RegistryEntry<SoundEvent>
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 爱丽丝的光环
    public static final RegistryEntry<ArmorMaterial> ALICE_HALO = registerMaterial(
            "alice_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, // ✅ 同上
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 日奈的光环
    public static final RegistryEntry<ArmorMaterial> HINA_HALO = registerMaterial(
            "hina_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, // ✅ 同上
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 阿露的光环
    public static final RegistryEntry<ArmorMaterial> ARU_HALO = registerMaterial(
            "aru_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON, // ✅ 同上
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 初音的光环
    public static final RegistryEntry<ArmorMaterial> MIKU_HALO = registerMaterial(
            "miku_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 泉奈的光环
    public static final RegistryEntry<ArmorMaterial> IZUNA_HALO = registerMaterial(
            "izuna_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 小春的光环
    public static final RegistryEntry<ArmorMaterial> KOHARU_HALO = registerMaterial(
            "koharu_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 莲望的光环
    public static final RegistryEntry<ArmorMaterial> HASUMI_HALO = registerMaterial(
            "hasumi_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 梓的光环
    public static final RegistryEntry<ArmorMaterial> AZUSA_HALO = registerMaterial(
            "azusa_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );
    
    // 日富美的光环
    public static final RegistryEntry<ArmorMaterial> HIFUMI_HALO = registerMaterial(
            "hifumi_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 小绿的光环
    public static final RegistryEntry<ArmorMaterial> MIDORI_HALO = registerMaterial(
            "midori_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 小桃的光环
    public static final RegistryEntry<ArmorMaterial> MOMOI_HALO = registerMaterial(
            "momoi_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 未花的光环
    public static final RegistryEntry<ArmorMaterial> MIKA_HALO = registerMaterial(
            "mika_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 伊吕波的光环
    public static final RegistryEntry<ArmorMaterial> IROHA_HALO = registerMaterial(
            "iroha_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 诺亚的光环
    public static final RegistryEntry<ArmorMaterial> NOA_HALO = registerMaterial(
            "noa_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 花子的光环
    public static final RegistryEntry<ArmorMaterial> HANAKO_HALO = registerMaterial(
            "hanako_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 玛丽的光环
    public static final RegistryEntry<ArmorMaterial> MARI_HALO = registerMaterial(
            "mari_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 邮箱的光环
    public static final RegistryEntry<ArmorMaterial> YUUKA_HALO = registerMaterial(
            "yuuka_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

    // 星野的光环
    public static final RegistryEntry<ArmorMaterial> HOSHION_HALO = registerMaterial(
            "hoshino_halo",
            Map.of(ArmorItem.Type.HELMET, 3),
            5,
            SoundEvents.ITEM_ARMOR_EQUIP_IRON,
            () -> Ingredient.ofItems(Items.IRON_INGOT),
            0.0f,
            0.0f,
            false
    );

}
