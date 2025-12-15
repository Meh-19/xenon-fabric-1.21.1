package net.meh.xenon.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.meh.xenon.Xenon;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
public static final ItemGroup XENON_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
        Identifier.of(Xenon.MOD_ID,"xenon_items"),
        FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PLATINUM))
                .displayName(Text.translatable("itemgroup.xenon.xenon_items"))
                .entries((displayContext, entries) -> {
                    entries.add(ModItems.PLATINUM);
                    entries.add(ModItems.RUBY);

                })

                .build());

    public static final ItemGroup XENON_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Xenon.MOD_ID,"xenon_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PLATINUM_BLOCK))
                    .displayName(Text.translatable("itemgroup.xenon.xenon_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PLATINUM_BLOCK);
                        entries.add(ModBlocks.PLATINUM_BRICKS);
                        entries.add(ModBlocks.PLATINUM_PILLAR);
                        entries.add(ModBlocks.PLATINUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_PLATINUM_ORE);

                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RUBY_BRICKS);
                        entries.add(ModBlocks.RUBY_PILLAR);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);

                        /* --- WOOD SETS (sorted like Minecraft) --- */

// Maple
                        entries.add(ModBlocks.MAPLE_LOG);
                        entries.add(ModBlocks.MAPLE_WOOD);
                        entries.add(ModBlocks.STRIPPED_MAPLE_LOG);
                        entries.add(ModBlocks.STRIPPED_MAPLE_WOOD);
                        entries.add(ModBlocks.MAPLE_PLANKS);
                        entries.add(ModBlocks.MAPLE_STAIRS);
                        entries.add(ModBlocks.MAPLE_SLAB);
                        entries.add(ModBlocks.MAPLE_FENCE);
                        entries.add(ModBlocks.MAPLE_FENCE_GATE);
                        entries.add(ModBlocks.MAPLE_PRESSURE_PLATE);
                        entries.add(ModBlocks.MAPLE_BUTTON);
                        entries.add(ModBlocks.VERTICAL_MAPLE_PLANKS);
                        entries.add(ModBlocks.MAPLE_PLANKS_CARVED);
                        entries.add(ModBlocks.MAPLE_PAPER_LANTERN);
                        entries.add(ModBlocks.MAPLE_BEAM);
                        entries.add(ModBlocks.ORANGE_MAPLE_LEAVES);
                        entries.add(ModBlocks.RED_MAPLE_LEAVES);

// Bleak
                        entries.add(ModBlocks.BLEAK_LOG);
                        entries.add(ModBlocks.BLEAK_WOOD);
                        entries.add(ModBlocks.STRIPPED_BLEAK_LOG);
                        entries.add(ModBlocks.STRIPPED_BLEAK_WOOD);
                        entries.add(ModBlocks.BLEAK_PLANKS);
                        entries.add(ModBlocks.BLEAK_STAIRS);
                        entries.add(ModBlocks.BLEAK_SLAB);
                        entries.add(ModBlocks.BLEAK_FENCE);
                        entries.add(ModBlocks.BLEAK_FENCE_GATE);
                        entries.add(ModBlocks.BLEAK_PRESSURE_PLATE);
                        entries.add(ModBlocks.BLEAK_BUTTON);
                        entries.add(ModBlocks.VERTICAL_BLEAK_PLANKS);
                        entries.add(ModBlocks.BLEAK_PLANKS_CARVED);
                        entries.add(ModBlocks.BLEAK_PAPER_LANTERN);
                        entries.add(ModBlocks.BLEAK_BEAM);
                        entries.add(ModBlocks.BLEAK_LEAVES);

// Fir
                        entries.add(ModBlocks.FIR_LOG);
                        entries.add(ModBlocks.FIR_WOOD);
                        entries.add(ModBlocks.STRIPPED_FIR_LOG);
                        entries.add(ModBlocks.STRIPPED_FIR_WOOD);
                        entries.add(ModBlocks.FIR_PLANKS);
                        entries.add(ModBlocks.FIR_STAIRS);
                        entries.add(ModBlocks.FIR_SLAB);
                        entries.add(ModBlocks.FIR_FENCE);
                        entries.add(ModBlocks.FIR_FENCE_GATE);
                        entries.add(ModBlocks.FIR_PRESSURE_PLATE);
                        entries.add(ModBlocks.FIR_BUTTON);
                        entries.add(ModBlocks.VERTICAL_FIR_PLANKS);
                        entries.add(ModBlocks.FIR_PLANKS_CARVED);
                        entries.add(ModBlocks.FIR_PAPER_LANTERN);
                        entries.add(ModBlocks.FIR_BEAM);
                        entries.add(ModBlocks.GREEN_FIR_LEAVES);
                        entries.add(ModBlocks.ORANGE_FIR_LEAVES);

