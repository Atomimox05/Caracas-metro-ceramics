package com.ax5.mccsj;

import com.ax5.mccsj.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CaracasMetroCeramics implements ModInitializer {
	public static final String MOD_ID = "mccsj";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}