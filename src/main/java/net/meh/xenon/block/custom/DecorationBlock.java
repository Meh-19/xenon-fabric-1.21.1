package net.meh.xenon.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.IntProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class DecorationBlock extends Block implements Waterloggable {

    public static final IntProperty COUNT = IntProperty.of("count", 1, 3);
    public static final BooleanProperty WATERLOGGED = Properties.WATERLOGGED;

    private static final VoxelShape OUTLINE =
            Block.createCuboidShape(1, 0, 1, 15, 1, 15);

    public DecorationBlock(Settings settings) {
        super(settings);
        this.setDefaultState(
                this.getStateManager().getDefaultState()
                        .with(COUNT, 1)
                        .with(WATERLOGGED, false)
        );
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(COUNT, WATERLOGGED);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();

        if (!canPlaceAt(this.getDefaultState(), world, pos)) {
            return null; // cancels placement
        }

        FluidState fluid = world.getFluidState(pos);

        return this.getDefaultState()
                .with(COUNT, 1)
                .with(WATERLOGGED, fluid.getFluid() == Fluids.WATER);
    }

    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, BlockHitResult hit) {

        ItemStack stack = player.getMainHandStack();

        if (stack.getItem() != this.asItem()) {
            return ActionResult.PASS;
        }

        int current = state.get(COUNT);
        if (current >= 3) {
            return ActionResult.PASS;
        }

        if (!world.isClient) {
            world.setBlockState(pos, state.with(COUNT, current + 1), Block.NOTIFY_ALL);

            if (!player.getAbilities().creativeMode) {
                stack.decrement(1);
            }

            world.playSound(
                    null,
                    pos,
                    SoundEvents.BLOCK_STONE_PLACE,
                    SoundCategory.BLOCKS,
                    0.8F,
                    0.9F + world.random.nextFloat() * 0.2F
            );
        }

        return ActionResult.SUCCESS;
    }

    @Override
    public void onStateReplaced(BlockState state, World world, BlockPos pos,
                                BlockState newState, boolean moved) {

        if (state.isOf(newState.getBlock())) {
            return;
        }

        if (!world.isClient) {
            PlayerEntity player = world.getClosestPlayer(
                    pos.getX() + 0.5,
                    pos.getY() + 0.5,
                    pos.getZ() + 0.5,
                    5.0,
                    false
            );

            if (player == null || !player.getAbilities().creativeMode) {
                int count = state.get(COUNT);
                for (int i = 0; i < count; i++) {
                    world.spawnEntity(new ItemEntity(
                            world,
                            pos.getX() + 0.5,
                            pos.getY() + 0.1,
                            pos.getZ() + 0.5,
                            new ItemStack(this.asItem())
                    ));
                }
            }
        }

        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world,
                                      BlockPos pos, ShapeContext context) {
        return OUTLINE;
    }

    @Override
    public VoxelShape getCollisionShape(BlockState state, BlockView world,
                                        BlockPos pos, ShapeContext context) {
        return VoxelShapes.empty(); // no collision
    }

    @Override
    public FluidState getFluidState(BlockState state) {
        return state.get(WATERLOGGED)
                ? Fluids.WATER.getStill(false)
                : super.getFluidState(state);
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction,
                                                BlockState neighborState, WorldAccess world,
                                                BlockPos pos, BlockPos neighborPos) {

        if (direction == Direction.DOWN && !canPlaceAt(state, world, pos)) {
            return Blocks.AIR.getDefaultState();
        }

        if (state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }


    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockPos below = pos.down();
        BlockState support = world.getBlockState(below);

        return Block.sideCoversSmallSquare(
                world,
                below,
                Direction.UP
        );
    }


}
