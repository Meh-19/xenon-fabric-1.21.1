package net.meh.xenon.trade;

import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.item.ModItems;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradedItem;
import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

public final class ScavengerTradePools {

    public static final List<WeightedTrade> ALL_TRADES = new ArrayList<>();

    static {
        ALL_TRADES.add(new WeightedTrade(random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SLATE.asItem(), 64, 1, random), 20));


        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.BUBBLE_CORAL_BLOCK.asItem(), 8, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.BRAIN_CORAL_BLOCK.asItem(), 8, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.FIRE_CORAL_BLOCK.asItem(), 8, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.TUBE_CORAL_BLOCK.asItem(), 8, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.HORN_CORAL_BLOCK.asItem(), 8, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.SEA_PICKLE.asItem(), 8, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.DIAMOND, 1, 1, ModItems.RUBY.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.IRON_INGOT, 6, 12, ModItems.RUBY.asItem(), 4, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.GOLD_INGOT, 6, 12, ModItems.RUBY.asItem(), 4, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.NETHERITE_SCRAP, 1, 1, ModItems.RUBY.asItem(), 20, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.COAL, 48, 96, ModItems.RUBY.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.LAPIS_LAZULI, 24, 48, ModItems.RUBY.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.REDSTONE, 36, 72, ModItems.RUBY.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.PLATINUM, 1, 1, ModItems.RUBY.asItem(), 20, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.COPPER_INGOT, 6, 12, ModItems.RUBY.asItem(), 2, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 3, 6, Items.APPLE.asItem(), 1, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.OAK_SAPLING, 1, 1, ModItems.RUBY.asItem(), 1, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Items.SPRUCE_SAPLING.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Items.BIRCH_SAPLING.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Items.JUNGLE_SAPLING.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Items.ACACIA_SAPLING.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.PISTON.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 48, 96, Blocks.STICKY_PISTON.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.REPEATER.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.COMPARATOR.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.DROPPER.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.OBSERVER.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Blocks.DISPENSER.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.HOPPER.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.GUNPOWDER, 6, 12, ModItems.RUBY.asItem(), 2, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.FEATHER, 12, 24, ModItems.RUBY.asItem(), 1, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Items.STRING.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.ENDER_PEARL, 6, 12, ModItems.RUBY.asItem(), 2, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.BONE, 24, 48, ModItems.RUBY.asItem(), 1, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Items.ROTTEN_FLESH.asItem(), 32, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Items.INK_SAC.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Items.GLOW_INK_SAC.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, Items.LEATHER.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(Items.SPIDER_EYE, 6, 12, ModItems.RUBY.asItem(), 2, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 48, 96, Items.SLIME_BALL.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.STONE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.ANDESITE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.DIORITE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.GRANITE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.MUD.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.TERRACOTTA.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.WHITE_CRYSTAL.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.RED_CRYSTAL.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.ORANGE_CRYSTAL.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.YELLOW_CRYSTAL.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.GREEN_CRYSTAL.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BLUE_CRYSTAL.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PURPLE_CRYSTAL.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.WHITE_CRYSTAL_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.RED_CRYSTAL_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.ORANGE_CRYSTAL_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.YELLOW_CRYSTAL_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.GREEN_CRYSTAL_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BLUE_CRYSTAL_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PURPLE_CRYSTAL_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_WHITE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_LIGHT_GRAY.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_GRAY.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_BLACK.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_BROWN.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_RED.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_ORANGE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_YELLOW.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_LIME.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_GREEN.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_LIGHT_BLUE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_BLUE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_MAGENTA.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_PURPLE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.QUILTED_WOOL_PINK.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PACKED_DIRT.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.ASHEN_SAND.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.ASHEN_SANDSTONE.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.DAMP_MOSS_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, ModBlocks.DAMP_MOSS.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.GRIMOSS_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, ModBlocks.GRIMOSS.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, ModBlocks.GRIMWEED_BLOCK.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.LIMESTONE.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.RHYOLITE.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.MOSSY_RHYOLITE.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.KYANITE.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.GRIMROCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.COBBLED_GRIMROCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.LOAM.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PACKED_LOAM.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SILT.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.DRIED_SILT.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SLATE.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.STRATA.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.DOLOMITE.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BRITTLE_BONE_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SCORIA_BRICKS_SLAB.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BLIGHTED_BONE_BLOCK.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.GRAVESTONE.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SCORIA.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.MOLTEN_SCORIA.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.DRIPSTONE_BRICKS.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.POLISHED_BASALT_BRICKS.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BLUE_NETHER_BRICKS.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.TAINTED_NETHER_BRICKS.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SOUL_BRICKS.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SNOW_BRICKS.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PACKED_SNOW.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PACKED_ICE_BRICKS.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PRISMARINE_TILES.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 48, 96, ModBlocks.ECHO_GLASS.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PERMAFROST.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.FROST.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BLIGHTED_SHROOMLIGHT.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SHOJI.asItem(), 32, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.CLOSED_WOODEN_CRATE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.ENFORCED_WOODEN_CRATE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SLATTED_WOODEN_CRATE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.FRAMED_WOODEN_CRATE.asItem(), 16, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.SANDY_LIMESTONE_BRICKS.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.POLISHED_BASALT_TILES.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.POSSESSED_CHISELED_SOUL_BRICKS.asItem(), 4, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PRISMARINE_PILLAR.asItem(), 8, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, ModItems.BLIGHT_ESSENCE.asItem(), 1, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, ModItems.DOLOMITE_DUST.asItem(), 16, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, ModBlocks.ROCK.asItem(), 16, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 12, 24, ModBlocks.PEBBLES.asItem(), 16, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.RED_MAPLE_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.ORANGE_MAPLE_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BLEAK_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.GREEN_FIR_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.ORANGE_FIR_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PALM_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BAYOU_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.WISTERIA_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.WISTERIA_FLOWERS_BLUE.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.WISTERIA_FLOWERS_PINK.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.WISTERIA_FLOWERS_PURPLE.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.WISTERIA_FLOWERS_WHITE.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BAOBAB_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.OAK_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.SPRUCE_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.BIRCH_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.JUNGLE_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.ACACIA_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.CHERRY_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.DARK_OAK_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.MANGROVE_LEAVES.asItem(), 64, 1, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.OAK_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.BIRCH_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.SPRUCE_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.DARK_OAK_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.WARPED_STEM.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.CRIMSON_STEM.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.CHERRY_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.MANGROVE_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.JUNGLE_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, Blocks.ACACIA_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.MAPLE_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BLEAK_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.FIR_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.PALM_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BAYOU_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.WISTERIA_LOG.asItem(), 32, 2, random),
                20
        ));
        ALL_TRADES.add(new WeightedTrade(
                random -> tradeRanged(ModItems.RUBY, 24, 48, ModBlocks.BAOBAB_LOG.asItem(), 32, 2, random),
                20
        ));
    }


    private static TradeOffer trade(
            Item buy,
            int buyCount,
            Item sell,
            int sellCount,
            int xp
    ) {
        return new TradeOffer(
                new TradedItem(buy, buyCount),
                Optional.empty(),
                new ItemStack(sell, sellCount),
                12,
                xp,
                0.0f
        );
    }

    private static TradeOffer tradeRanged(
            Item buy,
            int minBuy,
            int maxBuy,
            Item sell,
            int sellCount,
            int xp,
            Random random
    ) {
        int buyCount = minBuy + random.nextInt(maxBuy - minBuy + 1);

        return new TradeOffer(
                new TradedItem(buy, buyCount),
                Optional.empty(),
                new ItemStack(sell, sellCount),
                12,     // max uses
                xp,
                0.05f
        );
    }
    }
