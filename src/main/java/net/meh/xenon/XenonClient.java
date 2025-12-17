package net.meh.xenon;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.meh.xenon.block.entity.ModBlockEntities;
import net.meh.xenon.client.render.EchoGlassBlockEntityRenderer;

public class XenonClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockEntityRendererFactories.register(
                ModBlockEntities.ECHO_GLASS,
                EchoGlassBlockEntityRenderer::new
        );
    }
}
