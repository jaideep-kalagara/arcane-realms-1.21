package net.supergamer.arcanerealms;

import net.fabricmc.api.ModInitializer;

import net.supergamer.arcanerealms.Items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArcaneRealms implements ModInitializer {
	public static final String MOD_ID = "arcanerealms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		LOGGER.info("Loaded mod Arcane Realms!");
	}
}