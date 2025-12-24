package net.meh.xenon.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import net.fabricmc.loader.api.FabricLoader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public final class ConfigManager {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();
    private static final File FILE =
            FabricLoader.getInstance().getConfigDir().resolve("xenon_scavenger.json").toFile();

    public static ScavengerConfig CONFIG;

    public static void load() {
        try {
            if (!FILE.exists()) {
                CONFIG = new ScavengerConfig();
                save();
            } else {
                try (FileReader reader = new FileReader(FILE)) {
                    CONFIG = GSON.fromJson(reader, ScavengerConfig.class);
                }
            }
        } catch (Exception e) {
            CONFIG = new ScavengerConfig();
        }
    }

    private static void save() {
        try (FileWriter writer = new FileWriter(FILE)) {
            GSON.toJson(CONFIG, writer);
        } catch (Exception ignored) {}
    }
}
