package net.meh.xenon.block.custom.vines;

import com.mojang.serialization.MapCodec;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.block.*;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.World;
import net.minecraft.world.WorldView;

public class SculkVinesBlock extends AbstractPlantStemBlock {

    protected static final VoxelShape SHAPE =
            Block.createCuboidShape(1, 0, 1, 15, 16, 15);

    public SculkVinesBlock(Settings settings) {
        super(settings, Direction.DOWN, SHAPE, false, 0.11F);
    }

    @Override
    protected AbstractPlantBlock getPlant() {
        return (AbstractPlantBlock) ModBlocks.SCULK_VINES_END;
    }

    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        BlockState above = world.getBlockState(pos.up());
        return above.isOf(this)
                || above.isOf(ModBlocks.SCULK_VINES_END)
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
        if (newState.isOf(ModBlocks.SCULK_VINES)
                || newState.isOf(ModBlocks.SCULK_VINES_END)) {
            return;
        }

        // Destroy everything below
        BlockPos.Mutable scan = pos.mutableCopy().move(Direction.DOWN);
        while (true) {
            BlockState scanState = world.getBlockState(scan);
            if (scanState.isOf(this) || scanState.isOf(ModBlocks.SCULK_VINES_END)) {
                world.breakBlock(scan, false);
                scan.move(Direction.DOWN);
            } else {
                break;
            }
        }

        // Promote above into END
        BlockPos above = pos.up();
        if (world.getBlockState(above).isOf(this)) {
            world.setBlockState(
                    above,
                    ModBlocks.SCULK_VINES_END.getDefaultState(),
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
            world.setBlockState(below, ModBlocks.SCULK_VINES_END.getDefaultState());
        }
    }

    @Override
    protected MapCodec<? extends AbstractPlantStemBlock> getCodec() {
        return null;
    }

    @Override
    protected int getGrowthLength(Random random) {
        return 0;
    }

    @Override
    protected boolean chooseStemState(BlockState state) {
        return false;
    }
}
