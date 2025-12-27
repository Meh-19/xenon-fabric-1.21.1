package net.meh.xenon.block.custom.plants;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;

public class TallBrambleBlock extends PlantBlock {

    public TallBrambleBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return null;
    }


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
        return Block.createCuboidShape(
                2, 0, 2,
                14, 32, 14
        );
    }
}
