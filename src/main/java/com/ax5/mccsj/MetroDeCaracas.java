package com.ax5.mccsj;

import com.ax5.mccsj.block.ModBlocks;
import com.ax5.mccsj.block.ModBlocks;
import com.ax5.mccsj.items.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetroDeCaracas implements ModInitializer {
	public static final String MOD_ID = "mccsj";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.initialize();
		ModItems.init();
		LOGGER.info("Hello Fabric world!");
	}
}