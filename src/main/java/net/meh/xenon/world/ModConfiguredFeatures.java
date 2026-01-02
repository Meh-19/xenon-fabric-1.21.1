package net.meh.xenon.world;

import net.meh.xenon.Xenon;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE_KEY = registerKey("platinum_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RUBY_ORE_KEY = registerKey("ruby_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SLATE_SHEET =

            RegistryKey.of(
                    RegistryKeys.CONFIGURED_FEATURE,
                    Identifier.of(Xenon.MOD_ID, "slate_sheet")
            );

    public static final RegistryKey<ConfiguredFeature<?, ?>> PLATINUM_ORE =
            RegistryKey.of(
                    RegistryKeys.CONFIGURED_FEATURE,
                    Identifier.of(Xenon.MOD_ID, "platinum_ore")
            );

    private static final RuleTest STONE_AND_DEEPSLATE =
            new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldPlatinumOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.PLATINUM_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_PLATINUM_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> overworldRubyOres =
                List.of(OreFeatureConfig.createTarget(stoneReplaceables, ModBlocks.RUBY_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplaceables, ModBlocks.DEEPSLATE_RUBY_ORE.getDefaultState()));

        register(context, PLATINUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldPlatinumOres, 4));
        register(context, RUBY_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldRubyOres, 8));

        context.register(
                SLATE_SHEET,
                new ConfiguredFeature<>(
                        Feature.ORE,
                        new OreFeatureConfig(
                                List.of(
                                        OreFeatureConfig.createTarget(
                                                STONE_AND_DEEPSLATE,
                                                ModBlocks.SLATE.getDefaultState()
                                        )
                                ),
                                48,
                                0.2F
                        )
                )
        );

    }

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Xenon.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
}