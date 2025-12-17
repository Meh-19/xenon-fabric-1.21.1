package net.meh.xenon.block.custom;

import com.mojang.serialization.MapCodec;
import net.meh.xenon.block.entity.EchoGlassBlockEntity;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.SideShapeType;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.block.BlockWithEntity;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.block.SideShapeType;
import net.minecraft.world.BlockView;
import net.minecraft.util.math.Direction;

import org.jetbrains.annotations.Nullable;

public class EchoGlassBlock extends BlockWithEntity {

    public static final MapCodec<EchoGlassBlock> CODEC =
            createCodec(EchoGlassBlock::new);

    public EchoGlassBlock(Settings settings) {
        super(settings);
    }

    @Override
    protected MapCodec<? extends BlockWithEntity> getCodec() {
        return CODEC;
    }

    @Override
    public BlockRenderType getRenderType(BlockState state) {
        return BlockRenderType.INVISIBLE;
    }

    @Nullable
    @Override
    public BlockEntity createBlockEntity(BlockPos pos, BlockState state) {
        return new EchoGlassBlockEntity(pos, state);
    }
}

