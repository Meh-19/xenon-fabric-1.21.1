package net.meh.xenon.network;

import io.github.ladysnake.pal.VanillaAbilities;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.meh.xenon.ability.ModAbilities;
import net.minecraft.server.network.ServerPlayerEntity;

public final class RocketBootsPackets {

    public static void register() {
        ServerPlayNetworking.registerGlobalReceiver(
                RocketTogglePayload.ID,
                (payload, context) ->
                        context.server().execute(() ->
                                toggle(context.player())
                        )
        );
    }

    private static void toggle(ServerPlayerEntity player) {
        if (player.isCreative() || player.isSpectator()) return;

        if (!ModAbilities.ROCKET_BOOTS.grants(player, VanillaAbilities.ALLOW_FLYING)) return;

        boolean enable = !player.getAbilities().flying;
        player.getAbilities().flying = enable;

        if (enable) {
            player.setVelocity(player.getVelocity().x, 0.0, player.getVelocity().z);
            player.velocityModified = true;
        }

        player.sendAbilitiesUpdate();
    }




    private RocketBootsPackets() {}
}
