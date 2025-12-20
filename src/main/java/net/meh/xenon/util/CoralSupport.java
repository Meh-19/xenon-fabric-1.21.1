package net.meh.xenon.util;

import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.world.CoralStabilizationState;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;

public final class CoralSupport {

    private CoralSupport() {}

    public static boolean isSupported(ServerWorld world, BlockPos pos) {

        if (CoralStabilizationState.get(world).isStabilized(pos)) {
            return true;
        }

        for (Direction dir : Direction.values()) {
            Block block = world.getBlockState(pos.offset(dir)).getBlock();

            if (block == ModBlocks.DOLOMITE
                    || block == ModBlocks.DOLOMITE_SLAB
                    || block == ModBlocks.DOLOMITE_STAIRS
                    || block == ModBlocks.DOLOMITE_PILLAR
                    || block == ModBlocks.CHISELED_DOLOMITE
                    || block == ModBlocks.POLISHED_DOLOMITE
                    || block == ModBlocks.POLISHED_DOLOMITE_SLAB
                    || block == ModBlocks.POLISHED_DOLOMITE_STAIRS
                    || block == ModBlocks.DOLOMITE_BRICKS
                    || block == ModBlocks.DOLOMITE_BRICKS_SLAB
                    || block == ModBlocks.DOLOMITE_BRICKS_STAIRS
            ) {
                return true;
            }
        }

        return false;
    }

    public static boolean isAliveCoral(ServerWorld world, BlockPos pos) {
        Block block = world.getBlockState(pos).getBlock();

        return block == Blocks.BRAIN_CORAL
                || block == Blocks.BRAIN_CORAL_FAN
                || block == Blocks.BRAIN_CORAL_WALL_FAN
                || block == Blocks.BRAIN_CORAL_BLOCK

                || block == Blocks.FIRE_CORAL
                || block == Blocks.FIRE_CORAL_FAN
                || block == Blocks.FIRE_CORAL_WALL_FAN
                || block == Blocks.FIRE_CORAL_BLOCK

                || block == Blocks.TUBE_CORAL
                || block == Blocks.TUBE_CORAL_FAN
                || block == Blocks.TUBE_CORAL_WALL_FAN
                || block == Blocks.TUBE_CORAL_BLOCK

                || block == Blocks.BUBBLE_CORAL
                || block == Blocks.BUBBLE_CORAL_FAN
                || block == Blocks.BUBBLE_CORAL_WALL_FAN
                || block == Blocks.BUBBLE_CORAL_BLOCK

                || block == Blocks.HORN_CORAL
                || block == Blocks.HORN_CORAL_FAN
                || block == Blocks.HORN_CORAL_WALL_FAN
                || block == Blocks.HORN_CORAL_BLOCK;
    }
}
