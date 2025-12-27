package net.meh.xenon.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.meh.xenon.Xenon;
import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.item.custom.DolomiteDustItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.PlaceableOnWaterItem;
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
            new BlockItem(ModBlocks.ECHO_GLASS, new Item.Settings())
    );
    public static final Item DOLOMITE_DUST = Registry.register(
            Registries.ITEM,
            Identifier.of("xenon", "dolomite_dust"),
            new DolomiteDustItem(new Item.Settings())
    );

    public static final Item AQUARIUM_GLASS = Registry.register(
            Registries.ITEM,
            Identifier.of(Xenon.MOD_ID, "aquarium_glass"),
            new BlockItem(ModBlocks.AQUARIUM_GLASS, new Item.Settings())
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
