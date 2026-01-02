package net.meh.xenon.block.custom.plants;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.minecraft.block.*;
import net.minecraft.component.type.SuspiciousStewEffectsComponent;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

import java.util.List;

public class ModFlowerBlock extends PlantBlock implements SuspiciousStewIngredient {

    protected static final MapCodec<SuspiciousStewEffectsComponent> STEW_EFFECT_CODEC =
            SuspiciousStewEffectsComponent.CODEC.fieldOf("suspicious_stew_effects");

    public static final MapCodec<ModFlowerBlock> CODEC =
            RecordCodecBuilder.mapCodec(instance ->
                    instance.group(
                            STEW_EFFECT_CODEC.forGetter(ModFlowerBlock::getStewEffects),
                            createSettingsCodec()
                    ).apply(instance, ModFlowerBlock::new)
            );

    protected static final VoxelShape SHAPE =
            Block.createCuboidShape(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    private final SuspiciousStewEffectsComponent stewEffects;


    public ModFlowerBlock(
            RegistryEntry<StatusEffect> stewEffect,
            float effectLengthInSeconds,
            AbstractBlock.Settings settings
    ) {
        this(createStewEffectList(stewEffect, effectLengthInSeconds), settings);
    }

    public ModFlowerBlock(
            SuspiciousStewEffectsComponent stewEffects,
            AbstractBlock.Settings settings
    ) {
        super(settings);
        this.stewEffects = stewEffects;
    }

    protected static SuspiciousStewEffectsComponent createStewEffectList(
            RegistryEntry<StatusEffect> effect,
            float effectLengthInSeconds
    ) {
        return new SuspiciousStewEffectsComponent(
                List.of(
                        new SuspiciousStewEffectsComponent.StewEffect(
                                effect,
                                MathHelper.floor(effectLengthInSeconds * 20.0F)
                        )
                )
        );
    }

    @Override
    public VoxelShape getOutlineShape(
            BlockState state,
            BlockView world,
            BlockPos pos,
            ShapeContext context
    ) {
        Vec3d offset = state.getModelOffset(world, pos);
        return SHAPE.offset(offset.x, offset.y, offset.z);
    }

    @Override
    public SuspiciousStewEffectsComponent getStewEffects() {
        return this.stewEffects;
    }

    @Override
    protected MapCodec<? extends PlantBlock> getCodec() {
        return null;
    }
}
