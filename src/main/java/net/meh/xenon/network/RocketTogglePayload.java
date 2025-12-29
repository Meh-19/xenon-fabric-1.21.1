package net.meh.xenon.network;

import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;

public record RocketTogglePayload() implements CustomPayload {

    public static final Id<RocketTogglePayload> ID =
            new Id<>( Identifier.of("xenon", "rocket_toggle"));

    public static final PacketCodec<Object, RocketTogglePayload> CODEC =
            PacketCodec.unit(new RocketTogglePayload());

    @Override
    public Id<? extends CustomPayload> getId() {
        return ID;
    }
}
