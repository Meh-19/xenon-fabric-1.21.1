package net.meh.xenon.mixin;

import net.meh.xenon.util.CoralSupport;
import net.minecraft.block.CoralFanBlock;
import net.minecraft.block.BlockState;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CoralFanBlock.class)
public abstract class CoralFanBlockMixin {

    @Inject(
            method = "scheduledTick",
            at = @At("HEAD"),
            cancellable = true
    )
    private void xenon$preventFanDeath(
            BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci
    ) {
        if (CoralSupport.isSupported(world, pos)) {
            ci.cancel();
        }
    }
}
