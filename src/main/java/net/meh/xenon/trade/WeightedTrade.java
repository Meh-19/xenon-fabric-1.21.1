package net.meh.xenon.trade;

import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;

import java.util.function.Function;

public record WeightedTrade(
        Function<Random, TradeOffer> factory,
        int weight
) {}
