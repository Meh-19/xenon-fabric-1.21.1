package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(BlockTags.LOGS)
                .add(ModBlocks.MAPLE_LOG, ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_WOOD,
                        ModBlocks.BLEAK_LOG, ModBlocks.BLEAK_WOOD, ModBlocks.STRIPPED_BLEAK_LOG, ModBlocks.STRIPPED_BLEAK_WOOD,
                        ModBlocks.FIR_LOG, ModBlocks.FIR_WOOD, ModBlocks.STRIPPED_FIR_LOG, ModBlocks.STRIPPED_FIR_WOOD,
                        ModBlocks.PALM_LOG, ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_LOG, ModBlocks.STRIPPED_PALM_WOOD,
                        ModBlocks.BAYOU_LOG, ModBlocks.BAYOU_WOOD, ModBlocks.STRIPPED_BAYOU_LOG, ModBlocks.STRIPPED_BAYOU_WOOD,
                        ModBlocks.WISTERIA_LOG, ModBlocks.WISTERIA_WOOD, ModBlocks.STRIPPED_WISTERIA_LOG, ModBlocks.STRIPPED_WISTERIA_WOOD,
                        ModBlocks.BAOBAB_LOG, ModBlocks.BAOBAB_WOOD, ModBlocks.STRIPPED_BAOBAB_LOG, ModBlocks.STRIPPED_BAOBAB_WOOD);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)
                .add(ModBlocks.PLATINUM_BLOCK)
                .add(ModBlocks.PLATINUM_BRICKS)
                .add(ModBlocks.PLATINUM_PILLAR)

                .add(ModBlocks.DIAMOND_BRICK)
                .add(ModBlocks.DIAMOND_PILLAR)
                .add(ModBlocks.EMERALD_BRICK)
                .add(ModBlocks.EMERALD_PILLAR)
                .add(ModBlocks.GOLD_BRICK)
                .add(ModBlocks.GOLD_PILLAR)
                .add(ModBlocks.IRON_BRICK)
                .add(ModBlocks.IRON_PILLAR)
                .add(ModBlocks.NETHERITE_BRICK)
                .add(ModBlocks.NETHERITE_PILLAR)


                .add(ModBlocks.RUBY_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE)
                .add(ModBlocks.RUBY_BLOCK)
                .add(ModBlocks.RUBY_BRICKS)
                .add(ModBlocks.RUBY_PILLAR)

                .add(ModBlocks.STAINED_STONE_LIGHT_15)
                .add(ModBlocks.STAINED_STONE_LIGHT_30)
                .add(ModBlocks.STAINED_STONE_DARK_15)
                .add(ModBlocks.STAINED_STONE_DARK_30)
                .add(ModBlocks.STAINED_STONE_DARK_45)
                .add(ModBlocks.STAINED_STONE_DARK_60)
                .add(ModBlocks.STAINED_STONE_DARK_75)
                .add(ModBlocks.STAINED_STONE_DARK_90)
                .add(ModBlocks.STAINED_STONE_DARK_105)
                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.CHISELED_ANDESITE)
                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.CHISELED_DIORITE)
                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.CHISELED_GRANITE)
                .add(ModBlocks.CHISELED_STONE)
                .add(ModBlocks.DRIPSTONE_BRICKS)
                .add(ModBlocks.CHISELED_DRIPSTONE)
                .add(ModBlocks.POLISHED_DRIPSTONE)
                .add(ModBlocks.CHISELED_MUD)
                .add(ModBlocks.POLISHED_MUD)
                .add(ModBlocks.SLATE)
                .add(ModBlocks.SLATE_BRICKS)
                .add(ModBlocks.CHISELED_SLATE)
                .add(ModBlocks.POLISHED_SLATE)
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.LIMESTONE_BRICKS)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS)
                .add(ModBlocks.CHISELED_LIMESTONE)
                .add(ModBlocks.POLISHED_LIMESTONE)
                .add(ModBlocks.DRIED_SILT)
                .add(ModBlocks.SILT_BRICKS)
                .add(ModBlocks.CHISELED_SILT_BRICKS)
                .add(ModBlocks.POLISHED_SILT)
                .add(ModBlocks.BLUE_NETHER_BRICKS)
                .add(ModBlocks.CHISELED_BLUE_NETHER_BRICKS)
                .add(ModBlocks.POLISHED_BLUE_NETHER_BRICKS)
                .add(ModBlocks.TAINTED_NETHER_BRICKS)
                .add(ModBlocks.CHISELED_RED_NETHER_BRICKS)
                .add(ModBlocks.POLISHED_RED_NETHER_BRICKS)
                .add(ModBlocks.SOUL_BRICKS)
                .add(ModBlocks.POLISHED_SOUL_SAND)
                .add(ModBlocks.CHISELED_SOUL_BRICKS)
                .add(ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS)
                .add(ModBlocks.POLISHED_BASALT_BRICKS)
                .add(ModBlocks.POLISHED_BASALT_TILES)
                .add(ModBlocks.CUT_POLISHED_BASALT)
                .add(ModBlocks.CHISELED_POLISHED_BASALT);


        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                .add(ModBlocks.OAK_BEAM)
                .add(ModBlocks.SPRUCE_BEAM)
                .add(ModBlocks.BIRCH_BEAM)
                .add(ModBlocks.JUNGLE_BEAM)
                .add(ModBlocks.ACACIA_BEAM)
                .add(ModBlocks.DARK_OAK_BEAM)
                .add(ModBlocks.MANGROVE_BEAM)
                .add(ModBlocks.CHERRY_BEAM)
                .add(ModBlocks.WARPED_BEAM)
                .add(ModBlocks.CRIMSON_BEAM)
                .add(ModBlocks.MAPLE_PLANKS)
                .add(ModBlocks.VERTICAL_MAPLE_PLANKS)
                .add(ModBlocks.MAPLE_PLANKS_CARVED)
                .add(ModBlocks.MAPLE_BEAM)
                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD)
                .add(ModBlocks.MAPLE_STAIRS)
                .add(ModBlocks.MAPLE_SLAB)
                .add(ModBlocks.MAPLE_BUTTON)
                .add(ModBlocks.MAPLE_PRESSURE_PLATE)
                .add(ModBlocks.MAPLE_FENCE)
                .add(ModBlocks.MAPLE_FENCE_GATE)
                .add(ModBlocks.BLEAK_PLANKS)
                .add(ModBlocks.VERTICAL_BLEAK_PLANKS)
                .add(ModBlocks.BLEAK_PLANKS_CARVED)
                .add(ModBlocks.BLEAK_BEAM)
                .add(ModBlocks.BLEAK_LOG)
                .add(ModBlocks.STRIPPED_BLEAK_LOG)
                .add(ModBlocks.BLEAK_WOOD)
                .add(ModBlocks.STRIPPED_BLEAK_WOOD)
                .add(ModBlocks.BLEAK_STAIRS)
                .add(ModBlocks.BLEAK_SLAB)
                .add(ModBlocks.BLEAK_BUTTON)
                .add(ModBlocks.BLEAK_PRESSURE_PLATE)
                .add(ModBlocks.BLEAK_FENCE)
                .add(ModBlocks.BLEAK_FENCE_GATE)
                .add(ModBlocks.FIR_PLANKS)
                .add(ModBlocks.VERTICAL_FIR_PLANKS)
                .add(ModBlocks.FIR_PLANKS_CARVED)
                .add(ModBlocks.FIR_BEAM)
                .add(ModBlocks.FIR_LOG)
                .add(ModBlocks.STRIPPED_FIR_LOG)
                .add(ModBlocks.FIR_WOOD)
                .add(ModBlocks.STRIPPED_FIR_WOOD)
                .add(ModBlocks.FIR_STAIRS)
                .add(ModBlocks.FIR_SLAB)
                .add(ModBlocks.FIR_BUTTON)
                .add(ModBlocks.FIR_PRESSURE_PLATE)
                .add(ModBlocks.FIR_FENCE)
                .add(ModBlocks.FIR_FENCE_GATE)
                .add(ModBlocks.PALM_PLANKS)
                .add(ModBlocks.VERTICAL_PALM_PLANKS)
                .add(ModBlocks.PALM_PLANKS_CARVED)
                .add(ModBlocks.PALM_BEAM)
                .add(ModBlocks.PALM_CROWN)
                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.STRIPPED_PALM_WOOD)
                .add(ModBlocks.PALM_STAIRS)
                .add(ModBlocks.PALM_SLAB)
                .add(ModBlocks.PALM_BUTTON)
                .add(ModBlocks.PALM_PRESSURE_PLATE)
                .add(ModBlocks.PALM_FENCE)
                .add(ModBlocks.PALM_FENCE_GATE)
                .add(ModBlocks.BAYOU_PLANKS)
                .add(ModBlocks.VERTICAL_BAYOU_PLANKS)
                .add(ModBlocks.BAYOU_PLANKS_CARVED)
                .add(ModBlocks.BAYOU_BEAM)
                .add(ModBlocks.BAYOU_LOG)
                .add(ModBlocks.STRIPPED_BAYOU_LOG)
                .add(ModBlocks.BAYOU_WOOD)
                .add(ModBlocks.STRIPPED_BAYOU_WOOD)
                .add(ModBlocks.BAYOU_STAIRS)
                .add(ModBlocks.BAYOU_SLAB)
                .add(ModBlocks.BAYOU_BUTTON)
                .add(ModBlocks.BAYOU_PRESSURE_PLATE)
                .add(ModBlocks.BAYOU_FENCE)
                .add(ModBlocks.BAYOU_FENCE_GATE)
                .add(ModBlocks.WISTERIA_PLANKS)
                .add(ModBlocks.VERTICAL_WISTERIA_PLANKS)
                .add(ModBlocks.WISTERIA_PLANKS_CARVED)
                .add(ModBlocks.WISTERIA_BEAM)
                .add(ModBlocks.WISTERIA_LOG)
                .add(ModBlocks.STRIPPED_WISTERIA_LOG)
                .add(ModBlocks.WISTERIA_WOOD)
                .add(ModBlocks.STRIPPED_WISTERIA_WOOD)
                .add(ModBlocks.WISTERIA_STAIRS)
                .add(ModBlocks.WISTERIA_SLAB)
                .add(ModBlocks.WISTERIA_BUTTON)
                .add(ModBlocks.WISTERIA_PRESSURE_PLATE)
                .add(ModBlocks.WISTERIA_FENCE)
                .add(ModBlocks.WISTERIA_FENCE_GATE)
                .add(ModBlocks.BAOBAB_PLANKS)
                .add(ModBlocks.VERTICAL_BAOBAB_PLANKS)
                .add(ModBlocks.BAOBAB_PLANKS_CARVED)
                .add(ModBlocks.BAOBAB_BEAM)
                .add(ModBlocks.BAOBAB_LOG)
                .add(ModBlocks.STRIPPED_BAOBAB_LOG)
                .add(ModBlocks.BAOBAB_WOOD)
                .add(ModBlocks.STRIPPED_BAOBAB_WOOD)
                .add(ModBlocks.BAOBAB_STAIRS)
                .add(ModBlocks.BAOBAB_SLAB)
                .add(ModBlocks.BAOBAB_BUTTON)
                .add(ModBlocks.BAOBAB_PRESSURE_PLATE)
                .add(ModBlocks.BAOBAB_FENCE)
                .add(ModBlocks.BAOBAB_FENCE_GATE)
        .add(ModBlocks.FUNGAL_PLANKS_CARVED)
        .add(ModBlocks.FUNGAL_PLANKS)
        .add(ModBlocks.VERTICAL_FUNGAL_PLANKS)
        .add(ModBlocks.FUNGAL_STAIRS)
        .add(ModBlocks.FUNGAL_SLAB)
        .add(ModBlocks.FUNGAL_BUTTON)
        .add(ModBlocks.FUNGAL_PRESSURE_PLATE)
        .add(ModBlocks.FUNGAL_FENCE)
        .add(ModBlocks.FUNGAL_FENCE_GATE)
                .add(ModBlocks.WHITE_FUNGAL_PLANKS)
                .add(ModBlocks.WHITE_FUNGAL_STAIRS)
                .add(ModBlocks.WHITE_FUNGAL_SLAB)
                .add(ModBlocks.WHITE_FUNGAL_BUTTON)
                .add(ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.WHITE_FUNGAL_FENCE)
                .add(ModBlocks.WHITE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS)
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS)
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_SLAB)
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON)
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE)
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE)
                .add(ModBlocks.GRAY_FUNGAL_PLANKS)
                .add(ModBlocks.GRAY_FUNGAL_STAIRS)
                .add(ModBlocks.GRAY_FUNGAL_SLAB)
                .add(ModBlocks.GRAY_FUNGAL_BUTTON)
                .add(ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.GRAY_FUNGAL_FENCE)
                .add(ModBlocks.GRAY_FUNGAL_FENCE_GATE)
                .add(ModBlocks.BLACK_FUNGAL_PLANKS)
                .add(ModBlocks.BLACK_FUNGAL_STAIRS)
                .add(ModBlocks.BLACK_FUNGAL_SLAB)
                .add(ModBlocks.BLACK_FUNGAL_BUTTON)
                .add(ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.BLACK_FUNGAL_FENCE)
                .add(ModBlocks.BLACK_FUNGAL_FENCE_GATE)
                .add(ModBlocks.BROWN_FUNGAL_PLANKS)
                .add(ModBlocks.BROWN_FUNGAL_STAIRS)
                .add(ModBlocks.BROWN_FUNGAL_SLAB)
                .add(ModBlocks.BROWN_FUNGAL_BUTTON)
                .add(ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.BROWN_FUNGAL_FENCE)
                .add(ModBlocks.BROWN_FUNGAL_FENCE_GATE)
                .add(ModBlocks.RED_FUNGAL_PLANKS)
                .add(ModBlocks.RED_FUNGAL_STAIRS)
                .add(ModBlocks.RED_FUNGAL_SLAB)
                .add(ModBlocks.RED_FUNGAL_BUTTON)
                .add(ModBlocks.RED_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.RED_FUNGAL_FENCE)
                .add(ModBlocks.RED_FUNGAL_FENCE_GATE)
                .add(ModBlocks.ORANGE_FUNGAL_PLANKS)
                .add(ModBlocks.ORANGE_FUNGAL_STAIRS)
                .add(ModBlocks.ORANGE_FUNGAL_SLAB)
                .add(ModBlocks.ORANGE_FUNGAL_BUTTON)
                .add(ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.ORANGE_FUNGAL_FENCE)
                .add(ModBlocks.ORANGE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.YELLOW_FUNGAL_PLANKS)
                .add(ModBlocks.YELLOW_FUNGAL_STAIRS)
                .add(ModBlocks.YELLOW_FUNGAL_SLAB)
                .add(ModBlocks.YELLOW_FUNGAL_BUTTON)
                .add(ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.YELLOW_FUNGAL_FENCE)
                .add(ModBlocks.YELLOW_FUNGAL_FENCE_GATE)
                .add(ModBlocks.LIME_FUNGAL_PLANKS)
                .add(ModBlocks.LIME_FUNGAL_STAIRS)
                .add(ModBlocks.LIME_FUNGAL_SLAB)
                .add(ModBlocks.LIME_FUNGAL_BUTTON)
                .add(ModBlocks.LIME_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.LIME_FUNGAL_FENCE)
                .add(ModBlocks.LIME_FUNGAL_FENCE_GATE)
                .add(ModBlocks.GREEN_FUNGAL_PLANKS)
                .add(ModBlocks.GREEN_FUNGAL_STAIRS)
                .add(ModBlocks.GREEN_FUNGAL_SLAB)
                .add(ModBlocks.GREEN_FUNGAL_BUTTON)
                .add(ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.GREEN_FUNGAL_FENCE)
                .add(ModBlocks.GREEN_FUNGAL_FENCE_GATE)
                .add(ModBlocks.CYAN_FUNGAL_PLANKS)
                .add(ModBlocks.CYAN_FUNGAL_STAIRS)
                .add(ModBlocks.CYAN_FUNGAL_SLAB)
                .add(ModBlocks.CYAN_FUNGAL_BUTTON)
                .add(ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.CYAN_FUNGAL_FENCE)
                .add(ModBlocks.CYAN_FUNGAL_FENCE_GATE)
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS)
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS)
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_SLAB)
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON)
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE)
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.BLUE_FUNGAL_PLANKS)
                .add(ModBlocks.BLUE_FUNGAL_STAIRS)
                .add(ModBlocks.BLUE_FUNGAL_SLAB)
                .add(ModBlocks.BLUE_FUNGAL_BUTTON)
                .add(ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.BLUE_FUNGAL_FENCE)
                .add(ModBlocks.BLUE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.PURPLE_FUNGAL_PLANKS)
                .add(ModBlocks.PURPLE_FUNGAL_STAIRS)
                .add(ModBlocks.PURPLE_FUNGAL_SLAB)
                .add(ModBlocks.PURPLE_FUNGAL_BUTTON)
                .add(ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.PURPLE_FUNGAL_FENCE)
                .add(ModBlocks.PURPLE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.MAGENTA_FUNGAL_PLANKS)
                .add(ModBlocks.MAGENTA_FUNGAL_STAIRS)
                .add(ModBlocks.MAGENTA_FUNGAL_SLAB)
                .add(ModBlocks.MAGENTA_FUNGAL_BUTTON)
                .add(ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.MAGENTA_FUNGAL_FENCE)
                .add(ModBlocks.MAGENTA_FUNGAL_FENCE_GATE)
                .add(ModBlocks.PINK_FUNGAL_PLANKS)
                .add(ModBlocks.PINK_FUNGAL_STAIRS)
                .add(ModBlocks.PINK_FUNGAL_SLAB)
                .add(ModBlocks.PINK_FUNGAL_BUTTON)
                .add(ModBlocks.PINK_FUNGAL_PRESSURE_PLATE)
                .add(ModBlocks.PINK_FUNGAL_FENCE)
                .add(ModBlocks.PINK_FUNGAL_FENCE_GATE)
                .add(ModBlocks.VERTICAL_OAK_PLANKS)
                .add(ModBlocks.VERTICAL_SPRUCE_PLANKS)
                .add(ModBlocks.VERTICAL_BIRCH_PLANKS)
                .add(ModBlocks.VERTICAL_JUNGLE_PLANKS)
                .add(ModBlocks.VERTICAL_ACACIA_PLANKS)
                .add(ModBlocks.VERTICAL_DARK_OAK_PLANKS)
                .add(ModBlocks.VERTICAL_MANGROVE_PLANKS)
                .add(ModBlocks.VERTICAL_CHERRY_PLANKS)
                .add(ModBlocks.VERTICAL_CRIMSON_PLANKS)
                .add(ModBlocks.VERTICAL_WARPED_PLANKS)
                .add(ModBlocks.VERTICAL_BAMBOO_PLANKS)
                .add(ModBlocks.OAK_PAPER_LANTERN)
                .add(ModBlocks.SPRUCE_PAPER_LANTERN)
                .add(ModBlocks.BIRCH_PAPER_LANTERN)
                .add(ModBlocks.JUNGLE_PAPER_LANTERN)
                .add(ModBlocks.ACACIA_PAPER_LANTERN)
                .add(ModBlocks.DARK_OAK_PAPER_LANTERN)
                .add(ModBlocks.MANGROVE_PAPER_LANTERN)
                .add(ModBlocks.CHERRY_PAPER_LANTERN)
                .add(ModBlocks.CRIMSON_SHROOM_LANTERN)
                .add(ModBlocks.WARPED_SHROOM_LANTERN)
                .add(ModBlocks.MAPLE_PAPER_LANTERN)
                .add(ModBlocks.BLEAK_PAPER_LANTERN)
                .add(ModBlocks.FIR_PAPER_LANTERN)
                .add(ModBlocks.PALM_PAPER_LANTERN)
                .add(ModBlocks.BAYOU_PAPER_LANTERN)
                .add(ModBlocks.WISTERIA_PAPER_LANTERN)
                .add(ModBlocks.BAOBAB_PAPER_LANTERN)
                .add(ModBlocks.BAMBOO_PAPER_LANTERN)
                .add(ModBlocks.FUNGAL_PAPER_LANTERN)

                .add(ModBlocks.OAK_PLANKS_CARVED)
                .add(ModBlocks.SPRUCE_PLANKS_CARVED)
                .add(ModBlocks.BIRCH_PLANKS_CARVED)
                .add(ModBlocks.JUNGLE_PLANKS_CARVED)
                .add(ModBlocks.ACACIA_PLANKS_CARVED)
                .add(ModBlocks.DARK_OAK_PLANKS_CARVED)
                .add(ModBlocks.MANGROVE_PLANKS_CARVED)
                .add(ModBlocks.CHERRY_PLANKS_CARVED)
                .add(ModBlocks.CRIMSON_PLANKS_CARVED)
                .add(ModBlocks.WARPED_PLANKS_CARVED);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.PACKED_DIRT)
                .add(ModBlocks.PACKED_SAND)
                .add(ModBlocks.PACKED_RED_SAND)
                .add(ModBlocks.SILT);


        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                .add(ModBlocks.ORANGE_MAPLE_LEAVES)
                .add(ModBlocks.RED_MAPLE_LEAVES)
                .add(ModBlocks.BLEAK_LEAVES)
                .add(ModBlocks.ORANGE_FIR_LEAVES)
                .add(ModBlocks.GREEN_FIR_LEAVES)
                .add(ModBlocks.PALM_LEAVES)
                .add(ModBlocks.BAYOU_LEAVES)
                .add(ModBlocks.WISTERIA_LEAVES)
                .add(ModBlocks.WISTERIA_FLOWERS_BLUE)
                .add(ModBlocks.WISTERIA_FLOWERS_PINK)
                .add(ModBlocks.WISTERIA_FLOWERS_PURPLE)
                .add(ModBlocks.WISTERIA_FLOWERS_WHITE)
                .add(ModBlocks.BAOBAB_LEAVES);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.ANDESITE_BRICKS)
                .add(ModBlocks.CHISELED_ANDESITE)
                .add(ModBlocks.DIORITE_BRICKS)
                .add(ModBlocks.CHISELED_DIORITE)
                .add(ModBlocks.GRANITE_BRICKS)
                .add(ModBlocks.CHISELED_GRANITE)
                .add(ModBlocks.CHISELED_STONE)
                .add(ModBlocks.DRIPSTONE_BRICKS)
                .add(ModBlocks.CHISELED_DRIPSTONE)
                .add(ModBlocks.POLISHED_DRIPSTONE)
                .add(ModBlocks.CHISELED_MUD)
                .add(ModBlocks.POLISHED_MUD)
                .add(ModBlocks.SLATE)
                .add(ModBlocks.SLATE_BRICKS)
                .add(ModBlocks.CHISELED_SLATE)
                .add(ModBlocks.POLISHED_SLATE)
                .add(ModBlocks.LIMESTONE)
                .add(ModBlocks.LIMESTONE_BRICKS)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS)
                .add(ModBlocks.CHISELED_LIMESTONE)
                .add(ModBlocks.POLISHED_LIMESTONE)
                .add(ModBlocks.DRIED_SILT)
                .add(ModBlocks.SILT_BRICKS)
                .add(ModBlocks.CHISELED_SILT_BRICKS)
                .add(ModBlocks.POLISHED_SILT)
                .add(ModBlocks.SOUL_BRICKS)
                .add(ModBlocks.POLISHED_SOUL_SAND)
                .add(ModBlocks.CHISELED_SOUL_BRICKS)
                .add(ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS)
                .add(ModBlocks.POLISHED_BASALT_BRICKS)
                .add(ModBlocks.POLISHED_BASALT_TILES)
                .add(ModBlocks.CUT_POLISHED_BASALT)
                .add(ModBlocks.CHISELED_POLISHED_BASALT)
                .add(ModBlocks.PLATINUM_ORE)
                .add(ModBlocks.RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DEEPSLATE_PLATINUM_ORE)
                .add(ModBlocks.DEEPSLATE_RUBY_ORE);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG)
                .add(ModBlocks.STRIPPED_MAPLE_LOG)
                .add(ModBlocks.MAPLE_WOOD)
                .add(ModBlocks.STRIPPED_MAPLE_WOOD)
                .add(ModBlocks.BLEAK_LOG)
                .add(ModBlocks.STRIPPED_BLEAK_LOG)
                .add(ModBlocks.BLEAK_WOOD)
                .add(ModBlocks.STRIPPED_BLEAK_WOOD)
                .add(ModBlocks.FIR_LOG)
                .add(ModBlocks.STRIPPED_FIR_LOG)
                .add(ModBlocks.FIR_WOOD)
                .add(ModBlocks.STRIPPED_FIR_WOOD)
                .add(ModBlocks.PALM_LOG)
                .add(ModBlocks.STRIPPED_PALM_LOG)
                .add(ModBlocks.PALM_WOOD)
                .add(ModBlocks.STRIPPED_PALM_WOOD)
                .add(ModBlocks.PALM_CROWN)
                .add(ModBlocks.BAYOU_LOG)
                .add(ModBlocks.STRIPPED_BAYOU_LOG)
                .add(ModBlocks.BAYOU_WOOD)
                .add(ModBlocks.STRIPPED_BAYOU_WOOD)
                .add(ModBlocks.WISTERIA_LOG)
                .add(ModBlocks.STRIPPED_WISTERIA_LOG)
                .add(ModBlocks.WISTERIA_WOOD)
                .add(ModBlocks.STRIPPED_WISTERIA_WOOD)
                .add(ModBlocks.BAOBAB_LOG)
                .add(ModBlocks.STRIPPED_BAOBAB_LOG)
                .add(ModBlocks.BAOBAB_WOOD)
                .add(ModBlocks.STRIPPED_BAOBAB_WOOD);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LIMESTONE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LIMESTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LIMESTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LIMESTONE_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_LIMESTONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_LIMESTONE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LIMESTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LIMESTONE_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LIMESTONE_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LIMESTONE_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LIMESTONE_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_LIMESTONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_LIMESTONE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_LIMESTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_LIMESTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_LIMESTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_LIMESTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_LIMESTONE_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_LIMESTONE_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_WALL);

