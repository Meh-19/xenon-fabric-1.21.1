package net.meh.xenon.block.custom.vines;

import net.minecraft.block.*;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class ModGroundCoverBlock extends Block {

    private static final VoxelShape SHAPE =
            Block.createCuboidShape(0, 0, 0, 16, 1, 16);

    private final Block vineEndBlock;

    public ModGroundCoverBlock(Settings settings, Block vineEndBlock) {
        super(settings);
        this.vineEndBlock = vineEndBlock;
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        World world = context.getWorld();
        BlockPos pos = context.getBlockPos();

        if (world.getBlockState(pos.up())
                .isSideSolidFullSquare(world, pos.up(), Direction.DOWN)) {
            return vineEndBlock.getDefaultState();
        }

        return this.getDefaultState();
    }


    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos below = pos.down();
        BlockPos above = pos.up();

        if (world.getBlockState(below)
                .isSideSolidFullSquare(world, below, Direction.UP)) {
            return true;
        }

        return world.getBlockState(above)
                .isSideSolidFullSquare(world, above, Direction.DOWN);
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
}
