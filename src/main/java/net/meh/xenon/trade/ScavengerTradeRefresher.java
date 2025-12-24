package net.meh.xenon.trade;

import net.meh.xenon.sound.ModSounds;
import net.meh.xenon.villager.ModVillagers;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOfferList;

import java.util.ArrayList;

public final class ScavengerTradeRefresher {

    private ScavengerTradeRefresher() {}

    public static void refreshTrades(ServerWorld world) {
        for (VillagerEntity villager : world.getEntitiesByType(
                EntityType.VILLAGER,
                v -> v.getVillagerData().getProfession() == ModVillagers.SCAVENGER
        )) {
            reroll(villager);
        }
    }

    public static void ensureTradesExist(VillagerEntity villager) {
        if (villager.getOffers().isEmpty()) {
            reroll(villager);
        }
    }


    static void reroll(VillagerEntity villager) {

        int level = villager.getVillagerData().getLevel();
        int slots = ScavengerTradeRules.slotsForLevel(level);

        TradeOfferList offers = villager.getOffers();
        offers.clear();

        var random = villager.getWorld().getRandom();

        var pool = new ArrayList<TradeOffer>();
        for (var factory : ScavengerTradePools.ALL_TRADES) {
            pool.add(factory.factory().apply(random));
        }


        for (int i = pool.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            var tmp = pool.get(i);
            pool.set(i, pool.get(j));
            pool.set(j, tmp);
        }

        for (int i = 0; i < Math.min(slots, pool.size()); i++) {
            offers.add(pool.get(i));
        }

        if (villager.getCustomer() != null) {
            villager.sendOffers(
                    villager.getCustomer(),
                    villager.getDisplayName(),
                    level
            );
        }

        villager.getWorld().playSound(
                null,
                villager.getBlockPos(),
                ModSounds.RUBY_LOSE,
                net.minecraft.sound.SoundCategory.NEUTRAL,
                1.0f,
                1.0f
        );

    }
}
