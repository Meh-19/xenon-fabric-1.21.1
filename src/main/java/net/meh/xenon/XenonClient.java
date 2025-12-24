package net.meh.xenon;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.trade.ScavengerTradeInteraction;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;
import net.meh.xenon.block.entity.ModBlockEntities;
import net.meh.xenon.client.render.EchoGlassBlockEntityRenderer;

public class XenonClient implements ClientModInitializer {
    Block[] CRYSTALS = {
            ModBlocks.WHITE_CRYSTAL,
            ModBlocks.RED_CRYSTAL,
            ModBlocks.ORANGE_CRYSTAL,
            ModBlocks.YELLOW_CRYSTAL,
            ModBlocks.GREEN_CRYSTAL,
            ModBlocks.BLUE_CRYSTAL,
            ModBlocks.PURPLE_CRYSTAL
    };
    @Override
    public void onInitializeClient() {
        ScavengerTradeInteraction.register();

        BlockEntityRendererFactories.register(
                ModBlockEntities.ECHO_GLASS,
                EchoGlassBlockEntityRenderer::new
        );
        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.AQUARIUM_GLASS,
                RenderLayer.getTranslucent());
        for (Block block : CRYSTALS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }

    }
}
