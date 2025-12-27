package net.meh.xenon.block.custom.plants;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemPlacementContext;

public final class StickPlacementHandler {

    public static void register() {
        UseItemCallback.EVENT.register((player, world, hand) -> {
            ItemStack stack = player.getStackInHand(hand);

            if (!stack.isOf(Items.STICK)) {
                return TypedActionResult.pass(stack);
            }

            if (world.isClient) {
                return TypedActionResult.pass(stack);
            }

            BlockHitResult hit = (BlockHitResult) player.raycast(5.0D, 0.0F, false);

            if (hit.getType() != BlockHitResult.Type.BLOCK) {
                return TypedActionResult.pass(stack);
            }

            BlockPos placePos = hit.getBlockPos().offset(hit.getSide());

            ItemPlacementContext ctx = new ItemPlacementContext(
                    world,
                    player,
                    hand,
                    stack,
                    new BlockHitResult(
                            hit.getPos(),
                            hit.getSide(),
                            placePos,
                            false
                    )
            );

            BlockState state = ModBlocks.STICK.getPlacementState(ctx);

            if (state == null || !state.canPlaceAt(world, placePos)) {
                return TypedActionResult.pass(stack);
            }

            world.setBlockState(placePos, state, 3);

            var soundGroup = state.getSoundGroup();

            world.playSound(
                    null,
                    placePos,
                    soundGroup.getPlaceSound(),
                    SoundCategory.BLOCKS,
                    soundGroup.getVolume(),
                    soundGroup.getPitch()
            );


            if (!player.getAbilities().creativeMode) {
                stack.decrement(1);
            }

            return TypedActionResult.success(stack);
        });
    }
}
