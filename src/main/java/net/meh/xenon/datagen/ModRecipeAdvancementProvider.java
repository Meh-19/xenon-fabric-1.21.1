package net.meh.xenon.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricAdvancementProvider;
import net.meh.xenon.block.ModBlockFamilies;
import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementEntry;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class ModRecipeAdvancementProvider extends FabricAdvancementProvider {

    public ModRecipeAdvancementProvider(
            FabricDataOutput output,
            CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture
    ) {
        super(output, registriesFuture);
    }

    @Override
    public void generateAdvancement(
            RegistryWrapper.WrapperLookup registries,
            Consumer<AdvancementEntry> exporter
    ) {
        for (var family : ModBlockFamilies.STONES) {
            if (family.base() == null) continue;

            Identifier id = Identifier.of(
                    "xenon",
                    family.base().getTranslationKey().replace("block.xenon.", "")
            );

            exporter.accept(
                    new AdvancementEntry(
                            id,
                            Advancement.Builder.create()
                                    .criterion(
                                            "has_base",
                                            InventoryChangedCriterion.Conditions.items(family.base())
                                    )
                                    .build(Identifier.of("minecraft", "recipes/root")).value()
                    )
            );
        }
    }
}