// Palm
                        entries.add(ModBlocks.PALM_LOG);
                        entries.add(ModBlocks.PALM_WOOD);
                        entries.add(ModBlocks.STRIPPED_PALM_LOG);
                        entries.add(ModBlocks.STRIPPED_PALM_WOOD);
                        entries.add(ModBlocks.PALM_PLANKS);
                        entries.add(ModBlocks.PALM_STAIRS);
                        entries.add(ModBlocks.PALM_SLAB);
                        entries.add(ModBlocks.PALM_FENCE);
                        entries.add(ModBlocks.PALM_FENCE_GATE);
                        entries.add(ModBlocks.PALM_PRESSURE_PLATE);
                        entries.add(ModBlocks.PALM_BUTTON);
                        entries.add(ModBlocks.VERTICAL_PALM_PLANKS);
                        entries.add(ModBlocks.PALM_PLANKS_CARVED);
                        entries.add(ModBlocks.PALM_PAPER_LANTERN);
                        entries.add(ModBlocks.PALM_BEAM);
                        entries.add(ModBlocks.PALM_CROWN);
                        entries.add(ModBlocks.PALM_LEAVES);

// Bayou
                        entries.add(ModBlocks.BAYOU_LOG);
                        entries.add(ModBlocks.BAYOU_WOOD);
                        entries.add(ModBlocks.STRIPPED_BAYOU_LOG);
                        entries.add(ModBlocks.STRIPPED_BAYOU_WOOD);
                        entries.add(ModBlocks.BAYOU_PLANKS);
                        entries.add(ModBlocks.BAYOU_STAIRS);
                        entries.add(ModBlocks.BAYOU_SLAB);
                        entries.add(ModBlocks.BAYOU_FENCE);
                        entries.add(ModBlocks.BAYOU_FENCE_GATE);
                        entries.add(ModBlocks.BAYOU_PRESSURE_PLATE);
                        entries.add(ModBlocks.BAYOU_BUTTON);
                        entries.add(ModBlocks.VERTICAL_BAYOU_PLANKS);
                        entries.add(ModBlocks.BAYOU_PLANKS_CARVED);
                        entries.add(ModBlocks.BAYOU_PAPER_LANTERN);
                        entries.add(ModBlocks.BAYOU_BEAM);
                        entries.add(ModBlocks.BAYOU_LEAVES);

// Wisteria (huge set)
                        entries.add(ModBlocks.WISTERIA_LOG);
                        entries.add(ModBlocks.WISTERIA_WOOD);
                        entries.add(ModBlocks.STRIPPED_WISTERIA_LOG);
                        entries.add(ModBlocks.STRIPPED_WISTERIA_WOOD);
                        entries.add(ModBlocks.WISTERIA_PLANKS);
                        entries.add(ModBlocks.WISTERIA_STAIRS);
                        entries.add(ModBlocks.WISTERIA_SLAB);
                        entries.add(ModBlocks.WISTERIA_FENCE);
                        entries.add(ModBlocks.WISTERIA_FENCE_GATE);
                        entries.add(ModBlocks.WISTERIA_PRESSURE_PLATE);
                        entries.add(ModBlocks.WISTERIA_BUTTON);
                        entries.add(ModBlocks.VERTICAL_WISTERIA_PLANKS);
                        entries.add(ModBlocks.WISTERIA_PLANKS_CARVED);
                        entries.add(ModBlocks.WISTERIA_PAPER_LANTERN);
                        entries.add(ModBlocks.WISTERIA_BEAM);
                        entries.add(ModBlocks.WISTERIA_LEAVES);
                        entries.add(ModBlocks.WISTERIA_FLOWERS_BLUE);
                        entries.add(ModBlocks.WISTERIA_FLOWERS_PINK);
                        entries.add(ModBlocks.WISTERIA_FLOWERS_PURPLE);
                        entries.add(ModBlocks.WISTERIA_FLOWERS_WHITE);

