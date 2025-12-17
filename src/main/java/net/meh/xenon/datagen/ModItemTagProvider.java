package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
// Planks

        getOrCreateTagBuilder(ItemTags.PLANKS)
                .add(ModBlocks.VERTICAL_OAK_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_SPRUCE_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_BIRCH_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_JUNGLE_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_ACACIA_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_DARK_OAK_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_MANGROVE_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_CHERRY_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_CRIMSON_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_WARPED_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_BAMBOO_PLANKS.asItem())
                .add(ModBlocks.MAPLE_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_MAPLE_PLANKS.asItem())
                .add(ModBlocks.BLEAK_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_BLEAK_PLANKS.asItem())
                .add(ModBlocks.FIR_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_FIR_PLANKS.asItem())
                .add(ModBlocks.PALM_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_PALM_PLANKS.asItem())
                .add(ModBlocks.BAYOU_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_BAYOU_PLANKS.asItem())
                .add(ModBlocks.WISTERIA_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_WISTERIA_PLANKS.asItem())
                .add(ModBlocks.BAOBAB_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_BAOBAB_PLANKS.asItem())
                .add(ModBlocks.FUNGAL_PLANKS.asItem())
                .add(ModBlocks.VERTICAL_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.WHITE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.GRAY_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.BLACK_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.BROWN_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.RED_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.ORANGE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.YELLOW_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.LIME_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.GREEN_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.CYAN_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.BLUE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.PURPLE_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.MAGENTA_FUNGAL_PLANKS.asItem())
                .add(ModBlocks.PINK_FUNGAL_PLANKS.asItem());


// Wooden Stairs
        getOrCreateTagBuilder(ItemTags.WOODEN_STAIRS)
                .add(
                        ModBlocks.MAPLE_STAIRS.asItem(), ModBlocks.FIR_STAIRS.asItem(), ModBlocks.BLEAK_STAIRS.asItem(),
                        ModBlocks.PALM_STAIRS.asItem(), ModBlocks.BAYOU_STAIRS.asItem(), ModBlocks.WISTERIA_STAIRS.asItem(),
                        ModBlocks.BAOBAB_STAIRS.asItem(), ModBlocks.FUNGAL_STAIRS.asItem(),
                        ModBlocks.WHITE_FUNGAL_STAIRS.asItem(), ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS.asItem(),
                        ModBlocks.GRAY_FUNGAL_STAIRS.asItem(), ModBlocks.BLACK_FUNGAL_STAIRS.asItem(),
                        ModBlocks.BROWN_FUNGAL_STAIRS.asItem(), ModBlocks.RED_FUNGAL_STAIRS.asItem(),
                        ModBlocks.ORANGE_FUNGAL_STAIRS.asItem(), ModBlocks.YELLOW_FUNGAL_STAIRS.asItem(),
                        ModBlocks.LIME_FUNGAL_STAIRS.asItem(), ModBlocks.GREEN_FUNGAL_STAIRS.asItem(),
                        ModBlocks.CYAN_FUNGAL_STAIRS.asItem(), ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS.asItem(),
                        ModBlocks.BLUE_FUNGAL_STAIRS.asItem(), ModBlocks.PURPLE_FUNGAL_STAIRS.asItem(),
                        ModBlocks.MAGENTA_FUNGAL_STAIRS.asItem(), ModBlocks.PINK_FUNGAL_STAIRS.asItem()
                );

// Wooden Slabs
        getOrCreateTagBuilder(ItemTags.WOODEN_SLABS)
                .add(
                        ModBlocks.MAPLE_SLAB.asItem(), ModBlocks.FIR_SLAB.asItem(), ModBlocks.BLEAK_SLAB.asItem(),
                        ModBlocks.PALM_SLAB.asItem(), ModBlocks.BAYOU_SLAB.asItem(), ModBlocks.WISTERIA_SLAB.asItem(),
                        ModBlocks.BAOBAB_SLAB.asItem(), ModBlocks.FUNGAL_SLAB.asItem(),
                        ModBlocks.WHITE_FUNGAL_SLAB.asItem(), ModBlocks.LIGHT_GRAY_FUNGAL_SLAB.asItem(),
                        ModBlocks.GRAY_FUNGAL_SLAB.asItem(), ModBlocks.BLACK_FUNGAL_SLAB.asItem(),
                        ModBlocks.BROWN_FUNGAL_SLAB.asItem(), ModBlocks.RED_FUNGAL_SLAB.asItem(),
                        ModBlocks.ORANGE_FUNGAL_SLAB.asItem(), ModBlocks.YELLOW_FUNGAL_SLAB.asItem(),
                        ModBlocks.LIME_FUNGAL_SLAB.asItem(), ModBlocks.GREEN_FUNGAL_SLAB.asItem(),
                        ModBlocks.CYAN_FUNGAL_SLAB.asItem(), ModBlocks.LIGHT_BLUE_FUNGAL_SLAB.asItem(),
                        ModBlocks.BLUE_FUNGAL_SLAB.asItem(), ModBlocks.PURPLE_FUNGAL_SLAB.asItem(),
                        ModBlocks.MAGENTA_FUNGAL_SLAB.asItem(), ModBlocks.PINK_FUNGAL_SLAB.asItem()
                );

