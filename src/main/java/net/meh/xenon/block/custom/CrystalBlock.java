package net.meh.xenon.block.custom;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class CrystalBlock extends Block implements Waterloggable {

    public static final MapCodec<CrystalBlock> CODEC = RecordCodecBuilder.mapCodec(
            instance -> instance.group(
                    Codec.FLOAT.fieldOf("height").forGetter(block -> block.height),
                    Codec.FLOAT.fieldOf("aabb_offset").forGetter(block -> block.xzOffset),
                    createSettingsCodec()
            ).apply(instance, CrystalBlock::new)
    );

    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;
    public static final DirectionProperty FACING = Properties.FACING;

    private final float height;
    private final float xzOffset;

    protected final VoxelShape northShape;
    protected final VoxelShape southShape;
    protected final VoxelShape eastShape;
    protected final VoxelShape westShape;
    protected final VoxelShape upShape;
    protected final VoxelShape downShape;

    @Override
    protected MapCodec<? extends Block> getCodec() {
        return CODEC;
    }

    public CrystalBlock(float height, float xzOffset, Settings settings) {
        super(settings);
        this.height = height;
        this.xzOffset = xzOffset;

        this.setDefaultState(
                this.getStateManager().getDefaultState()
                        .with(WATERLOGGED, false)
                        .with(FACING, Direction.UP)
        );

        this.upShape = Block.createCuboidShape(
                xzOffset, 0.0, xzOffset,
                16.0F - xzOffset, height, 16.0F - xzOffset
        );
        this.downShape = Block.createCuboidShape(
                xzOffset, 16.0F - height, xzOffset,
                16.0F - xzOffset, 16.0, 16.0F - xzOffset
        );
        this.northShape = Block.createCuboidShape(
                xzOffset, xzOffset, 16.0F - height,
                16.0F - xzOffset, 16.0F - xzOffset, 16.0
        );
        this.southShape = Block.createCuboidShape(
                xzOffset, xzOffset, 0.0,
                16.0F - xzOffset, 16.0F - xzOffset, height
        );
        this.eastShape = Block.createCuboidShape(
                0.0, xzOffset, xzOffset,
                height, 16.0F - xzOffset, 16.0F - xzOffset
        );
        this.westShape = Block.createCuboidShape(
                16.0F - height, xzOffset, xzOffset,
                16.0, 16.0F - xzOffset, 16.0F - xzOffset
        );
    }

    @Override
    protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(FACING)) {
            case NORTH -> northShape;
            case SOUTH -> southShape;
            case EAST -> eastShape;
            case WEST -> westShape;
            case DOWN -> downShape;
            case UP -> upShape;
        };
    }

    @Override
    protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction facing = state.get(FACING);
        BlockPos supportPos = pos.offset(facing.getOpposite());
        return world.getBlockState(supportPos)
                .isSideSolidFullSquare(world, supportPos, facing);
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
        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return direction == state.get(FACING).getOpposite() && !state.canPlaceAt(world, pos)
                ? Blocks.AIR.getDefaultState()
                : super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        WorldAccess world = ctx.getWorld();
        BlockPos pos = ctx.getBlockPos();

        return this.getDefaultState()
                .with(FACING, ctx.getSide())
                .with(WATERLOGGED, world.getFluidState(pos).getFluid() == Fluids.WATER);
    }

    @Override
    protected BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    protected BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED)
                ? Fluids.WATER.getStill(false)
                : super.getFluidState(state);
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(WATERLOGGED, FACING);
    }
}