// Baobab
                        entries.add(ModBlocks.BAOBAB_LOG);
                        entries.add(ModBlocks.BAOBAB_WOOD);
                        entries.add(ModBlocks.STRIPPED_BAOBAB_LOG);
                        entries.add(ModBlocks.STRIPPED_BAOBAB_WOOD);
                        entries.add(ModBlocks.BAOBAB_PLANKS);
                        entries.add(ModBlocks.BAOBAB_STAIRS);
                        entries.add(ModBlocks.BAOBAB_SLAB);
                        entries.add(ModBlocks.BAOBAB_FENCE);
                        entries.add(ModBlocks.BAOBAB_FENCE_GATE);
                        entries.add(ModBlocks.BAOBAB_PRESSURE_PLATE);
                        entries.add(ModBlocks.BAOBAB_BUTTON);
                        entries.add(ModBlocks.VERTICAL_BAOBAB_PLANKS);
                        entries.add(ModBlocks.BAOBAB_PLANKS_CARVED);
                        entries.add(ModBlocks.BAOBAB_PAPER_LANTERN);
                        entries.add(ModBlocks.BAOBAB_BEAM);
                        entries.add(ModBlocks.BAOBAB_LEAVES);

// Fungal (and dyed fungal sets)
// —–– your fungal planks, stairs, slabs, fences, etc.
// (no duplicates, all grouped neatly like Minecraft)

