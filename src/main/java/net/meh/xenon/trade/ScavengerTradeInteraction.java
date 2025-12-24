package net.meh.xenon.trade;

import net.fabricmc.fabric.api.event.player.UseEntityCallback;
import net.meh.xenon.villager.ModVillagers;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.util.ActionResult;

public final class ScavengerTradeInteraction {

    public static void register() {
        UseEntityCallback.EVENT.register((player, world, hand, entity, hitResult) -> {
            if (!world.isClient && entity instanceof VillagerEntity villager) {
                if (villager.getVillagerData().getProfession() == ModVillagers.SCAVENGER) {
                    ScavengerTradeRefresher.ensureTradesExist(villager);
                }
            }
            return ActionResult.PASS;
        });
    }
}
