package net.meh.xenon.block.entity;

import net.meh.xenon.Xenon;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlockEntities {

    public static final BlockEntityType<EchoGlassBlockEntity> ECHO_GLASS =
            Registry.register(
                    Registries.BLOCK_ENTITY_TYPE,
                    Identifier.of(Xenon.MOD_ID, "echo_glass"),
                    BlockEntityType.Builder.create(
                            EchoGlassBlockEntity::new,
                            ModBlocks.ECHO_GLASS
                    ).build(null)
            );

    public static void register() {}
}
