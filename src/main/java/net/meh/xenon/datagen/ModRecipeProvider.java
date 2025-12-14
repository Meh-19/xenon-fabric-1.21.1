package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(FabricDataOutput output,
                             CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    // ------------------------------------------------------------
    //  Small helpers
    // ------------------------------------------------------------

    private void shaped(RecipeExporter exporter,
                        RecipeCategory category,
                        ItemConvertible output,
                        int count,
                        String[] pattern,
                        Object... keys) {

        ShapedRecipeJsonBuilder builder = ShapedRecipeJsonBuilder.create(category, output, count);

        // Patterns
        for (String row : pattern) {
            builder.pattern(row);
        }

        // Key/value pairs
        for (int i = 0; i < keys.length; i += 2) {
            char symbol = (char) keys[i];
            ItemConvertible ingredient = (ItemConvertible) keys[i + 1];
            builder.input(symbol, ingredient);
        }

        // Correct recipe ID for 1.21.1
        String id = RecipeProvider.getRecipeName(output);
        builder.criterion("has_" + id, conditionsFromItem(output));

        builder.offerTo(exporter);
    }





    private void shapeless(RecipeExporter exporter,
                           RecipeCategory category,
                           ItemConvertible output,
                           int count,
                           ItemConvertible... inputs) {

        ShapelessRecipeJsonBuilder builder = ShapelessRecipeJsonBuilder.create(category, output, count);

        for (ItemConvertible in : inputs) {
            builder.input(in);
        }

        String id = RecipeProvider.getRecipeName(output);
        builder.criterion("has_" + id, conditionsFromItem(output));

        builder.offerTo(exporter);
    }



    private void makeFungalBaseWoodSet(RecipeExporter exporter) {
        // Mushroom Stem -> 4 Fungal Planks
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FUNGAL_PLANKS, 4,
                Blocks.MUSHROOM_STEM);

        // Fungal planks wood set (stairs, slab, button, plate, fence, gate)
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FUNGAL_STAIRS, 4,
                new String[]{"P  ", "PP ", "PPP"},
                'P', ModBlocks.FUNGAL_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FUNGAL_SLAB, 6,
                new String[]{"PPP"},
                'P', ModBlocks.FUNGAL_PLANKS);

        shapeless(exporter, RecipeCategory.REDSTONE, ModBlocks.FUNGAL_BUTTON, 1,
                ModBlocks.FUNGAL_PLANKS);

        shaped(exporter, RecipeCategory.REDSTONE, ModBlocks.FUNGAL_PRESSURE_PLATE, 1,
                new String[]{"PP"},
                'P', ModBlocks.FUNGAL_PLANKS);

        shaped(exporter, RecipeCategory.DECORATIONS, ModBlocks.FUNGAL_FENCE, 3,
                new String[]{"PIP", "PIP"},
                'P', ModBlocks.FUNGAL_PLANKS,
                'I', Items.STICK);

        shaped(exporter, RecipeCategory.REDSTONE, ModBlocks.FUNGAL_FENCE_GATE, 1,
                new String[]{"IPI", "IPI"},
                'P', ModBlocks.FUNGAL_PLANKS,
                'I', Items.STICK);
    }

    private void makeFungalColorRecipes(RecipeExporter exporter,
                                        ItemConvertible basePlanks,
                                        ItemConvertible colorPlanks,
                                        ItemConvertible dye,
                                        ItemConvertible stairs,
                                        ItemConvertible slab,
                                        ItemConvertible button,
                                        ItemConvertible pressurePlate,
                                        ItemConvertible fence,
                                        ItemConvertible fenceGate) {

        // Planks recolor (PPP / PIP / PPP)
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, colorPlanks, 8,
                new String[]{"PPP", "PIP", "PPP"},
                'P', basePlanks,
                'I', dye);

        // Stairs
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, stairs, 4,
                new String[]{"P  ", "PP ", "PPP"},
                'P', colorPlanks);

        // Slab
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, slab, 6,
                new String[]{"PPP"},
                'P', colorPlanks);

        // Button
        shapeless(exporter, RecipeCategory.REDSTONE, button, 1,
                colorPlanks);

        // Pressure plate
        shaped(exporter, RecipeCategory.REDSTONE, pressurePlate, 1,
                new String[]{"PP"},
                'P', colorPlanks);

        // Fence
        shaped(exporter, RecipeCategory.DECORATIONS, fence, 3,
                new String[]{"PIP", "PIP"},
                'P', colorPlanks,
                'I', Items.STICK);

        // Fence gate
        shaped(exporter, RecipeCategory.REDSTONE, fenceGate, 1,
                new String[]{"IPI", "IPI"},
                'P', colorPlanks,
                'I', Items.STICK);
    }

    private void makeVerticalPlanks(RecipeExporter exporter,
                                    ItemConvertible basePlanks,
                                    ItemConvertible verticalPlanks) {
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, verticalPlanks, 3,
                new String[]{"P", "P", "P"},
                'P', basePlanks);
    }

    private void makeBeams(RecipeExporter exporter,
                           ItemConvertible log,
                           ItemConvertible beam,
                           ItemConvertible planks) {
        // Log -> Beam (2)
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, beam, 2,
                new String[]{"PP"},
                'P', log);

        // Beam -> 4 planks
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, planks, 4,
                beam);
    }

    private void beamToPlanks(RecipeExporter exporter,
                              ItemConvertible beam,
                              ItemConvertible planks) {
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, planks, 4,
                beam);
    }

    private void makeCarvedPlanks(RecipeExporter exporter,
                                  ItemConvertible basePlanks,
                                  ItemConvertible carvedPlanks) {
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, carvedPlanks, 2,
                new String[]{"PP"},
                'P', basePlanks);
    }

    private void makePaperLantern(RecipeExporter exporter,
                                  ItemConvertible basePlanks,
                                  ItemConvertible lanternBlock) {
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, lanternBlock, 1,
                new String[]{"SPS", "ATA", "SPS"},
                'P', basePlanks,
                'S', Items.STICK,
                'A', Items.PAPER,
                'T', Items.TORCH);
    }

    private void makeShroomLantern(RecipeExporter exporter,
                                   ItemConvertible basePlanks,
                                   ItemConvertible lanternBlock) {
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, lanternBlock, 1,
                new String[]{"SPS", "AAA", "SPS"},
                'P', basePlanks,
                'S', Items.STICK,
                'A', Blocks.SHROOMLIGHT);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        // ------------------------------------------------------------
        //  FUNGAL BASE WOOD SET
        // ------------------------------------------------------------
        makeFungalBaseWoodSet(exporter);

        // ------------------------------------------------------------
        //  FUNGAL DYE VARIANTS (ALL 16 COLORS)
        // ------------------------------------------------------------

        // White
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.WHITE_FUNGAL_PLANKS,
                Items.WHITE_DYE,
                ModBlocks.WHITE_FUNGAL_STAIRS,
                ModBlocks.WHITE_FUNGAL_SLAB,
                ModBlocks.WHITE_FUNGAL_BUTTON,
                ModBlocks.WHITE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.WHITE_FUNGAL_FENCE,
                ModBlocks.WHITE_FUNGAL_FENCE_GATE);

        // Light Gray
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS,
                Items.LIGHT_GRAY_DYE,
                ModBlocks.LIGHT_GRAY_FUNGAL_STAIRS,
                ModBlocks.LIGHT_GRAY_FUNGAL_SLAB,
                ModBlocks.LIGHT_GRAY_FUNGAL_BUTTON,
                ModBlocks.LIGHT_GRAY_FUNGAL_PRESSURE_PLATE,
                ModBlocks.LIGHT_GRAY_FUNGAL_FENCE,
                ModBlocks.LIGHT_GRAY_FUNGAL_FENCE_GATE);

        // Gray
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.GRAY_FUNGAL_PLANKS,
                Items.GRAY_DYE,
                ModBlocks.GRAY_FUNGAL_STAIRS,
                ModBlocks.GRAY_FUNGAL_SLAB,
                ModBlocks.GRAY_FUNGAL_BUTTON,
                ModBlocks.GRAY_FUNGAL_PRESSURE_PLATE,
                ModBlocks.GRAY_FUNGAL_FENCE,
                ModBlocks.GRAY_FUNGAL_FENCE_GATE);

        // Black
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.BLACK_FUNGAL_PLANKS,
                Items.BLACK_DYE,
                ModBlocks.BLACK_FUNGAL_STAIRS,
                ModBlocks.BLACK_FUNGAL_SLAB,
                ModBlocks.BLACK_FUNGAL_BUTTON,
                ModBlocks.BLACK_FUNGAL_PRESSURE_PLATE,
                ModBlocks.BLACK_FUNGAL_FENCE,
                ModBlocks.BLACK_FUNGAL_FENCE_GATE);

        // Brown
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.BROWN_FUNGAL_PLANKS,
                Items.BROWN_DYE,
                ModBlocks.BROWN_FUNGAL_STAIRS,
                ModBlocks.BROWN_FUNGAL_SLAB,
                ModBlocks.BROWN_FUNGAL_BUTTON,
                ModBlocks.BROWN_FUNGAL_PRESSURE_PLATE,
                ModBlocks.BROWN_FUNGAL_FENCE,
                ModBlocks.BROWN_FUNGAL_FENCE_GATE);

        // Red
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.RED_FUNGAL_PLANKS,
                Items.RED_DYE,
                ModBlocks.RED_FUNGAL_STAIRS,
                ModBlocks.RED_FUNGAL_SLAB,
                ModBlocks.RED_FUNGAL_BUTTON,
                ModBlocks.RED_FUNGAL_PRESSURE_PLATE,
                ModBlocks.RED_FUNGAL_FENCE,
                ModBlocks.RED_FUNGAL_FENCE_GATE);

        // Orange
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.ORANGE_FUNGAL_PLANKS,
                Items.ORANGE_DYE,
                ModBlocks.ORANGE_FUNGAL_STAIRS,
                ModBlocks.ORANGE_FUNGAL_SLAB,
                ModBlocks.ORANGE_FUNGAL_BUTTON,
                ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.ORANGE_FUNGAL_FENCE,
                ModBlocks.ORANGE_FUNGAL_FENCE_GATE);

        // Yellow
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.YELLOW_FUNGAL_PLANKS,
                Items.YELLOW_DYE,
                ModBlocks.YELLOW_FUNGAL_STAIRS,
                ModBlocks.YELLOW_FUNGAL_SLAB,
                ModBlocks.YELLOW_FUNGAL_BUTTON,
                ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE,
                ModBlocks.YELLOW_FUNGAL_FENCE,
                ModBlocks.YELLOW_FUNGAL_FENCE_GATE);

        // Lime
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.LIME_FUNGAL_PLANKS,
                Items.LIME_DYE,
                ModBlocks.LIME_FUNGAL_STAIRS,
                ModBlocks.LIME_FUNGAL_SLAB,
                ModBlocks.LIME_FUNGAL_BUTTON,
                ModBlocks.LIME_FUNGAL_PRESSURE_PLATE,
                ModBlocks.LIME_FUNGAL_FENCE,
                ModBlocks.LIME_FUNGAL_FENCE_GATE);

        // Green
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.GREEN_FUNGAL_PLANKS,
                Items.GREEN_DYE,
                ModBlocks.GREEN_FUNGAL_STAIRS,
                ModBlocks.GREEN_FUNGAL_SLAB,
                ModBlocks.GREEN_FUNGAL_BUTTON,
                ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE,
                ModBlocks.GREEN_FUNGAL_FENCE,
                ModBlocks.GREEN_FUNGAL_FENCE_GATE);

        // Cyan
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.CYAN_FUNGAL_PLANKS,
                Items.CYAN_DYE,
                ModBlocks.CYAN_FUNGAL_STAIRS,
                ModBlocks.CYAN_FUNGAL_SLAB,
                ModBlocks.CYAN_FUNGAL_BUTTON,
                ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE,
                ModBlocks.CYAN_FUNGAL_FENCE,
                ModBlocks.CYAN_FUNGAL_FENCE_GATE);

        // Light Blue
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS,
                Items.LIGHT_BLUE_DYE,
                ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS,
                ModBlocks.LIGHT_BLUE_FUNGAL_SLAB,
                ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON,
                ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.LIGHT_BLUE_FUNGAL_FENCE,
                ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE);

        // Blue
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.BLUE_FUNGAL_PLANKS,
                Items.BLUE_DYE,
                ModBlocks.BLUE_FUNGAL_STAIRS,
                ModBlocks.BLUE_FUNGAL_SLAB,
                ModBlocks.BLUE_FUNGAL_BUTTON,
                ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.BLUE_FUNGAL_FENCE,
                ModBlocks.BLUE_FUNGAL_FENCE_GATE);

        // Purple
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.PURPLE_FUNGAL_PLANKS,
                Items.PURPLE_DYE,
                ModBlocks.PURPLE_FUNGAL_STAIRS,
                ModBlocks.PURPLE_FUNGAL_SLAB,
                ModBlocks.PURPLE_FUNGAL_BUTTON,
                ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE,
                ModBlocks.PURPLE_FUNGAL_FENCE,
                ModBlocks.PURPLE_FUNGAL_FENCE_GATE);

        // Magenta
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.MAGENTA_FUNGAL_PLANKS,
                Items.MAGENTA_DYE,
                ModBlocks.MAGENTA_FUNGAL_STAIRS,
                ModBlocks.MAGENTA_FUNGAL_SLAB,
                ModBlocks.MAGENTA_FUNGAL_BUTTON,
                ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE,
                ModBlocks.MAGENTA_FUNGAL_FENCE,
                ModBlocks.MAGENTA_FUNGAL_FENCE_GATE);

        // Pink
        makeFungalColorRecipes(exporter,
                ModBlocks.FUNGAL_PLANKS,
                ModBlocks.PINK_FUNGAL_PLANKS,
                Items.PINK_DYE,
                ModBlocks.PINK_FUNGAL_STAIRS,
                ModBlocks.PINK_FUNGAL_SLAB,
                ModBlocks.PINK_FUNGAL_BUTTON,
                ModBlocks.PINK_FUNGAL_PRESSURE_PLATE,
                ModBlocks.PINK_FUNGAL_FENCE,
                ModBlocks.PINK_FUNGAL_FENCE_GATE);

        // ------------------------------------------------------------
        //  VERTICAL PLANKS (VANILLA + MOD)
        // ------------------------------------------------------------

        // Vanilla
        makeVerticalPlanks(exporter, Blocks.OAK_PLANKS, ModBlocks.VERTICAL_OAK_PLANKS);
        makeVerticalPlanks(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.VERTICAL_SPRUCE_PLANKS);
        makeVerticalPlanks(exporter, Blocks.BIRCH_PLANKS, ModBlocks.VERTICAL_BIRCH_PLANKS);
        makeVerticalPlanks(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.VERTICAL_JUNGLE_PLANKS);
        makeVerticalPlanks(exporter, Blocks.ACACIA_PLANKS, ModBlocks.VERTICAL_ACACIA_PLANKS);
        makeVerticalPlanks(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.VERTICAL_DARK_OAK_PLANKS);
        makeVerticalPlanks(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.VERTICAL_MANGROVE_PLANKS);
        makeVerticalPlanks(exporter, Blocks.CHERRY_PLANKS, ModBlocks.VERTICAL_CHERRY_PLANKS);
        makeVerticalPlanks(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.VERTICAL_CRIMSON_PLANKS);
        makeVerticalPlanks(exporter, Blocks.WARPED_PLANKS, ModBlocks.VERTICAL_WARPED_PLANKS);
        makeVerticalPlanks(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.VERTICAL_BAMBOO_PLANKS);

        // Mod woods
        makeVerticalPlanks(exporter, ModBlocks.MAPLE_PLANKS, ModBlocks.VERTICAL_MAPLE_PLANKS);
        makeVerticalPlanks(exporter, ModBlocks.BLEAK_PLANKS, ModBlocks.VERTICAL_BLEAK_PLANKS);
        makeVerticalPlanks(exporter, ModBlocks.FIR_PLANKS, ModBlocks.VERTICAL_FIR_PLANKS);
        makeVerticalPlanks(exporter, ModBlocks.PALM_PLANKS, ModBlocks.VERTICAL_PALM_PLANKS);
        makeVerticalPlanks(exporter, ModBlocks.BAYOU_PLANKS, ModBlocks.VERTICAL_BAYOU_PLANKS);
        makeVerticalPlanks(exporter, ModBlocks.WISTERIA_PLANKS, ModBlocks.VERTICAL_WISTERIA_PLANKS);
        makeVerticalPlanks(exporter, ModBlocks.BAOBAB_PLANKS, ModBlocks.VERTICAL_BAOBAB_PLANKS);
        makeVerticalPlanks(exporter, ModBlocks.FUNGAL_PLANKS, ModBlocks.VERTICAL_FUNGAL_PLANKS);

        // ------------------------------------------------------------
        //  BEAMS (MOD) + BEAM → PLANKS (MOD + VANILLA)
        // ------------------------------------------------------------

        // Mod beams (log -> beam, beam -> planks)
        makeBeams(exporter, ModBlocks.MAPLE_LOG, ModBlocks.MAPLE_BEAM, ModBlocks.MAPLE_PLANKS);
        makeBeams(exporter, ModBlocks.BLEAK_LOG, ModBlocks.BLEAK_BEAM, ModBlocks.BLEAK_PLANKS);
        makeBeams(exporter, ModBlocks.FIR_LOG, ModBlocks.FIR_BEAM, ModBlocks.FIR_PLANKS);
        makeBeams(exporter, ModBlocks.PALM_LOG, ModBlocks.PALM_BEAM, ModBlocks.PALM_PLANKS);
        makeBeams(exporter, ModBlocks.BAYOU_LOG, ModBlocks.BAYOU_BEAM, ModBlocks.BAYOU_PLANKS);
        makeBeams(exporter, ModBlocks.WISTERIA_LOG, ModBlocks.WISTERIA_BEAM, ModBlocks.WISTERIA_PLANKS);
        makeBeams(exporter, ModBlocks.BAOBAB_LOG, ModBlocks.BAOBAB_BEAM, ModBlocks.BAOBAB_PLANKS);

        // Vanilla beams: only beam -> planks
        beamToPlanks(exporter, ModBlocks.OAK_BEAM, Blocks.OAK_PLANKS);
        beamToPlanks(exporter, ModBlocks.SPRUCE_BEAM, Blocks.SPRUCE_PLANKS);
        beamToPlanks(exporter, ModBlocks.BIRCH_BEAM, Blocks.BIRCH_PLANKS);
        beamToPlanks(exporter, ModBlocks.JUNGLE_BEAM, Blocks.JUNGLE_PLANKS);
        beamToPlanks(exporter, ModBlocks.ACACIA_BEAM, Blocks.ACACIA_PLANKS);
        beamToPlanks(exporter, ModBlocks.DARK_OAK_BEAM, Blocks.DARK_OAK_PLANKS);
        beamToPlanks(exporter, ModBlocks.MANGROVE_BEAM, Blocks.MANGROVE_PLANKS);
        beamToPlanks(exporter, ModBlocks.CHERRY_BEAM, Blocks.CHERRY_PLANKS);
        beamToPlanks(exporter, ModBlocks.WARPED_BEAM, Blocks.WARPED_PLANKS);
        beamToPlanks(exporter, ModBlocks.CRIMSON_BEAM, Blocks.CRIMSON_PLANKS);

        // ------------------------------------------------------------
        //  CARVED PLANK VARIANTS (VANILLA + MOD + FUNGAL)
        // ------------------------------------------------------------

        // Vanilla carved planks
        makeCarvedPlanks(exporter, Blocks.OAK_PLANKS, ModBlocks.OAK_PLANKS_CARVED);
        makeCarvedPlanks(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_PLANKS_CARVED);
        makeCarvedPlanks(exporter, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_PLANKS_CARVED);
        makeCarvedPlanks(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_PLANKS_CARVED);
        makeCarvedPlanks(exporter, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_PLANKS_CARVED);
        makeCarvedPlanks(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_PLANKS_CARVED);
        makeCarvedPlanks(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_PLANKS_CARVED);
        makeCarvedPlanks(exporter, Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_PLANKS_CARVED);
        makeCarvedPlanks(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_PLANKS_CARVED);
        makeCarvedPlanks(exporter, Blocks.WARPED_PLANKS, ModBlocks.WARPED_PLANKS_CARVED);

        // Mod carved planks
        makeCarvedPlanks(exporter, ModBlocks.MAPLE_PLANKS, ModBlocks.MAPLE_PLANKS_CARVED);
        makeCarvedPlanks(exporter, ModBlocks.BLEAK_PLANKS, ModBlocks.BLEAK_PLANKS_CARVED);
        makeCarvedPlanks(exporter, ModBlocks.FIR_PLANKS, ModBlocks.FIR_PLANKS_CARVED);
        makeCarvedPlanks(exporter, ModBlocks.PALM_PLANKS, ModBlocks.PALM_PLANKS_CARVED);
        makeCarvedPlanks(exporter, ModBlocks.BAYOU_PLANKS, ModBlocks.BAYOU_PLANKS_CARVED);
        makeCarvedPlanks(exporter, ModBlocks.WISTERIA_PLANKS, ModBlocks.WISTERIA_PLANKS_CARVED);
        makeCarvedPlanks(exporter, ModBlocks.BAOBAB_PLANKS, ModBlocks.BAOBAB_PLANKS_CARVED);
        makeCarvedPlanks(exporter, ModBlocks.FUNGAL_PLANKS, ModBlocks.FUNGAL_PLANKS_CARVED);

        // ------------------------------------------------------------
        //  PAPER LANTERNS + SHROOM LANTERNS
        // ------------------------------------------------------------

        // Vanilla plank paper lanterns
        makePaperLantern(exporter, Blocks.OAK_PLANKS, ModBlocks.OAK_PAPER_LANTERN);
        makePaperLantern(exporter, Blocks.SPRUCE_PLANKS, ModBlocks.SPRUCE_PAPER_LANTERN);
        makePaperLantern(exporter, Blocks.BIRCH_PLANKS, ModBlocks.BIRCH_PAPER_LANTERN);
        makePaperLantern(exporter, Blocks.JUNGLE_PLANKS, ModBlocks.JUNGLE_PAPER_LANTERN);
        makePaperLantern(exporter, Blocks.ACACIA_PLANKS, ModBlocks.ACACIA_PAPER_LANTERN);
        makePaperLantern(exporter, Blocks.DARK_OAK_PLANKS, ModBlocks.DARK_OAK_PAPER_LANTERN);
        makePaperLantern(exporter, Blocks.MANGROVE_PLANKS, ModBlocks.MANGROVE_PAPER_LANTERN);
        makePaperLantern(exporter, Blocks.CHERRY_PLANKS, ModBlocks.CHERRY_PAPER_LANTERN);
        makePaperLantern(exporter, Blocks.BAMBOO_PLANKS, ModBlocks.BAMBOO_PAPER_LANTERN);

        // Mod plank paper lanterns
        makePaperLantern(exporter, ModBlocks.MAPLE_PLANKS, ModBlocks.MAPLE_PAPER_LANTERN);
        makePaperLantern(exporter, ModBlocks.BLEAK_PLANKS, ModBlocks.BLEAK_PAPER_LANTERN);
        makePaperLantern(exporter, ModBlocks.FIR_PLANKS, ModBlocks.FIR_PAPER_LANTERN);
        makePaperLantern(exporter, ModBlocks.PALM_PLANKS, ModBlocks.PALM_PAPER_LANTERN);
        makePaperLantern(exporter, ModBlocks.BAYOU_PLANKS, ModBlocks.BAYOU_PAPER_LANTERN);
        makePaperLantern(exporter, ModBlocks.WISTERIA_PLANKS, ModBlocks.WISTERIA_PAPER_LANTERN);
        makePaperLantern(exporter, ModBlocks.BAOBAB_PLANKS, ModBlocks.BAOBAB_PAPER_LANTERN);
        makePaperLantern(exporter, ModBlocks.FUNGAL_PLANKS, ModBlocks.FUNGAL_PAPER_LANTERN);

        // Shroom lanterns (Nether woods + Shroomlight)
        makeShroomLantern(exporter, Blocks.CRIMSON_PLANKS, ModBlocks.CRIMSON_SHROOM_LANTERN);
        makeShroomLantern(exporter, Blocks.WARPED_PLANKS, ModBlocks.WARPED_SHROOM_LANTERN);

        // -------------------------------
