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

        /* =========================
           TAG BUILDERS
           ========================= */

        var logs = getOrCreateTagBuilder(BlockTags.LOGS);
        var logsThatBurn = getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN);

        var pickaxe = getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE);
        var axe = getOrCreateTagBuilder(BlockTags.AXE_MINEABLE);
        var shovel = getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE);
        var hoe = getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);

        var needsStone = getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL);
        var needsIron = getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL);

        var fences = getOrCreateTagBuilder(BlockTags.FENCES);
        var fenceGates = getOrCreateTagBuilder(BlockTags.FENCE_GATES);
        var walls = getOrCreateTagBuilder(BlockTags.WALLS);

        var coralBlocks = getOrCreateTagBuilder(BlockTags.CORAL_BLOCKS);

        /* =========================
           LOGS
           ========================= */

        logs.add(
                ModBlocks.MAPLE_LOG, ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_WOOD,
                ModBlocks.BLEAK_LOG, ModBlocks.BLEAK_WOOD, ModBlocks.STRIPPED_BLEAK_LOG, ModBlocks.STRIPPED_BLEAK_WOOD,
                ModBlocks.FIR_LOG, ModBlocks.FIR_WOOD, ModBlocks.STRIPPED_FIR_LOG, ModBlocks.STRIPPED_FIR_WOOD,
                ModBlocks.PALM_LOG, ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_LOG, ModBlocks.STRIPPED_PALM_WOOD,
                ModBlocks.BAYOU_LOG, ModBlocks.BAYOU_WOOD, ModBlocks.STRIPPED_BAYOU_LOG, ModBlocks.STRIPPED_BAYOU_WOOD,
                ModBlocks.WISTERIA_LOG, ModBlocks.WISTERIA_WOOD, ModBlocks.STRIPPED_WISTERIA_LOG, ModBlocks.STRIPPED_WISTERIA_WOOD,
                ModBlocks.BAOBAB_LOG, ModBlocks.BAOBAB_WOOD, ModBlocks.STRIPPED_BAOBAB_LOG, ModBlocks.STRIPPED_BAOBAB_WOOD
        );

        logsThatBurn.add(
                ModBlocks.MAPLE_LOG, ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_WOOD,
                ModBlocks.BLEAK_LOG, ModBlocks.BLEAK_WOOD, ModBlocks.STRIPPED_BLEAK_LOG, ModBlocks.STRIPPED_BLEAK_WOOD,
                ModBlocks.FIR_LOG, ModBlocks.FIR_WOOD, ModBlocks.STRIPPED_FIR_LOG, ModBlocks.STRIPPED_FIR_WOOD,
                ModBlocks.PALM_LOG, ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_LOG, ModBlocks.STRIPPED_PALM_WOOD,
                ModBlocks.PALM_CROWN,
                ModBlocks.BAYOU_LOG, ModBlocks.BAYOU_WOOD, ModBlocks.STRIPPED_BAYOU_LOG, ModBlocks.STRIPPED_BAYOU_WOOD,
                ModBlocks.WISTERIA_LOG, ModBlocks.WISTERIA_WOOD, ModBlocks.STRIPPED_WISTERIA_LOG, ModBlocks.STRIPPED_WISTERIA_WOOD,
                ModBlocks.BAOBAB_LOG, ModBlocks.BAOBAB_WOOD, ModBlocks.STRIPPED_BAOBAB_LOG, ModBlocks.STRIPPED_BAOBAB_WOOD
        );

        pickaxe.add(

                ModBlocks.ECHO_GLASS,
                ModBlocks.ASHEN_SANDSTONE,
                ModBlocks.CUT_ASHEN_SANDSTONE,
                ModBlocks.CHISELED_ASHEN_SANDSTONE,
                ModBlocks.SMOOTH_ASHEN_SANDSTONE,

                ModBlocks.PACKED_LOAM_BRICKS,
                ModBlocks.PACKED_LOAM_BRICKS_STAIRS,
                ModBlocks.PACKED_LOAM_BRICKS_SLAB,
                ModBlocks.PACKED_LOAM_BRICKS_WALL,

                ModBlocks.CHISELED_PACKED_LOAM,
                ModBlocks.MOSSY_PACKED_LOAM_BRICKS,
                ModBlocks.MOSSY_PACKED_LOAM_BRICKS_STAIRS,
                ModBlocks.MOSSY_PACKED_LOAM_BRICKS_SLAB,
                ModBlocks.MOSSY_PACKED_LOAM_BRICKS_WALL,

                ModBlocks.DOLOMITE,
                ModBlocks.DOLOMITE_SLAB,
                ModBlocks.DOLOMITE_STAIRS,
                ModBlocks.DOLOMITE_WALL,

                ModBlocks.DOLOMITE_PILLAR,
                ModBlocks.CHISELED_DOLOMITE,


                ModBlocks.DOLOMITE_BRICKS,
                ModBlocks.DOLOMITE_BRICKS_SLAB,
                ModBlocks.DOLOMITE_BRICKS_STAIRS,
                ModBlocks.DOLOMITE_BRICKS_WALL,

                ModBlocks.POLISHED_DOLOMITE,
                ModBlocks.POLISHED_DOLOMITE_SLAB,
                ModBlocks.POLISHED_DOLOMITE_STAIRS,
                ModBlocks.POLISHED_DOLOMITE_WALL

        );

        axe.add(
                ModBlocks.WHITE_FUNGAL_PLANKS,
                ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS,
                ModBlocks.GRAY_FUNGAL_PLANKS,
                ModBlocks.BLACK_FUNGAL_PLANKS,
                ModBlocks.BROWN_FUNGAL_PLANKS,
                ModBlocks.RED_FUNGAL_PLANKS,
                ModBlocks.ORANGE_FUNGAL_PLANKS,
                ModBlocks.YELLOW_FUNGAL_PLANKS,
                ModBlocks.LIME_FUNGAL_PLANKS,
                ModBlocks.GREEN_FUNGAL_PLANKS,
                ModBlocks.CYAN_FUNGAL_PLANKS,
                ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS,
                ModBlocks.BLUE_FUNGAL_PLANKS,
                ModBlocks.PURPLE_FUNGAL_PLANKS,
                ModBlocks.MAGENTA_FUNGAL_PLANKS,
                ModBlocks.PINK_FUNGAL_PLANKS,

                ModBlocks.OAK_PAPER_LANTERN,
                ModBlocks.SPRUCE_PAPER_LANTERN,
                ModBlocks.BIRCH_PAPER_LANTERN,
                ModBlocks.JUNGLE_PAPER_LANTERN,
                ModBlocks.ACACIA_PAPER_LANTERN,
                ModBlocks.DARK_OAK_PAPER_LANTERN,
                ModBlocks.MANGROVE_PAPER_LANTERN,
                ModBlocks.CHERRY_PAPER_LANTERN,
                ModBlocks.BAMBOO_PAPER_LANTERN,
                ModBlocks.CRIMSON_SHROOM_LANTERN,
                ModBlocks.WARPED_SHROOM_LANTERN,

                ModBlocks.OAK_BEAM,
                ModBlocks.SPRUCE_BEAM,
                ModBlocks.BIRCH_BEAM,
                ModBlocks.JUNGLE_BEAM,
                ModBlocks.ACACIA_BEAM,
                ModBlocks.DARK_OAK_BEAM,
                ModBlocks.MANGROVE_BEAM,
                ModBlocks.CHERRY_BEAM,
                ModBlocks.CRIMSON_BEAM,
                ModBlocks.WARPED_BEAM,

                ModBlocks.VERTICAL_OAK_PLANKS,
                ModBlocks.VERTICAL_SPRUCE_PLANKS,
                ModBlocks.VERTICAL_BIRCH_PLANKS,
                ModBlocks.VERTICAL_JUNGLE_PLANKS,
                ModBlocks.VERTICAL_ACACIA_PLANKS,
                ModBlocks.VERTICAL_DARK_OAK_PLANKS,
                ModBlocks.VERTICAL_MANGROVE_PLANKS,
                ModBlocks.VERTICAL_CHERRY_PLANKS,
                ModBlocks.VERTICAL_CRIMSON_PLANKS,
                ModBlocks.VERTICAL_WARPED_PLANKS,
                ModBlocks.VERTICAL_BAMBOO_PLANKS,

                ModBlocks.PALM_CROWN,
                ModBlocks.MAPLE_PLANKS, ModBlocks.VERTICAL_MAPLE_PLANKS, ModBlocks.MAPLE_PLANKS_CARVED,
                ModBlocks.MAPLE_BEAM, ModBlocks.MAPLE_LOG, ModBlocks.STRIPPED_MAPLE_LOG,
                ModBlocks.MAPLE_WOOD, ModBlocks.STRIPPED_MAPLE_WOOD,
                ModBlocks.MAPLE_STAIRS, ModBlocks.MAPLE_SLAB, ModBlocks.MAPLE_BUTTON,
                ModBlocks.MAPLE_PRESSURE_PLATE, ModBlocks.MAPLE_FENCE, ModBlocks.MAPLE_FENCE_GATE,
                ModBlocks.MAPLE_PAPER_LANTERN,

                ModBlocks.BLEAK_PLANKS, ModBlocks.VERTICAL_BLEAK_PLANKS, ModBlocks.BLEAK_PLANKS_CARVED,
                ModBlocks.BLEAK_BEAM, ModBlocks.BLEAK_LOG, ModBlocks.STRIPPED_BLEAK_LOG,
                ModBlocks.BLEAK_WOOD, ModBlocks.STRIPPED_BLEAK_WOOD,
                ModBlocks.BLEAK_STAIRS, ModBlocks.BLEAK_SLAB, ModBlocks.BLEAK_BUTTON,
                ModBlocks.BLEAK_PRESSURE_PLATE, ModBlocks.BLEAK_FENCE, ModBlocks.BLEAK_FENCE_GATE,
                ModBlocks.BLEAK_PAPER_LANTERN,

                ModBlocks.FIR_PLANKS, ModBlocks.VERTICAL_FIR_PLANKS, ModBlocks.FIR_PLANKS_CARVED,
                ModBlocks.FIR_BEAM, ModBlocks.FIR_LOG, ModBlocks.STRIPPED_FIR_LOG,
                ModBlocks.FIR_WOOD, ModBlocks.STRIPPED_FIR_WOOD,
                ModBlocks.FIR_STAIRS, ModBlocks.FIR_SLAB, ModBlocks.FIR_BUTTON,
                ModBlocks.FIR_PRESSURE_PLATE, ModBlocks.FIR_FENCE, ModBlocks.FIR_FENCE_GATE,
                ModBlocks.FIR_PAPER_LANTERN,

                ModBlocks.PALM_PLANKS, ModBlocks.VERTICAL_PALM_PLANKS, ModBlocks.PALM_PLANKS_CARVED,
                ModBlocks.PALM_BEAM, ModBlocks.PALM_LOG, ModBlocks.STRIPPED_PALM_LOG,
                ModBlocks.PALM_WOOD, ModBlocks.STRIPPED_PALM_WOOD,
                ModBlocks.PALM_STAIRS, ModBlocks.PALM_SLAB, ModBlocks.PALM_BUTTON,
                ModBlocks.PALM_PRESSURE_PLATE, ModBlocks.PALM_FENCE, ModBlocks.PALM_FENCE_GATE,
                ModBlocks.PALM_PAPER_LANTERN,

                ModBlocks.BAYOU_PLANKS, ModBlocks.VERTICAL_BAYOU_PLANKS, ModBlocks.BAYOU_PLANKS_CARVED,
                ModBlocks.BAYOU_BEAM, ModBlocks.BAYOU_LOG, ModBlocks.STRIPPED_BAYOU_LOG,
                ModBlocks.BAYOU_WOOD, ModBlocks.STRIPPED_BAYOU_WOOD,
                ModBlocks.BAYOU_STAIRS, ModBlocks.BAYOU_SLAB, ModBlocks.BAYOU_BUTTON,
                ModBlocks.BAYOU_PRESSURE_PLATE, ModBlocks.BAYOU_FENCE, ModBlocks.BAYOU_FENCE_GATE,
                ModBlocks.BAYOU_PAPER_LANTERN,

                ModBlocks.WISTERIA_PLANKS, ModBlocks.VERTICAL_WISTERIA_PLANKS, ModBlocks.WISTERIA_PLANKS_CARVED,
                ModBlocks.WISTERIA_BEAM, ModBlocks.WISTERIA_LOG, ModBlocks.STRIPPED_WISTERIA_LOG,
                ModBlocks.WISTERIA_WOOD, ModBlocks.STRIPPED_WISTERIA_WOOD,
                ModBlocks.WISTERIA_STAIRS, ModBlocks.WISTERIA_SLAB, ModBlocks.WISTERIA_BUTTON,
                ModBlocks.WISTERIA_PRESSURE_PLATE, ModBlocks.WISTERIA_FENCE, ModBlocks.WISTERIA_FENCE_GATE,
                ModBlocks.WISTERIA_PAPER_LANTERN,

                ModBlocks.BAOBAB_PLANKS, ModBlocks.VERTICAL_BAOBAB_PLANKS, ModBlocks.BAOBAB_PLANKS_CARVED,
                ModBlocks.BAOBAB_BEAM, ModBlocks.BAOBAB_LOG, ModBlocks.STRIPPED_BAOBAB_LOG,
                ModBlocks.BAOBAB_WOOD, ModBlocks.STRIPPED_BAOBAB_WOOD,
                ModBlocks.BAOBAB_STAIRS, ModBlocks.BAOBAB_SLAB, ModBlocks.BAOBAB_BUTTON,
                ModBlocks.BAOBAB_PRESSURE_PLATE, ModBlocks.BAOBAB_FENCE, ModBlocks.BAOBAB_FENCE_GATE,
                ModBlocks.BAOBAB_PAPER_LANTERN,

                ModBlocks.FUNGAL_PLANKS, ModBlocks.VERTICAL_FUNGAL_PLANKS, ModBlocks.FUNGAL_PLANKS_CARVED,
                ModBlocks.FUNGAL_STAIRS, ModBlocks.FUNGAL_SLAB, ModBlocks.FUNGAL_BUTTON,
                ModBlocks.FUNGAL_PRESSURE_PLATE, ModBlocks.FUNGAL_FENCE, ModBlocks.FUNGAL_FENCE_GATE,
                ModBlocks.FUNGAL_PAPER_LANTERN,

                ModBlocks.WHITE_FUNGAL_PLANKS, ModBlocks.WHITE_FUNGAL_STAIRS, ModBlocks.WHITE_FUNGAL_SLAB,
                ModBlocks.WHITE_FUNGAL_BUTTON, ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.WHITE_FUNGAL_FENCE, ModBlocks.WHITE_FUNGAL_FENCE_GATE,

                ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS, ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS, ModBlocks.LIGHT_GRAY_FUNGAL_SLAB,
                ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON, ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE,
                ModBlocks.LIGHT_GRAY_FUNGAL_FENCE, ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE,

                ModBlocks.GRAY_FUNGAL_PLANKS, ModBlocks.GRAY_FUNGAL_STAIRS, ModBlocks.GRAY_FUNGAL_SLAB,
                ModBlocks.GRAY_FUNGAL_BUTTON, ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE,
                ModBlocks.GRAY_FUNGAL_FENCE, ModBlocks.GRAY_FUNGAL_FENCE_GATE,

                ModBlocks.BLACK_FUNGAL_PLANKS, ModBlocks.BLACK_FUNGAL_STAIRS, ModBlocks.BLACK_FUNGAL_SLAB,
                ModBlocks.BLACK_FUNGAL_BUTTON, ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE,
                ModBlocks.BLACK_FUNGAL_FENCE, ModBlocks.BLACK_FUNGAL_FENCE_GATE,

                ModBlocks.BROWN_FUNGAL_PLANKS, ModBlocks.BROWN_FUNGAL_STAIRS, ModBlocks.BROWN_FUNGAL_SLAB,
                ModBlocks.BROWN_FUNGAL_BUTTON, ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE,
                ModBlocks.BROWN_FUNGAL_FENCE, ModBlocks.BROWN_FUNGAL_FENCE_GATE,

                ModBlocks.RED_FUNGAL_PLANKS, ModBlocks.RED_FUNGAL_STAIRS, ModBlocks.RED_FUNGAL_SLAB,
                ModBlocks.RED_FUNGAL_BUTTON, ModBlocks.RED_FUNGAL_PRESSURE_PLATE,
                ModBlocks.RED_FUNGAL_FENCE, ModBlocks.RED_FUNGAL_FENCE_GATE,

                ModBlocks.ORANGE_FUNGAL_PLANKS, ModBlocks.ORANGE_FUNGAL_STAIRS, ModBlocks.ORANGE_FUNGAL_SLAB,
                ModBlocks.ORANGE_FUNGAL_BUTTON, ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.ORANGE_FUNGAL_FENCE, ModBlocks.ORANGE_FUNGAL_FENCE_GATE,

                ModBlocks.YELLOW_FUNGAL_PLANKS, ModBlocks.YELLOW_FUNGAL_STAIRS, ModBlocks.YELLOW_FUNGAL_SLAB,
                ModBlocks.YELLOW_FUNGAL_BUTTON, ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE,
                ModBlocks.YELLOW_FUNGAL_FENCE, ModBlocks.YELLOW_FUNGAL_FENCE_GATE,

                ModBlocks.LIME_FUNGAL_PLANKS, ModBlocks.LIME_FUNGAL_STAIRS, ModBlocks.LIME_FUNGAL_SLAB,
                ModBlocks.LIME_FUNGAL_BUTTON, ModBlocks.LIME_FUNGAL_PRESSURE_PLATE,
                ModBlocks.LIME_FUNGAL_FENCE, ModBlocks.LIME_FUNGAL_FENCE_GATE,

                ModBlocks.GREEN_FUNGAL_PLANKS, ModBlocks.GREEN_FUNGAL_STAIRS, ModBlocks.GREEN_FUNGAL_SLAB,
                ModBlocks.GREEN_FUNGAL_BUTTON, ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE,
                ModBlocks.GREEN_FUNGAL_FENCE, ModBlocks.GREEN_FUNGAL_FENCE_GATE,

                ModBlocks.CYAN_FUNGAL_PLANKS, ModBlocks.CYAN_FUNGAL_STAIRS, ModBlocks.CYAN_FUNGAL_SLAB,
                ModBlocks.CYAN_FUNGAL_BUTTON, ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE,
                ModBlocks.CYAN_FUNGAL_FENCE, ModBlocks.CYAN_FUNGAL_FENCE_GATE,

                ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS, ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS, ModBlocks.LIGHT_BLUE_FUNGAL_SLAB,
                ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON, ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.LIGHT_BLUE_FUNGAL_FENCE, ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE,

                ModBlocks.BLUE_FUNGAL_PLANKS, ModBlocks.BLUE_FUNGAL_STAIRS, ModBlocks.BLUE_FUNGAL_SLAB,
                ModBlocks.BLUE_FUNGAL_BUTTON, ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.BLUE_FUNGAL_FENCE, ModBlocks.BLUE_FUNGAL_FENCE_GATE,

                ModBlocks.PURPLE_FUNGAL_PLANKS, ModBlocks.PURPLE_FUNGAL_STAIRS, ModBlocks.PURPLE_FUNGAL_SLAB,
                ModBlocks.PURPLE_FUNGAL_BUTTON, ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.PURPLE_FUNGAL_FENCE, ModBlocks.PURPLE_FUNGAL_FENCE_GATE,

                ModBlocks.MAGENTA_FUNGAL_PLANKS, ModBlocks.MAGENTA_FUNGAL_STAIRS, ModBlocks.MAGENTA_FUNGAL_SLAB,
                ModBlocks.MAGENTA_FUNGAL_BUTTON, ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE,
                ModBlocks.MAGENTA_FUNGAL_FENCE, ModBlocks.MAGENTA_FUNGAL_FENCE_GATE,

                ModBlocks.PINK_FUNGAL_PLANKS, ModBlocks.PINK_FUNGAL_STAIRS, ModBlocks.PINK_FUNGAL_SLAB,
                ModBlocks.PINK_FUNGAL_BUTTON, ModBlocks.PINK_FUNGAL_PRESSURE_PLATE,
                ModBlocks.PINK_FUNGAL_FENCE, ModBlocks.PINK_FUNGAL_FENCE_GATE
        );

        shovel.add(
                ModBlocks.PACKED_LOAM,
                ModBlocks.PACKED_LOAM_STAIRS,
                ModBlocks.PACKED_LOAM_SLAB,
                ModBlocks.PACKED_LOAM_WALL,

                ModBlocks.PERMAFROST,
                ModBlocks.PACKED_DIRT,
                ModBlocks.PACKED_DIRT_SLAB,

                ModBlocks.ASHEN_SAND,
                ModBlocks.PACKED_ASHEN_SAND,
                ModBlocks.PACKED_DIRT, ModBlocks.PACKED_SAND, ModBlocks.PACKED_RED_SAND,
                ModBlocks.SILT, ModBlocks.PACKED_DIRT_SLAB
        );

        hoe.add(
                ModBlocks.GRIMOSS_BLOCK,
                ModBlocks.GRIMOSS,
                ModBlocks.FROST,
                ModBlocks.DAMP_MOSS_BLOCK,
                ModBlocks.DAMP_MOSS,
                ModBlocks.GRIMWEED_BLOCK,
                ModBlocks.PALE_GRIMWEED_BLOCK,
                ModBlocks.ORANGE_MAPLE_LEAVES, ModBlocks.RED_MAPLE_LEAVES, ModBlocks.BLEAK_LEAVES,
                ModBlocks.ORANGE_FIR_LEAVES, ModBlocks.GREEN_FIR_LEAVES, ModBlocks.PALM_LEAVES,
                ModBlocks.BAYOU_LEAVES, ModBlocks.WISTERIA_LEAVES,
                ModBlocks.WISTERIA_FLOWERS_BLUE, ModBlocks.WISTERIA_FLOWERS_PINK,
                ModBlocks.WISTERIA_FLOWERS_PURPLE, ModBlocks.WISTERIA_FLOWERS_WHITE,
                ModBlocks.BAOBAB_LEAVES
        );

        needsStone.add(
                ModBlocks.ASHEN_SANDSTONE,
                ModBlocks.CUT_ASHEN_SANDSTONE,
                ModBlocks.CHISELED_ASHEN_SANDSTONE,
                ModBlocks.SMOOTH_ASHEN_SANDSTONE,

                ModBlocks.PACKED_LOAM,
                ModBlocks.PACKED_LOAM_BRICKS,
                ModBlocks.CHISELED_PACKED_LOAM,

                ModBlocks.POLISHED_BASALT_BRICKS,
                ModBlocks.POLISHED_BASALT_TILES,

                ModBlocks.PLATINUM_ORE, ModBlocks.RUBY_ORE,
                ModBlocks.LIMESTONE, ModBlocks.GRIMROCK, ModBlocks.SLATE,
                ModBlocks.STRATA, ModBlocks.DOLOMITE,
                ModBlocks.SILT, ModBlocks.DRIED_SILT, ModBlocks.LOAM,

                ModBlocks.DOLOMITE_BRICKS,
                ModBlocks.DOLOMITE_BRICKS_SLAB,
                ModBlocks.DOLOMITE_BRICKS_STAIRS,
                ModBlocks.DOLOMITE_BRICKS_WALL,

                ModBlocks.POLISHED_DOLOMITE,
                ModBlocks.POLISHED_DOLOMITE_SLAB,
                ModBlocks.POLISHED_DOLOMITE_STAIRS,
                ModBlocks.POLISHED_DOLOMITE_WALL
        );

        needsIron.add(
                ModBlocks.DEEPSLATE_PLATINUM_ORE,
                ModBlocks.DEEPSLATE_RUBY_ORE
        );

        fences.add(
                ModBlocks.MAPLE_FENCE, ModBlocks.BLEAK_FENCE, ModBlocks.FIR_FENCE,
                ModBlocks.PALM_FENCE, ModBlocks.BAYOU_FENCE, ModBlocks.WISTERIA_FENCE,
                ModBlocks.BAOBAB_FENCE,
                ModBlocks.FUNGAL_FENCE, ModBlocks.WHITE_FUNGAL_FENCE, ModBlocks.LIGHT_GRAY_FUNGAL_FENCE,
                ModBlocks.GRAY_FUNGAL_FENCE, ModBlocks.BLACK_FUNGAL_FENCE, ModBlocks.BROWN_FUNGAL_FENCE,
                ModBlocks.RED_FUNGAL_FENCE, ModBlocks.ORANGE_FUNGAL_FENCE, ModBlocks.YELLOW_FUNGAL_FENCE,
                ModBlocks.LIME_FUNGAL_FENCE, ModBlocks.GREEN_FUNGAL_FENCE, ModBlocks.CYAN_FUNGAL_FENCE,
                ModBlocks.LIGHT_BLUE_FUNGAL_FENCE, ModBlocks.BLUE_FUNGAL_FENCE, ModBlocks.PURPLE_FUNGAL_FENCE,
                ModBlocks.MAGENTA_FUNGAL_FENCE, ModBlocks.PINK_FUNGAL_FENCE
        );

        fenceGates.add(
                ModBlocks.MAPLE_FENCE_GATE, ModBlocks.BLEAK_FENCE_GATE, ModBlocks.FIR_FENCE_GATE,
                ModBlocks.PALM_FENCE_GATE, ModBlocks.BAYOU_FENCE_GATE, ModBlocks.WISTERIA_FENCE_GATE,
                ModBlocks.BAOBAB_FENCE_GATE,
                ModBlocks.FUNGAL_FENCE_GATE, ModBlocks.WHITE_FUNGAL_FENCE_GATE, ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE,
                ModBlocks.GRAY_FUNGAL_FENCE_GATE, ModBlocks.BLACK_FUNGAL_FENCE_GATE, ModBlocks.BROWN_FUNGAL_FENCE_GATE,
                ModBlocks.RED_FUNGAL_FENCE_GATE, ModBlocks.ORANGE_FUNGAL_FENCE_GATE, ModBlocks.YELLOW_FUNGAL_FENCE_GATE,
                ModBlocks.LIME_FUNGAL_FENCE_GATE, ModBlocks.GREEN_FUNGAL_FENCE_GATE, ModBlocks.CYAN_FUNGAL_FENCE_GATE,
                ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE, ModBlocks.BLUE_FUNGAL_FENCE_GATE, ModBlocks.PURPLE_FUNGAL_FENCE_GATE,
                ModBlocks.MAGENTA_FUNGAL_FENCE_GATE, ModBlocks.PINK_FUNGAL_FENCE_GATE
        );

        walls.add(
                ModBlocks.LIMESTONE_WALL,
                ModBlocks.LIMESTONE_BRICKS_WALL,
                ModBlocks.POLISHED_LIMESTONE_WALL,
                ModBlocks.SANDY_LIMESTONE_BRICKS_WALL,
                ModBlocks.GRIMROCK_WALL,
                ModBlocks.COBBLED_GRIMROCK_WALL,
                ModBlocks.CRACKED_GRIMROCK_BRICKS_WALL,
                ModBlocks.GRIMROCK_BRICKS_WALL,
                ModBlocks.MOSSY_GRIMROCK_BRICKS_WALL,
                ModBlocks.POLISHED_GRIMROCK_WALL,
                ModBlocks.MOSSY_PACKED_LOAM_BRICKS_WALL,
                ModBlocks.PACKED_LOAM_WALL,
                ModBlocks.PACKED_LOAM_BRICKS_WALL,
                ModBlocks.DRIED_SILT_WALL,
                ModBlocks.POLISHED_SILT_WALL,
                ModBlocks.SILT_BRICKS_WALL,
                ModBlocks.SLATE_WALL,
                ModBlocks.POLISHED_SLATE_WALL,
                ModBlocks.SLATE_BRICKS_WALL,
                ModBlocks.STRATA_WALL,
                ModBlocks.POLISHED_STRATA_WALL,
                ModBlocks.STRATA_BRICKS_WALL,
                ModBlocks.DOLOMITE_WALL,
                ModBlocks.POLISHED_DOLOMITE_WALL,
                ModBlocks.DOLOMITE_BRICKS_WALL
        );

        coralBlocks.add(
                ModBlocks.DOLOMITE,
                ModBlocks.DOLOMITE_BRICKS,
                ModBlocks.CHISELED_DOLOMITE,
                ModBlocks.POLISHED_DOLOMITE


                );

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRAVESTONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRAVESTONE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_GRAVESTONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_GRAVESTONE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRAVESTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRAVESTONE_BRICKS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRAVESTONE_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRAVESTONE_BRICKS_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRAVESTONE_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRAVESTONE_BRICKS_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.GRAVESTONE_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.GRAVESTONE_BRICKS_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_GRAVESTONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_GRAVESTONE);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_GRAVESTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_GRAVESTONE_STAIRS);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_GRAVESTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_GRAVESTONE_SLAB);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.POLISHED_GRAVESTONE_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.POLISHED_GRAVESTONE_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_DRIPSTONE)
                .add(ModBlocks.DRIPSTONE_BRICKS)
                .add(ModBlocks.DRIPSTONE_BRICKS_STAIRS)
                .add(ModBlocks.DRIPSTONE_BRICKS_SLAB)
                .add(ModBlocks.DRIPSTONE_BRICKS_WALL)
                .add(ModBlocks.POLISHED_DRIPSTONE)
                .add(ModBlocks.POLISHED_DRIPSTONE_STAIRS)
                .add(ModBlocks.POLISHED_DRIPSTONE_SLAB)
                .add(ModBlocks.POLISHED_DRIPSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_DRIPSTONE)
                .add(ModBlocks.DRIPSTONE_BRICKS)
                .add(ModBlocks.DRIPSTONE_BRICKS_STAIRS)
                .add(ModBlocks.DRIPSTONE_BRICKS_SLAB)
                .add(ModBlocks.DRIPSTONE_BRICKS_WALL)
                .add(ModBlocks.POLISHED_DRIPSTONE)
                .add(ModBlocks.POLISHED_DRIPSTONE_STAIRS)
                .add(ModBlocks.POLISHED_DRIPSTONE_SLAB)
                .add(ModBlocks.POLISHED_DRIPSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.DRIPSTONE_BRICKS_WALL)
                .add(ModBlocks.POLISHED_DRIPSTONE_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_POLISHED_BASALT)
                .add(ModBlocks.CUT_POLISHED_BASALT)
                .add(ModBlocks.CUT_POLISHED_BASALT_STAIRS)
                .add(ModBlocks.CUT_POLISHED_BASALT_SLAB)
                .add(ModBlocks.CUT_POLISHED_BASALT_WALL)
                .add(ModBlocks.POLISHED_BASALT_BRICKS)
                .add(ModBlocks.POLISHED_BASALT_BRICKS_STAIRS)
                .add(ModBlocks.POLISHED_BASALT_BRICKS_SLAB)
                .add(ModBlocks.POLISHED_BASALT_BRICKS_WALL)
                .add(ModBlocks.POLISHED_BASALT_TILES)
                .add(ModBlocks.POLISHED_BASALT_TILES_STAIRS)
                .add(ModBlocks.POLISHED_BASALT_TILES_SLAB)
                .add(ModBlocks.POLISHED_BASALT_TILES_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_POLISHED_BASALT)
                .add(ModBlocks.CUT_POLISHED_BASALT)
                .add(ModBlocks.CUT_POLISHED_BASALT_STAIRS)
                .add(ModBlocks.CUT_POLISHED_BASALT_SLAB)
                .add(ModBlocks.CUT_POLISHED_BASALT_WALL)
                .add(ModBlocks.POLISHED_BASALT_BRICKS)
                .add(ModBlocks.POLISHED_BASALT_BRICKS_STAIRS)
                .add(ModBlocks.POLISHED_BASALT_BRICKS_SLAB)
                .add(ModBlocks.POLISHED_BASALT_BRICKS_WALL)
                .add(ModBlocks.POLISHED_BASALT_TILES)
                .add(ModBlocks.POLISHED_BASALT_TILES_STAIRS)
                .add(ModBlocks.POLISHED_BASALT_TILES_SLAB)
                .add(ModBlocks.POLISHED_BASALT_TILES_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.CUT_POLISHED_BASALT_WALL)
                .add(ModBlocks.POLISHED_BASALT_BRICKS_WALL)
                .add(ModBlocks.POLISHED_BASALT_TILES_WALL)


        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.BLUE_NETHER_BRICKS)
                .add(ModBlocks.BLUE_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.BLUE_NETHER_BRICKS_SLAB)
                .add(ModBlocks.BLUE_NETHER_BRICKS_WALL)
                .add(ModBlocks.CHISELED_BLUE_NETHER_BRICKS)
                .add(ModBlocks.CHISELED_RED_NETHER_BRICKS)
                .add(ModBlocks.POLISHED_BLUE_NETHER_BRICKS)
                .add(ModBlocks.POLISHED_NETHER_BRICKS)
                .add(ModBlocks.POLISHED_RED_NETHER_BRICKS)
                .add(ModBlocks.TAINTED_NETHER_BRICKS)
                .add(ModBlocks.TAINTED_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.TAINTED_NETHER_BRICKS_SLAB)
                .add(ModBlocks.TAINTED_NETHER_BRICKS_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLUE_NETHER_BRICKS)
                .add(ModBlocks.BLUE_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.BLUE_NETHER_BRICKS_SLAB)
                .add(ModBlocks.BLUE_NETHER_BRICKS_WALL)
                .add(ModBlocks.CHISELED_BLUE_NETHER_BRICKS)
                .add(ModBlocks.CHISELED_RED_NETHER_BRICKS)
                .add(ModBlocks.POLISHED_BLUE_NETHER_BRICKS)
                .add(ModBlocks.POLISHED_NETHER_BRICKS)
                .add(ModBlocks.POLISHED_RED_NETHER_BRICKS)
                .add(ModBlocks.TAINTED_NETHER_BRICKS)
                .add(ModBlocks.TAINTED_NETHER_BRICKS_STAIRS)
                .add(ModBlocks.TAINTED_NETHER_BRICKS_SLAB)
                .add(ModBlocks.TAINTED_NETHER_BRICKS_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.BLUE_NETHER_BRICKS_WALL)
                .add(ModBlocks.TAINTED_NETHER_BRICKS_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_SOUL_BRICKS)
                .add(ModBlocks.POLISHED_SOULSAND)
                .add(ModBlocks.POLISHED_SOULSAND_STAIRS)
                .add(ModBlocks.POLISHED_SOULSAND_SLAB)
                .add(ModBlocks.POLISHED_SOULSAND_WALL)
                .add(ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS)
                .add(ModBlocks.SOUL_BRICKS)
                .add(ModBlocks.SOUL_BRICKS_STAIRS)
                .add(ModBlocks.SOUL_BRICKS_SLAB)
                .add(ModBlocks.SOUL_BRICKS_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_SOUL_BRICKS)
                .add(ModBlocks.POLISHED_SOULSAND)
                .add(ModBlocks.POLISHED_SOULSAND_STAIRS)
                .add(ModBlocks.POLISHED_SOULSAND_SLAB)
                .add(ModBlocks.POLISHED_SOULSAND_WALL)
                .add(ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS)
                .add(ModBlocks.SOUL_BRICKS)
                .add(ModBlocks.SOUL_BRICKS_STAIRS)
                .add(ModBlocks.SOUL_BRICKS_SLAB)
                .add(ModBlocks.SOUL_BRICKS_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.POLISHED_SOULSAND_WALL)
                .add(ModBlocks.SOUL_BRICKS_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_SNOW_BRICKS)
                .add(ModBlocks.PACKED_SNOW)
                .add(ModBlocks.PACKED_SNOW_STAIRS)
                .add(ModBlocks.PACKED_SNOW_SLAB)
                .add(ModBlocks.PACKED_SNOW_WALL)
                .add(ModBlocks.SNOW_BRICKS)
                .add(ModBlocks.SNOW_BRICKS_STAIRS)
                .add(ModBlocks.SNOW_BRICKS_SLAB)
                .add(ModBlocks.SNOW_BRICKS_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_SNOW_BRICKS)
                .add(ModBlocks.PACKED_SNOW)
                .add(ModBlocks.PACKED_SNOW_STAIRS)
                .add(ModBlocks.PACKED_SNOW_SLAB)
                .add(ModBlocks.PACKED_SNOW_WALL)
                .add(ModBlocks.SNOW_BRICKS)
                .add(ModBlocks.SNOW_BRICKS_STAIRS)
                .add(ModBlocks.SNOW_BRICKS_SLAB)
                .add(ModBlocks.SNOW_BRICKS_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PACKED_SNOW_WALL)
                .add(ModBlocks.SNOW_BRICKS_WALL)
        ;
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_PACKED_ICE_BRICKS)
                .add(ModBlocks.PACKED_ICE_BRICKS)
                .add(ModBlocks.PACKED_ICE_BRICKS_STAIRS)
                .add(ModBlocks.PACKED_ICE_BRICKS_SLAB)
                .add(ModBlocks.PACKED_ICE_BRICKS_WALL)
                .add(ModBlocks.POLISHED_PACKED_ICE)
                .add(ModBlocks.POLISHED_PACKED_ICE_STAIRS)
                .add(ModBlocks.POLISHED_PACKED_ICE_SLAB)
                .add(ModBlocks.POLISHED_PACKED_ICE_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_PACKED_ICE_BRICKS)
                .add(ModBlocks.PACKED_ICE_BRICKS)
                .add(ModBlocks.PACKED_ICE_BRICKS_STAIRS)
                .add(ModBlocks.PACKED_ICE_BRICKS_SLAB)
                .add(ModBlocks.PACKED_ICE_BRICKS_WALL)
                .add(ModBlocks.POLISHED_PACKED_ICE)
                .add(ModBlocks.POLISHED_PACKED_ICE_STAIRS)
                .add(ModBlocks.POLISHED_PACKED_ICE_SLAB)
                .add(ModBlocks.POLISHED_PACKED_ICE_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.PACKED_ICE_BRICKS_WALL)
                .add(ModBlocks.POLISHED_PACKED_ICE_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.CHISELED_PRISMARINE)
                .add(ModBlocks.POLISHED_PRISMARINE)
                .add(ModBlocks.POLISHED_PRISMARINE_STAIRS)
                .add(ModBlocks.POLISHED_PRISMARINE_SLAB)
                .add(ModBlocks.POLISHED_PRISMARINE_WALL)
                .add(ModBlocks.PRISMARINE_PILLAR)
                .add(ModBlocks.PRISMARINE_TILES)
                .add(ModBlocks.PRISMARINE_TILES_STAIRS)
                .add(ModBlocks.PRISMARINE_TILES_SLAB)
                .add(ModBlocks.PRISMARINE_TILES_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.CHISELED_PRISMARINE)
                .add(ModBlocks.POLISHED_PRISMARINE)
                .add(ModBlocks.POLISHED_PRISMARINE_STAIRS)
                .add(ModBlocks.POLISHED_PRISMARINE_SLAB)
                .add(ModBlocks.POLISHED_PRISMARINE_WALL)
                .add(ModBlocks.PRISMARINE_PILLAR)
                .add(ModBlocks.PRISMARINE_TILES)
                .add(ModBlocks.PRISMARINE_TILES_STAIRS)
                .add(ModBlocks.PRISMARINE_TILES_SLAB)
                .add(ModBlocks.PRISMARINE_TILES_WALL)
        ;

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.POLISHED_PRISMARINE_WALL)
                .add(ModBlocks.PRISMARINE_TILES_WALL)
        ;




    }
}
