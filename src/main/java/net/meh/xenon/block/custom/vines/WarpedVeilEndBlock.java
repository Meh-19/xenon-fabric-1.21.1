package net.meh.xenon.block.custom.vines;

import com.mojang.serialization.MapCodec;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.block.AbstractPlantBlock;
import net.minecraft.block.AbstractPlantStemBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;
import org.jetbrains.annotations.Nullable;

public class WarpedVeilEndBlock extends AbstractPlantBlock {

    protected static final VoxelShape SHAPE =
            Block.createCuboidShape(1, 0, 1, 15, 16, 15);

    public WarpedVeilEndBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false);
    }

    @Override
    protected AbstractPlantStemBlock getStem() {
        return (AbstractPlantStemBlock) ModBlocks.WARPED_VEIL;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext context) {
        BlockPos pos = context.getBlockPos();
        World world = context.getWorld();

        if (world.getBlockState(pos.up()).isOf(this)) {
            world.setBlockState(pos.up(), ModBlocks.WARPED_VEIL.getDefaultState());
        }

        return this.getDefaultState();
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState above = world.getBlockState(pos.up());
        return above.isOf(ModBlocks.WARPED_VEIL)
                || above.isOf(this)
                || above.isSideSolidFullSquare(world, pos.up(), Direction.DOWN);
    }

    @Override
    public void onStateReplaced(
            BlockState state,
            World world,
            BlockPos pos,
            BlockState newState,
            boolean moved
    ) {
        if (newState.isOf(ModBlocks.WARPED_VEIL)
                || newState.isOf(ModBlocks.WARPED_VEIL_BOTTOM)) {
            return;
        }

        // Destroy everything below
        BlockPos.Mutable scan = pos.mutableCopy().move(Direction.DOWN);
        while (true) {
            BlockState scanState = world.getBlockState(scan);
            if (scanState.isOf(ModBlocks.WARPED_VEIL)
                    || scanState.isOf(this)) {
                world.breakBlock(scan, false);
                scan.move(Direction.DOWN);
            } else {
                break;
            }
        }

        // Promote above
        BlockPos above = pos.up();
        if (world.getBlockState(above).isOf(ModBlocks.WARPED_VEIL)) {
            world.setBlockState(
                    above,
                    this.getDefaultState(),
                    Block.NOTIFY_ALL
            );
        }

        super.onStateReplaced(state, world, pos, newState, moved);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (random.nextInt(25) != 0) return;

        BlockPos below = pos.down();
        if (world.isAir(below)) {
            world.setBlockState(below, this.getDefaultState());
            world.setBlockState(pos, ModBlocks.WARPED_VEIL.getDefaultState());
        }
    }

    @Override
    protected MapCodec<? extends AbstractPlantBlock> getCodec() {
        return null;
    }
}
