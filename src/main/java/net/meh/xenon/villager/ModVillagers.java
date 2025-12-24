package net.meh.xenon.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.meh.xenon.Xenon;
import net.meh.xenon.block.ModBlocks;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;

public class ModVillagers {

    public static final RegistryKey<PointOfInterestType> MEH_POI_KEY =
            RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, Identifier.of(Xenon.MOD_ID, "meh_poi"));

    public static final PointOfInterestType MEH_POI =
            PointOfInterestHelper.register(
                    Identifier.of(Xenon.MOD_ID, "meh_poi"),
                    1,
                    1,
                    ModBlocks.SALVAGING_TABLE
            );

    public static final VillagerProfession SCAVENGER =
            Registry.register(
                    Registries.VILLAGER_PROFESSION,
                    Identifier.of(Xenon.MOD_ID, "scavenger"),
                    new VillagerProfession(
                            "scavenger",
                            entry -> entry.matchesKey(MEH_POI_KEY),
                            entry -> entry.matchesKey(MEH_POI_KEY),
                            ImmutableSet.of(),
                            ImmutableSet.of(),
                            SoundEvents.ENTITY_VILLAGER_WORK_LIBRARIAN
                    )
            );

    public static void registerVillagers() {
        Xenon.LOGGER.info("Registering Scavenger villager");
    }
}
