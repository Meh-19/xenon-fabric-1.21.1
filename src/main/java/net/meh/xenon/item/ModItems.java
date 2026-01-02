package net.meh.xenon.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.meh.xenon.Xenon;
import net.meh.xenon.block.ModBlockItem;
import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.item.custom.DolomiteDustItem;
import net.meh.xenon.item.custom.RocketBootsItem;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
public static final Item PLATINUM = registerItem("platinum", new Item(new Item.Settings()));
    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()));
    public static final Item BLIGHT_ESSENCE = registerItem("blight_essence", new Item(new Item.Settings()));

    public static final Item ECHO_GLASS_ITEM = Registry.register(
            Registries.ITEM,
            Identifier.of(Xenon.MOD_ID, "echo_glass"),
            new ModBlockItem(ModBlocks.ECHO_GLASS, new Item.Settings())
    );
    public static final Item DOLOMITE_DUST = Registry.register(
            Registries.ITEM,
            Identifier.of("xenon", "dolomite_dust"),
            new DolomiteDustItem(new Item.Settings())
    );

    public static final Item AQUARIUM_GLASS = Registry.register(
            Registries.ITEM,
            Identifier.of(Xenon.MOD_ID, "aquarium_glass"),
            new ModBlockItem(ModBlocks.AQUARIUM_GLASS, new Item.Settings())
    );

    public static final Item SMALL_LILY =
            Registry.register(
                    Registries.ITEM,
                    Identifier.of("xenon", "small_lily"),
                    new PlaceableOnWaterItem(
                            ModBlocks.SMALL_LILY,
                            new Item.Settings()
                    )
            );


    public static final Item PLATINUM_SWORD = registerItem("platinum_sword",
            new SwordItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 3, -2.4f))));
    public static final Item PLATINUM_PICKAXE = registerItem("platinum_pickaxe",
            new PickaxeItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 1, -2.8f))));
    public static final Item PLATINUM_SHOVEL = registerItem("platinum_shovel",
            new ShovelItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 1.5f, -3.0f))));
    public static final Item PLATINUM_AXE = registerItem("platinum_axe",
            new AxeItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 6, -3.2f))));
    public static final Item PLATINUM_HOE = registerItem("platinum_hoe",
            new HoeItem(ModToolMaterials.PLATINUM, new Item.Settings()
                    .attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.PLATINUM, 0, -3f))));

    public static final Item PLATINUM_HELMET = registerItem("platinum_helmet",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(11))));
    public static final Item PLATINUM_CHESTPLATE = registerItem("platinum_chestplate",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(16))));
    public static final Item PLATINUM_LEGGINGS = registerItem("platinum_leggings",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(15))));
    public static final Item PLATINUM_BOOTS = registerItem("platinum_boots",
            new ArmorItem(ModArmorMaterials.PLATINUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(13))));

    public static final Item ROCKET_BOOTS = registerItem(
            "rocket_boots",
            new RocketBootsItem(
                    ModArmorMaterials.ROCKET_ARMOR_MATERIAL,
                    new Item.Settings().maxDamage(429)
            )
    );

    private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(Xenon.MOD_ID, name), item);
}


    public static void registerModItems() {
        Xenon.LOGGER.info("Registering Mod Items for " + Xenon.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PLATINUM);
            entries.add(RUBY);

        });
    }
}
