package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.PLATINUM_BLOCK);
        addDrop(ModBlocks.PLATINUM_BRICKS);
        addDrop(ModBlocks.PLATINUM_PILLAR);

        addDrop(ModBlocks.DIAMOND_BRICK);
        addDrop(ModBlocks.DIAMOND_PILLAR);
        addDrop(ModBlocks.EMERALD_BRICK);
        addDrop(ModBlocks.EMERALD_PILLAR);
        addDrop(ModBlocks.GOLD_BRICK);
        addDrop(ModBlocks.GOLD_PILLAR);
        addDrop(ModBlocks.IRON_BRICK);
        addDrop(ModBlocks.IRON_PILLAR);
        addDrop(ModBlocks.NETHERITE_BRICK);
        addDrop(ModBlocks.NETHERITE_PILLAR);


        addDrop(ModBlocks.RUBY_BLOCK);
        addDrop(ModBlocks.RUBY_BRICKS);
        addDrop(ModBlocks.RUBY_PILLAR);

        addDrop(ModBlocks.PLATINUM_ORE, oreDrops(ModBlocks.PLATINUM_ORE, ModItems.PLATINUM));
        addDrop(ModBlocks.DEEPSLATE_PLATINUM_ORE, oreDrops(ModBlocks.PLATINUM_ORE, ModItems.PLATINUM));

        addDrop(ModBlocks.RUBY_ORE, oreDrops(ModBlocks.RUBY_ORE, ModItems.RUBY));
        addDrop(ModBlocks.DEEPSLATE_RUBY_ORE, oreDrops(ModBlocks.DEEPSLATE_RUBY_ORE, ModItems.RUBY));

        addDrop(ModBlocks.OAK_BEAM);
        addDrop(ModBlocks.SPRUCE_BEAM);
        addDrop(ModBlocks.BIRCH_BEAM);
        addDrop(ModBlocks.JUNGLE_BEAM);
        addDrop(ModBlocks.ACACIA_BEAM);
        addDrop(ModBlocks.DARK_OAK_BEAM);
        addDrop(ModBlocks.MANGROVE_BEAM);
        addDrop(ModBlocks.CHERRY_BEAM);
        addDrop(ModBlocks.WARPED_BEAM);
        addDrop(ModBlocks.CRIMSON_BEAM);

        addDrop(ModBlocks.VERTICAL_OAK_PLANKS);
        addDrop(ModBlocks.VERTICAL_SPRUCE_PLANKS);
        addDrop(ModBlocks.VERTICAL_BIRCH_PLANKS);
        addDrop(ModBlocks.VERTICAL_JUNGLE_PLANKS);
        addDrop(ModBlocks.VERTICAL_ACACIA_PLANKS);
        addDrop(ModBlocks.VERTICAL_DARK_OAK_PLANKS);
        addDrop(ModBlocks.VERTICAL_MANGROVE_PLANKS);
        addDrop(ModBlocks.VERTICAL_CHERRY_PLANKS);
        addDrop(ModBlocks.VERTICAL_CRIMSON_PLANKS);
        addDrop(ModBlocks.VERTICAL_WARPED_PLANKS);
        addDrop(ModBlocks.VERTICAL_BAMBOO_PLANKS);
        addDrop(ModBlocks.OAK_PAPER_LANTERN);
        addDrop(ModBlocks.SPRUCE_PAPER_LANTERN);
        addDrop(ModBlocks.BIRCH_PAPER_LANTERN);
        addDrop(ModBlocks.JUNGLE_PAPER_LANTERN);
        addDrop(ModBlocks.ACACIA_PAPER_LANTERN);
        addDrop(ModBlocks.DARK_OAK_PAPER_LANTERN);
        addDrop(ModBlocks.MANGROVE_PAPER_LANTERN);
        addDrop(ModBlocks.CHERRY_PAPER_LANTERN);
        addDrop(ModBlocks.CRIMSON_SHROOM_LANTERN);
        addDrop(ModBlocks.WARPED_SHROOM_LANTERN);
        addDrop(ModBlocks.MAPLE_PAPER_LANTERN);
        addDrop(ModBlocks.BLEAK_PAPER_LANTERN);
        addDrop(ModBlocks.FIR_PAPER_LANTERN);
        addDrop(ModBlocks.PALM_PAPER_LANTERN);
        addDrop(ModBlocks.BAYOU_PAPER_LANTERN);
        addDrop(ModBlocks.WISTERIA_PAPER_LANTERN);
        addDrop(ModBlocks.BAOBAB_PAPER_LANTERN);
        addDrop(ModBlocks.BAMBOO_PAPER_LANTERN);
        addDrop(ModBlocks.FUNGAL_PAPER_LANTERN);

        addDrop(ModBlocks.OAK_PLANKS_CARVED);
        addDrop(ModBlocks.SPRUCE_PLANKS_CARVED);
        addDrop(ModBlocks.BIRCH_PLANKS_CARVED);
        addDrop(ModBlocks.JUNGLE_PLANKS_CARVED);
        addDrop(ModBlocks.ACACIA_PLANKS_CARVED);
        addDrop(ModBlocks.DARK_OAK_PLANKS_CARVED);
        addDrop(ModBlocks.MANGROVE_PLANKS_CARVED);
        addDrop(ModBlocks.CHERRY_PLANKS_CARVED);
        addDrop(ModBlocks.CRIMSON_PLANKS_CARVED);
        addDrop(ModBlocks.WARPED_PLANKS_CARVED);

        addDrop(ModBlocks.MAPLE_LOG);
        addDrop(ModBlocks.STRIPPED_MAPLE_LOG);
        addDrop(ModBlocks.MAPLE_WOOD);
        addDrop(ModBlocks.STRIPPED_MAPLE_WOOD);
        addDrop(ModBlocks.MAPLE_PLANKS);
        addDrop(ModBlocks.VERTICAL_MAPLE_PLANKS);
        addDrop(ModBlocks.MAPLE_PLANKS_CARVED);
        addDrop(ModBlocks.MAPLE_BEAM);


        addDrop(ModBlocks.MAPLE_STAIRS);
        addDrop(ModBlocks.MAPLE_BUTTON);
        addDrop(ModBlocks.MAPLE_PRESSURE_PLATE);
        addDrop(ModBlocks.MAPLE_FENCE);
        addDrop(ModBlocks.MAPLE_FENCE_GATE);
        addDrop(ModBlocks.MAPLE_SLAB, slabDrops(ModBlocks.MAPLE_SLAB));

        addDrop(ModBlocks.RED_MAPLE_LEAVES, leavesDrops(ModBlocks.RED_MAPLE_LEAVES, ModBlocks.RUBY_BLOCK, 0.0025f)); //TODO
        addDrop(ModBlocks.ORANGE_MAPLE_LEAVES, leavesDrops(ModBlocks.ORANGE_MAPLE_LEAVES, ModBlocks.RUBY_BLOCK, 0.0025f)); //TODO

        addDrop(ModBlocks.BLEAK_LOG);
        addDrop(ModBlocks.STRIPPED_BLEAK_LOG);
        addDrop(ModBlocks.BLEAK_WOOD);
        addDrop(ModBlocks.STRIPPED_BLEAK_WOOD);
        addDrop(ModBlocks.BLEAK_PLANKS);
        addDrop(ModBlocks.VERTICAL_BLEAK_PLANKS);
        addDrop(ModBlocks.BLEAK_PLANKS_CARVED);
        addDrop(ModBlocks.BLEAK_BEAM);

        addDrop(ModBlocks.BLEAK_STAIRS);
        addDrop(ModBlocks.BLEAK_BUTTON);
        addDrop(ModBlocks.BLEAK_PRESSURE_PLATE);
        addDrop(ModBlocks.BLEAK_FENCE);
        addDrop(ModBlocks.BLEAK_FENCE_GATE);
        addDrop(ModBlocks.BLEAK_SLAB, slabDrops(ModBlocks.BLEAK_SLAB));

        addDrop(ModBlocks.BLEAK_LEAVES, leavesDrops(ModBlocks.BLEAK_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.FIR_LOG);
        addDrop(ModBlocks.STRIPPED_FIR_LOG);
        addDrop(ModBlocks.FIR_WOOD);
        addDrop(ModBlocks.STRIPPED_FIR_WOOD);
        addDrop(ModBlocks.FIR_PLANKS);
        addDrop(ModBlocks.VERTICAL_FIR_PLANKS);
        addDrop(ModBlocks.FIR_PLANKS_CARVED);
        addDrop(ModBlocks.FIR_BEAM);

        addDrop(ModBlocks.FIR_STAIRS);
        addDrop(ModBlocks.FIR_BUTTON);
        addDrop(ModBlocks.FIR_PRESSURE_PLATE);
        addDrop(ModBlocks.FIR_FENCE);
        addDrop(ModBlocks.FIR_FENCE_GATE);
        addDrop(ModBlocks.FIR_SLAB, slabDrops(ModBlocks.FIR_SLAB));

        addDrop(ModBlocks.GREEN_FIR_LEAVES, leavesDrops(ModBlocks.GREEN_FIR_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.ORANGE_FIR_LEAVES, leavesDrops(ModBlocks.ORANGE_FIR_LEAVES, ModBlocks.RUBY_BLOCK, 0.0025f)); //TODO

        addDrop(ModBlocks.PALM_LOG);
        addDrop(ModBlocks.STRIPPED_PALM_LOG);
        addDrop(ModBlocks.PALM_WOOD);
        addDrop(ModBlocks.STRIPPED_PALM_WOOD);
        addDrop(ModBlocks.PALM_PLANKS);
        addDrop(ModBlocks.VERTICAL_PALM_PLANKS);
        addDrop(ModBlocks.PALM_PLANKS_CARVED);
        addDrop(ModBlocks.PALM_BEAM);
        addDrop(ModBlocks.PALM_CROWN);

        addDrop(ModBlocks.PALM_STAIRS);
        addDrop(ModBlocks.PALM_BUTTON);
        addDrop(ModBlocks.PALM_PRESSURE_PLATE);
        addDrop(ModBlocks.PALM_FENCE);
        addDrop(ModBlocks.PALM_FENCE_GATE);
        addDrop(ModBlocks.PALM_SLAB, slabDrops(ModBlocks.PALM_SLAB));

        addDrop(ModBlocks.PALM_LEAVES, leavesDrops(ModBlocks.PALM_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.BAYOU_LOG);
        addDrop(ModBlocks.STRIPPED_BAYOU_LOG);
        addDrop(ModBlocks.BAYOU_WOOD);
        addDrop(ModBlocks.STRIPPED_BAYOU_WOOD);
        addDrop(ModBlocks.BAYOU_PLANKS);
        addDrop(ModBlocks.VERTICAL_BAYOU_PLANKS);
        addDrop(ModBlocks.BAYOU_PLANKS_CARVED);
        addDrop(ModBlocks.BAYOU_BEAM);

        addDrop(ModBlocks.BAYOU_STAIRS);
        addDrop(ModBlocks.BAYOU_BUTTON);
        addDrop(ModBlocks.BAYOU_PRESSURE_PLATE);
        addDrop(ModBlocks.BAYOU_FENCE);
        addDrop(ModBlocks.BAYOU_FENCE_GATE);
        addDrop(ModBlocks.BAYOU_SLAB, slabDrops(ModBlocks.BAYOU_SLAB));

        addDrop(ModBlocks.BAYOU_LEAVES, leavesDrops(ModBlocks.BAYOU_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.WISTERIA_LOG);
        addDrop(ModBlocks.STRIPPED_WISTERIA_LOG);
        addDrop(ModBlocks.WISTERIA_WOOD);
        addDrop(ModBlocks.STRIPPED_WISTERIA_WOOD);
        addDrop(ModBlocks.WISTERIA_PLANKS);
        addDrop(ModBlocks.VERTICAL_WISTERIA_PLANKS);
        addDrop(ModBlocks.WISTERIA_PLANKS_CARVED);
        addDrop(ModBlocks.WISTERIA_BEAM);

        addDrop(ModBlocks.WISTERIA_STAIRS);
        addDrop(ModBlocks.WISTERIA_BUTTON);
        addDrop(ModBlocks.WISTERIA_PRESSURE_PLATE);
        addDrop(ModBlocks.WISTERIA_FENCE);
        addDrop(ModBlocks.WISTERIA_FENCE_GATE);
        addDrop(ModBlocks.WISTERIA_SLAB, slabDrops(ModBlocks.WISTERIA_SLAB));

        addDrop(ModBlocks.WISTERIA_LEAVES, leavesDrops(ModBlocks.WISTERIA_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.WISTERIA_FLOWERS_BLUE, leavesDrops(ModBlocks.WISTERIA_FLOWERS_BLUE, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.WISTERIA_FLOWERS_PINK, leavesDrops(ModBlocks.WISTERIA_FLOWERS_PINK, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.WISTERIA_FLOWERS_PURPLE, leavesDrops(ModBlocks.WISTERIA_FLOWERS_PURPLE, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO
        addDrop(ModBlocks.WISTERIA_FLOWERS_WHITE, leavesDrops(ModBlocks.WISTERIA_FLOWERS_WHITE, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.BAOBAB_LOG);
        addDrop(ModBlocks.STRIPPED_BAOBAB_LOG);
        addDrop(ModBlocks.BAOBAB_WOOD);
        addDrop(ModBlocks.STRIPPED_BAOBAB_WOOD);
        addDrop(ModBlocks.BAOBAB_PLANKS);
        addDrop(ModBlocks.VERTICAL_BAOBAB_PLANKS);
        addDrop(ModBlocks.BAOBAB_PLANKS_CARVED);
        addDrop(ModBlocks.BAOBAB_BEAM);

        addDrop(ModBlocks.BAOBAB_STAIRS);
        addDrop(ModBlocks.BAOBAB_BUTTON);
        addDrop(ModBlocks.BAOBAB_PRESSURE_PLATE);
        addDrop(ModBlocks.BAOBAB_FENCE);
        addDrop(ModBlocks.BAOBAB_FENCE_GATE);
        addDrop(ModBlocks.BAOBAB_SLAB, slabDrops(ModBlocks.BAOBAB_SLAB));

        addDrop(ModBlocks.BAOBAB_LEAVES, leavesDrops(ModBlocks.BAOBAB_LEAVES, ModBlocks.RUBY_BLOCK, 0.005f)); //TODO

        addDrop(ModBlocks.FUNGAL_PLANKS_CARVED);
        addDrop(ModBlocks.FUNGAL_PLANKS);
        addDrop(ModBlocks.VERTICAL_FUNGAL_PLANKS);
        addDrop(ModBlocks.FUNGAL_STAIRS);
        addDrop(ModBlocks.FUNGAL_BUTTON);
        addDrop(ModBlocks.FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.FUNGAL_FENCE);
        addDrop(ModBlocks.FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.FUNGAL_SLAB, slabDrops(ModBlocks.FUNGAL_SLAB));

        addDrop(ModBlocks.WHITE_FUNGAL_PLANKS);
        addDrop(ModBlocks.WHITE_FUNGAL_STAIRS);
        addDrop(ModBlocks.WHITE_FUNGAL_BUTTON);
        addDrop(ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.WHITE_FUNGAL_FENCE);
        addDrop(ModBlocks.WHITE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.WHITE_FUNGAL_SLAB, slabDrops(ModBlocks.WHITE_FUNGAL_SLAB));

        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_GRAY_FUNGAL_SLAB, slabDrops(ModBlocks.LIGHT_GRAY_FUNGAL_SLAB));

        addDrop(ModBlocks.GRAY_FUNGAL_PLANKS);
        addDrop(ModBlocks.GRAY_FUNGAL_STAIRS);
        addDrop(ModBlocks.GRAY_FUNGAL_BUTTON);
        addDrop(ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.GRAY_FUNGAL_FENCE);
        addDrop(ModBlocks.GRAY_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.GRAY_FUNGAL_SLAB, slabDrops(ModBlocks.GRAY_FUNGAL_SLAB));

        addDrop(ModBlocks.BLACK_FUNGAL_PLANKS);
        addDrop(ModBlocks.BLACK_FUNGAL_STAIRS);
        addDrop(ModBlocks.BLACK_FUNGAL_BUTTON);
        addDrop(ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.BLACK_FUNGAL_FENCE);
        addDrop(ModBlocks.BLACK_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.BLACK_FUNGAL_SLAB, slabDrops(ModBlocks.BLACK_FUNGAL_SLAB));

        addDrop(ModBlocks.BROWN_FUNGAL_PLANKS);
        addDrop(ModBlocks.BROWN_FUNGAL_STAIRS);
        addDrop(ModBlocks.BROWN_FUNGAL_BUTTON);
        addDrop(ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.BROWN_FUNGAL_FENCE);
        addDrop(ModBlocks.BROWN_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.BROWN_FUNGAL_SLAB, slabDrops(ModBlocks.BROWN_FUNGAL_SLAB));

        addDrop(ModBlocks.RED_FUNGAL_PLANKS);
        addDrop(ModBlocks.RED_FUNGAL_STAIRS);
        addDrop(ModBlocks.RED_FUNGAL_BUTTON);
        addDrop(ModBlocks.RED_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.RED_FUNGAL_FENCE);
        addDrop(ModBlocks.RED_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.RED_FUNGAL_SLAB, slabDrops(ModBlocks.RED_FUNGAL_SLAB));

        addDrop(ModBlocks.ORANGE_FUNGAL_PLANKS);
        addDrop(ModBlocks.ORANGE_FUNGAL_STAIRS);
        addDrop(ModBlocks.ORANGE_FUNGAL_BUTTON);
        addDrop(ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.ORANGE_FUNGAL_FENCE);
        addDrop(ModBlocks.ORANGE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.ORANGE_FUNGAL_SLAB, slabDrops(ModBlocks.ORANGE_FUNGAL_SLAB));

        addDrop(ModBlocks.YELLOW_FUNGAL_PLANKS);
        addDrop(ModBlocks.YELLOW_FUNGAL_STAIRS);
        addDrop(ModBlocks.YELLOW_FUNGAL_BUTTON);
        addDrop(ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.YELLOW_FUNGAL_FENCE);
        addDrop(ModBlocks.YELLOW_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.YELLOW_FUNGAL_SLAB, slabDrops(ModBlocks.YELLOW_FUNGAL_SLAB));

        addDrop(ModBlocks.LIME_FUNGAL_PLANKS);
        addDrop(ModBlocks.LIME_FUNGAL_STAIRS);
        addDrop(ModBlocks.LIME_FUNGAL_BUTTON);
        addDrop(ModBlocks.LIME_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.LIME_FUNGAL_FENCE);
        addDrop(ModBlocks.LIME_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.LIME_FUNGAL_SLAB, slabDrops(ModBlocks.LIME_FUNGAL_SLAB));

        addDrop(ModBlocks.GREEN_FUNGAL_PLANKS);
        addDrop(ModBlocks.GREEN_FUNGAL_STAIRS);
        addDrop(ModBlocks.GREEN_FUNGAL_BUTTON);
        addDrop(ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.GREEN_FUNGAL_FENCE);
        addDrop(ModBlocks.GREEN_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.GREEN_FUNGAL_SLAB, slabDrops(ModBlocks.GREEN_FUNGAL_SLAB));

        addDrop(ModBlocks.CYAN_FUNGAL_PLANKS);
        addDrop(ModBlocks.CYAN_FUNGAL_STAIRS);
        addDrop(ModBlocks.CYAN_FUNGAL_BUTTON);
        addDrop(ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.CYAN_FUNGAL_FENCE);
        addDrop(ModBlocks.CYAN_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.CYAN_FUNGAL_SLAB, slabDrops(ModBlocks.CYAN_FUNGAL_SLAB));

        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.LIGHT_BLUE_FUNGAL_SLAB, slabDrops(ModBlocks.LIGHT_BLUE_FUNGAL_SLAB));

        addDrop(ModBlocks.BLUE_FUNGAL_PLANKS);
        addDrop(ModBlocks.BLUE_FUNGAL_STAIRS);
        addDrop(ModBlocks.BLUE_FUNGAL_BUTTON);
        addDrop(ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.BLUE_FUNGAL_FENCE);
        addDrop(ModBlocks.BLUE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.BLUE_FUNGAL_SLAB, slabDrops(ModBlocks.BLUE_FUNGAL_SLAB));

        addDrop(ModBlocks.PURPLE_FUNGAL_PLANKS);
        addDrop(ModBlocks.PURPLE_FUNGAL_STAIRS);
        addDrop(ModBlocks.PURPLE_FUNGAL_BUTTON);
        addDrop(ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.PURPLE_FUNGAL_FENCE);
        addDrop(ModBlocks.PURPLE_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.PURPLE_FUNGAL_SLAB, slabDrops(ModBlocks.PURPLE_FUNGAL_SLAB));

        addDrop(ModBlocks.MAGENTA_FUNGAL_PLANKS);
        addDrop(ModBlocks.MAGENTA_FUNGAL_STAIRS);
        addDrop(ModBlocks.MAGENTA_FUNGAL_BUTTON);
        addDrop(ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.MAGENTA_FUNGAL_FENCE);
        addDrop(ModBlocks.MAGENTA_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.MAGENTA_FUNGAL_SLAB, slabDrops(ModBlocks.MAGENTA_FUNGAL_SLAB));

        addDrop(ModBlocks.PINK_FUNGAL_PLANKS);
        addDrop(ModBlocks.PINK_FUNGAL_STAIRS);
        addDrop(ModBlocks.PINK_FUNGAL_BUTTON);
        addDrop(ModBlocks.PINK_FUNGAL_PRESSURE_PLATE);
        addDrop(ModBlocks.PINK_FUNGAL_FENCE);
        addDrop(ModBlocks.PINK_FUNGAL_FENCE_GATE);
        addDrop(ModBlocks.PINK_FUNGAL_SLAB, slabDrops(ModBlocks.PINK_FUNGAL_SLAB));

        addDrop(ModBlocks.STAINED_STONE_LIGHT_15, drops(Blocks.STONE));
        addDrop(ModBlocks.STAINED_STONE_LIGHT_30, drops(Blocks.STONE));
        addDrop(ModBlocks.STAINED_STONE_DARK_15, drops(Blocks.STONE));
        addDrop(ModBlocks.STAINED_STONE_DARK_30, drops(Blocks.STONE));
        addDrop(ModBlocks.STAINED_STONE_DARK_45, drops(Blocks.STONE));
        addDrop(ModBlocks.STAINED_STONE_DARK_60, drops(Blocks.STONE));
        addDrop(ModBlocks.STAINED_STONE_DARK_75, drops(Blocks.STONE));
        addDrop(ModBlocks.STAINED_STONE_DARK_90, drops(Blocks.STONE));
        addDrop(ModBlocks.STAINED_STONE_DARK_105, drops(Blocks.STONE));

        addDrop(ModBlocks.ANDESITE_BRICKS);
        addDrop(ModBlocks.CHISELED_ANDESITE);
        addDrop(ModBlocks.DIORITE_BRICKS);
        addDrop(ModBlocks.CHISELED_DIORITE);
        addDrop(ModBlocks.GRANITE_BRICKS);
        addDrop(ModBlocks.CHISELED_GRANITE);
        addDrop(ModBlocks.CHISELED_STONE);
        addDrop(ModBlocks.DRIPSTONE_BRICKS);
        addDrop(ModBlocks.CHISELED_DRIPSTONE);
        addDrop(ModBlocks.POLISHED_DRIPSTONE);
        addDrop(ModBlocks.CHISELED_MUD);
        addDrop(ModBlocks.POLISHED_MUD);
        addDrop(ModBlocks.PACKED_DIRT);
        addDrop(ModBlocks.PACKED_SAND);
        addDrop(ModBlocks.PACKED_RED_SAND);
        addDrop(ModBlocks.SILT);
        addDrop(ModBlocks.DRIED_SILT);
        addDrop(ModBlocks.SILT_BRICKS);
        addDrop(ModBlocks.CHISELED_SILT_BRICKS);
        addDrop(ModBlocks.POLISHED_SILT);
        addDrop(ModBlocks.BLUE_NETHER_BRICKS);
        addDrop(ModBlocks.CHISELED_BLUE_NETHER_BRICKS);
        addDrop(ModBlocks.POLISHED_BLUE_NETHER_BRICKS);
        addDrop(ModBlocks.TAINTED_NETHER_BRICKS);
        addDrop(ModBlocks.CHISELED_RED_NETHER_BRICKS);
        addDrop(ModBlocks.POLISHED_RED_NETHER_BRICKS);
        addDrop(ModBlocks.SOUL_BRICKS);
        addDrop(ModBlocks.POLISHED_SOUL_SAND);
        addDrop(ModBlocks.CHISELED_SOUL_BRICKS);
        addDrop(ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS);
        addDrop(ModBlocks.POLISHED_BASALT_BRICKS);
        addDrop(ModBlocks.POLISHED_BASALT_TILES);
        addDrop(ModBlocks.CUT_POLISHED_BASALT);
        addDrop(ModBlocks.CHISELED_POLISHED_BASALT);

        addDrop(ModBlocks.ASHEN_SAND);
        addDrop(ModBlocks.ASHEN_SANDSTONE);
        addDrop(ModBlocks.CHISELED_ASHEN_SANDSTONE);
        addDrop(ModBlocks.CHISELED_GRIMROCK);
        addDrop(ModBlocks.COBBLED_GRIMROCK);
        addDrop(ModBlocks.CUT_ASHEN_SANDSTONE);
//        addDrop(ModBlocks.DAMP_MOSS_BLOCK); //TODO
        addDrop(ModBlocks.GRIMOSS_BLOCK);
        addDrop(ModBlocks.GRIMROCK);
        addDrop(ModBlocks.GRIMROCK_BRICKS);
        addDrop(ModBlocks.GRIMWEED_BLOCK);
        addDrop(ModBlocks.MOSSY_GRIMROCK_BRICKS);
        addDrop(ModBlocks.PACKED_ASHEN_SAND);
        addDrop(ModBlocks.PALE_GRIMWEED_BLOCK);
        addDrop(ModBlocks.POLISHED_GRIMROCK);
        addDrop(ModBlocks.BLIGHTED_SHROOMLIGHT);

        addDrop(ModBlocks.LIMESTONE);
        addDrop(ModBlocks.LIMESTONE_STAIRS);
        addDrop(ModBlocks.LIMESTONE_SLAB, slabDrops(ModBlocks.LIMESTONE_SLAB));
        addDrop(ModBlocks.LIMESTONE_WALL);
        addDrop(ModBlocks.CHISELED_LIMESTONE);
        addDrop(ModBlocks.LIMESTONE_BRICKS);
        addDrop(ModBlocks.LIMESTONE_BRICKS_STAIRS);
        addDrop(ModBlocks.LIMESTONE_BRICKS_SLAB, slabDrops(ModBlocks.LIMESTONE_BRICKS_SLAB));
        addDrop(ModBlocks.LIMESTONE_BRICKS_WALL);
        addDrop(ModBlocks.POLISHED_LIMESTONE);
        addDrop(ModBlocks.POLISHED_LIMESTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_LIMESTONE_SLAB, slabDrops(ModBlocks.POLISHED_LIMESTONE_SLAB));
        addDrop(ModBlocks.POLISHED_LIMESTONE_WALL);
        addDrop(ModBlocks.SANDY_LIMESTONE_BRICKS);
        addDrop(ModBlocks.SANDY_LIMESTONE_BRICKS_STAIRS);
        addDrop(ModBlocks.SANDY_LIMESTONE_BRICKS_SLAB, slabDrops(ModBlocks.SANDY_LIMESTONE_BRICKS_SLAB));
        addDrop(ModBlocks.SANDY_LIMESTONE_BRICKS_WALL);

        addDrop(ModBlocks.GRIMROCK);
        addDrop(ModBlocks.GRIMROCK_STAIRS);
        addDrop(ModBlocks.GRIMROCK_SLAB, slabDrops(ModBlocks.GRIMROCK_SLAB));
        addDrop(ModBlocks.GRIMROCK_WALL);
        addDrop(ModBlocks.CHISELED_GRIMROCK);
        addDrop(ModBlocks.COBBLED_GRIMROCK);
        addDrop(ModBlocks.COBBLED_GRIMROCK_STAIRS);
        addDrop(ModBlocks.COBBLED_GRIMROCK_SLAB, slabDrops(ModBlocks.COBBLED_GRIMROCK_SLAB));
        addDrop(ModBlocks.COBBLED_GRIMROCK_WALL);
        addDrop(ModBlocks.CRACKED_GRIMROCK_BRICKS);
        addDrop(ModBlocks.CRACKED_GRIMROCK_BRICKS_STAIRS);
        addDrop(ModBlocks.CRACKED_GRIMROCK_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_GRIMROCK_BRICKS_SLAB));
        addDrop(ModBlocks.CRACKED_GRIMROCK_BRICKS_WALL);
        addDrop(ModBlocks.GRIMROCK_BRICKS);
        addDrop(ModBlocks.GRIMROCK_BRICKS_STAIRS);
        addDrop(ModBlocks.GRIMROCK_BRICKS_SLAB, slabDrops(ModBlocks.GRIMROCK_BRICKS_SLAB));
        addDrop(ModBlocks.GRIMROCK_BRICKS_WALL);
        addDrop(ModBlocks.MOSSY_GRIMROCK_BRICKS);
        addDrop(ModBlocks.MOSSY_GRIMROCK_BRICKS_STAIRS);
        addDrop(ModBlocks.MOSSY_GRIMROCK_BRICKS_SLAB, slabDrops(ModBlocks.MOSSY_GRIMROCK_BRICKS_SLAB));
        addDrop(ModBlocks.MOSSY_GRIMROCK_BRICKS_WALL);
        addDrop(ModBlocks.POLISHED_GRIMROCK);
        addDrop(ModBlocks.POLISHED_GRIMROCK_STAIRS);
        addDrop(ModBlocks.POLISHED_GRIMROCK_SLAB, slabDrops(ModBlocks.POLISHED_GRIMROCK_SLAB));
        addDrop(ModBlocks.POLISHED_GRIMROCK_WALL);

        addDrop(ModBlocks.LOAM);
        addDrop(ModBlocks.CHISELED_PACKED_LOAM);
        addDrop(ModBlocks.MOSSY_PACKED_LOAM_BRICKS);
        addDrop(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_STAIRS);
        addDrop(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_SLAB, slabDrops(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_SLAB));
        addDrop(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_WALL);
        addDrop(ModBlocks.PACKED_LOAM);
        addDrop(ModBlocks.PACKED_LOAM_STAIRS);
        addDrop(ModBlocks.PACKED_LOAM_SLAB, slabDrops(ModBlocks.PACKED_LOAM_SLAB));
        addDrop(ModBlocks.PACKED_LOAM_WALL);
        addDrop(ModBlocks.PACKED_LOAM_BRICKS);
        addDrop(ModBlocks.PACKED_LOAM_BRICKS_STAIRS);
        addDrop(ModBlocks.PACKED_LOAM_BRICKS_SLAB, slabDrops(ModBlocks.PACKED_LOAM_BRICKS_SLAB));
        addDrop(ModBlocks.PACKED_LOAM_BRICKS_WALL);

        addDrop(ModBlocks.SILT);
        addDrop(ModBlocks.DRIED_SILT);
        addDrop(ModBlocks.DRIED_SILT_STAIRS);
        addDrop(ModBlocks.DRIED_SILT_SLAB, slabDrops(ModBlocks.DRIED_SILT_SLAB));
        addDrop(ModBlocks.PACKED_DIRT_SLAB, slabDrops(ModBlocks.PACKED_DIRT_SLAB));
        addDrop(ModBlocks.DRIED_SILT_WALL);
        addDrop(ModBlocks.POLISHED_SILT);
        addDrop(ModBlocks.POLISHED_SILT_STAIRS);
        addDrop(ModBlocks.POLISHED_SILT_SLAB, slabDrops(ModBlocks.POLISHED_SILT_SLAB));
        addDrop(ModBlocks.POLISHED_SILT_WALL);
        addDrop(ModBlocks.SILT_BRICKS);
        addDrop(ModBlocks.SILT_BRICKS_STAIRS);
        addDrop(ModBlocks.SILT_BRICKS_SLAB, slabDrops(ModBlocks.SILT_BRICKS_SLAB));
        addDrop(ModBlocks.SILT_BRICKS_WALL);

        addDrop(ModBlocks.SLATE);
        addDrop(ModBlocks.SLATE_STAIRS);
        addDrop(ModBlocks.SLATE_SLAB, slabDrops(ModBlocks.SLATE_SLAB));
        addDrop(ModBlocks.SLATE_WALL);
        addDrop(ModBlocks.CHISELED_SLATE);
        addDrop(ModBlocks.POLISHED_SLATE);
        addDrop(ModBlocks.POLISHED_SLATE_STAIRS);
        addDrop(ModBlocks.POLISHED_SLATE_SLAB, slabDrops(ModBlocks.POLISHED_SLATE_SLAB));
        addDrop(ModBlocks.POLISHED_SLATE_WALL);
        addDrop(ModBlocks.SLATE_BRICKS);
        addDrop(ModBlocks.SLATE_BRICKS_STAIRS);
        addDrop(ModBlocks.SLATE_BRICKS_SLAB, slabDrops(ModBlocks.SLATE_BRICKS_SLAB));
        addDrop(ModBlocks.SLATE_BRICKS_WALL);

        addDrop(ModBlocks.STRATA);
        addDrop(ModBlocks.STRATA_STAIRS);
        addDrop(ModBlocks.STRATA_SLAB, slabDrops(ModBlocks.STRATA_SLAB));
        addDrop(ModBlocks.STRATA_WALL);
        addDrop(ModBlocks.CHISELED_STRATA);
        addDrop(ModBlocks.POLISHED_STRATA);
        addDrop(ModBlocks.POLISHED_STRATA_STAIRS);
        addDrop(ModBlocks.POLISHED_STRATA_SLAB, slabDrops(ModBlocks.POLISHED_STRATA_SLAB));
        addDrop(ModBlocks.POLISHED_STRATA_WALL);
        addDrop(ModBlocks.STRATA_BRICKS);
        addDrop(ModBlocks.STRATA_BRICKS_STAIRS);
        addDrop(ModBlocks.STRATA_BRICKS_SLAB, slabDrops(ModBlocks.STRATA_BRICKS_SLAB));
        addDrop(ModBlocks.STRATA_BRICKS_WALL);

        addDrop(ModBlocks.DOLOMITE);
        addDrop(ModBlocks.DOLOMITE_STAIRS);
        addDrop(ModBlocks.DOLOMITE_SLAB, slabDrops(ModBlocks.DOLOMITE_SLAB));
        addDrop(ModBlocks.DOLOMITE_WALL);
        addDrop(ModBlocks.CHISELED_DOLOMITE);
        addDrop(ModBlocks.POLISHED_DOLOMITE);
        addDrop(ModBlocks.POLISHED_DOLOMITE_STAIRS);
        addDrop(ModBlocks.POLISHED_DOLOMITE_SLAB, slabDrops(ModBlocks.POLISHED_DOLOMITE_SLAB));
        addDrop(ModBlocks.POLISHED_DOLOMITE_WALL);
        addDrop(ModBlocks.DOLOMITE_BRICKS);
        addDrop(ModBlocks.DOLOMITE_BRICKS_STAIRS);
        addDrop(ModBlocks.DOLOMITE_BRICKS_SLAB, slabDrops(ModBlocks.DOLOMITE_BRICKS_SLAB));
        addDrop(ModBlocks.DOLOMITE_BRICKS_WALL);
        addDrop(ModBlocks.DOLOMITE_PILLAR);







    }
    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }
}
