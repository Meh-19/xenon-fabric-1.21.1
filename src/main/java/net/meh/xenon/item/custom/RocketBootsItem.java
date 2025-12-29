package net.meh.xenon.item.custom;

import io.github.ladysnake.pal.VanillaAbilities;
import net.meh.xenon.ability.ModAbilities;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.NbtComponent;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import java.util.List;

public class RocketBootsItem extends ArmorItem {

    public static final int MAX_FUEL_TICKS = 30 * 60 * 20;

    private static final int PARTICLE_INTERVAL = 4;
    private static final int SOUND_INTERVAL = 5;

    private static final int WARNING_TICKS = 60 * 20;
    private static final String WARNED_KEY = "FuelWarned";

    public RocketBootsItem(RegistryEntry<ArmorMaterial> material, Settings settings) {
        super(material, Type.BOOTS, settings);
    }

    public static ItemStack createWithFullFuel(Item item) {
        ItemStack stack = new ItemStack(item);
        setFuel(stack, MAX_FUEL_TICKS);
        return stack;
    }

    @Override
    public ItemStack getDefaultStack() {
        ItemStack stack = super.getDefaultStack();
        setFuel(stack, MAX_FUEL_TICKS);
        return stack;
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, Entity entity, int slot, boolean selected) {
        if (world.isClient) return;
        if (!(entity instanceof PlayerEntity player)) return;

        // 🚨 ONLY the equipped boots may do anything
        ItemStack equipped = player.getEquippedStack(EquipmentSlot.FEET);
        if (!ItemStack.areEqual(equipped, stack)) return;

        int fuel = getFuel(stack);

        if (fuel <= 0) {
            revokeFlight(player);
            return;
        }

        ModAbilities.ROCKET_BOOTS.grantTo(player, VanillaAbilities.ALLOW_FLYING);

        if (!player.getAbilities().flying) return;

        setFuel(stack, fuel - 1);
        player.fallDistance = 0.0F;

        if (fuel <= WARNING_TICKS) {
            NbtCompound data = getData(stack);
            if (!data.getBoolean(WARNED_KEY)) {
                data.putBoolean(WARNED_KEY, true);
                stack.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(data));

                player.sendMessage(
                        Text.literal("⚠ Rocket boots fuel is running low!")
                                .formatted(Formatting.RED),
                        true
                );
            }
        }

        if (world instanceof ServerWorld serverWorld) {
            Vec3d pos = player.getPos();

            if (world.getTime() % PARTICLE_INTERVAL == 0) {
                serverWorld.spawnParticles(
                        ParticleTypes.FIREWORK,
                        pos.x, pos.y + 0.1, pos.z,
                        2, 0.15, 0.05, 0.15, 0.01
                );
            }

            if (world.getTime() % SOUND_INTERVAL == 0) {
                serverWorld.playSound(
                        null,
                        player.getBlockPos(),
                        SoundEvents.BLOCK_AZALEA_HIT,
                        SoundCategory.PLAYERS,
                        0.85F,
                        0.8F
                );
            }
        }
    }

    private void revokeFlight(PlayerEntity player) {
        ModAbilities.ROCKET_BOOTS.revokeFrom(player, VanillaAbilities.ALLOW_FLYING);

        if (player.isCreative() || player.isSpectator()) return;

        if (player.getAbilities().flying) {
            player.getAbilities().flying = false;
            player.sendAbilitiesUpdate();
        }
    }

    private static NbtCompound getData(ItemStack stack) {
        NbtComponent comp = stack.get(DataComponentTypes.CUSTOM_DATA);
        return comp != null ? comp.copyNbt() : new NbtCompound();
    }

    public static int getFuel(ItemStack stack) {
        return getData(stack).getInt("Fuel");
    }

    public static void setFuel(ItemStack stack, int fuel) {
        NbtCompound tag = getData(stack);
        tag.putInt("Fuel", Math.max(fuel, 0));
        stack.set(DataComponentTypes.CUSTOM_DATA, NbtComponent.of(tag));
    }

    @Override
    public void appendTooltip(
            ItemStack stack,
            Item.TooltipContext context,
            List<Text> tooltip,
            TooltipType type
    ) {
        tooltip.add(Text.literal("Double-jump to fly").formatted(Formatting.AQUA));
        tooltip.add(Text.literal("Creative-style flight").formatted(Formatting.GRAY));
        tooltip.add(Text.literal("Fuel: " + getFuel(stack) / 1200 + " min").formatted(Formatting.YELLOW));
    }
}