// PART 3 — VANILLA WOOD RECIPES
// -------------------------------
//
// These generate recipes for cutting beams back into planks,
// and carved plank variants for each vanilla wood type.
//



    }
    private void generateVanillaWoodRecipes(RecipeExporter exporter) {

        // Revert beams → planks (4 planks per beam)
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_PLANKS, 4,       ModBlocks.OAK_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_PLANKS, 4,    ModBlocks.SPRUCE_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_PLANKS, 4,     ModBlocks.BIRCH_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_PLANKS, 4,    ModBlocks.JUNGLE_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_PLANKS, 4,    ModBlocks.ACACIA_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_PLANKS, 4,  ModBlocks.DARK_OAK_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_PLANKS, 4,  ModBlocks.MANGROVE_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_PLANKS, 4,    ModBlocks.CHERRY_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_PLANKS, 4,   ModBlocks.CRIMSON_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_PLANKS, 4,    ModBlocks.WARPED_BEAM);

        // Carved planks (2 output)
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.OAK_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.SPRUCE_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.BIRCH_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.JUNGLE_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.ACACIA_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.DARK_OAK_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.MANGROVE_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.CHERRY_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.CRIMSON_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_PLANKS_CARVED, 2,
                new String[] { "PP" },
                'P', Blocks.WARPED_PLANKS);
    }
    // ---------------------------------------
