package net.meh.xenon.trade;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.meh.xenon.villager.ModVillagers;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;

import java.util.Optional;

public final class ModTrades {

    private ModTrades() {}
    public static void registerSingleInputTrade(
            int level,
            Item buyItem,
            int buyCount,
            Item sellItem,
            int sellCount,
            int maxUses,
            int villagerXp,
            float priceMultiplier
    ) {
        TradeOfferHelper.registerVillagerOffers(
                ModVillagers.SCAVENGER,
                level,
                factories -> factories.add((entity, random) ->
                        new TradeOffer(
                                new TradedItem(buyItem, buyCount),
                                Optional.empty(), // ← correct for single-input
                                new ItemStack(sellItem, sellCount),
                                maxUses,
                                villagerXp,
                                priceMultiplier
                        )
                )
        );
    }
    public static void registerTwoInputTrade(
            int level,
            Item buyItemA,
            int buyCountA,
            Item buyItemB,
            int buyCountB,
            Item sellItem,
            int sellCount,
            int maxUses,
            int villagerXp,
            float priceMultiplier
    ) {
        TradeOfferHelper.registerVillagerOffers(
                ModVillagers.SCAVENGER,
                level,
                factories -> factories.add((entity, random) ->
                        new TradeOffer(
                                new TradedItem(buyItemA, buyCountA),
                                Optional.of(new TradedItem(buyItemB, buyCountB)), // ← FIX
                                new ItemStack(sellItem, sellCount),
                                maxUses,
                                villagerXp,
                                priceMultiplier
                        )
                )
        );
    }
}
