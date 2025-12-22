package net.meh.xenon.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.TransparentBlock;
import net.minecraft.util.math.Direction;


public class AquariumGlassBlock extends TransparentBlock {

    public AquariumGlassBlock(Settings settings) {
        super(settings);
    }

    @Override
    public boolean isSideInvisible(BlockState state, BlockState neighborState, Direction direction) {
        return neighborState.isOf(this);
    }
}