// PART 4 — MODDED WOOD FAMILY RECIPES
// ---------------------------------------
//
// All modded woods: vertical planks, carved planks,
// beams → planks conversions, and planks → vertical planks.
//

    private void generateModdedWoodRecipes(RecipeExporter exporter) {

        // -------------------
        // WOOD SETS: MAPLE
        // -------------------

        // Planks → Vertical Planks
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_MAPLE_PLANKS, 3,
                new String[]{ "P", "P", "P" },
                'P', ModBlocks.MAPLE_PLANKS);

        // Planks Carved
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_PLANKS_CARVED, 2,
                new String[]{ "PP" },
                'P', ModBlocks.MAPLE_PLANKS);

        // Beam → Planks
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_PLANKS, 4,
                ModBlocks.MAPLE_BEAM);

        // Beam crafting (Log → Beam)
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_BEAM, 2,
                new String[]{ "PP" },
                'P', ModBlocks.MAPLE_LOG);


        // -------------------
        // WOOD SETS: BLEAK
        // -------------------

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BLEAK_PLANKS, 3,
                new String[]{ "P", "P", "P" },
                'P', ModBlocks.BLEAK_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLEAK_PLANKS_CARVED, 2,
                new String[]{ "PP" },
                'P', ModBlocks.BLEAK_PLANKS);

        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLEAK_PLANKS, 4,
                ModBlocks.BLEAK_BEAM);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLEAK_BEAM, 2,
                new String[]{ "PP" },
                'P', ModBlocks.BLEAK_LOG);


        // -------------------
        // WOOD SETS: FIR
        // -------------------

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FIR_PLANKS, 3,
                new String[]{ "P", "P", "P" },
                'P', ModBlocks.FIR_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIR_PLANKS_CARVED, 2,
                new String[]{ "PP" },
                'P', ModBlocks.FIR_PLANKS);

        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIR_PLANKS, 4,
                ModBlocks.FIR_BEAM);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIR_BEAM, 2,
                new String[]{ "PP" },
                'P', ModBlocks.FIR_LOG);


        // -------------------
        // WOOD SETS: PALM
        // -------------------

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_PALM_PLANKS, 3,
                new String[]{ "P", "P", "P" },
                'P', ModBlocks.PALM_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS_CARVED, 2,
                new String[]{ "PP" },
                'P', ModBlocks.PALM_PLANKS);

        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS, 4,
                ModBlocks.PALM_BEAM);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_BEAM, 2,
                new String[]{ "PP" },
                'P', ModBlocks.PALM_LOG);


        // -------------------
        // WOOD SETS: BAYOU
        // -------------------

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BAYOU_PLANKS, 3,
                new String[]{ "P", "P", "P" },
                'P', ModBlocks.BAYOU_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAYOU_PLANKS_CARVED, 2,
                new String[]{ "PP" },
                'P', ModBlocks.BAYOU_PLANKS);

        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAYOU_PLANKS, 4,
                ModBlocks.BAYOU_BEAM);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAYOU_BEAM, 2,
                new String[]{ "PP" },
                'P', ModBlocks.BAYOU_LOG);


        // -------------------
        // WOOD SETS: WISTERIA
        // -------------------

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_WISTERIA_PLANKS, 3,
                new String[]{ "P", "P", "P" },
                'P', ModBlocks.WISTERIA_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_PLANKS_CARVED, 2,
                new String[]{ "PP" },
                'P', ModBlocks.WISTERIA_PLANKS);

        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_PLANKS, 4,
                ModBlocks.WISTERIA_BEAM);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_BEAM, 2,
                new String[]{ "PP" },
                'P', ModBlocks.WISTERIA_LOG);


        // -------------------
        // WOOD SETS: BAOBAB
        // -------------------

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BAOBAB_PLANKS, 3,
                new String[]{ "P", "P", "P" },
                'P', ModBlocks.BAOBAB_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAOBAB_PLANKS_CARVED, 2,
                new String[]{ "PP" },
                'P', ModBlocks.BAOBAB_PLANKS);

        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAOBAB_PLANKS, 4,
                ModBlocks.BAOBAB_BEAM);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAOBAB_BEAM, 2,
                new String[]{ "PP" },
                'P', ModBlocks.BAOBAB_LOG);


        // -------------------
        // WOOD SETS: FUNGAL (BASE)
        // -------------------

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FUNGAL_PLANKS, 3,
                new String[]{ "P", "P", "P" },
                'P', ModBlocks.FUNGAL_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FUNGAL_PLANKS_CARVED, 2,
                new String[]{ "PP" },
                'P', ModBlocks.FUNGAL_PLANKS);

    }
