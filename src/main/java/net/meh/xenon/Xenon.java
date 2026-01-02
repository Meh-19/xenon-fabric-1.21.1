package net.meh.xenon;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents;
import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.block.custom.plants.StickPlacementHandler;
import net.meh.xenon.config.ConfigManager;
import net.meh.xenon.item.ModItemGroups;
import net.meh.xenon.item.ModItems;
import net.meh.xenon.network.ModPayloads;
import net.meh.xenon.network.RocketBootsPackets;
import net.meh.xenon.sound.ModSounds;
import net.meh.xenon.trade.ScavengerTradeRefresher;
import net.meh.xenon.util.RocketBootsSafety;
import net.meh.xenon.villager.ModVillagers;
import net.meh.xenon.world.ModConfiguredFeatures;
import net.meh.xenon.world.gen.ModWorldGeneration;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class Xenon implements ModInitializer {

	public static final String MOD_ID = "xenon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private static final Map<World, Long> LAST_DAY_PER_WORLD = new HashMap<>();

	@Override
	public void onInitialize() {
		RocketBootsSafety.register();
		ModPayloads.register();
		RocketBootsPackets.register();
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		StickPlacementHandler.register();
		ModVillagers.registerVillagers();
		ModSounds.registerSounds();
		ConfigManager.load();
		logBlockCount();
		ModWorldGeneration.generateModWorldGen();

		ServerTickEvents.END_WORLD_TICK.register(world -> {
			long currentDay = world.getTimeOfDay() / 24000L;
			long lastDay = LAST_DAY_PER_WORLD.getOrDefault(world, -1L);

			if (currentDay != lastDay) {
				LAST_DAY_PER_WORLD.put(world, currentDay);

				LOGGER.info(
						"New day detected in {} (day {}) — rerolling Scavenger trades",
						world.getRegistryKey().getValue(),
						currentDay
				);

				ScavengerTradeRefresher.refreshTrades(world);
			}
		});
	}

	private static void logBlockCount() {
		long count = Registries.BLOCK.stream()
				.filter(block -> {
					Identifier id = Registries.BLOCK.getId(block);
					return id != null && id.getNamespace().equals(MOD_ID);
				})
				.count();

		LOGGER.info("Xenon has registered {} blocks.", count);
	}
}
