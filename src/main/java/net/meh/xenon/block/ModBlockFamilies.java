package net.meh.xenon.block;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;


public final class ModBlockFamilies {

    private ModBlockFamilies() {}

    
    public record StoneFamily(
            Block base,
            Block stonecutInput,

            Block stairs,
            Block slab,
            Block wall,
            Block pillar,


            Block polished,
            Block polishedStairs,
            Block polishedSlab,
            Block polishedWall,


            Block bricks,
            Block bricksStairs,
            Block bricksSlab,
            Block bricksWall,


            Block tiles,
            Block tilesStairs,
            Block tilesSlab,
            Block tilesWall,


            Block chiseled,
            Block possessedChiseled,

            Block crackedBricks,
            Block crackedBricksStairs,
            Block crackedBricksSlab,
            Block crackedBricksWall,

            Block mossyBricks,
            Block mossyBricksStairs,
            Block mossyBricksSlab,
            Block mossyBricksWall,

            Block sandyBricks,
            Block sandyBricksStairs,
            Block sandyBricksSlab,
            Block sandyBricksWall,

            Block mossy,
            Block mossyStairs,
            Block mossySlab,
            Block mossyWall,

            Block porous,

            Block molten,
            Block chiseledMolten,
            Block moltenBricks,
            Block moltenBricksStairs,
            Block moltenBricksSlab,
            Block moltenBricksWall,

            Block cut,
            Block cutStairs,
            Block cutSlab,
            Block cutWall,

            Block brick,

            Block cobbled,
            Block cobbledStairs,
            Block cobbledSlab,
            Block cobbledWall

    ) {

        public Iterable<Block> all() {
            return Stream.of(
                    base,
                    stonecutInput,
                    stairs, slab, wall, pillar,
                    polished, polishedStairs, polishedSlab, polishedWall,
                    bricks, bricksStairs, bricksSlab, bricksWall,
                    tiles, tilesStairs, tilesSlab, tilesWall,
                    chiseled, possessedChiseled,
                    crackedBricks, crackedBricksStairs, crackedBricksSlab, crackedBricksWall,
                    mossyBricks, mossyBricksStairs, mossyBricksSlab, mossyBricksWall,
                    sandyBricks, sandyBricksStairs, sandyBricksSlab, sandyBricksWall,
                    mossy, mossyStairs, mossySlab, mossyWall,
                    porous,
                    molten, chiseledMolten,
                    moltenBricks, moltenBricksStairs, moltenBricksSlab, moltenBricksWall,
                    cut, cutStairs, cutSlab, cutWall,
                    brick,
                    cobbled, cobbledStairs, cobbledSlab, cobbledWall
            ).filter(Objects::nonNull).toList();
        }

    }