// -------------------------------------------
// PART 5 — BEAM → PLANKS + VERTICAL PLANKS
// -------------------------------------------
//
// All woods (vanilla + modded) get:
//  • 4 planks from 1 beam (shapeless)
//  • 3 vertical planks from 3 planks (shaped)
//
// This unifies all wood sets, including modded ones.
//

    private void generateBeamAndVerticalPlankRecipes(RecipeExporter exporter) {

        // -------------------------------------------
        // VANILLA WOODS — vertical planks
        // -------------------------------------------

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_OAK_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.OAK_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_SPRUCE_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.SPRUCE_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BIRCH_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.BIRCH_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_JUNGLE_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.JUNGLE_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_ACACIA_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.ACACIA_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_DARK_OAK_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.DARK_OAK_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_MANGROVE_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.MANGROVE_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CHERRY_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.CHERRY_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_CRIMSON_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.CRIMSON_PLANKS);

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_WARPED_PLANKS, 3,
                new String[]{ "P", "P", "P" }, 'P', Blocks.WARPED_PLANKS);


        // -------------------------------------------
        // VANILLA BEAMS → PLANKS
        // -------------------------------------------

        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.OAK_PLANKS, 4, ModBlocks.OAK_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.SPRUCE_PLANKS, 4, ModBlocks.SPRUCE_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.BIRCH_PLANKS, 4, ModBlocks.BIRCH_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.JUNGLE_PLANKS, 4, ModBlocks.JUNGLE_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.ACACIA_PLANKS, 4, ModBlocks.ACACIA_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.DARK_OAK_PLANKS, 4, ModBlocks.DARK_OAK_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.MANGROVE_PLANKS, 4, ModBlocks.MANGROVE_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CHERRY_PLANKS, 4, ModBlocks.CHERRY_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.CRIMSON_PLANKS, 4, ModBlocks.CRIMSON_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, Blocks.WARPED_PLANKS, 4, ModBlocks.WARPED_BEAM);


        // -------------------------------------------
        // MODDED WOODS — vertical planks
        // -------------------------------------------

        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_MAPLE_PLANKS,    3, new String[]{ "P","P","P" }, 'P', ModBlocks.MAPLE_PLANKS);
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BLEAK_PLANKS,    3, new String[]{ "P","P","P" }, 'P', ModBlocks.BLEAK_PLANKS);
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FIR_PLANKS,      3, new String[]{ "P","P","P" }, 'P', ModBlocks.FIR_PLANKS);
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_PALM_PLANKS,     3, new String[]{ "P","P","P" }, 'P', ModBlocks.PALM_PLANKS);
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BAYOU_PLANKS,    3, new String[]{ "P","P","P" }, 'P', ModBlocks.BAYOU_PLANKS);
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_WISTERIA_PLANKS, 3, new String[]{ "P","P","P" }, 'P', ModBlocks.WISTERIA_PLANKS);
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_BAOBAB_PLANKS,   3, new String[]{ "P","P","P" }, 'P', ModBlocks.BAOBAB_PLANKS);
        shaped(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.VERTICAL_FUNGAL_PLANKS,   3, new String[]{ "P","P","P" }, 'P', ModBlocks.FUNGAL_PLANKS);


        // -------------------------------------------
        // MODDED BEAMS → PLANKS
        // -------------------------------------------

        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.MAPLE_PLANKS,    4, ModBlocks.MAPLE_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLEAK_PLANKS,    4, ModBlocks.BLEAK_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.FIR_PLANKS,      4, ModBlocks.FIR_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALM_PLANKS,     4, ModBlocks.PALM_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAYOU_PLANKS,    4, ModBlocks.BAYOU_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.WISTERIA_PLANKS, 4, ModBlocks.WISTERIA_BEAM);
        shapeless(exporter, RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAOBAB_PLANKS,   4, ModBlocks.BAOBAB_BEAM);
    }
