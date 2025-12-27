package net.meh.xenon.block.custom.plants;

import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class ModLilyPadBlock extends PlantBlock {

    public static final MapCodec<ModLilyPadBlock> CODEC =
            createCodec(ModLilyPadBlock::new);

    protected static final VoxelShape SHAPE =
            Block.createCuboidShape(1.0, 0.0, 1.0, 15.0, 1.5, 15.0);

    @Override
    public MapCodec<? extends PlantBlock> getCodec() {
        return CODEC;
    }

    public ModLilyPadBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected VoxelShape getOutlineShape(
            BlockState state, BlockView world, BlockPos pos, ShapeContext context
    ) {
        return SHAPE;
    }

    @Override
    protected boolean canPlantOnTop(BlockState floor, BlockView world, BlockPos pos) {
        FluidState fluidHere = world.getFluidState(pos);
        FluidState fluidAbove = world.getFluidState(pos.up());

        return (fluidHere.isOf(Fluids.WATER) || floor.getBlock() instanceof IceBlock)
                && fluidAbove.isEmpty();
    }
}