// Wooden Fences
        getOrCreateTagBuilder(ItemTags.WOODEN_FENCES)
                .add(
                        ModBlocks.MAPLE_FENCE.asItem(), ModBlocks.FIR_FENCE.asItem(), ModBlocks.BLEAK_FENCE.asItem(),
                        ModBlocks.PALM_FENCE.asItem(), ModBlocks.BAYOU_FENCE.asItem(), ModBlocks.WISTERIA_FENCE.asItem(),
                        ModBlocks.BAOBAB_FENCE.asItem(), ModBlocks.FUNGAL_FENCE.asItem(),
                        ModBlocks.WHITE_FUNGAL_FENCE.asItem(), ModBlocks.LIGHT_GRAY_FUNGAL_FENCE.asItem(),
                        ModBlocks.GRAY_FUNGAL_FENCE.asItem(), ModBlocks.BLACK_FUNGAL_FENCE.asItem(),
                        ModBlocks.BROWN_FUNGAL_FENCE.asItem(), ModBlocks.RED_FUNGAL_FENCE.asItem(),
                        ModBlocks.ORANGE_FUNGAL_FENCE.asItem(), ModBlocks.YELLOW_FUNGAL_FENCE.asItem(),
                        ModBlocks.LIME_FUNGAL_FENCE.asItem(), ModBlocks.GREEN_FUNGAL_FENCE.asItem(),
                        ModBlocks.CYAN_FUNGAL_FENCE.asItem(), ModBlocks.LIGHT_BLUE_FUNGAL_FENCE.asItem(),
                        ModBlocks.BLUE_FUNGAL_FENCE.asItem(), ModBlocks.PURPLE_FUNGAL_FENCE.asItem(),
                        ModBlocks.MAGENTA_FUNGAL_FENCE.asItem(), ModBlocks.PINK_FUNGAL_FENCE.asItem()
                );

        getOrCreateTagBuilder(ItemTags.FENCES)
                .add(
                        ModBlocks.MAPLE_FENCE.asItem(), ModBlocks.FIR_FENCE.asItem(), ModBlocks.BLEAK_FENCE.asItem(),
                        ModBlocks.PALM_FENCE.asItem(), ModBlocks.BAYOU_FENCE.asItem(), ModBlocks.WISTERIA_FENCE.asItem(),
                        ModBlocks.BAOBAB_FENCE.asItem(), ModBlocks.FUNGAL_FENCE.asItem(),
                        ModBlocks.WHITE_FUNGAL_FENCE.asItem(), ModBlocks.LIGHT_GRAY_FUNGAL_FENCE.asItem(),
                        ModBlocks.GRAY_FUNGAL_FENCE.asItem(), ModBlocks.BLACK_FUNGAL_FENCE.asItem(),
                        ModBlocks.BROWN_FUNGAL_FENCE.asItem(), ModBlocks.RED_FUNGAL_FENCE.asItem(),
                        ModBlocks.ORANGE_FUNGAL_FENCE.asItem(), ModBlocks.YELLOW_FUNGAL_FENCE.asItem(),
                        ModBlocks.LIME_FUNGAL_FENCE.asItem(), ModBlocks.GREEN_FUNGAL_FENCE.asItem(),
                        ModBlocks.CYAN_FUNGAL_FENCE.asItem(), ModBlocks.LIGHT_BLUE_FUNGAL_FENCE.asItem(),
                        ModBlocks.BLUE_FUNGAL_FENCE.asItem(), ModBlocks.PURPLE_FUNGAL_FENCE.asItem(),
                        ModBlocks.MAGENTA_FUNGAL_FENCE.asItem(), ModBlocks.PINK_FUNGAL_FENCE.asItem()
                );