// --------------------------------------------------------
// PART 6 — COLORED FUNGAL WOOD SETS (NO getBlock NEEDED)
// --------------------------------------------------------

    private void generateColoredFungalWood(RecipeExporter exporter) {

        record FungalColor(
                String name,
                Item dye,
                Block planks,
                Block stairs,
                Block slab,
                Block button,
                Block pressure,
                Block fence,
                Block fenceGate
        ) {}

        List<FungalColor> colors = List.of(
                new FungalColor("red", Items.RED_DYE,
                        ModBlocks.RED_FUNGAL_PLANKS,
                        ModBlocks.RED_FUNGAL_STAIRS,
                        ModBlocks.RED_FUNGAL_SLAB,
                        ModBlocks.RED_FUNGAL_BUTTON,
                        ModBlocks.RED_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.RED_FUNGAL_FENCE,
                        ModBlocks.RED_FUNGAL_FENCE_GATE
                ),

                new FungalColor("orange", Items.ORANGE_DYE,
                        ModBlocks.ORANGE_FUNGAL_PLANKS,
                        ModBlocks.ORANGE_FUNGAL_STAIRS,
                        ModBlocks.ORANGE_FUNGAL_SLAB,
                        ModBlocks.ORANGE_FUNGAL_BUTTON,
                        ModBlocks.ORANGE_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.ORANGE_FUNGAL_FENCE,
                        ModBlocks.ORANGE_FUNGAL_FENCE_GATE
                ),

                new FungalColor("yellow", Items.YELLOW_DYE,
                        ModBlocks.YELLOW_FUNGAL_PLANKS,
                        ModBlocks.YELLOW_FUNGAL_STAIRS,
                        ModBlocks.YELLOW_FUNGAL_SLAB,
                        ModBlocks.YELLOW_FUNGAL_BUTTON,
                        ModBlocks.YELLOW_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.YELLOW_FUNGAL_FENCE,
                        ModBlocks.YELLOW_FUNGAL_FENCE_GATE
                ),

                new FungalColor("lime", Items.LIME_DYE,
                        ModBlocks.LIME_FUNGAL_PLANKS,
                        ModBlocks.LIME_FUNGAL_STAIRS,
                        ModBlocks.LIME_FUNGAL_SLAB,
                        ModBlocks.LIME_FUNGAL_BUTTON,
                        ModBlocks.LIME_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.LIME_FUNGAL_FENCE,
                        ModBlocks.LIME_FUNGAL_FENCE_GATE
                ),

                new FungalColor("green", Items.GREEN_DYE,
                        ModBlocks.GREEN_FUNGAL_PLANKS,
                        ModBlocks.GREEN_FUNGAL_STAIRS,
                        ModBlocks.GREEN_FUNGAL_SLAB,
                        ModBlocks.GREEN_FUNGAL_BUTTON,
                        ModBlocks.GREEN_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.GREEN_FUNGAL_FENCE,
                        ModBlocks.GREEN_FUNGAL_FENCE_GATE
                ),

                new FungalColor("cyan", Items.CYAN_DYE,
                        ModBlocks.CYAN_FUNGAL_PLANKS,
                        ModBlocks.CYAN_FUNGAL_STAIRS,
                        ModBlocks.CYAN_FUNGAL_SLAB,
                        ModBlocks.CYAN_FUNGAL_BUTTON,
                        ModBlocks.CYAN_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.CYAN_FUNGAL_FENCE,
                        ModBlocks.CYAN_FUNGAL_FENCE_GATE
                ),

                new FungalColor("light_blue", Items.LIGHT_BLUE_DYE,
                        ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS,
                        ModBlocks.LIGHT_BLUE_FUNGAL_STAIRS,
                        ModBlocks.LIGHT_BLUE_FUNGAL_SLAB,
                        ModBlocks.LIGHT_BLUE_FUNGAL_BUTTON,
                        ModBlocks.LIGHT_BLUE_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.LIGHT_BLUE_FUNGAL_FENCE,
                        ModBlocks.LIGHT_BLUE_FUNGAL_FENCE_GATE
                ),

                new FungalColor("blue", Items.BLUE_DYE,
                        ModBlocks.BLUE_FUNGAL_PLANKS,
                        ModBlocks.BLUE_FUNGAL_STAIRS,
                        ModBlocks.BLUE_FUNGAL_SLAB,
                        ModBlocks.BLUE_FUNGAL_BUTTON,
                        ModBlocks.BLUE_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.BLUE_FUNGAL_FENCE,
                        ModBlocks.BLUE_FUNGAL_FENCE_GATE
                ),

                new FungalColor("purple", Items.PURPLE_DYE,
                        ModBlocks.PURPLE_FUNGAL_PLANKS,
                        ModBlocks.PURPLE_FUNGAL_STAIRS,
                        ModBlocks.PURPLE_FUNGAL_SLAB,
                        ModBlocks.PURPLE_FUNGAL_BUTTON,
                        ModBlocks.PURPLE_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.PURPLE_FUNGAL_FENCE,
                        ModBlocks.PURPLE_FUNGAL_FENCE_GATE
                ),

                new FungalColor("magenta", Items.MAGENTA_DYE,
                        ModBlocks.MAGENTA_FUNGAL_PLANKS,
                        ModBlocks.MAGENTA_FUNGAL_STAIRS,
                        ModBlocks.MAGENTA_FUNGAL_SLAB,
                        ModBlocks.MAGENTA_FUNGAL_BUTTON,
                        ModBlocks.MAGENTA_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.MAGENTA_FUNGAL_FENCE,
                        ModBlocks.MAGENTA_FUNGAL_FENCE_GATE
                ),

                new FungalColor("pink", Items.PINK_DYE,
                        ModBlocks.PINK_FUNGAL_PLANKS,
                        ModBlocks.PINK_FUNGAL_STAIRS,
                        ModBlocks.PINK_FUNGAL_SLAB,
                        ModBlocks.PINK_FUNGAL_BUTTON,
                        ModBlocks.PINK_FUNGAL_PRESSURE_PLATE,
                        ModBlocks.PINK_FUNGAL_FENCE,
                        ModBlocks.PINK_FUNGAL_FENCE_GATE
                )
        );

        // -----------------------------------------
        // Generate all fungal colors in one loop
        // -----------------------------------------
        for (FungalColor c : colors) {

            // Planks (8)
            shaped(exporter, RecipeCategory.BUILDING_BLOCKS, c.planks(), 8,
                    new String[]{ "PPP", "PIP", "PPP" },
                    'P', ModBlocks.FUNGAL_PLANKS,
                    'I', c.dye());

            // Stairs (4)
            shaped(exporter, RecipeCategory.BUILDING_BLOCKS, c.stairs(), 4,
                    new String[]{ "P  ", "PP ", "PPP" },
                    'P', c.planks());

            // Slab (6)
            shaped(exporter, RecipeCategory.BUILDING_BLOCKS, c.slab(), 6,
                    new String[]{ "PPP" },
                    'P', c.planks());

            // Button
            shapeless(exporter, RecipeCategory.REDSTONE, c.button(), 1,
                    c.planks());

            // Pressure Plate
            shaped(exporter, RecipeCategory.REDSTONE, c.pressure(), 1,
                    new String[]{ "PP" },
                    'P', c.planks());

            // Fence (3)
            shaped(exporter, RecipeCategory.DECORATIONS, c.fence(), 3,
                    new String[]{ "PIP", "PIP" },
                    'P', c.planks(),
                    'I', Items.STICK);

            // Fence Gate (1)
            shaped(exporter, RecipeCategory.REDSTONE, c.fenceGate(), 1,
                    new String[]{ "IPI", "IPI" },
                    'P', c.planks(),
                    'I', Items.STICK);
        }
        // ===============================
// BLIGHT / BLEAK / GRIM / LOAM SET
// ===============================

// Damp Moss (item) ⇄ Damp Moss Block

// 3x DAMP_MOSS (item) from 2x DAMP_MOSS_BLOCK, vertical pattern
     //   ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.DAMP_MOSS, 3)
      //          .pattern("P")
      //          .pattern("P")
      //          .input('P', ModBlocks.DAMP_MOSS_BLOCK)
      //          .criterion("has_damp_moss_block", conditionsFromItem(ModBlocks.DAMP_MOSS_BLOCK))
       //         .offerTo(exporter);

// 1x DAMP_MOSS_BLOCK from 4x DAMP_MOSS (item)
   //     ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.DAMP_MOSS_BLOCK)
     //           .pattern("PP")
     //           .pattern("PP")
      //          .input('P', ModBlocks.DAMP_MOSS)
     //           .criterion("has_damp_moss", conditionsFromItem(ModBlocks.DAMP_MOSS))
     //           .offerTo(exporter);


// Bleak Leaves: 8x from Jungle Leaves + Blight Essence
        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.BLEAK_LEAVES, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', Blocks.JUNGLE_LEAVES)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Grimrock: 8x from Stone + Blight Essence
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRIMROCK, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', Blocks.STONE)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Ashen Sandstone: 8x from Sandstone + Blight Essence
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHEN_SANDSTONE, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', Blocks.SANDSTONE)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Ashen Sand: 8x from Sand + Blight Essence
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHEN_SAND, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', Blocks.SAND)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Grimweed Block: 8x from Grass Block + Blight Essence
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRIMWEED_BLOCK, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', Blocks.GRASS_BLOCK)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Bleak Planks: 8x from any Planks + Blight Essence (uses vanilla PLANKS tag)
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLEAK_PLANKS, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ItemTags.PLANKS)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Blighted Shroomlight: 8x from Shroomlight + Blight Essence
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLIGHTED_SHROOMLIGHT, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', Blocks.SHROOMLIGHT)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Cobbled Grimrock: 8x from Cobblestone + Blight Essence
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLED_GRIMROCK, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', Blocks.COBBLESTONE)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Grimoss Block: 8x from Damp Moss Block + Blight Essence
   //     ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRIMOSS_BLOCK, 8)
     //           .pattern("PPP")
     //           .pattern("PIP")
     //           .pattern("PPP")
      //          .input('P', ModBlocks.DAMP_MOSS_BLOCK)
      //          .input('I', ModItems.BLIGHT_ESSENCE)
      //          .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
      //          .offerTo(exporter);


