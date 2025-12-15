package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

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

        var grimrock = gen.registerCubeAllModelTexturePool(ModBlocks.GRIMROCK);
        var cobbled_grimrock = gen.registerCubeAllModelTexturePool(ModBlocks.COBBLED_GRIMROCK);
        var cracked_grimrock_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CRACKED_GRIMROCK_BRICKS);
        var grimrock_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.GRIMROCK_BRICKS);
        var mossy_grimrock_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_GRIMROCK_BRICKS);
        var polished_grimrock_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GRIMROCK);

        var mossy_packed_loam_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.MOSSY_PACKED_LOAM_BRICKS);
        var packed_loam = gen.registerCubeAllModelTexturePool(ModBlocks.PACKED_LOAM);
        var packed_loam_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.PACKED_LOAM_BRICKS);

        var dried_silt = gen.registerCubeAllModelTexturePool(ModBlocks.DRIED_SILT);
        var polished_silt = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_SILT);
        var silt_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.SILT_BRICKS);

        var packed_dirt = gen.registerCubeAllModelTexturePool(ModBlocks.PACKED_DIRT);

        var slate = gen.registerCubeAllModelTexturePool(ModBlocks.SLATE);
        var polished_slate = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_SLATE);
        var slate_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.SLATE_BRICKS);

        var strata = gen.registerCubeAllModelTexturePool(ModBlocks.STRATA);
        var polished_strata = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_STRATA);
        var strata_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.STRATA_BRICKS);

        var dolomite = gen.registerCubeAllModelTexturePool(ModBlocks.DOLOMITE);
        var polished_dolomite = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DOLOMITE);
        var dolomite_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.DOLOMITE_BRICKS);

        dolomite.wall(ModBlocks.DOLOMITE_WALL);
        dolomite.slab(ModBlocks.DOLOMITE_SLAB);
        dolomite.stairs(ModBlocks.DOLOMITE_STAIRS);

        polished_dolomite.wall(ModBlocks.POLISHED_DOLOMITE_WALL);
        polished_dolomite.slab(ModBlocks.POLISHED_DOLOMITE_SLAB);
        polished_dolomite.stairs(ModBlocks.POLISHED_DOLOMITE_STAIRS);

        dolomite_bricks.wall(ModBlocks.DOLOMITE_BRICKS_WALL);
        dolomite_bricks.slab(ModBlocks.DOLOMITE_BRICKS_SLAB);
        dolomite_bricks.stairs(ModBlocks.DOLOMITE_BRICKS_STAIRS);

        strata.wall(ModBlocks.STRATA_WALL);
        strata.slab(ModBlocks.STRATA_SLAB);
        strata.stairs(ModBlocks.STRATA_STAIRS);

        polished_strata.wall(ModBlocks.POLISHED_STRATA_WALL);
        polished_strata.slab(ModBlocks.POLISHED_STRATA_SLAB);
        polished_strata.stairs(ModBlocks.POLISHED_STRATA_STAIRS);

        strata_bricks.wall(ModBlocks.STRATA_BRICKS_WALL);
        strata_bricks.slab(ModBlocks.STRATA_BRICKS_SLAB);
        strata_bricks.stairs(ModBlocks.STRATA_BRICKS_STAIRS);

        slate.wall(ModBlocks.SLATE_WALL);
        slate.slab(ModBlocks.SLATE_SLAB);
        slate.stairs(ModBlocks.SLATE_STAIRS);



        polished_slate.wall(ModBlocks.POLISHED_SLATE_WALL);
        polished_slate.slab(ModBlocks.POLISHED_SLATE_SLAB);
        polished_slate.stairs(ModBlocks.POLISHED_SLATE_STAIRS);

        slate_bricks.wall(ModBlocks.SLATE_BRICKS_WALL);
        slate_bricks.slab(ModBlocks.SLATE_BRICKS_SLAB);
        slate_bricks.stairs(ModBlocks.SLATE_BRICKS_STAIRS);

        packed_dirt.slab(ModBlocks.PACKED_DIRT_SLAB);

        dried_silt.wall(ModBlocks.DRIED_SILT_WALL);
        dried_silt.slab(ModBlocks.DRIED_SILT_SLAB);
        dried_silt.stairs(ModBlocks.DRIED_SILT_STAIRS);

        polished_silt.wall(ModBlocks.POLISHED_SILT_WALL);
        polished_silt.slab(ModBlocks.POLISHED_SILT_SLAB);
        polished_silt.stairs(ModBlocks.POLISHED_SILT_STAIRS);

        silt_bricks.wall(ModBlocks.SILT_BRICKS_WALL);
        silt_bricks.slab(ModBlocks.SILT_BRICKS_SLAB);
        silt_bricks.stairs(ModBlocks.SILT_BRICKS_STAIRS);

        mossy_packed_loam_bricks.wall(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_WALL);
        mossy_packed_loam_bricks.slab(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_SLAB);
        mossy_packed_loam_bricks.stairs(ModBlocks.MOSSY_PACKED_LOAM_BRICKS_STAIRS);

        packed_loam.wall(ModBlocks.PACKED_LOAM_BRICKS_WALL);
        packed_loam.slab(ModBlocks.PACKED_LOAM_BRICKS_SLAB);
        packed_loam.stairs(ModBlocks.PACKED_LOAM_BRICKS_STAIRS);

        packed_loam_bricks.wall(ModBlocks.PACKED_LOAM_WALL);
        packed_loam_bricks.slab(ModBlocks.PACKED_LOAM_SLAB);
        packed_loam_bricks.stairs(ModBlocks.PACKED_LOAM_STAIRS);

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

        grimrock.wall(ModBlocks.GRIMROCK_WALL);
        grimrock.slab(ModBlocks.GRIMROCK_SLAB);
        grimrock.stairs(ModBlocks.GRIMROCK_STAIRS);

        cobbled_grimrock.wall(ModBlocks.COBBLED_GRIMROCK_WALL);
        cobbled_grimrock.slab(ModBlocks.COBBLED_GRIMROCK_SLAB);
        cobbled_grimrock.stairs(ModBlocks.COBBLED_GRIMROCK_STAIRS);

        cracked_grimrock_bricks.wall(ModBlocks.CRACKED_GRIMROCK_BRICKS_WALL);
        cracked_grimrock_bricks.slab(ModBlocks.CRACKED_GRIMROCK_BRICKS_SLAB);
        cracked_grimrock_bricks.stairs(ModBlocks.CRACKED_GRIMROCK_BRICKS_STAIRS);

        grimrock_bricks.wall(ModBlocks.GRIMROCK_BRICKS_WALL);
        grimrock_bricks.slab(ModBlocks.GRIMROCK_BRICKS_SLAB);
        grimrock_bricks.stairs(ModBlocks.GRIMROCK_BRICKS_STAIRS);

        mossy_grimrock_bricks.wall(ModBlocks.MOSSY_GRIMROCK_BRICKS_WALL);
        mossy_grimrock_bricks.slab(ModBlocks.MOSSY_GRIMROCK_BRICKS_SLAB);
        mossy_grimrock_bricks.stairs(ModBlocks.MOSSY_GRIMROCK_BRICKS_STAIRS);

        polished_grimrock_bricks.wall(ModBlocks.POLISHED_GRIMROCK_WALL);
        polished_grimrock_bricks.slab(ModBlocks.POLISHED_GRIMROCK_SLAB);
        polished_grimrock_bricks.stairs(ModBlocks.POLISHED_GRIMROCK_STAIRS);


    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

    }
}