// Wooden Buttons
        getOrCreateTagBuilder(ItemTags.BUTTONS)
                .add(
                        ModBlocks.MAPLE_BUTTON.asItem(), ModBlocks.FIR_BUTTON.asItem(), ModBlocks.BLEAK_BUTTON.asItem(),
                        ModBlocks.PALM_BUTTON.asItem(), ModBlocks.BAYOU_BUTTON.asItem(), ModBlocks.WISTERIA_BUTTON.asItem(),
                        ModBlocks.BAOBAB_BUTTON.asItem(), ModBlocks.FUNGAL_BUTTON.asItem(),
                        ModBlocks.WHITE_FUNGAL_BUTTON.asItem(), ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON.asItem(),
                        ModBlocks.GRAY_FUNGAL_BUTTON.asItem(), ModBlocks.BLACK_FUNGAL_BUTTON.asItem(),
                        ModBlocks.BROWN_FUNGAL_BUTTON.asItem(), ModBlocks.RED_FUNGAL_BUTTON.asItem(),
                        ModBlocks.ORANGE_FUNGAL_BUTTON.asItem(), ModBlocks.YELLOW_FUNGAL_BUTTON.asItem(),
                        ModBlocks.LIME_FUNGAL_BUTTON.asItem(), ModBlocks.GREEN_FUNGAL_BUTTON.asItem(),
                        ModBlocks.CYAN_FUNGAL_BUTTON.asItem(), ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON.asItem(),
                        ModBlocks.BLUE_FUNGAL_BUTTON.asItem(), ModBlocks.PURPLE_FUNGAL_BUTTON.asItem(),
                        ModBlocks.MAGENTA_FUNGAL_BUTTON.asItem(), ModBlocks.PINK_FUNGAL_BUTTON.asItem()
                );

