package net.meh.xenon.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.fluid.Fluids;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class PorousDolomiteBlock extends Block {

    public PorousDolomiteBlock(Settings settings) {
        super(settings);
    }

    @Override
    public void onBlockAdded(
            BlockState state,
            World world,
            BlockPos pos,
            BlockState oldState,
            boolean notify
    ) {
        if (!world.isClient) {
            world.scheduleBlockTick(pos, this, 1);
        }
    }

    @Override
    protected void scheduledTick(
            BlockState state,
            ServerWorld world,
            BlockPos pos,
            Random random
    ) {
        BlockPos above = pos.up();

        if (!world.getFluidState(above).isOf(Fluids.WATER)) {
            return;
        }

        BlockState aboveState = world.getBlockState(above);

        if (!aboveState.isOf(Blocks.BUBBLE_COLUMN)
                || aboveState.get(BubbleColumnBlock.DRAG)) {

            BlockState bubble = Blocks.BUBBLE_COLUMN
                    .getDefaultState()
                    .with(BubbleColumnBlock.DRAG, false);

            BubbleColumnBlock.update(world, above, aboveState, bubble);
        }

        world.scheduleBlockTick(pos, this, 1);
    }

    @Override
    protected BlockState getStateForNeighborUpdate(
            BlockState state,
            Direction direction,
            BlockState neighborState,
            WorldAccess world,
            BlockPos pos,
            BlockPos neighborPos
    ) {
        return state;
    }
    @Override
    public void neighborUpdate(
            BlockState state,
            World world,
            BlockPos pos,
            Block sourceBlock,
            BlockPos sourcePos,
            boolean notify
    ) {
        if (world.isClient) return;

        if (!sourcePos.equals(pos.up())) return;

        if (world.getFluidState(pos.up()).isOf(Fluids.WATER)) {
            world.scheduleBlockTick(pos, this, 1);
        }
    }
}
