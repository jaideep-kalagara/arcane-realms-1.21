package net.supergamer.arcanerealms.networking;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.util.Identifier;
import net.supergamer.arcanerealms.ArcaneRealms;
import net.supergamer.arcanerealms.networking.packet.WandUseC2SPayload;

public class ModMessages {
    public static final Identifier WAND_USE_ID = Identifier.of(ArcaneRealms.MOD_ID, "wand_use_id");

}
