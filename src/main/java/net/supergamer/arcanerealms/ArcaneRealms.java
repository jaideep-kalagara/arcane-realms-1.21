package net.supergamer.arcanerealms;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.minecraft.text.Text;
import net.minecraft.world.Difficulty;
import net.supergamer.arcanerealms.Items.ModItemGroups;
import net.supergamer.arcanerealms.Items.ModItems;
import net.supergamer.arcanerealms.networking.ModMessages;
import net.supergamer.arcanerealms.networking.packet.WandUseC2SPayload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.text.html.parser.Entity;

public class ArcaneRealms implements ModInitializer {
	public static final String MOD_ID = "arcanerealms";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		LOGGER.info("Loaded mod Arcane Realms!");



		PayloadTypeRegistry.playC2S().register(WandUseC2SPayload.ID, WandUseC2SPayload.CODEC);


		ServerPlayNetworking.registerGlobalReceiver(WandUseC2SPayload.ID, (payload, context) -> {
			context.server().execute(() -> {
				 context.server().sendMessage(Text.literal("Clicked!"));
			});
		});
	}
}