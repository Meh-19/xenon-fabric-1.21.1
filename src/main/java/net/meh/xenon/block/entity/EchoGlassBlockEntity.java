package net.meh.xenon.block.entity;

import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.block.entity.ModBlockEntities;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;

public class EchoGlassBlockEntity extends BlockEntity {

    public EchoGlassBlockEntity(BlockPos pos, BlockState state) {
        super(ModBlockEntities.ECHO_GLASS, pos, state);
    }
}
