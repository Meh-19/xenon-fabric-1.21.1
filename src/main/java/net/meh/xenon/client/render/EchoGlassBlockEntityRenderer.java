package net.meh.xenon.client.render;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.meh.xenon.block.entity.EchoGlassBlockEntity;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.*;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.block.entity.BlockEntityRenderer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;

@Environment(EnvType.CLIENT)
public class EchoGlassBlockEntityRenderer
        implements BlockEntityRenderer<EchoGlassBlockEntity> {

    private final BlockRenderManager blockRenderManager;

    public EchoGlassBlockEntityRenderer(BlockEntityRendererFactory.Context ctx) {
        this.blockRenderManager = ctx.getRenderManager();
    }

    @Override
    public void render(
            EchoGlassBlockEntity entity,
            float tickDelta,
            MatrixStack matrices,
            VertexConsumerProvider vertexConsumers,
            int light,
            int overlay
    ) {
        if (!MinecraftClient.getInstance().player
                .getMainHandStack()
                .isOf(net.meh.xenon.item.ModItems.ECHO_GLASS_ITEM)) {
            return;
        }

        blockRenderManager.renderBlock(
                entity.getCachedState(),
                entity.getPos(),
                entity.getWorld(),
                matrices,
                vertexConsumers.getBuffer(RenderLayer.getTranslucent()),
                false,
                entity.getWorld().random
        );
    }
}