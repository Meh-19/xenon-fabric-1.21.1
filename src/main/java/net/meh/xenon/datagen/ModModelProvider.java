package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator gen) {

        var limestone = gen.registerCubeAllModelTexturePool(ModBlocks.LIMESTONE);
        var polished_limestone = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_LIMESTONE);
        var sandy_limestone = gen.registerCubeAllModelTexturePool(ModBlocks.SANDY_LIMESTONE_BRICKS);
        var limestone_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.LIMESTONE_BRICKS);

        limestone_bricks.wall(ModBlocks.LIMESTONE_BRICKS_WALL);
        limestone_bricks.slab(ModBlocks.LIMESTONE_BRICKS_SLAB);
        limestone_bricks.stairs(ModBlocks.LIMESTONE_BRICKS_STAIRS);
        sandy_limestone.wall(ModBlocks.SANDY_LIMESTONE_BRICKS_WALL);
        sandy_limestone.slab(ModBlocks.SANDY_LIMESTONE_BRICKS_SLAB);
        sandy_limestone.stairs(ModBlocks.SANDY_LIMESTONE_BRICKS_STAIRS);
        polished_limestone.wall(ModBlocks.POLISHED_LIMESTONE_WALL);
        polished_limestone.slab(ModBlocks.POLISHED_LIMESTONE_SLAB);
        polished_limestone.stairs(ModBlocks.POLISHED_LIMESTONE_STAIRS);
        limestone.wall(ModBlocks.LIMESTONE_WALL);
        limestone.slab(ModBlocks.LIMESTONE_SLAB);
        limestone.stairs(ModBlocks.LIMESTONE_STAIRS);

    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}