// Wooden Pressure Plates
        getOrCreateTagBuilder(ItemTags.WOODEN_PRESSURE_PLATES)
                .add(
                        ModBlocks.MAPLE_PRESSURE_PLATE.asItem(), ModBlocks.FIR_PRESSURE_PLATE.asItem(), ModBlocks.BLEAK_PRESSURE_PLATE.asItem(),
                        ModBlocks.PALM_PRESSURE_PLATE.asItem(), ModBlocks.BAYOU_PRESSURE_PLATE.asItem(), ModBlocks.WISTERIA_PRESSURE_PLATE.asItem(),
                        ModBlocks.BAOBAB_PRESSURE_PLATE.asItem(), ModBlocks.FUNGAL_PRESSURE_PLATE.asItem(),
                        ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE.asItem(), ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE.asItem(),
                        ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE.asItem(), ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE.asItem(),
                        ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE.asItem(), ModBlocks.RED_FUNGAL_PRESSURE_PLATE.asItem(),
                        ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE.asItem(), ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE.asItem(),
                        ModBlocks.LIME_FUNGAL_PRESSURE_PLATE.asItem(), ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE.asItem(),
                        ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE.asItem(), ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE.asItem(),
                        ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE.asItem(), ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE.asItem(),
                        ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE.asItem(), ModBlocks.PINK_FUNGAL_PRESSURE_PLATE.asItem()
                );
        getOrCreateTagBuilder(ItemTags.LOGS_THAT_BURN)
                .add(ModBlocks.MAPLE_LOG.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_LOG.asItem())
                .add(ModBlocks.MAPLE_WOOD.asItem())
                .add(ModBlocks.STRIPPED_MAPLE_WOOD.asItem())
                .add(ModBlocks.BLEAK_LOG.asItem())
                .add(ModBlocks.STRIPPED_BLEAK_LOG.asItem())
                .add(ModBlocks.BLEAK_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BLEAK_WOOD.asItem())
                .add(ModBlocks.FIR_LOG.asItem())
                .add(ModBlocks.STRIPPED_FIR_LOG.asItem())
                .add(ModBlocks.FIR_WOOD.asItem())
                .add(ModBlocks.STRIPPED_FIR_WOOD.asItem())
                .add(ModBlocks.PALM_LOG.asItem())
                .add(ModBlocks.STRIPPED_PALM_LOG.asItem())
                .add(ModBlocks.PALM_WOOD.asItem())
                .add(ModBlocks.STRIPPED_PALM_WOOD.asItem())
                .add(ModBlocks.BAYOU_LOG.asItem())
                .add(ModBlocks.STRIPPED_BAYOU_LOG.asItem())
                .add(ModBlocks.BAYOU_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BAYOU_WOOD.asItem())
                .add(ModBlocks.WISTERIA_LOG.asItem())
                .add(ModBlocks.STRIPPED_WISTERIA_LOG.asItem())
                .add(ModBlocks.WISTERIA_WOOD.asItem())
                .add(ModBlocks.STRIPPED_WISTERIA_WOOD.asItem())
                .add(ModBlocks.BAOBAB_LOG.asItem())
                .add(ModBlocks.STRIPPED_BAOBAB_LOG.asItem())
                .add(ModBlocks.BAOBAB_WOOD.asItem())
                .add(ModBlocks.STRIPPED_BAOBAB_WOOD.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS);

        getOrCreateTagBuilder(ItemTags.STONE_BUTTONS);

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.LIMESTONE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.LIMESTONE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.LIMESTONE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.LIMESTONE_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.LIMESTONE_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.LIMESTONE_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.POLISHED_LIMESTONE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.POLISHED_LIMESTONE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.POLISHED_LIMESTONE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.SANDY_LIMESTONE_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.GRIMROCK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.GRIMROCK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.GRIMROCK_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.COBBLED_GRIMROCK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.COBBLED_GRIMROCK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.COBBLED_GRIMROCK_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.CRACKED_GRIMROCK_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.GRIMROCK_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.GRIMROCK_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.GRIMROCK_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.MOSSY_GRIMROCK_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.POLISHED_GRIMROCK_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.POLISHED_GRIMROCK_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.POLISHED_GRIMROCK_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.PACKED_LOAM_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.PACKED_LOAM_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.PACKED_LOAM_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.PACKED_LOAM_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.PACKED_LOAM_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.PACKED_LOAM_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.DRIED_SILT_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.DRIED_SILT_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.DRIED_SILT_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.POLISHED_SILT_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.POLISHED_SILT_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.POLISHED_SILT_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.SILT_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.SILT_BRICKS_SLAB.asItem())
                .add(ModBlocks.PACKED_DIRT_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.SILT_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.SLATE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.SLATE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.SLATE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.POLISHED_SLATE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.POLISHED_SLATE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.POLISHED_SLATE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.SLATE_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.SLATE_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.SLATE_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.STRATA_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.STRATA_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.STRATA_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.POLISHED_STRATA_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.POLISHED_STRATA_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.POLISHED_STRATA_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.STRATA_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.STRATA_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.STRATA_BRICKS_WALL.asItem());


        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.DOLOMITE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.DOLOMITE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.DOLOMITE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.POLISHED_DOLOMITE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.POLISHED_DOLOMITE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.POLISHED_DOLOMITE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.DOLOMITE_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.DOLOMITE_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.DOLOMITE_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.GRAVESTONE_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.GRAVESTONE_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.GRAVESTONE_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.POLISHED_GRAVESTONE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.POLISHED_GRAVESTONE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.POLISHED_GRAVESTONE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.DRIPSTONE_BRICKS_STAIRS.asItem())
                .add(ModBlocks.POLISHED_DRIPSTONE_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.DRIPSTONE_BRICKS_SLAB.asItem())
                .add(ModBlocks.POLISHED_DRIPSTONE_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.DRIPSTONE_BRICKS_WALL.asItem())
                .add(ModBlocks.POLISHED_DRIPSTONE_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.BLUE_NETHER_BRICKS_STAIRS.asItem())
                .add(ModBlocks.TAINTED_NETHER_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.BLUE_NETHER_BRICKS_SLAB.asItem())
                .add(ModBlocks.TAINTED_NETHER_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.BLUE_NETHER_BRICKS_WALL.asItem())
                .add(ModBlocks.TAINTED_NETHER_BRICKS_WALL.asItem());

        getOrCreateTagBuilder(ItemTags.STAIRS)
                .add(ModBlocks.POLISHED_SOULSAND_STAIRS.asItem())
                .add(ModBlocks.SOUL_BRICKS_STAIRS.asItem());

        getOrCreateTagBuilder(ItemTags.SLABS)
                .add(ModBlocks.POLISHED_SOULSAND_SLAB.asItem())
                .add(ModBlocks.SOUL_BRICKS_SLAB.asItem());

        getOrCreateTagBuilder(ItemTags.WALLS)
                .add(ModBlocks.POLISHED_SOULSAND_WALL.asItem())
                .add(ModBlocks.SOUL_BRICKS_WALL.asItem());












    }
}