// Grimoss (item): 8x from Damp Moss (item) + Blight Essence
  //      ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.GRIMOSS, 8)
    //            .pattern("PPP")
     //           .pattern("PIP")
    //            .pattern("PPP")
     //           .input('P', ModBlocks.DAMP_MOSS)
      //          .input('I', ModItems.BLIGHT_ESSENCE)
      //          .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
          //      .offerTo(exporter);


// Grimweed (short): 8x from Short Grass + Blight Essence
      //  ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.GRIMWEED, 8)
      //          .pattern("PPP")
      //          .pattern("PIP")
      //          .pattern("PPP")
        //        .input('P', Blocks.SHORT_GRASS)
          //      .input('I', ModItems.BLIGHT_ESSENCE)
            //    .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
              //  .offerTo(exporter);


// Pale Grimweed: 8x from Grimweed + Blight Essence
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.PALE_GRIMWEED, 8)
  //              .pattern("PPP")
    //            .pattern("PIP")
      //          .pattern("PPP")
        //        .input('P', ModBlocks.GRIMWEED)
          //      .input('I', ModItems.BLIGHT_ESSENCE)
            //    .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
              //  .offerTo(exporter);


// Tall Grimweed: 8x from Tall Grass + Blight Essence
//        ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TALL_GRIMWEED, 8)
  //              .pattern("PPP")
    //            .pattern("PIP")
      //          .pattern("PPP")
        //        .input('P', Blocks.TALL_GRASS)
          //      .input('I', ModItems.BLIGHT_ESSENCE)
            //    .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
              //  .offerTo(exporter);


