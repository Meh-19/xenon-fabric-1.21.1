package net.meh.xenon.block.custom.plants;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

import java.util.function.Supplier;

public class ShortBrambleBlock extends PlantBlock implements Fertilizable {

    private final Supplier<TallPlantBlock> tallVariant;

    public ShortBrambleBlock(
            AbstractBlock.Settings settings,
            Supplier<TallPlantBlock> tallVariant
    ) {
        super(settings);
        this.tallVariant = tallVariant;
    }

    /* ---------- Fertilizable ---------- */

    @Override
    public boolean isFertilizable(WorldView world, BlockPos pos, BlockState state) {
        return true;
    }

    @Override
    public boolean canGrow(World world, Random random, BlockPos pos, BlockState state) {
        return world.isAir(pos.up());
    }

    @Override
    public void grow(ServerWorld world, Random random, BlockPos pos, BlockState state) {
        TallPlantBlock tall = tallVariant.get();

        if (world.isAir(pos.up()) && tall.getDefaultState().canPlaceAt(world, pos)) {
            TallPlantBlock.placeAt(world, tall.getDefaultState(), pos, 2);
        }
    }

    protected static final VoxelShape SHAPE =
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    @Override
    public void onEntityCollision(
            BlockState state,
            World world,
            BlockPos pos,
            Entity entity
    ) {
        if (entity instanceof LivingEntity living) {
            entity.slowMovement(state, new Vec3d(0.8, 0.75, 0.8));

            if (!world.isClient) {
                living.damage(
                        world.getDamageSources().sweetBerryBush(),
                        1.0F
                );
            }
        }
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

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return null;
    }
}

