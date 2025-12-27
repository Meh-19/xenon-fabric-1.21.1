package net.meh.xenon.block.custom.plants;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public abstract class BrambleBlockBase extends Block {

    protected BrambleBlockBase(Settings settings) {
        super(settings);
    }

    @Override
    public void onEntityCollision(
            BlockState state,
            World world,
            BlockPos pos,
            Entity entity
    ) {
        if (entity instanceof LivingEntity living) {
            entity.slowMovement(state, new Vec3d(0.8, 0.75, 0.8));

            if (!world.isClient) {
                living.damage(
                        world.getDamageSources().sweetBerryBush(),
                        1.0F
                );
            }
        }
    }
}
