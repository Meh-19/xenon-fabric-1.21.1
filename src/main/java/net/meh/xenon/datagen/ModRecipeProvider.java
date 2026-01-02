package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.meh.xenon.block.ModBlockFamilies;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.data.server.recipe.*;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {

    public ModRecipeProvider(
            FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture
    ) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        for (var family : ModBlockFamilies.STONES) {

            Block inputBlock = family.stonecutInput();
            if (inputBlock == null) continue;

            Ingredient input = Ingredient.ofItems(inputBlock);

            for (Block output : family.all()) {
                if (output == inputBlock) continue;

                if (output instanceof SlabBlock) {
                    StonecuttingRecipeJsonBuilder.createStonecutting(
                                    input,
                                    RecipeCategory.BUILDING_BLOCKS,
                                    output,
                                    2
                            )
                            .criterion("has_input", conditionsFromItem(inputBlock))
                            .offerTo(exporter);
                } else {
                    StonecuttingRecipeJsonBuilder.createStonecutting(
                                    input,
                                    RecipeCategory.BUILDING_BLOCKS,
                                    output
                            )
                            .criterion("has_input", conditionsFromItem(inputBlock))
                            .offerTo(exporter);
                }
            }
        }
    }

        private void offerSet(
            RecipeExporter exporter,
            Block base,
            Block stairs,
            Block slab,
            Block wall
    ) {
        if (base == null) return;

        Ingredient ingredient = Ingredient.ofItems(base);

        if (stairs != null) {
            createStairsRecipe(stairs, ingredient)
                    .criterion("has_base", conditionsFromItem(base))
                    .offerTo(exporter);

            stonecut(exporter, stairs, base);
        }

        if (slab != null) {
            createSlabRecipe(RecipeCategory.BUILDING_BLOCKS, slab, ingredient)
                    .criterion("has_base", conditionsFromItem(base))
                    .offerTo(exporter);

            stonecut(exporter, slab, base, 2);
        }

        if (wall != null) {
            ShapedRecipeJsonBuilder.create(
                            RecipeCategory.BUILDING_BLOCKS,
                            wall,
                            6
                    )
                    .input('#', ingredient)
                    .pattern("###")
                    .pattern("###")
                    .criterion("has_base", conditionsFromItem(base))
                    .offerTo(exporter);

            stonecut(exporter, wall, base);
        }
    }

    private void stonecut(
            RecipeExporter exporter,
            ItemConvertible output,
            ItemConvertible input
    ) {
        StonecuttingRecipeJsonBuilder.createStonecutting(
                        Ingredient.ofItems(input),
                        RecipeCategory.BUILDING_BLOCKS,
                        output
                ).criterion("has_input", conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void stonecut(
            RecipeExporter exporter,
            ItemConvertible output,
            ItemConvertible input,
            int count
    ) {
        StonecuttingRecipeJsonBuilder.createStonecutting(
                        Ingredient.ofItems(input),
                        RecipeCategory.BUILDING_BLOCKS,
                        output,
                        count
                ).criterion("has_input", conditionsFromItem(input))
                .offerTo(exporter);
    }

    private void offerPolishedConversion(
            RecipeExporter exporter,
            Block base,
            Block polished
    ) {
        if (base == null || polished == null) return;

        StonecuttingRecipeJsonBuilder.createStonecutting(
                        Ingredient.ofItems(base),
                        RecipeCategory.BUILDING_BLOCKS,
                        polished
                )
                .criterion("has_base", conditionsFromItem(base))
                .offerTo(exporter);
    }
    private void offerCrackedConversion(
            RecipeExporter exporter,
            Block bricks,
            Block cracked
    ) {
        if (bricks == null || cracked == null) return;

        CookingRecipeJsonBuilder.createSmelting(
                        Ingredient.ofItems(bricks),
                        RecipeCategory.BUILDING_BLOCKS,
                        cracked,
                        0.1f,
                        200
                )
                .criterion("has_bricks", conditionsFromItem(bricks))
                .offerTo(exporter);
    }
    private void offerMossyConversion(
            RecipeExporter exporter,
            Block base,
            Block mossy
    ) {
        if (base == null || mossy == null) return;

        ShapelessRecipeJsonBuilder.create(
                        RecipeCategory.BUILDING_BLOCKS,
                        mossy
                )
                .input(base)
                .input(net.minecraft.item.Items.VINE)
                .criterion("has_base", conditionsFromItem(base))
                .offerTo(exporter);
    }
    private void offerCutToBricks(
            RecipeExporter exporter,
            Block cut,
            Block bricks
    ) {
        if (cut == null || bricks == null) return;

        StonecuttingRecipeJsonBuilder.createStonecutting(
                        Ingredient.ofItems(cut),
                        RecipeCategory.BUILDING_BLOCKS,
                        bricks
                )
                .criterion("has_cut", conditionsFromItem(cut))
                .offerTo(exporter);
    }
    private void offerMoltenToBricks(
            RecipeExporter exporter,
            Block molten,
            Block moltenBricks
    ) {
        if (molten == null || moltenBricks == null) return;

        CookingRecipeJsonBuilder.createSmelting(
                        Ingredient.ofItems(molten),
                        RecipeCategory.BUILDING_BLOCKS,
                        moltenBricks,
                        0.1f,
                        200
                )
                .criterion("has_molten", conditionsFromItem(molten))
                .offerTo(exporter);
    }
    private void stonecutFromBase(
            RecipeExporter exporter,
            Block base,
            Block output,
            int count
    ) {
        if (base == null || output == null) return;

        StonecuttingRecipeJsonBuilder.createStonecutting(
                        Ingredient.ofItems(base),
                        RecipeCategory.BUILDING_BLOCKS,
                        output,
                        count
                )
                .criterion("has_base", conditionsFromItem(base))
                .offerTo(exporter);
    }

}
