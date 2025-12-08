package net.meh.xenon;

import net.fabricmc.api.ModInitializer;

import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Xenon implements ModInitializer {
	public static final String MOD_ID = "xenon";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}