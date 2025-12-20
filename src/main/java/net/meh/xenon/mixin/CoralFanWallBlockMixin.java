package net.meh.xenon.mixin;

import net.meh.xenon.util.CoralSupport;
import net.minecraft.block.BlockState;
import net.minecraft.block.CoralWallFanBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CoralWallFanBlock.class)
public abstract class CoralFanWallBlockMixin {

    @Inject(
            method = "scheduledTick",
            at = @At("HEAD"),
            cancellable = true
    )
    private void xenon$preventWallFanDeath(
            BlockState state, ServerWorld world, BlockPos pos, Random random, CallbackInfo ci
    ) {
        if (CoralSupport.isSupported(world, pos)) {
            ci.cancel();
        }
    }
}