package net.meh.xenon.block.custom;

import net.meh.xenon.Xenon;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.ActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PrismLanternBlock extends Block {
    public static final BooleanProperty LIT = BooleanProperty.of("lit");

    public PrismLanternBlock(Settings settings) {
        super(settings);
        this.setDefaultState(this.getStateManager().getDefaultState().with(LIT, false));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(LIT);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player, BlockHitResult hit) {
        if (world.isClient) {
            return ActionResult.SUCCESS;
        }

        boolean next = !state.get(LIT);
        Xenon.LOGGER.info("PrismLantern toggled: {} -> {}", state.get(LIT), next);

        world.setBlockState(pos, state.with(LIT, next), Block.NOTIFY_ALL);
        return ActionResult.CONSUME;
    }
}