// Tall Pale Grimweed: 8x from Tall Grimweed + Blight Essence
   //     ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, ModBlocks.TALL_PALE_GRIMWEED, 8)
     //           .pattern("PPP")
       //         .pattern("PIP")
         //       .pattern("PPP")
           //     .input('P', ModBlocks.TALL_GRIMWEED)
             //   .input('I', ModItems.BLIGHT_ESSENCE)
               // .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                //.offerTo(exporter);


// Pale Grimweed Block: 8x from Mycelium OR Grimweed Block + Blight Essence
// Option B (your choice earlier): use two separate recipes (no non-vanilla tag / ingredient hacks).

// Mycelium → Pale Grimweed Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_GRIMWEED_BLOCK, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', Blocks.MYCELIUM)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);

// Grimweed Block → Pale Grimweed Block
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PALE_GRIMWEED_BLOCK, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ModBlocks.GRIMWEED_BLOCK)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Bleak Log: 8x from any Log + Blight Essence (vanilla LOGS tag)
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BLEAK_LOG, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', ItemTags.LOGS)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Loam: 8x from Dirt + Blight Essence
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.LOAM, 8)
                .pattern("PPP")
                .pattern("PIP")
                .pattern("PPP")
                .input('P', Blocks.DIRT)
                .input('I', ModItems.BLIGHT_ESSENCE)
                .criterion("has_blight_essence", conditionsFromItem(ModItems.BLIGHT_ESSENCE))
                .offerTo(exporter);


