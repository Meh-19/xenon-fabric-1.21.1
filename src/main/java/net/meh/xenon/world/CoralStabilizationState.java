package net.meh.xenon.world;

import net.minecraft.nbt.NbtCompound;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.PersistentState;

import java.util.HashSet;
import java.util.Set;

public class CoralStabilizationState extends PersistentState {

    public static final Type<CoralStabilizationState> TYPE =
            new Type<>(
                    CoralStabilizationState::new,
                    CoralStabilizationState::fromNbt,
                    null
            );

    private final Set<BlockPos> stabilized = new HashSet<>();

    public CoralStabilizationState() {}

    public static CoralStabilizationState fromNbt(
            NbtCompound nbt,
            WrapperLookup lookup
    ) {
        CoralStabilizationState state = new CoralStabilizationState();

        int[] data = nbt.getIntArray("Positions");
        for (int i = 0; i < data.length; i += 3) {
            state.stabilized.add(new BlockPos(data[i], data[i + 1], data[i + 2]));
        }

        return state;
    }

    @Override
    public NbtCompound writeNbt(
            NbtCompound nbt,
            WrapperLookup lookup
    ) {
        int[] data = new int[stabilized.size() * 3];
        int i = 0;

        for (BlockPos pos : stabilized) {
            data[i++] = pos.getX();
            data[i++] = pos.getY();
            data[i++] = pos.getZ();
        }

        nbt.putIntArray("Positions", data);
        return nbt;
    }


    public boolean isStabilized(BlockPos pos) {
        return stabilized.contains(pos);
    }

    public void add(BlockPos pos) {
        stabilized.add(pos);
        markDirty();
    }

    public void remove(BlockPos pos) {
        stabilized.remove(pos);
        markDirty();
    }

    public static CoralStabilizationState get(ServerWorld world) {
        return world.getPersistentStateManager().getOrCreate(TYPE, "xenon_coral_stabilized");
    }
}