// Vanilla wood enhancements (OAK_BEAM, etc.)

                        /* --- STONES & BRICKS (Minecraft-style sorting) --- */

                        entries.add(ModBlocks.ANDESITE_BRICKS);
                        entries.add(ModBlocks.CHISELED_ANDESITE);

                        entries.add(ModBlocks.DIORITE_BRICKS);
                        entries.add(ModBlocks.CHISELED_DIORITE);

                        entries.add(ModBlocks.GRANITE_BRICKS);
                        entries.add(ModBlocks.CHISELED_GRANITE);

                        entries.add(ModBlocks.CHISELED_STONE);

                        entries.add(ModBlocks.DRIPSTONE_BRICKS);
                        entries.add(ModBlocks.CHISELED_DRIPSTONE);
                        entries.add(ModBlocks.POLISHED_DRIPSTONE);

                        entries.add(ModBlocks.SLATE);
                        entries.add(ModBlocks.SLATE_BRICKS);
                        entries.add(ModBlocks.CHISELED_SLATE);
                        entries.add(ModBlocks.POLISHED_SLATE);

                        entries.add(ModBlocks.LIMESTONE);
                        entries.add(ModBlocks.LIMESTONE_STAIRS);
                        entries.add(ModBlocks.LIMESTONE_SLAB);
                        entries.add(ModBlocks.LIMESTONE_WALL);
                        entries.add(ModBlocks.CHISELED_LIMESTONE);
                        entries.add(ModBlocks.LIMESTONE_BRICKS);
                        entries.add(ModBlocks.LIMESTONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.LIMESTONE_BRICKS_SLAB);
                        entries.add(ModBlocks.LIMESTONE_BRICKS_WALL);
                        entries.add(ModBlocks.POLISHED_LIMESTONE);
                        entries.add(ModBlocks.POLISHED_LIMESTONE_STAIRS);
                        entries.add(ModBlocks.POLISHED_LIMESTONE_SLAB);
                        entries.add(ModBlocks.POLISHED_LIMESTONE_WALL);
                        entries.add(ModBlocks.SANDY_LIMESTONE_BRICKS);
                        entries.add(ModBlocks.SANDY_LIMESTONE_BRICKS_STAIRS);
                        entries.add(ModBlocks.SANDY_LIMESTONE_BRICKS_SLAB);
                        entries.add(ModBlocks.SANDY_LIMESTONE_BRICKS_WALL);


                        entries.add(ModBlocks.SILT);
                        entries.add(ModBlocks.DRIED_SILT);
                        entries.add(ModBlocks.SILT_BRICKS);
                        entries.add(ModBlocks.CHISELED_SILT_BRICKS);
                        entries.add(ModBlocks.POLISHED_SILT);

                        /* --- NETHER BLOCKS --- */

                        entries.add(ModBlocks.BLUE_NETHER_BRICKS);
                        entries.add(ModBlocks.CHISELED_BLUE_NETHER_BRICKS);
                        entries.add(ModBlocks.POLISHED_BLUE_NETHER_BRICKS);

                        entries.add(ModBlocks.TAINTED_NETHER_BRICKS);
                        entries.add(ModBlocks.CHISELED_RED_NETHER_BRICKS);
                        entries.add(ModBlocks.POLISHED_RED_NETHER_BRICKS);

                        entries.add(ModBlocks.SOUL_BRICKS);
                        entries.add(ModBlocks.CHISELED_SOUL_BRICKS);
                        entries.add(ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS);
                        entries.add(ModBlocks.POLISHED_SOUL_SAND);

                        /* --- BASALT --- */

                        entries.add(ModBlocks.POLISHED_BASALT_BRICKS);
                        entries.add(ModBlocks.POLISHED_BASALT_TILES);
                        entries.add(ModBlocks.CUT_POLISHED_BASALT);
                        entries.add(ModBlocks.CHISELED_POLISHED_BASALT);

                        /* --- CUSTOM EARTHY BLOCKS --- */

                        entries.add(ModBlocks.LOAM);
                        entries.add(ModBlocks.PACKED_LOAM);
                        entries.add(ModBlocks.PACKED_LOAM_BRICKS);
                        entries.add(ModBlocks.CHISELED_PACKED_LOAM);
                        entries.add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS);

                        entries.add(ModBlocks.PACKED_ASHEN_SAND);
                        entries.add(ModBlocks.ASHEN_SAND);
                        entries.add(ModBlocks.ASHEN_SANDSTONE);
                        entries.add(ModBlocks.CUT_ASHEN_SANDSTONE);
                        entries.add(ModBlocks.CHISELED_ASHEN_SANDSTONE);
                        entries.add(ModBlocks.SMOOTH_ASHEN_SANDSTONE);

                        entries.add(ModBlocks.PACKED_DIRT);
                        entries.add(ModBlocks.PACKED_SAND);
                        entries.add(ModBlocks.PACKED_RED_SAND);

                        /* --- GRIMROCK SET --- */

                        entries.add(ModBlocks.GRIMROCK);
                        entries.add(ModBlocks.GRIMROCK_STAIRS);
                        entries.add(ModBlocks.GRIMROCK_SLAB);
                        entries.add(ModBlocks.GRIMROCK_WALL);
                        entries.add(ModBlocks.CHISELED_GRIMROCK);
                        entries.add(ModBlocks.COBBLED_GRIMROCK);
                        entries.add(ModBlocks.COBBLED_GRIMROCK_STAIRS);
                        entries.add(ModBlocks.COBBLED_GRIMROCK_SLAB);
                        entries.add(ModBlocks.COBBLED_GRIMROCK_WALL);
                        entries.add(ModBlocks.CRACKED_GRIMROCK_BRICKS);
                        entries.add(ModBlocks.CRACKED_GRIMROCK_BRICKS_STAIRS);
                        entries.add(ModBlocks.CRACKED_GRIMROCK_BRICKS_SLAB);
                        entries.add(ModBlocks.CRACKED_GRIMROCK_BRICKS_WALL);
                        entries.add(ModBlocks.GRIMROCK_BRICKS);
                        entries.add(ModBlocks.GRIMROCK_BRICKS_STAIRS);
                        entries.add(ModBlocks.GRIMROCK_BRICKS_SLAB);
                        entries.add(ModBlocks.GRIMROCK_BRICKS_WALL);
                        entries.add(ModBlocks.MOSSY_GRIMROCK_BRICKS);
                        entries.add(ModBlocks.MOSSY_GRIMROCK_BRICKS_STAIRS);
                        entries.add(ModBlocks.MOSSY_GRIMROCK_BRICKS_SLAB);
                        entries.add(ModBlocks.MOSSY_GRIMROCK_BRICKS_WALL);
                        entries.add(ModBlocks.POLISHED_GRIMROCK);
                        entries.add(ModBlocks.POLISHED_GRIMROCK_STAIRS);
                        entries.add(ModBlocks.POLISHED_GRIMROCK_SLAB);
                        entries.add(ModBlocks.POLISHED_GRIMROCK_WALL);


                        /* --- ORGANIC BLOCKS --- */

                        entries.add(ModBlocks.GRIMOSS_BLOCK);
                        entries.add(ModBlocks.GRIMWEED_BLOCK);
                        entries.add(ModBlocks.PALE_GRIMWEED_BLOCK);

                        /* --- LIGHTING & SPECIAL BLOCKS --- */

                        entries.add(ModBlocks.BLIGHTED_SHROOMLIGHT);


                    })

                    .build());


    public static void registerItemGroups() {
        Xenon.LOGGER.info("Registering Item Groups for " + Xenon.MOD_ID);
    }
}
