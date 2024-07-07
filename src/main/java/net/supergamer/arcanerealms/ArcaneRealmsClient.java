package net.supergamer.arcanerealms;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.supergamer.arcanerealms.networking.ModMessages;
import net.supergamer.arcanerealms.networking.packet.WandUseC2SPayload;

public class ArcaneRealmsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
    // In your common initializer method
            PayloadTypeRegistry.playS2C().register(WandUseC2SPayload.ID, WandUseC2SPayload.CODEC);

    // In your client-only initializer method
            ClientPlayNetworking.registerGlobalReceiver(WandUseC2SPayload.ID, (payload, context) -> {
                context.client().execute(() -> {


                });
            });
    }
}
