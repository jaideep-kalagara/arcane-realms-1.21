package net.supergamer.arcanerealms.networking.packet;


import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityData;
import net.minecraft.network.RegistryByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.math.BlockPos;
import net.supergamer.arcanerealms.networking.ModMessages;

public record WandUseC2SPayload(BlockPos blockPos) implements CustomPayload {
    public static final CustomPayload.Id<WandUseC2SPayload> ID = new CustomPayload.Id<>(ModMessages.WAND_USE_ID);
    public static final PacketCodec<RegistryByteBuf, WandUseC2SPayload> CODEC = PacketCodec.tuple(BlockPos.PACKET_CODEC, WandUseC2SPayload::blockPos, WandUseC2SPayload::new);


    @Override
    public CustomPayload.Id<? extends CustomPayload> getId() {
        return ID;
    }
}