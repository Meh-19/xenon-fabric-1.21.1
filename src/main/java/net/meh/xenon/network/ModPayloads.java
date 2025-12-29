package net.meh.xenon.network;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;

public final class ModPayloads {

    public static void register() {
        PayloadTypeRegistry.playC2S().register(
                RocketTogglePayload.ID,
                RocketTogglePayload.CODEC
        );
    }

    private ModPayloads() {}
}
