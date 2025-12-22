package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.data.client.TexturedModel;
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

        var kyanite = gen.registerCubeAllModelTexturePool(ModBlocks.KYANITE);
        var polished_kyanite = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_KYANITE);
        var kyanite_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.KYANITE_BRICKS);

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

        var gravestone = gen.registerCubeAllModelTexturePool(ModBlocks.GRAVESTONE);
        var polished_gravestone = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_GRAVESTONE);
        var gravestone_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.GRAVESTONE_BRICKS);

        gen.registerCubeAllModelTexturePool(ModBlocks.CHISELED_DRIPSTONE);
        var dripstone_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.DRIPSTONE_BRICKS);
        var polished_dripstone = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_DRIPSTONE);

        var cut_polished_basalt = gen.registerCubeAllModelTexturePool(ModBlocks.CUT_POLISHED_BASALT);
        var polished_basalt_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BASALT_BRICKS);
        var polished_basalt_tiles = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_BASALT_TILES);

        var blue_nether_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.BLUE_NETHER_BRICKS);
        var tainted_nether_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.TAINTED_NETHER_BRICKS);

        var polished_soulsand = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_SOULSAND);
        var soul_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.SOUL_BRICKS);

        var packed_snow = gen.registerCubeAllModelTexturePool(ModBlocks.PACKED_SNOW);
        var snow_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.SNOW_BRICKS);

        var packed_ice_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.PACKED_ICE_BRICKS);
        var polished_packed_ice = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_PACKED_ICE);

        var polished_prismarine = gen.registerCubeAllModelTexturePool(ModBlocks.POLISHED_PRISMARINE);
        var prismarine_tiles = gen.registerCubeAllModelTexturePool(ModBlocks.PRISMARINE_TILES);

        registerPillar(gen, ModBlocks.SCORIA);
        registerPillar(gen, ModBlocks.MOLTEN_SCORIA);

        registerFixedColumn(gen, ModBlocks.CHISELED_SCORIA);
        registerFixedColumn(gen, ModBlocks.CHISELED_MOLTEN_SCORIA);


        var scoria_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.SCORIA_BRICKS);
        var molten_scoria_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.MOLTEN_SCORIA_BRICKS);

        scoria_bricks.wall(ModBlocks.SCORIA_BRICKS_WALL);
        scoria_bricks.slab(ModBlocks.SCORIA_BRICKS_SLAB);
        scoria_bricks.stairs(ModBlocks.SCORIA_BRICKS_STAIRS);

        molten_scoria_bricks.wall(ModBlocks.MOLTEN_SCORIA_BRICKS_WALL);
        molten_scoria_bricks.slab(ModBlocks.MOLTEN_SCORIA_BRICKS_SLAB);
        molten_scoria_bricks.stairs(ModBlocks.MOLTEN_SCORIA_BRICKS_STAIRS);

        polished_prismarine.wall(ModBlocks.POLISHED_PRISMARINE_WALL);
        polished_prismarine.slab(ModBlocks.POLISHED_PRISMARINE_SLAB);
        polished_prismarine.stairs(ModBlocks.POLISHED_PRISMARINE_STAIRS);

        prismarine_tiles.wall(ModBlocks.PRISMARINE_TILES_WALL);
        prismarine_tiles.slab(ModBlocks.PRISMARINE_TILES_SLAB);
        prismarine_tiles.stairs(ModBlocks.PRISMARINE_TILES_STAIRS);


        packed_ice_bricks.wall(ModBlocks.PACKED_ICE_BRICKS_WALL);
        packed_ice_bricks.slab(ModBlocks.PACKED_ICE_BRICKS_SLAB);
        packed_ice_bricks.stairs(ModBlocks.PACKED_ICE_BRICKS_STAIRS);

        polished_packed_ice.wall(ModBlocks.POLISHED_PACKED_ICE_WALL);
        polished_packed_ice.slab(ModBlocks.POLISHED_PACKED_ICE_SLAB);
        polished_packed_ice.stairs(ModBlocks.POLISHED_PACKED_ICE_STAIRS);


        packed_snow.wall(ModBlocks.PACKED_SNOW_WALL);
        packed_snow.slab(ModBlocks.PACKED_SNOW_SLAB);
        packed_snow.stairs(ModBlocks.PACKED_SNOW_STAIRS);

        snow_bricks.wall(ModBlocks.SNOW_BRICKS_WALL);
        snow_bricks.slab(ModBlocks.SNOW_BRICKS_SLAB);
        snow_bricks.stairs(ModBlocks.SNOW_BRICKS_STAIRS);


        polished_soulsand.wall(ModBlocks.POLISHED_SOULSAND_WALL);
        polished_soulsand.slab(ModBlocks.POLISHED_SOULSAND_SLAB);
        polished_soulsand.stairs(ModBlocks.POLISHED_SOULSAND_STAIRS);

        soul_bricks.wall(ModBlocks.SOUL_BRICKS_WALL);
        soul_bricks.slab(ModBlocks.SOUL_BRICKS_SLAB);
        soul_bricks.stairs(ModBlocks.SOUL_BRICKS_STAIRS);


        blue_nether_bricks.wall(ModBlocks.BLUE_NETHER_BRICKS_WALL);
        blue_nether_bricks.slab(ModBlocks.BLUE_NETHER_BRICKS_SLAB);
        blue_nether_bricks.stairs(ModBlocks.BLUE_NETHER_BRICKS_STAIRS);

        tainted_nether_bricks.wall(ModBlocks.TAINTED_NETHER_BRICKS_WALL);
        tainted_nether_bricks.slab(ModBlocks.TAINTED_NETHER_BRICKS_SLAB);
        tainted_nether_bricks.stairs(ModBlocks.TAINTED_NETHER_BRICKS_STAIRS);


        cut_polished_basalt.wall(ModBlocks.CUT_POLISHED_BASALT_WALL);
        cut_polished_basalt.slab(ModBlocks.CUT_POLISHED_BASALT_SLAB);
        cut_polished_basalt.stairs(ModBlocks.CUT_POLISHED_BASALT_STAIRS);

        polished_basalt_bricks.wall(ModBlocks.POLISHED_BASALT_BRICKS_WALL);
        polished_basalt_bricks.slab(ModBlocks.POLISHED_BASALT_BRICKS_SLAB);
        polished_basalt_bricks.stairs(ModBlocks.POLISHED_BASALT_BRICKS_STAIRS);

        polished_basalt_tiles.wall(ModBlocks.POLISHED_BASALT_TILES_WALL);
        polished_basalt_tiles.slab(ModBlocks.POLISHED_BASALT_TILES_SLAB);
        polished_basalt_tiles.stairs(ModBlocks.POLISHED_BASALT_TILES_STAIRS);


        dripstone_bricks.wall(ModBlocks.DRIPSTONE_BRICKS_WALL);
        dripstone_bricks.slab(ModBlocks.DRIPSTONE_BRICKS_SLAB);
        dripstone_bricks.stairs(ModBlocks.DRIPSTONE_BRICKS_STAIRS);

        polished_dripstone.wall(ModBlocks.POLISHED_DRIPSTONE_WALL);
        polished_dripstone.slab(ModBlocks.POLISHED_DRIPSTONE_SLAB);
        polished_dripstone.stairs(ModBlocks.POLISHED_DRIPSTONE_STAIRS);




        gravestone.wall(ModBlocks.GRAVESTONE_WALL);
        gravestone.slab(ModBlocks.GRAVESTONE_SLAB);
        gravestone.stairs(ModBlocks.GRAVESTONE_STAIRS);

        polished_gravestone.wall(ModBlocks.POLISHED_GRAVESTONE_WALL);
        polished_gravestone.slab(ModBlocks.POLISHED_GRAVESTONE_SLAB);
        polished_gravestone.stairs(ModBlocks.POLISHED_GRAVESTONE_STAIRS);

        gravestone_bricks.wall(ModBlocks.GRAVESTONE_BRICKS_WALL);
        gravestone_bricks.slab(ModBlocks.GRAVESTONE_BRICKS_SLAB);
        gravestone_bricks.stairs(ModBlocks.GRAVESTONE_BRICKS_STAIRS);

        gen.registerCubeAllModelTexturePool(ModBlocks.POROUS_DOLOMITE);
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

        kyanite_bricks.wall(ModBlocks.KYANITE_BRICKS_WALL);
        kyanite_bricks.slab(ModBlocks.KYANITE_BRICKS_SLAB);
        kyanite_bricks.stairs(ModBlocks.KYANITE_BRICKS_STAIRS);
        polished_kyanite.wall(ModBlocks.POLISHED_KYANITE_WALL);
        polished_kyanite.slab(ModBlocks.POLISHED_KYANITE_SLAB);
        polished_kyanite.stairs(ModBlocks.POLISHED_KYANITE_STAIRS);
        kyanite.wall(ModBlocks.KYANITE_WALL);
        kyanite.slab(ModBlocks.KYANITE_SLAB);
        kyanite.stairs(ModBlocks.KYANITE_STAIRS);

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

        var shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES);
        var white_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_WHITE);
        var light_gray_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_GRAY);
        var gray_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_GRAY);
        var black_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_BLACK);
        var brown_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_BROWN);
        var red_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_RED);
        var orange_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_ORANGE);
        var yellow_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_YELLOW);
        var lime_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_LIME);
        var green_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_GREEN);
        var cyan_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_CYAN);
        var light_blue_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_BLUE);
        var blue_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_BLUE);
        var magenta_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_MAGENTA);
        var purple_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_PURPLE);
        var pink_shingles = gen.registerCubeAllModelTexturePool(ModBlocks.TERRACOTTA_SHINGLES_PINK);

        var white_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_WHITE);
        var light_gray_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_LIGHT_GRAY);
        var gray_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_GRAY);
        var black_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_BLACK);
        var brown_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_BROWN);
        var red_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_RED);
        var orange_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_ORANGE);
        var yellow_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_YELLOW);
        var lime_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_LIME);
        var green_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_GREEN);
        var cyan_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_CYAN);
        var light_blue_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_LIGHT_BLUE);
        var blue_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_BLUE);
        var magenta_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_MAGENTA);
        var purple_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_PURPLE);
        var pink_concrete_bricks = gen.registerCubeAllModelTexturePool(ModBlocks.CONCRETE_BRICKS_PINK);

        white_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_WHITE_STAIRS);
        light_gray_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_LIGHT_GRAY_STAIRS);
        gray_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_GRAY_STAIRS);
        black_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_BLACK_STAIRS);
        brown_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_BROWN_STAIRS);
        red_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_RED_STAIRS);
        orange_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_ORANGE_STAIRS);
        yellow_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_YELLOW_STAIRS);
        lime_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_LIME_STAIRS);
        green_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_GREEN_STAIRS);
        cyan_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_CYAN_STAIRS);
        light_blue_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_LIGHT_BLUE_STAIRS);
        blue_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_BLUE_STAIRS);
        purple_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_PURPLE_STAIRS);
        magenta_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_MAGENTA_STAIRS);
        pink_concrete_bricks.stairs(ModBlocks.CONCRETE_BRICKS_PINK_STAIRS);

        white_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_WHITE_SLAB);
        light_gray_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_LIGHT_GRAY_SLAB);
        gray_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_GRAY_SLAB);
        black_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_BLACK_SLAB);
        brown_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_BROWN_SLAB);
        red_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_RED_SLAB);
        orange_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_ORANGE_SLAB);
        yellow_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_YELLOW_SLAB);
        lime_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_LIME_SLAB);
        green_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_GREEN_SLAB);
        cyan_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_CYAN_SLAB);
        light_blue_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_LIGHT_BLUE_SLAB);
        blue_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_BLUE_SLAB);
        purple_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_PURPLE_SLAB);
        magenta_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_MAGENTA_SLAB);
        pink_concrete_bricks.slab(ModBlocks.CONCRETE_BRICKS_PINK_SLAB);

        shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_STAIRS);
        white_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_WHITE_STAIRS);
        light_gray_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_GRAY_STAIRS);
        gray_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_GRAY_STAIRS);
        black_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_BLACK_STAIRS);
        brown_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_BROWN_STAIRS);
        red_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_RED_STAIRS);
        orange_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_ORANGE_STAIRS);
        yellow_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_YELLOW_STAIRS);
        lime_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_LIME_STAIRS);
        green_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_GREEN_STAIRS);
        cyan_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_CYAN_STAIRS);
        light_blue_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_BLUE_STAIRS);
        blue_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_BLUE_STAIRS);
        purple_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_PURPLE_STAIRS);
        magenta_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_MAGENTA_STAIRS);
        pink_shingles.stairs(ModBlocks.TERRACOTTA_SHINGLES_PINK_STAIRS);

        shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_SLAB);
        white_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_WHITE_SLAB);
        light_gray_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_GRAY_SLAB);
        gray_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_GRAY_SLAB);
        black_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_BLACK_SLAB);
        brown_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_BROWN_SLAB);
        red_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_RED_SLAB);
        orange_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_ORANGE_SLAB);
        yellow_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_YELLOW_SLAB);
        lime_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_LIME_SLAB);
        green_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_GREEN_SLAB);
        cyan_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_CYAN_SLAB);
        light_blue_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_LIGHT_BLUE_SLAB);
        blue_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_BLUE_SLAB);
        purple_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_PURPLE_SLAB);
        magenta_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_MAGENTA_SLAB);
        pink_shingles.slab(ModBlocks.TERRACOTTA_SHINGLES_PINK_SLAB);



    }
    private void registerPillar(BlockStateModelGenerator gen, Block block) {
        gen.registerAxisRotated(
                block,
                TexturedModel.CUBE_COLUMN,
                TexturedModel.CUBE_COLUMN_HORIZONTAL

        );
    }

    private void registerFixedColumn(BlockStateModelGenerator gen, Block block) {
        gen.registerSingleton(
                block,
                TexturedModel.CUBE_COLUMN
        );
    }




    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(

        );
    }

}