getOrCreateTagBuilder(BlockTags.FENCES)
        .add(ModBlocks.MAPLE_FENCE)
        .add(ModBlocks.BLEAK_FENCE)
        .add(ModBlocks.FIR_FENCE)
        .add(ModBlocks.PALM_FENCE)
        .add(ModBlocks.BAYOU_FENCE)
        .add(ModBlocks.WISTERIA_FENCE)
        .add(ModBlocks.BAOBAB_FENCE)
        .add(ModBlocks.FUNGAL_FENCE)
        .add(ModBlocks.WHITE_FUNGAL_FENCE)
        .add(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE)
        .add(ModBlocks.GRAY_FUNGAL_FENCE)
        .add(ModBlocks.BLACK_FUNGAL_FENCE)
        .add(ModBlocks.BROWN_FUNGAL_FENCE)
        .add(ModBlocks.RED_FUNGAL_FENCE)
        .add(ModBlocks.ORANGE_FUNGAL_FENCE)
        .add(ModBlocks.YELLOW_FUNGAL_FENCE)
        .add(ModBlocks.LIME_FUNGAL_FENCE)
        .add(ModBlocks.GREEN_FUNGAL_FENCE)
        .add(ModBlocks.CYAN_FUNGAL_FENCE)
        .add(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE)
        .add(ModBlocks.BLUE_FUNGAL_FENCE)
        .add(ModBlocks.PURPLE_FUNGAL_FENCE)
        .add(ModBlocks.MAGENTA_FUNGAL_FENCE)
        .add(ModBlocks.PINK_FUNGAL_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.MAPLE_FENCE_GATE)
                .add(ModBlocks.BLEAK_FENCE_GATE)
                .add(ModBlocks.FIR_FENCE_GATE)
                .add(ModBlocks.PALM_FENCE_GATE)
                .add(ModBlocks.BAYOU_FENCE_GATE)
                .add(ModBlocks.WISTERIA_FENCE_GATE)
                .add(ModBlocks.BAOBAB_FENCE_GATE)
                .add(ModBlocks.FUNGAL_FENCE_GATE)
                .add(ModBlocks.WHITE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE)
                .add(ModBlocks.GRAY_FUNGAL_FENCE_GATE)
                .add(ModBlocks.BLACK_FUNGAL_FENCE_GATE)
                .add(ModBlocks.BROWN_FUNGAL_FENCE_GATE)
                .add(ModBlocks.RED_FUNGAL_FENCE_GATE)
                .add(ModBlocks.ORANGE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.YELLOW_FUNGAL_FENCE_GATE)
                .add(ModBlocks.LIME_FUNGAL_FENCE_GATE)
                .add(ModBlocks.GREEN_FUNGAL_FENCE_GATE)
                .add(ModBlocks.CYAN_FUNGAL_FENCE_GATE)
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.BLUE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.PURPLE_FUNGAL_FENCE_GATE)
                .add(ModBlocks.MAGENTA_FUNGAL_FENCE_GATE)
                .add(ModBlocks.PINK_FUNGAL_FENCE_GATE);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.LIMESTONE_WALL)
                .add(ModBlocks.LIMESTONE_BRICKS_WALL)
                .add(ModBlocks.POLISHED_LIMESTONE_WALL)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRIMROCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRIMROCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRIMROCK_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRIMROCK_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRIMROCK_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRIMROCK_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRIMROCK_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRIMROCK_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_GRIMROCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_GRIMROCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBBLED_GRIMROCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.COBBLED_GRIMROCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBBLED_GRIMROCK_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.COBBLED_GRIMROCK_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBBLED_GRIMROCK_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.COBBLED_GRIMROCK_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.COBBLED_GRIMROCK_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.COBBLED_GRIMROCK_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRIMROCK_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRIMROCK_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRIMROCK_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRIMROCK_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRIMROCK_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRIMROCK_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRIMROCK_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRIMROCK_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_GRIMROCK);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_GRIMROCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_GRIMROCK_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_GRIMROCK_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_GRIMROCK_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_GRIMROCK_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_GRIMROCK_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_GRIMROCK_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.LOAM);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.LOAM);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_PACKED_LOAM);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_PACKED_LOAM);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PACKED_LOAM);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PACKED_LOAM);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PACKED_LOAM_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PACKED_LOAM_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PACKED_LOAM_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PACKED_LOAM_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PACKED_LOAM_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PACKED_LOAM_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PACKED_LOAM_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PACKED_LOAM_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PACKED_LOAM_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PACKED_LOAM_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PACKED_LOAM_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PACKED_LOAM_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.PACKED_LOAM_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PACKED_LOAM_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILT);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SILT);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DRIED_SILT);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.DRIED_SILT);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DRIED_SILT_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.DRIED_SILT_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DRIED_SILT_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.DRIED_SILT_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DRIED_SILT_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.DRIED_SILT_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_SILT);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_SILT);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_SILT_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_SILT_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_SILT_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_SILT_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_SILT_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_SILT_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILT_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SILT_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILT_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SILT_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILT_BRICKS_SLAB)
                .add(ModBlocks.PACKED_DIRT_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SILT_BRICKS_SLAB)
                .add(ModBlocks.PACKED_DIRT_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SILT_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SILT_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SLATE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SLATE_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SLATE_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SLATE_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SLATE_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SLATE_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SLATE_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_SLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_SLATE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_SLATE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_SLATE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_SLATE_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_SLATE_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_SLATE_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_SLATE_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_SLATE_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_SLATE_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SLATE_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SLATE_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SLATE_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SLATE_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SLATE_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SLATE_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.SLATE_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.SLATE_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STRATA);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STRATA);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STRATA_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STRATA_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STRATA_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STRATA_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STRATA_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STRATA_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_STRATA);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_STRATA);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_STRATA);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_STRATA);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_STRATA_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_STRATA_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_STRATA_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_STRATA_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_STRATA_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_STRATA_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STRATA_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STRATA_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STRATA_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STRATA_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STRATA_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STRATA_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.STRATA_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.STRATA_BRICKS_WALL);









    }

}
