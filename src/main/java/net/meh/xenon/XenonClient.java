package net.meh.xenon;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.meh.xenon.block.ModBlocks;
import net.meh.xenon.network.RocketBootsPackets;
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
        RocketBootsPackets.register();
        BlockEntityRendererFactories.register(
                ModBlockEntities.ECHO_GLASS,
                EchoGlassBlockEntityRenderer::new
        );
        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.STICK,
                RenderLayer.getCutout()
        );
        BlockRenderLayerMap.INSTANCE.putBlock(
                ModBlocks.AQUARIUM_GLASS,
                RenderLayer.getTranslucent()
        );
        for (Block block : CRYSTALS) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout()
            );
        }
        BlockRenderLayerMap.INSTANCE.putBlocks(
                RenderLayer.getCutout(),

                ModBlocks.AMARYLLIS,
                ModBlocks.CATTAIL,
                ModBlocks.OCULUS_ORCHID,
                ModBlocks.HIBISCUS,

                ModBlocks.TALL_BEACH_GRASS,
                ModBlocks.BEACH_GRASS,

                ModBlocks.BRAMBLE,
                ModBlocks.TALL_BRAMBLE,

                ModBlocks.DRY_BUSH,
                ModBlocks.TALL_DRY_BUSH,

                ModBlocks.DRY_GRASS,
                ModBlocks.TALL_DRY_GRASS,

                ModBlocks.FROSTED_GRASS,
                ModBlocks.TALL_FROSTED_GRASS,

                ModBlocks.GRIMWEED,
                ModBlocks.TALL_GRIMWEED,

                ModBlocks.PALE_GRIMWEED,
                ModBlocks.TALL_PALE_GRIMWEED,

                ModBlocks.HOGWEED,
                ModBlocks.TALL_HOGWEED,

                ModBlocks.ORANGE_MYCENA,
                ModBlocks.TALL_ORANGE_MYCENA,

                ModBlocks.CLOVER,

                ModBlocks.SOUL_STALKS,
                ModBlocks.TALL_SOUL_STALKS,

                ModBlocks.SCULK_VINES,
                ModBlocks.SCULK_VINES_END,
                ModBlocks.WARPED_VEIL,
                ModBlocks.WARPED_VEIL_BOTTOM,
                ModBlocks.DAMP_MOSS_HANG,
                ModBlocks.DAMP_MOSS_HANG_BOTTOM,
                ModBlocks.GRIMOSS_HANG,
                ModBlocks.GRIMOSS_HANG_BOTTOM,
                ModBlocks.DAMP_MOSS,
                ModBlocks.GRIMOSS,
                ModBlocks.ASH,
                ModBlocks.SMALL_LILY,
                ModBlocks.FROST
        );
    }
}