// Packed Loam: 4x from 4x Loam
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_LOAM, 4)
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.LOAM)
                .criterion("has_loam", conditionsFromItem(ModBlocks.LOAM))
                .offerTo(exporter);


// Packed Loam Bricks: 4x from 4x Packed Loam
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_LOAM_BRICKS, 4)
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.PACKED_LOAM)
                .criterion("has_packed_loam", conditionsFromItem(ModBlocks.PACKED_LOAM))
                .offerTo(exporter);


// Chiseled Packed Loam: 2x from 2x Packed Loam
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_PACKED_LOAM, 2)
                .pattern("PP")
                .input('P', ModBlocks.PACKED_LOAM)
                .criterion("has_packed_loam", conditionsFromItem(ModBlocks.PACKED_LOAM))
                .offerTo(exporter);


// Mossy Packed Loam Bricks: 1x from Packed Loam Bricks + Grimoss
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_PACKED_LOAM_BRICKS)
                .pattern("PI")
                .pattern("P ")
                .input('P', ModBlocks.PACKED_LOAM_BRICKS)
                .input('I', ModBlocks.GRIMOSS)
                .criterion("has_packed_loam_bricks", conditionsFromItem(ModBlocks.PACKED_LOAM_BRICKS))
                .offerTo(exporter);


// Ashen Sandstone family rework (you also have the Blight conversions above)

// Ashen Sandstone: 1x from 4x Ashen Sand
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ASHEN_SANDSTONE)
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.ASHEN_SAND)
                .criterion("has_ashen_sand", conditionsFromItem(ModBlocks.ASHEN_SAND))
                .offerTo(exporter);

// Cut Ashen Sandstone: 4x from 4x Ashen Sandstone
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CUT_ASHEN_SANDSTONE, 4)
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.ASHEN_SANDSTONE)
                .criterion("has_ashen_sandstone", conditionsFromItem(ModBlocks.ASHEN_SANDSTONE))
                .offerTo(exporter);

// Chiseled Ashen Sandstone: 2x from 2x Ashen Sandstone
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_ASHEN_SANDSTONE, 2)
                .pattern("PP")
                .input('P', ModBlocks.ASHEN_SANDSTONE)
                .criterion("has_ashen_sandstone", conditionsFromItem(ModBlocks.ASHEN_SANDSTONE))
                .offerTo(exporter);


// Packed Ashen Sand: 1x from 9x Ashen Sand
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PACKED_ASHEN_SAND)
                .pattern("PPP")
                .pattern("PPP")
                .pattern("PPP")
                .input('P', ModBlocks.ASHEN_SAND)
                .criterion("has_ashen_sand", conditionsFromItem(ModBlocks.ASHEN_SAND))
                .offerTo(exporter);


// Grimrock brick chain

// Polished Grimrock: 4x from 4x Cobbled Grimrock
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.POLISHED_GRIMROCK, 4)
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.COBBLED_GRIMROCK)
                .criterion("has_cobbled_grimrock", conditionsFromItem(ModBlocks.COBBLED_GRIMROCK))
                .offerTo(exporter);

// Grimrock Bricks: 4x from 4x Polished Grimrock
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRIMROCK_BRICKS, 4)
                .pattern("PP")
                .pattern("PP")
                .input('P', ModBlocks.POLISHED_GRIMROCK)
                .criterion("has_polished_grimrock", conditionsFromItem(ModBlocks.POLISHED_GRIMROCK))
                .offerTo(exporter);

// Chiseled Grimrock: 2x from 2x Polished Grimrock
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHISELED_GRIMROCK, 2)
                .pattern("PP")
                .input('P', ModBlocks.POLISHED_GRIMROCK)
                .criterion("has_polished_grimrock", conditionsFromItem(ModBlocks.POLISHED_GRIMROCK))
                .offerTo(exporter);

// Mossy Grimrock Bricks: 1x from Grimrock Bricks + Grimoss
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MOSSY_GRIMROCK_BRICKS)
                .pattern("PI")
                .pattern("P ")
                .input('P', ModBlocks.GRIMROCK_BRICKS)
                .input('I', ModBlocks.GRIMOSS)
                .criterion("has_grimrock_bricks", conditionsFromItem(ModBlocks.GRIMROCK_BRICKS))
                .offerTo(exporter);

    }

}
