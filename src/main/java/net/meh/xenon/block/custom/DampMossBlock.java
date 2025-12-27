package net.meh.xenon.block.custom;

import net.meh.xenon.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class DampMossBlock extends Block {

    private static final VoxelShape SHAPE =
            Block.createCuboidShape(0, 0, 0, 16, 1, 16);

    public DampMossBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockPos pos = context.getBlockPos();
        WorldView world = context.getWorld();

        BlockState above = world.getBlockState(pos.up());

        if (above.isSideSolidFullSquare(world, pos.up(), Direction.DOWN)
                || above.isOf(ModBlocks.DAMP_MOSS_HANG)
                || above.isOf(ModBlocks.DAMP_MOSS_HANG_BOTTOM)) {

            return ModBlocks.DAMP_MOSS_HANG.getDefaultState();
        }

        return this.getDefaultState();
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState below = world.getBlockState(pos.down());
        BlockState above = world.getBlockState(pos.up());

        if (state.isOf(this)) {
            return below.isSideSolidFullSquare(world, pos.down(), Direction.UP)
                    && !above.isOf(ModBlocks.DAMP_MOSS_HANG)
                    && !above.isOf(ModBlocks.DAMP_MOSS_HANG_BOTTOM);
        }

        return above.isSideSolidFullSquare(world, pos.up(), Direction.DOWN)
                || above.isOf(ModBlocks.DAMP_MOSS_HANG)
                || above.isOf(ModBlocks.DAMP_MOSS_HANG_BOTTOM)
                || below.isOf(ModBlocks.DAMP_MOSS_HANG)
                || below.isOf(ModBlocks.DAMP_MOSS_HANG_BOTTOM);
    }

    @Override
    public VoxelShape getOutlineShape(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        return SHAPE;
    }

    @Override
    public VoxelShape getCullingShape(BlockState state, BlockView world, BlockPos pos) {
        return VoxelShapes.empty();
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState neighbor, Direction dir) {
        return false;
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
        if (!canPlaceAt(state, world, pos)) {
            world.breakBlock(pos, true);
        }
    }
}
