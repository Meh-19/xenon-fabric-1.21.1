package net.meh.xenon.util;

import io.github.ladysnake.pal.VanillaAbilities;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.meh.xenon.ability.ModAbilities;
import net.meh.xenon.item.custom.RocketBootsItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;

public final class RocketBootsSafety {

    public static void register() {
        ServerTickEvents.END_SERVER_TICK.register(RocketBootsSafety::tick);
    }

    private static void tick(MinecraftServer server) {
        for (ServerPlayerEntity player : server.getPlayerManager().getPlayerList()) {

            if (player.isCreative() || player.isSpectator()) continue;

            boolean wearingBoots =
                    player.getEquippedStack(EquipmentSlot.FEET).getItem() instanceof RocketBootsItem;

            boolean flyingByRocket =
                    ModAbilities.ROCKET_BOOTS.grants(player, VanillaAbilities.ALLOW_FLYING);

            if (!wearingBoots && flyingByRocket) {
                ModAbilities.ROCKET_BOOTS.revokeFrom(player, VanillaAbilities.ALLOW_FLYING);

                if (player.getAbilities().flying) {
                    player.getAbilities().flying = false;
                    player.sendAbilitiesUpdate();
                }
            }
        }
    }
}
