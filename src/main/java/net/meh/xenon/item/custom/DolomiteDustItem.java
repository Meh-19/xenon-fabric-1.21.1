package net.meh.xenon.item.custom;

import net.meh.xenon.util.CoralSupport;
import net.meh.xenon.world.CoralStabilizationState;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class DolomiteDustItem extends Item {

    public DolomiteDustItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if (!(context.getWorld() instanceof ServerWorld world)) {
            return ActionResult.SUCCESS;
        }

        BlockPos pos = context.getBlockPos();

        if (!CoralSupport.isAliveCoral(world, pos)) {
            return ActionResult.PASS;
        }

        CoralStabilizationState state = CoralStabilizationState.get(world);

        if (state.isStabilized(pos)) {
            return ActionResult.PASS;
        }

        state.add(pos);

        world.playSound(
                null,
                pos,
                SoundEvents.ITEM_HONEYCOMB_WAX_ON,
                SoundCategory.BLOCKS,
                1.0F,
                1.0F
        );

        world.spawnParticles(
                ParticleTypes.WAX_OFF,
                pos.getX() + 0.5,
                pos.getY() + 0.5,
                pos.getZ() + 0.5,
                10,
                0.3,
                0.3,
                0.3,
                0.01
        );

        if (!context.getPlayer().getAbilities().creativeMode) {
            context.getStack().decrement(1);
        }

        return ActionResult.SUCCESS;
    }

    private static boolean isAliveCoral(Block block) {
        return block == Blocks.BRAIN_CORAL
                || block == Blocks.BRAIN_CORAL_FAN
                || block == Blocks.BRAIN_CORAL_WALL_FAN
                || block == Blocks.FIRE_CORAL
                || block == Blocks.FIRE_CORAL_FAN
                || block == Blocks.FIRE_CORAL_WALL_FAN
                || block == Blocks.HORN_CORAL
                || block == Blocks.HORN_CORAL_FAN
                || block == Blocks.HORN_CORAL_WALL_FAN
                || block == Blocks.TUBE_CORAL
                || block == Blocks.TUBE_CORAL_FAN
                || block == Blocks.TUBE_CORAL_WALL_FAN
                || block == Blocks.BUBBLE_CORAL
                || block == Blocks.BUBBLE_CORAL_FAN
                || block == Blocks.BUBBLE_CORAL_WALL_FAN;
    }
}
