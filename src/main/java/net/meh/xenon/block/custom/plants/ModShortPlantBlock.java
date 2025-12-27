package net.meh.xenon.block.custom.plants;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.function.Supplier;

public class ModShortPlantBlock extends PlantBlock implements Fertilizable {

    protected static final VoxelShape SHAPE =
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    private final Supplier<TallPlantBlock> tallPlant;

    public ModShortPlantBlock(
            AbstractBlock.Settings settings,
            Supplier<TallPlantBlock> tallPlant
    ) {
        super(settings);
        this.tallPlant = tallPlant;
    }

    @Override
    protected VoxelShape getOutlineShape(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        return SHAPE;
    }

    /* ---------------- Fertilizable ---------------- */

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public void grow(
            ServerWorld world,
            Random random,
            BlockPos pos,
            BlockState state
    ) {
        TallPlantBlock tall = tallPlant.get();

        if (world.isAir(pos.up())
                && tall.getDefaultState().canPlaceAt(world, pos)) {
            TallPlantBlock.placeAt(
                    world,
                    tall.getDefaultState(),
                    pos,
                    Block.NOTIFY_ALL
            );
        }
    }

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return null;
    }
}