    public static final List<StoneFamily> STONES = List.of(

            new StoneFamily(

                    ModBlocks.LIMESTONE,
                    ModBlocks.LIMESTONE,
                    ModBlocks.LIMESTONE_STAIRS,
                    ModBlocks.LIMESTONE_SLAB,
                    ModBlocks.LIMESTONE_WALL,
                    null,

                    ModBlocks.POLISHED_LIMESTONE,
                    ModBlocks.POLISHED_LIMESTONE_STAIRS,
                    ModBlocks.POLISHED_LIMESTONE_SLAB,
                    ModBlocks.POLISHED_LIMESTONE_WALL,


                    ModBlocks.LIMESTONE_BRICKS,
                    ModBlocks.LIMESTONE_BRICKS_STAIRS,
                    ModBlocks.LIMESTONE_BRICKS_SLAB,
                    ModBlocks.LIMESTONE_BRICKS_WALL,

                    null, null, null, null,


                    ModBlocks.CHISELED_LIMESTONE,
                    null,


                    null, null, null, null,


                    null, null, null, null,


                    ModBlocks.SANDY_LIMESTONE_BRICKS,
                    ModBlocks.SANDY_LIMESTONE_BRICKS_STAIRS,
                    ModBlocks.SANDY_LIMESTONE_BRICKS_SLAB,
                    ModBlocks.SANDY_LIMESTONE_BRICKS_WALL,


                    null, null, null, null,


                    null,


                    null, null,
                    null, null, null, null,


                    null, null, null, null,


                    null,

                    null,null,null,null
            ),

            new StoneFamily(

                    ModBlocks.RHYOLITE,
                    ModBlocks.RHYOLITE,
                    ModBlocks.RHYOLITE_STAIRS,
                    ModBlocks.RHYOLITE_SLAB,
                    ModBlocks.RHYOLITE_WALL,
                    ModBlocks.RHYOLITE_PILLAR,

                    null,
                    null,
                    null,
                    null,


                    ModBlocks.RHYOLITE_BRICKS,
                    ModBlocks.RHYOLITE_BRICKS_STAIRS,
                    ModBlocks.RHYOLITE_BRICKS_SLAB,
                    ModBlocks.RHYOLITE_BRICKS_WALL,


                    null, null, null, null,


                    ModBlocks.CHISELED_RHYOLITE,
                    null,


                    ModBlocks.CRACKED_RHYOLITE_BRICKS,   ModBlocks.CRACKED_RHYOLITE_BRICKS_STAIRS,   ModBlocks.CRACKED_RHYOLITE_BRICKS_SLAB,   ModBlocks.CRACKED_RHYOLITE_BRICKS_WALL,


                    ModBlocks.MOSSY_RHYOLITE_BRICKS, ModBlocks.MOSSY_RHYOLITE_BRICKS_STAIRS, ModBlocks.MOSSY_RHYOLITE_BRICKS_SLAB, ModBlocks.MOSSY_RHYOLITE_BRICKS_WALL,


                    null,
                    null,
                    null,
                    null,


                    ModBlocks.MOSSY_RHYOLITE, ModBlocks.MOSSY_RHYOLITE_STAIRS, ModBlocks.MOSSY_RHYOLITE_SLAB, ModBlocks.MOSSY_RHYOLITE_WALL,


                    null,


                    null, null,
                    null, null, null, null,


                    null, null, null, null,


                    null,

                    null,null,null,null
            ),
            new StoneFamily(

                    ModBlocks.KYANITE,
                    ModBlocks.KYANITE,
                    ModBlocks.KYANITE_STAIRS,
                    ModBlocks.KYANITE_SLAB,
                    ModBlocks.KYANITE_WALL,
                    null,


                    ModBlocks.POLISHED_KYANITE,
                    ModBlocks.POLISHED_KYANITE_STAIRS,
                    ModBlocks.POLISHED_KYANITE_SLAB,
                    ModBlocks.POLISHED_KYANITE_WALL,


                    ModBlocks.KYANITE_BRICKS,
                    ModBlocks.KYANITE_BRICKS_STAIRS,
                    ModBlocks.KYANITE_BRICKS_SLAB,
                    ModBlocks.KYANITE_BRICKS_WALL,


                    null,null,null,null,

                    ModBlocks.CHISELED_KYANITE,
                    null,

                    null,null,null,null,

                    null,null,null,null,

                    null,
                    null,
                    null,
                    null,


                    null,null,null,null,

                    null,


                    null, null,
                    null, null, null, null,


                    null,null,null,null,

                    null,

                    null,null,null,null
            ),
            new StoneFamily(

                    ModBlocks.GRIMROCK,
                    ModBlocks.GRIMROCK,
                    ModBlocks.GRIMROCK_STAIRS,
                    ModBlocks.GRIMROCK_SLAB,
                    ModBlocks.GRIMROCK_WALL,
                    null,

                    ModBlocks.POLISHED_GRIMROCK,
                    ModBlocks.POLISHED_GRIMROCK_STAIRS,
                    ModBlocks.POLISHED_GRIMROCK_SLAB,
                    ModBlocks.POLISHED_GRIMROCK_WALL,



                    ModBlocks.GRIMROCK_BRICKS,
                    ModBlocks.GRIMROCK_BRICKS_STAIRS,
                    ModBlocks.GRIMROCK_BRICKS_SLAB,
                    ModBlocks.GRIMROCK_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_GRIMROCK,
                    null,


                    ModBlocks.CRACKED_GRIMROCK_BRICKS,   ModBlocks.CRACKED_GRIMROCK_BRICKS_STAIRS,   ModBlocks.CRACKED_GRIMROCK_BRICKS_SLAB,   ModBlocks.CRACKED_GRIMROCK_BRICKS_WALL,



                    ModBlocks.MOSSY_GRIMROCK_BRICKS, ModBlocks.MOSSY_GRIMROCK_BRICKS_STAIRS, ModBlocks.MOSSY_GRIMROCK_BRICKS_SLAB, ModBlocks.MOSSY_GRIMROCK_BRICKS_WALL,



                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,



                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,

                    ModBlocks.COBBLED_GRIMROCK,ModBlocks.COBBLED_GRIMROCK_STAIRS,ModBlocks.COBBLED_GRIMROCK_SLAB,ModBlocks.COBBLED_GRIMROCK_WALL

            ),

            new StoneFamily(

                    ModBlocks.PACKED_LOAM,
                    ModBlocks.PACKED_LOAM,
                    ModBlocks.PACKED_LOAM_STAIRS,
                    ModBlocks.PACKED_LOAM_SLAB,
                    ModBlocks.PACKED_LOAM_WALL,
                    null,
                    null,null,null,null,



                    ModBlocks.PACKED_LOAM_BRICKS,
                    ModBlocks.PACKED_LOAM_BRICKS_STAIRS,
                    ModBlocks.PACKED_LOAM_BRICKS_SLAB,
                    ModBlocks.PACKED_LOAM_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_PACKED_LOAM,
                    null,


                    null,null,null,null,


                    ModBlocks.MOSSY_PACKED_LOAM_BRICKS, ModBlocks.MOSSY_PACKED_LOAM_BRICKS_STAIRS, ModBlocks.MOSSY_PACKED_LOAM_BRICKS_SLAB, ModBlocks.MOSSY_PACKED_LOAM_BRICKS_WALL,



                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null ,null,null


            ),
            new StoneFamily(

                    ModBlocks.DRIED_SILT,
                    ModBlocks.DRIED_SILT,
                    ModBlocks.DRIED_SILT_STAIRS,
                    ModBlocks.DRIED_SILT_SLAB,
                    ModBlocks.DRIED_SILT_WALL,
                    null,

                    ModBlocks.POLISHED_SILT,
                    ModBlocks.POLISHED_SILT_STAIRS,
                    ModBlocks.POLISHED_SILT_SLAB,
                    ModBlocks.POLISHED_SILT_WALL,



                    ModBlocks.SILT_BRICKS,
                    ModBlocks.SILT_BRICKS_STAIRS,
                    ModBlocks.SILT_BRICKS_SLAB,
                    ModBlocks.SILT_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_SILT_BRICKS,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    ModBlocks.SLATE,
                    ModBlocks.SLATE,
                    ModBlocks.SLATE_STAIRS,
                    ModBlocks.SLATE_SLAB,
                    ModBlocks.SLATE_WALL,
                    null,
                    ModBlocks.POLISHED_SLATE,
                    ModBlocks.POLISHED_SLATE_STAIRS,
                    ModBlocks.POLISHED_SLATE_SLAB,
                    ModBlocks.POLISHED_SLATE_WALL,



                    ModBlocks.SLATE_BRICKS,
                    ModBlocks.SLATE_BRICKS_STAIRS,
                    ModBlocks.SLATE_BRICKS_SLAB,
                    ModBlocks.SLATE_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_SLATE,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    ModBlocks.STRATA,
                    ModBlocks.STRATA,
                    ModBlocks.STRATA_STAIRS,
                    ModBlocks.STRATA_SLAB,
                    ModBlocks.STRATA_WALL,
                    null,
                    ModBlocks.POLISHED_STRATA,
                    ModBlocks.POLISHED_STRATA_STAIRS,
                    ModBlocks.POLISHED_STRATA_SLAB,
                    ModBlocks.POLISHED_STRATA_WALL,



                    ModBlocks.STRATA_BRICKS,
                    ModBlocks.STRATA_BRICKS_STAIRS,
                    ModBlocks.STRATA_BRICKS_SLAB,
                    ModBlocks.STRATA_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_STRATA,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    ModBlocks.DOLOMITE,
                    ModBlocks.DOLOMITE,
                    ModBlocks.DOLOMITE_STAIRS,
                    ModBlocks.DOLOMITE_SLAB,
                    ModBlocks.DOLOMITE_WALL,
                    ModBlocks.DOLOMITE_PILLAR,

                    ModBlocks.POLISHED_DOLOMITE,
                    ModBlocks.POLISHED_DOLOMITE_STAIRS,
                    ModBlocks.POLISHED_DOLOMITE_SLAB,
                    ModBlocks.POLISHED_DOLOMITE_WALL,



                    ModBlocks.DOLOMITE_BRICKS,
                    ModBlocks.DOLOMITE_BRICKS_STAIRS,
                    ModBlocks.DOLOMITE_BRICKS_SLAB,
                    ModBlocks.DOLOMITE_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_DOLOMITE,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    ModBlocks.POROUS_DOLOMITE,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    ModBlocks.GRAVESTONE,
                    ModBlocks.GRAVESTONE,
                    ModBlocks.GRAVESTONE_STAIRS,
                    ModBlocks.GRAVESTONE_SLAB,
                    ModBlocks.GRAVESTONE_WALL,
                    null,
                    ModBlocks.POLISHED_GRAVESTONE,
                    ModBlocks.POLISHED_GRAVESTONE_STAIRS,
                    ModBlocks.POLISHED_GRAVESTONE_SLAB,
                    ModBlocks.POLISHED_GRAVESTONE_WALL,



                    ModBlocks.GRAVESTONE_BRICKS,
                    ModBlocks.GRAVESTONE_BRICKS_STAIRS,
                    ModBlocks.GRAVESTONE_BRICKS_SLAB,
                    ModBlocks.GRAVESTONE_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_GRAVESTONE,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    ModBlocks.SCORIA,
                    ModBlocks.SCORIA,
                    null,null,null,null,

                    null,null,null,null,



                    ModBlocks.SCORIA_BRICKS,
                    ModBlocks.SCORIA_BRICKS_STAIRS,
                    ModBlocks.SCORIA_BRICKS_SLAB,
                    ModBlocks.SCORIA_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_SCORIA,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    ModBlocks.MOLTEN_SCORIA, ModBlocks.CHISELED_MOLTEN_SCORIA,
                    ModBlocks.MOLTEN_SCORIA_BRICKS, ModBlocks.MOLTEN_SCORIA_BRICKS_STAIRS, ModBlocks.MOLTEN_SCORIA_BRICKS_SLAB, ModBlocks.MOLTEN_SCORIA_BRICKS_WALL,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    null,
                    Blocks.DRIPSTONE_BLOCK,
                    null,null,null,
                    null,

                    ModBlocks.POLISHED_DRIPSTONE,
                    ModBlocks.POLISHED_DRIPSTONE_STAIRS,
                    ModBlocks.POLISHED_DRIPSTONE_SLAB,
                    ModBlocks.POLISHED_DRIPSTONE_WALL,



                    ModBlocks.DRIPSTONE_BRICKS,
                    ModBlocks.DRIPSTONE_BRICKS_STAIRS,
                    ModBlocks.DRIPSTONE_BRICKS_SLAB,
                    ModBlocks.DRIPSTONE_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_DRIPSTONE,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    null,
                    Blocks.POLISHED_BASALT,
                    null,null,null,null,

                    null,null,null,null,



                    ModBlocks.POLISHED_BASALT_BRICKS,
                    ModBlocks.POLISHED_BASALT_BRICKS_STAIRS,
                    ModBlocks.POLISHED_BASALT_BRICKS_SLAB,
                    ModBlocks.POLISHED_BASALT_BRICKS_WALL,



                    ModBlocks.POLISHED_BASALT_TILES,    ModBlocks.POLISHED_BASALT_TILES_STAIRS,    ModBlocks.POLISHED_BASALT_TILES_SLAB,    ModBlocks.POLISHED_BASALT_TILES_WALL,



                    ModBlocks.CHISELED_POLISHED_BASALT,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    ModBlocks.CUT_POLISHED_BASALT,   ModBlocks.CUT_POLISHED_BASALT_STAIRS,   ModBlocks.CUT_POLISHED_BASALT_SLAB,   ModBlocks.CUT_POLISHED_BASALT_WALL,



                    null,


                    null, null, null, null


            ),

            new StoneFamily(

                    ModBlocks.BLUE_NETHER_BRICKS,
                    ModBlocks.BLUE_NETHER_BRICKS,
                    ModBlocks.BLUE_NETHER_BRICKS_STAIRS,
                    ModBlocks.BLUE_NETHER_BRICKS_SLAB,
                    ModBlocks.BLUE_NETHER_BRICKS_WALL,
                    null,
                    ModBlocks.POLISHED_BLUE_NETHER_BRICKS,
                    null,null,null,



                    null,null,null,null,



                    null,null,null,null,


                    ModBlocks.CHISELED_BLUE_NETHER_BRICKS,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    null,
                    Blocks.RED_NETHER_BRICKS,
                    null,null,null,

                    ModBlocks.POLISHED_RED_NETHER_BRICKS,
                    null,null,null,



                    null,null,null,null,



                    null,null,null,null,null,


                    ModBlocks.CHISELED_RED_NETHER_BRICKS,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    ModBlocks.TAINTED_NETHER_BRICKS,
                    ModBlocks.TAINTED_NETHER_BRICKS,
                    ModBlocks.TAINTED_NETHER_BRICKS_STAIRS,
                    ModBlocks.TAINTED_NETHER_BRICKS_SLAB,
                    ModBlocks.TAINTED_NETHER_BRICKS_WALL,
                    null,
                    null,null,null,null,



                    null,null,null,null,



                    null,null,null,null,


                    null,                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    null,null,null,null,null,

                    ModBlocks.POLISHED_SOULSAND,
                    Blocks.SOUL_SAND,
                    ModBlocks.POLISHED_SOULSAND_STAIRS,
                    ModBlocks.POLISHED_SOULSAND_SLAB,
                    ModBlocks.POLISHED_SOULSAND_WALL,



                    ModBlocks.SOUL_BRICKS,
                    ModBlocks.SOUL_BRICKS_STAIRS,
                    ModBlocks.SOUL_BRICKS_SLAB,
                    ModBlocks.SOUL_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_SOUL_BRICKS,
                    ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS,



                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    ModBlocks.PACKED_SNOW,
                    ModBlocks.PACKED_SNOW,
                    ModBlocks.PACKED_SNOW_STAIRS,
                    ModBlocks.PACKED_SNOW_SLAB,
                    ModBlocks.PACKED_SNOW_WALL,
                    null,
                    null,                    null,                    null,                    null,


                    ModBlocks.SNOW_BRICKS,
                    ModBlocks.SNOW_BRICKS_STAIRS,
                    ModBlocks.SNOW_BRICKS_SLAB,
                    ModBlocks.SNOW_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_SNOW_BRICKS,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(

                    null,
                    Blocks.PACKED_ICE,
                    null,
                    null,
                    null,
                    null,
                    ModBlocks.POLISHED_PACKED_ICE,
                    ModBlocks.POLISHED_PACKED_ICE_STAIRS,
                    ModBlocks.POLISHED_PACKED_ICE_SLAB,
                    ModBlocks.POLISHED_PACKED_ICE_WALL,



                    ModBlocks.PACKED_ICE_BRICKS,
                    ModBlocks.PACKED_ICE_BRICKS_STAIRS,
                    ModBlocks.PACKED_ICE_BRICKS_SLAB,
                    ModBlocks.PACKED_ICE_BRICKS_WALL,



                    null,null,null,null,


                    ModBlocks.CHISELED_PACKED_ICE_BRICKS,
                    null,


                    null,null,null,null,


                    null,null,null,null,


                    null,
                    null,
                    null,
                    null,



                    null,null,null,null,


                    null,



                    null, null,
                    null, null, null, null,



                    null,null,null,null,


                    null,


                    null, null, null, null


            ),
            new StoneFamily(
                    null,
                    Blocks.PRISMARINE,
                    null,                    null,                    null,
                    ModBlocks.PRISMARINE_PILLAR,

                    ModBlocks.POLISHED_PRISMARINE,
                    ModBlocks.POLISHED_PRISMARINE_STAIRS,
                    ModBlocks.POLISHED_PRISMARINE_SLAB,
                    ModBlocks.POLISHED_PRISMARINE_WALL,
                    null,                    null,                    null,                    null,
                    ModBlocks.PRISMARINE_TILES,    ModBlocks.PRISMARINE_TILES_STAIRS,    ModBlocks.PRISMARINE_TILES_SLAB,    ModBlocks.PRISMARINE_TILES_WALL,
                    ModBlocks.CHISELED_PRISMARINE,
                    null,
                    null,null,null,null,
                    null,null,null,null,
                    null, null, null, null,
                    null,null,null,null,
                    null, null, null,
                    null, null, null, null,
                    null,null,null,null,
                    null,
                    null, null, null, null
            )
    );
}
