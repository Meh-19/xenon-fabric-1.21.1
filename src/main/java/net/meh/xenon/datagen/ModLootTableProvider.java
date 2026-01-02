package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.meh.xenon.block.ModBlockFamilies;
import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.condition.SurvivesExplosionLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
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
        for (var family : ModBlockFamilies.STONES) {
            for (Block block : family.all()) {
                if (block instanceof SlabBlock) {
                    addDrop(block, slabDrops(block));
                } else {
                    addDrop(block);
                }
            }
        }

        addDrop(ModBlocks.SALVAGING_TABLE);
        addDrop(ModBlocks.PRISM_LANTERN);
        addDrop(ModBlocks.WHITE_CRYSTAL_BLOCK);
        addDrop(ModBlocks.WHITE_CRYSTAL_BRICKS);
        addDrop(ModBlocks.WHITE_CRYSTAL_LANTERN);
        addDrop(ModBlocks.CHISELED_WHITE_CRYSTAL_BRICKS);
        addDrop(ModBlocks.RED_CRYSTAL_BLOCK);
        addDrop(ModBlocks.RED_CRYSTAL_BRICKS);
        addDrop(ModBlocks.RED_CRYSTAL_LANTERN);
        addDrop(ModBlocks.CHISELED_RED_CRYSTAL_BRICKS);
        addDrop(ModBlocks.RED_CRYSTAL);
        addDrop(ModBlocks.ORANGE_CRYSTAL_BLOCK);
        addDrop(ModBlocks.ORANGE_CRYSTAL_BRICKS);
        addDrop(ModBlocks.ORANGE_CRYSTAL_LANTERN);
        addDrop(ModBlocks.CHISELED_ORANGE_CRYSTAL_BRICKS);
        addDrop(ModBlocks.ORANGE_CRYSTAL);
        addDrop(ModBlocks.YELLOW_CRYSTAL_BLOCK);
        addDrop(ModBlocks.YELLOW_CRYSTAL_BRICKS);
        addDrop(ModBlocks.YELLOW_CRYSTAL_LANTERN);
        addDrop(ModBlocks.CHISELED_YELLOW_CRYSTAL_BRICKS);
        addDrop(ModBlocks.YELLOW_CRYSTAL);
        addDrop(ModBlocks.WHITE_CRYSTAL);
        addDrop(ModBlocks.GREEN_CRYSTAL_BLOCK);
        addDrop(ModBlocks.GREEN_CRYSTAL_BRICKS);
        addDrop(ModBlocks.GREEN_CRYSTAL_LANTERN);
        addDrop(ModBlocks.CHISELED_GREEN_CRYSTAL_BRICKS);
        addDrop(ModBlocks.GREEN_CRYSTAL);
        addDrop(ModBlocks.BLUE_CRYSTAL_BLOCK);
        addDrop(ModBlocks.BLUE_CRYSTAL_BRICKS);
        addDrop(ModBlocks.BLUE_CRYSTAL_LANTERN);
        addDrop(ModBlocks.CHISELED_BLUE_CRYSTAL_BRICKS);
        addDrop(ModBlocks.BLUE_CRYSTAL);
        addDrop(ModBlocks.PURPLE_CRYSTAL_BLOCK);
        addDrop(ModBlocks.PURPLE_CRYSTAL_BRICKS);
        addDrop(ModBlocks.PURPLE_CRYSTAL_LANTERN);
        addDrop(ModBlocks.CHISELED_PURPLE_CRYSTAL_BRICKS);
        addDrop(ModBlocks.PURPLE_CRYSTAL);

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
        addDrop(ModBlocks.SHOJI);
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

        addDrop(ModBlocks.ASHEN_SAND);
        addDrop(ModBlocks.ASHEN_SANDSTONE);
        addDrop(ModBlocks.CHISELED_ASHEN_SANDSTONE);
        addDrop(ModBlocks.CHISELED_GRIMROCK);
        addDrop(ModBlocks.COBBLED_GRIMROCK);
        addDrop(ModBlocks.CUT_ASHEN_SANDSTONE);
        addDrop(ModBlocks.DAMP_MOSS_BLOCK);
        addDrop(ModBlocks.GRIMOSS_BLOCK);
        addDrop(ModBlocks.GRIMOSS);
        addDrop(ModBlocks.DAMP_MOSS);
        addDrop(ModBlocks.ASH);
        addDropWithSilkTouch(ModBlocks.PERMAFROST, Blocks.DIRT);
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

        addDrop(ModBlocks.RHYOLITE);
        addDrop(ModBlocks.RHYOLITE_STAIRS);
        addDrop(ModBlocks.RHYOLITE_SLAB, slabDrops(ModBlocks.RHYOLITE_SLAB));
        addDrop(ModBlocks.RHYOLITE_WALL);
        addDrop(ModBlocks.MOSSY_RHYOLITE);
        addDrop(ModBlocks.MOSSY_RHYOLITE_STAIRS);
        addDrop(ModBlocks.MOSSY_RHYOLITE_SLAB, slabDrops(ModBlocks.MOSSY_RHYOLITE_SLAB));
        addDrop(ModBlocks.MOSSY_RHYOLITE_WALL);
        addDrop(ModBlocks.CHISELED_LIMESTONE);
        addDrop(ModBlocks.RHYOLITE_BRICKS);
        addDrop(ModBlocks.RHYOLITE_BRICKS_STAIRS);
        addDrop(ModBlocks.RHYOLITE_BRICKS_SLAB, slabDrops(ModBlocks.RHYOLITE_BRICKS_SLAB));
        addDrop(ModBlocks.RHYOLITE_BRICKS_WALL);
        addDrop(ModBlocks.CRACKED_RHYOLITE_BRICKS);
        addDrop(ModBlocks.CRACKED_RHYOLITE_BRICKS_STAIRS);
        addDrop(ModBlocks.CRACKED_RHYOLITE_BRICKS_SLAB, slabDrops(ModBlocks.CRACKED_RHYOLITE_BRICKS_SLAB));
        addDrop(ModBlocks.CRACKED_RHYOLITE_BRICKS_WALL);
        addDrop(ModBlocks.POLISHED_LIMESTONE);
        addDrop(ModBlocks.MOSSY_RHYOLITE_BRICKS);
        addDrop(ModBlocks.MOSSY_RHYOLITE_BRICKS_STAIRS);
        addDrop(ModBlocks.MOSSY_RHYOLITE_BRICKS_SLAB, slabDrops(ModBlocks.MOSSY_RHYOLITE_BRICKS_SLAB));
        addDrop(ModBlocks.MOSSY_RHYOLITE_BRICKS_WALL);

        addDrop(ModBlocks.KYANITE);
        addDrop(ModBlocks.KYANITE_STAIRS);
        addDrop(ModBlocks.KYANITE_SLAB, slabDrops(ModBlocks.KYANITE_SLAB));
        addDrop(ModBlocks.KYANITE_WALL);
        addDrop(ModBlocks.CHISELED_KYANITE);
        addDrop(ModBlocks.KYANITE_BRICKS);
        addDrop(ModBlocks.KYANITE_BRICKS_STAIRS);
        addDrop(ModBlocks.KYANITE_BRICKS_SLAB, slabDrops(ModBlocks.KYANITE_BRICKS_SLAB));
        addDrop(ModBlocks.KYANITE_BRICKS_WALL);
        addDrop(ModBlocks.POLISHED_KYANITE);
        addDrop(ModBlocks.POLISHED_KYANITE_STAIRS);
        addDrop(ModBlocks.POLISHED_KYANITE_SLAB, slabDrops(ModBlocks.POLISHED_KYANITE_SLAB));
        addDrop(ModBlocks.POLISHED_KYANITE_WALL);

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
        addDrop(ModBlocks.RHYOLITE_PILLAR);
        addDrop(ModBlocks.BRITTLE_BONE_BLOCK);
        addDrop(ModBlocks.CARVED_BRITTLE_BONE_BLOCK);
        addDrop(ModBlocks.BLIGHTED_BONE_BLOCK);
        addDrop(ModBlocks.CARVED_BLIGHTED_BONE_BLOCK);
        addDrop(ModBlocks.SCORCHED_BONE_BLOCK);
        addDrop(ModBlocks.CARVED_SCORCHED_BONE_BLOCK);
        addDrop(ModBlocks.SCORIA);
        addDrop(ModBlocks.MOLTEN_SCORIA);
        addDrop(ModBlocks.SCORIA_BRICKS);
        addDrop(ModBlocks.SCORIA_BRICKS_SLAB, slabDrops(ModBlocks.SCORIA_BRICKS_SLAB));
        addDrop(ModBlocks.SCORIA_BRICKS_STAIRS);
        addDrop(ModBlocks.SCORIA_BRICKS_WALL);
        addDrop(ModBlocks.MOLTEN_SCORIA_BRICKS_SLAB, slabDrops(ModBlocks.MOLTEN_SCORIA_BRICKS_SLAB));
        addDrop(ModBlocks.MOLTEN_SCORIA_BRICKS_STAIRS);
        addDrop(ModBlocks.MOLTEN_SCORIA_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_SCORIA);
        addDrop(ModBlocks.CHISELED_MOLTEN_SCORIA);

        addDrop(ModBlocks.ECHO_GLASS, dropsWithSilkTouch(ModBlocks.ECHO_GLASS));

        addDrop(ModBlocks.GRAVESTONE);
        addDrop(ModBlocks.CHISELED_GRAVESTONE);
        addDrop(ModBlocks.GRAVESTONE_BRICKS);
        addDrop(ModBlocks.GRAVESTONE_BRICKS_STAIRS);
        addDrop(ModBlocks.GRAVESTONE_BRICKS_SLAB, slabDrops(ModBlocks.GRAVESTONE_BRICKS_SLAB));
        addDrop(ModBlocks.GRAVESTONE_BRICKS_WALL);
        addDrop(ModBlocks.POLISHED_GRAVESTONE);
        addDrop(ModBlocks.POLISHED_GRAVESTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_GRAVESTONE_SLAB, slabDrops(ModBlocks.POLISHED_GRAVESTONE_SLAB));
        addDrop(ModBlocks.POLISHED_GRAVESTONE_WALL);

        addDrop(ModBlocks.CHISELED_DRIPSTONE);
        addDrop(ModBlocks.DRIPSTONE_BRICKS);
        addDrop(ModBlocks.DRIPSTONE_BRICKS_STAIRS);
        addDrop(ModBlocks.DRIPSTONE_BRICKS_SLAB, slabDrops(ModBlocks.DRIPSTONE_BRICKS_SLAB));
        addDrop(ModBlocks.DRIPSTONE_BRICKS_WALL);
        addDrop(ModBlocks.POLISHED_DRIPSTONE);
        addDrop(ModBlocks.POLISHED_DRIPSTONE_STAIRS);
        addDrop(ModBlocks.POLISHED_DRIPSTONE_SLAB, slabDrops(ModBlocks.POLISHED_DRIPSTONE_SLAB));
        addDrop(ModBlocks.POLISHED_DRIPSTONE_WALL);

        addDrop(ModBlocks.CHISELED_POLISHED_BASALT);
        addDrop(ModBlocks.CUT_POLISHED_BASALT);
        addDrop(ModBlocks.CUT_POLISHED_BASALT_STAIRS);
        addDrop(ModBlocks.CUT_POLISHED_BASALT_SLAB, slabDrops(ModBlocks.CUT_POLISHED_BASALT_SLAB));
        addDrop(ModBlocks.CUT_POLISHED_BASALT_WALL);
        addDrop(ModBlocks.POLISHED_BASALT_BRICKS);
        addDrop(ModBlocks.POLISHED_BASALT_BRICKS_STAIRS);
        addDrop(ModBlocks.POLISHED_BASALT_BRICKS_SLAB, slabDrops(ModBlocks.POLISHED_BASALT_BRICKS_SLAB));
        addDrop(ModBlocks.POLISHED_BASALT_BRICKS_WALL);
        addDrop(ModBlocks.POLISHED_BASALT_TILES);
        addDrop(ModBlocks.POLISHED_BASALT_TILES_STAIRS);
        addDrop(ModBlocks.POLISHED_BASALT_TILES_SLAB, slabDrops(ModBlocks.POLISHED_BASALT_TILES_SLAB));
        addDrop(ModBlocks.POLISHED_BASALT_TILES_WALL);

        addDrop(ModBlocks.BLUE_NETHER_BRICKS);
        addDrop(ModBlocks.BLUE_NETHER_BRICKS_STAIRS);
        addDrop(ModBlocks.BLUE_NETHER_BRICKS_SLAB, slabDrops(ModBlocks.BLUE_NETHER_BRICKS_SLAB));
        addDrop(ModBlocks.BLUE_NETHER_BRICKS_WALL);
        addDrop(ModBlocks.CHISELED_BLUE_NETHER_BRICKS);
        addDrop(ModBlocks.CHISELED_RED_NETHER_BRICKS);
        addDrop(ModBlocks.POLISHED_BLUE_NETHER_BRICKS);
        addDrop(ModBlocks.POLISHED_NETHER_BRICKS);
        addDrop(ModBlocks.POLISHED_RED_NETHER_BRICKS);
        addDrop(ModBlocks.TAINTED_NETHER_BRICKS);
        addDrop(ModBlocks.TAINTED_NETHER_BRICKS_STAIRS);
        addDrop(ModBlocks.TAINTED_NETHER_BRICKS_SLAB, slabDrops(ModBlocks.TAINTED_NETHER_BRICKS_SLAB));
        addDrop(ModBlocks.TAINTED_NETHER_BRICKS_WALL);

        addDrop(ModBlocks.CHISELED_SOUL_BRICKS);
        addDrop(ModBlocks.POLISHED_SOULSAND);
        addDrop(ModBlocks.POLISHED_SOULSAND_STAIRS);
        addDrop(ModBlocks.POLISHED_SOULSAND_SLAB, slabDrops(ModBlocks.POLISHED_SOULSAND_SLAB));
        addDrop(ModBlocks.POLISHED_SOULSAND_WALL);
        addDrop(ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS);
        addDrop(ModBlocks.SOUL_BRICKS);
        addDrop(ModBlocks.SOUL_BRICKS_STAIRS);
        addDrop(ModBlocks.SOUL_BRICKS_SLAB, slabDrops(ModBlocks.SOUL_BRICKS_SLAB));
        addDrop(ModBlocks.SOUL_BRICKS_WALL);

        addDrop(ModBlocks.CHISELED_SNOW_BRICKS);
        addDrop(ModBlocks.PACKED_SNOW);
        addDrop(ModBlocks.PACKED_SNOW_STAIRS);
        addDrop(ModBlocks.PACKED_SNOW_SLAB, slabDrops(ModBlocks.PACKED_SNOW_SLAB));
        addDrop(ModBlocks.PACKED_SNOW_WALL);
        addDrop(ModBlocks.SNOW_BRICKS);
        addDrop(ModBlocks.SNOW_BRICKS_STAIRS);
        addDrop(ModBlocks.SNOW_BRICKS_SLAB, slabDrops(ModBlocks.SNOW_BRICKS_SLAB));
        addDrop(ModBlocks.SNOW_BRICKS_WALL);

        addDrop(ModBlocks.CHISELED_PACKED_ICE_BRICKS);
        addDrop(ModBlocks.PACKED_ICE_BRICKS);
        addDrop(ModBlocks.PACKED_ICE_BRICKS_STAIRS);
        addDrop(ModBlocks.PACKED_ICE_BRICKS_SLAB, slabDrops(ModBlocks.PACKED_ICE_BRICKS_SLAB));
        addDrop(ModBlocks.PACKED_ICE_BRICKS_WALL);
        addDrop(ModBlocks.POLISHED_PACKED_ICE);
        addDrop(ModBlocks.POLISHED_PACKED_ICE_STAIRS);
        addDrop(ModBlocks.POLISHED_PACKED_ICE_SLAB, slabDrops(ModBlocks.POLISHED_PACKED_ICE_SLAB));
        addDrop(ModBlocks.POLISHED_PACKED_ICE_WALL);

        addDrop(ModBlocks.CHISELED_PRISMARINE);
        addDrop(ModBlocks.POLISHED_PRISMARINE);
        addDrop(ModBlocks.POLISHED_PRISMARINE_STAIRS);
        addDrop(ModBlocks.POLISHED_PRISMARINE_SLAB, slabDrops(ModBlocks.POLISHED_PRISMARINE_SLAB));
        addDrop(ModBlocks.POLISHED_PRISMARINE_WALL);
        addDrop(ModBlocks.PRISMARINE_PILLAR);
        addDrop(ModBlocks.PRISMARINE_TILES);
        addDrop(ModBlocks.PRISMARINE_TILES_STAIRS);
        addDrop(ModBlocks.PRISMARINE_TILES_SLAB, slabDrops(ModBlocks.PRISMARINE_TILES_SLAB));
        addDrop(ModBlocks.PRISMARINE_TILES_WALL);

        addDrop(ModBlocks.TERRACOTTA_SHINGLES);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_WHITE);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_GRAY);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_GRAY);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_BLACK);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_BROWN);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_RED);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_ORANGE);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_YELLOW);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_LIME);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_GREEN);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_CYAN);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_BLUE);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_BLUE);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_PURPLE);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_MAGENTA);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_PINK);


        addDrop(ModBlocks.TERRACOTTA_SHINGLES_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_WHITE_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_GRAY_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_GRAY_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_BLACK_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_BROWN_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_RED_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_ORANGE_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_YELLOW_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_LIME_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_GREEN_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_CYAN_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_BLUE_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_BLUE_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_PURPLE_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_MAGENTA_STAIRS);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_PINK_STAIRS);

        addDrop(ModBlocks.TERRACOTTA_SHINGLES_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_WHITE_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_GRAY_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_GRAY_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_BLACK_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_BROWN_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_RED_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_ORANGE_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_YELLOW_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_LIME_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_GREEN_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_CYAN_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_BLUE_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_BLUE_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_PURPLE_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_MAGENTA_SLAB);
        addDrop(ModBlocks.TERRACOTTA_SHINGLES_PINK_SLAB);

        addDrop(ModBlocks.CONCRETE_BRICKS_WHITE);
        addDrop(ModBlocks.CONCRETE_BRICKS_LIGHT_GRAY);
        addDrop(ModBlocks.CONCRETE_BRICKS_GRAY);
        addDrop(ModBlocks.CONCRETE_BRICKS_BLACK);
        addDrop(ModBlocks.CONCRETE_BRICKS_BROWN);
        addDrop(ModBlocks.CONCRETE_BRICKS_RED);
        addDrop(ModBlocks.CONCRETE_BRICKS_ORANGE);
        addDrop(ModBlocks.CONCRETE_BRICKS_YELLOW);
        addDrop(ModBlocks.CONCRETE_BRICKS_LIME);
        addDrop(ModBlocks.CONCRETE_BRICKS_GREEN);
        addDrop(ModBlocks.CONCRETE_BRICKS_CYAN);
        addDrop(ModBlocks.CONCRETE_BRICKS_LIGHT_BLUE);
        addDrop(ModBlocks.CONCRETE_BRICKS_BLUE);
        addDrop(ModBlocks.CONCRETE_BRICKS_PURPLE);
        addDrop(ModBlocks.CONCRETE_BRICKS_MAGENTA);
        addDrop(ModBlocks.CONCRETE_BRICKS_PINK);

        addDrop(ModBlocks.QUILTED_WOOL_WHITE);
        addDrop(ModBlocks.QUILTED_WOOL_LIGHT_GRAY);
        addDrop(ModBlocks.QUILTED_WOOL_GRAY);
        addDrop(ModBlocks.QUILTED_WOOL_BLACK);
        addDrop(ModBlocks.QUILTED_WOOL_BROWN);
        addDrop(ModBlocks.QUILTED_WOOL_RED);
        addDrop(ModBlocks.QUILTED_WOOL_ORANGE);
        addDrop(ModBlocks.QUILTED_WOOL_YELLOW);
        addDrop(ModBlocks.QUILTED_WOOL_LIME);
        addDrop(ModBlocks.QUILTED_WOOL_GREEN);
        addDrop(ModBlocks.QUILTED_WOOL_CYAN);
        addDrop(ModBlocks.QUILTED_WOOL_LIGHT_BLUE);
        addDrop(ModBlocks.QUILTED_WOOL_BLUE);
        addDrop(ModBlocks.QUILTED_WOOL_PURPLE);
        addDrop(ModBlocks.QUILTED_WOOL_MAGENTA);
        addDrop(ModBlocks.QUILTED_WOOL_PINK);

        addDrop(ModBlocks.CLOSED_WOODEN_CRATE);
        addDrop(ModBlocks.ENFORCED_WOODEN_CRATE);
        addDrop(ModBlocks.SLATTED_WOODEN_CRATE);
        addDrop(ModBlocks.FRAMED_WOODEN_CRATE);

        addDrop(ModBlocks.CARROT_CRATE);
        addDrop(ModBlocks.POTATO_CRATE);
        addDrop(ModBlocks.BEET_CRATE);
        addDrop(ModBlocks.BERRY_BASKET);
        addDrop(ModBlocks.APPLE_BASKET);
        addDrop(ModBlocks.BAMBOO_BUNDLE);
        addDrop(ModBlocks.STICK_BUNDLE);
        addDrop(ModBlocks.SUGAR_CANE_BUNDLE);
        addDrop(ModBlocks.CACTUS_BUNDLE);


        addDrop(ModBlocks.CONCRETE_BRICKS_WHITE_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_LIGHT_GRAY_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_GRAY_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_BLACK_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_BROWN_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_RED_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_ORANGE_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_YELLOW_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_LIME_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_GREEN_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_CYAN_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_LIGHT_BLUE_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_BLUE_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_PURPLE_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_MAGENTA_STAIRS);
        addDrop(ModBlocks.CONCRETE_BRICKS_PINK_STAIRS);

        addDrop(ModBlocks.CONCRETE_BRICKS_WHITE_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_LIGHT_GRAY_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_GRAY_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_BLACK_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_BROWN_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_RED_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_ORANGE_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_YELLOW_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_LIME_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_GREEN_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_CYAN_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_LIGHT_BLUE_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_BLUE_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_PURPLE_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_MAGENTA_SLAB);
        addDrop(ModBlocks.CONCRETE_BRICKS_PINK_SLAB);

        dropsWithShears(ModBlocks.HOGWEED);
        dropsWithShears(ModBlocks.TALL_HOGWEED);
        dropsWithShears(ModBlocks.FROSTED_GRASS);
        dropsWithShears(ModBlocks.TALL_FROSTED_GRASS);
        dropsWithShears(ModBlocks.DRY_GRASS);
        dropsWithShears(ModBlocks.TALL_DRY_GRASS);
        dropsWithShears(ModBlocks.HIBISCUS);
        dropsWithShears(ModBlocks.OCULUS_ORCHID);
        dropsWithShears(ModBlocks.CATTAIL);
        dropsWithShears(ModBlocks.CLOVER);
        dropsWithShears(ModBlocks.GRIMWEED);
        dropsWithShears(ModBlocks.PALE_GRIMWEED);
        dropsWithShears(ModBlocks.TALL_GRIMWEED);
        dropsWithShears(ModBlocks.TALL_PALE_GRIMWEED);
        dropsWithShears(ModBlocks.DRY_BUSH);
        dropsWithShears(ModBlocks.TALL_DRY_BUSH);
        dropsStick(ModBlocks.STICK);
        dropsWithShears(ModBlocks.SOUL_STALKS);
        dropsWithShears(ModBlocks.TALL_SOUL_STALKS);
        dropsWithShears(ModBlocks.SMALL_LILY);
        dropsWithShears(ModBlocks.SCULK_VINES);
                dropsWithShears(ModBlocks.SCULK_VINES_END);
        dropsWithShears(ModBlocks.GRIMOSS_HANG);
        dropsWithShears(ModBlocks.GRIMOSS_HANG_BOTTOM);
        dropsWithShears(ModBlocks.DAMP_MOSS_HANG);
        dropsWithShears(ModBlocks.DAMP_MOSS_HANG_BOTTOM);
                dropsWithShears(ModBlocks.WARPED_VEIL);
                dropsWithShears(ModBlocks.WARPED_VEIL_BOTTOM);
        dropsWithShears(ModBlocks.ORANGE_MYCENA);
        dropsWithShears(ModBlocks.BEACH_GRASS);
        dropsWithShears(ModBlocks.TALL_BEACH_GRASS);
        dropsWithShears(ModBlocks.AMARYLLIS);
        dropsWithShears(ModBlocks.BRAMBLE);
        dropsWithShears(ModBlocks.TALL_BRAMBLE);
    }


    public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));
    }

    public LootTable.Builder dropsStick(Block dropPerishes) {
        return LootTable.builder()
                .pool(LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .with(ItemEntry.builder(Items.STICK)
                                .apply(SetCountLootFunction.builder(ConstantLootNumberProvider.create(1))))
                        .conditionally(SurvivesExplosionLootCondition.builder()));
    }
}
