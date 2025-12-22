package net.meh.xenon.block;

import net.meh.xenon.block.custom.PorousDolomiteBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.AbstractBlock;
import com.mojang.serialization.MapCodec;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.meh.xenon.Xenon;
import net.meh.xenon.block.custom.EchoGlassBlock;
import net.meh.xenon.block.custom.DecorationBlock;
import net.minecraft.block.*;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Xenon.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Xenon.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }



    //<editor-fold desc="Platinum">
    public static final Block PLATINUM_BLOCK = registerBlock("platinum_block",
            new Block(AbstractBlock.Settings.create()

                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)

                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_BRICKS = registerBlock("platinum_bricks",
            new Block(AbstractBlock.Settings.create()

                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)

                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_PILLAR = registerBlock("platinum_pillar",
            new PillarBlock(AbstractBlock.Settings.create()

                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)

                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block PLATINUM_ORE = registerBlock("platinum_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()

                            .instrument(NoteBlockInstrument.BASEDRUM)

                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DEEPSLATE_PLATINUM_ORE = registerBlock("deepslate_platinum_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()

                            .instrument(NoteBlockInstrument.BASEDRUM)

                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));
    //</editor-fold>

    //<editor-fold desc="Ruby">
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(AbstractBlock.Settings.create()

                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)

                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_BRICKS = registerBlock("ruby_bricks",
            new Block(AbstractBlock.Settings.create()

                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)

                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_PILLAR = registerBlock("ruby_pillar",
            new PillarBlock(AbstractBlock.Settings.create()

                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)

                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()

                            .instrument(NoteBlockInstrument.BASEDRUM)

                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.STONE)
            ));

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
            new ExperienceDroppingBlock(
                    UniformIntProvider.create(3, 7),
                    AbstractBlock.Settings.create()

                            .instrument(NoteBlockInstrument.BASEDRUM)

                            .strength(3.0F, 3.0F)
                            .sounds(BlockSoundGroup.DEEPSLATE)
            ));
    //</editor-fold>

    //<editor-fold desc="1.5.6 Finished">
    public static final Block MAPLE_LOG = registerBlock("maple_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAPLE_WOOD = registerBlock("maple_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_MAPLE_LOG = registerBlock("stripped_maple_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_MAPLE_WOOD = registerBlock("stripped_maple_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAPLE_PLANKS = registerBlock("maple_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_MAPLE_PLANKS = registerBlock("vertical_maple_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAPLE_PLANKS_CARVED = registerBlock("maple_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAPLE_STAIRS = registerBlock("maple_stairs",
            new StairsBlock(ModBlocks.MAPLE_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAPLE_SLAB = registerBlock("maple_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAPLE_FENCE = registerBlock("maple_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block MAPLE_FENCE_GATE = registerBlock("maple_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block MAPLE_PRESSURE_PLATE = registerBlock("maple_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAPLE_BUTTON = registerBlock("maple_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block MAPLE_BEAM = registerBlock("maple_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block RED_MAPLE_LEAVES = registerBlock("red_maple_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block ORANGE_MAPLE_LEAVES = registerBlock("orange_maple_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block BLEAK_LOG = registerBlock("bleak_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLEAK_WOOD = registerBlock("bleak_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_BLEAK_LOG = registerBlock("stripped_bleak_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_BLEAK_WOOD = registerBlock("stripped_bleak_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLEAK_PLANKS = registerBlock("bleak_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_BLEAK_PLANKS = registerBlock("vertical_bleak_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLEAK_PLANKS_CARVED = registerBlock("bleak_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLEAK_STAIRS = registerBlock("bleak_stairs",
            new StairsBlock(ModBlocks.BLEAK_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLEAK_SLAB = registerBlock("bleak_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLEAK_FENCE = registerBlock("bleak_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block BLEAK_FENCE_GATE = registerBlock("bleak_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block BLEAK_PRESSURE_PLATE = registerBlock("bleak_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLEAK_BUTTON = registerBlock("bleak_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block BLEAK_BEAM = registerBlock("bleak_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLEAK_LEAVES = registerBlock("bleak_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block FIR_LOG = registerBlock("fir_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIR_WOOD = registerBlock("fir_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_FIR_LOG = registerBlock("stripped_fir_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_FIR_WOOD = registerBlock("stripped_fir_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIR_PLANKS = registerBlock("fir_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_FIR_PLANKS = registerBlock("vertical_fir_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIR_PLANKS_CARVED = registerBlock("fir_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIR_STAIRS = registerBlock("fir_stairs",
            new StairsBlock(ModBlocks.FIR_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIR_SLAB = registerBlock("fir_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIR_FENCE = registerBlock("fir_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block FIR_FENCE_GATE = registerBlock("fir_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block FIR_PRESSURE_PLATE = registerBlock("fir_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block FIR_BUTTON = registerBlock("fir_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block FIR_BEAM = registerBlock("fir_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block GREEN_FIR_LEAVES = registerBlock("green_fir_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block ORANGE_FIR_LEAVES = registerBlock("orange_fir_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block PALM_LOG = registerBlock("palm_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PALM_WOOD = registerBlock("palm_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PALM_PLANKS = registerBlock("palm_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_PALM_PLANKS = registerBlock("vertical_palm_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PALM_PLANKS_CARVED = registerBlock("palm_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PALM_STAIRS = registerBlock("palm_stairs",
            new StairsBlock(ModBlocks.PALM_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block PALM_SLAB = registerBlock("palm_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PALM_FENCE = registerBlock("palm_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block PALM_BUTTON = registerBlock("palm_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block PALM_BEAM = registerBlock("palm_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PALM_CROWN = registerBlock("palm_crown",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PALM_LEAVES = registerBlock("palm_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block BAYOU_LOG = registerBlock("bayou_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAYOU_WOOD = registerBlock("bayou_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_BAYOU_LOG = registerBlock("stripped_bayou_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_BAYOU_WOOD = registerBlock("stripped_bayou_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAYOU_PLANKS = registerBlock("bayou_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_BAYOU_PLANKS = registerBlock("vertical_bayou_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAYOU_PLANKS_CARVED = registerBlock("bayou_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAYOU_STAIRS = registerBlock("bayou_stairs",
            new StairsBlock(ModBlocks.BAYOU_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAYOU_SLAB = registerBlock("bayou_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAYOU_FENCE = registerBlock("bayou_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block BAYOU_FENCE_GATE = registerBlock("bayou_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block BAYOU_PRESSURE_PLATE = registerBlock("bayou_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAYOU_BUTTON = registerBlock("bayou_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block BAYOU_BEAM = registerBlock("bayou_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAYOU_LEAVES = registerBlock("bayou_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block WISTERIA_LOG = registerBlock("wisteria_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WISTERIA_WOOD = registerBlock("wisteria_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_WISTERIA_LOG = registerBlock("stripped_wisteria_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_WISTERIA_WOOD = registerBlock("stripped_wisteria_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WISTERIA_PLANKS = registerBlock("wisteria_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_WISTERIA_PLANKS = registerBlock("vertical_wisteria_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WISTERIA_PLANKS_CARVED = registerBlock("wisteria_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WISTERIA_STAIRS = registerBlock("wisteria_stairs",
            new StairsBlock(ModBlocks.WISTERIA_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block WISTERIA_SLAB = registerBlock("wisteria_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WISTERIA_FENCE = registerBlock("wisteria_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block WISTERIA_FENCE_GATE = registerBlock("wisteria_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block WISTERIA_PRESSURE_PLATE = registerBlock("wisteria_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block WISTERIA_BUTTON = registerBlock("wisteria_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block WISTERIA_BEAM = registerBlock("wisteria_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WISTERIA_LEAVES = registerBlock("wisteria_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block WISTERIA_FLOWERS_BLUE = registerBlock("wisteria_flowers_blue",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block WISTERIA_FLOWERS_PINK = registerBlock("wisteria_flowers_pink",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block WISTERIA_FLOWERS_PURPLE = registerBlock("wisteria_flowers_purple",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block WISTERIA_FLOWERS_WHITE = registerBlock("wisteria_flowers_white",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block BAOBAB_LOG = registerBlock("baobab_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAOBAB_WOOD = registerBlock("baobab_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_BAOBAB_LOG = registerBlock("stripped_baobab_log",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block STRIPPED_BAOBAB_WOOD = registerBlock("stripped_baobab_wood",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAOBAB_PLANKS = registerBlock("baobab_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_BAOBAB_PLANKS = registerBlock("vertical_baobab_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAOBAB_PLANKS_CARVED = registerBlock("baobab_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAOBAB_STAIRS = registerBlock("baobab_stairs",
            new StairsBlock(ModBlocks.BAOBAB_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAOBAB_SLAB = registerBlock("baobab_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAOBAB_FENCE = registerBlock("baobab_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block BAOBAB_FENCE_GATE = registerBlock("baobab_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block BAOBAB_PRESSURE_PLATE = registerBlock("baobab_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAOBAB_BUTTON = registerBlock("baobab_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block BAOBAB_BEAM = registerBlock("baobab_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BAOBAB_LEAVES = registerBlock("baobab_leaves",
            new LeavesBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(0.2F)

                    .instrument(NoteBlockInstrument.HAT)

                    .sounds(BlockSoundGroup.GRASS)
                    .nonOpaque()));

    public static final Block FUNGAL_PLANKS = registerBlock("fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_FUNGAL_PLANKS = registerBlock("vertical_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FUNGAL_PLANKS_CARVED = registerBlock("fungal_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FUNGAL_STAIRS = registerBlock("fungal_stairs",
            new StairsBlock(ModBlocks.FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block FUNGAL_SLAB = registerBlock("fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block FUNGAL_FENCE = registerBlock("fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block FUNGAL_FENCE_GATE = registerBlock("fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block FUNGAL_PRESSURE_PLATE = registerBlock("fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block FUNGAL_BUTTON = registerBlock("fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block WHITE_FUNGAL_PLANKS = registerBlock("white_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WHITE_FUNGAL_STAIRS = registerBlock("white_fungal_stairs",
            new StairsBlock(ModBlocks.WHITE_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block WHITE_FUNGAL_SLAB = registerBlock("white_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WHITE_FUNGAL_FENCE = registerBlock("white_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block WHITE_FUNGAL_FENCE_GATE = registerBlock("white_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block WHITE_FUNGAL_PRESSURE_PLATE = registerBlock("white_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block WHITE_FUNGAL_BUTTON = registerBlock("white_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block LIGHT_GRAY_FUNGAL_PLANKS = registerBlock("light_gray_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_GRAY_FUNGAL_STAIRS = registerBlock("light_gray_fungal_stairs",
            new StairsBlock(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_GRAY_FUNGAL_SLAB = registerBlock("light_gray_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_GRAY_FUNGAL_FENCE = registerBlock("light_gray_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block LIGHT_GRAY_FUNGAL_FENCE_GATE = registerBlock("light_gray_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block LIGHT_GRAY_FUNGAL_PRESSURE_PLATE = registerBlock("light_gray_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_GRAY_FUNGAL_BUTTON = registerBlock("light_gray_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block GRAY_FUNGAL_PLANKS = registerBlock("gray_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block GRAY_FUNGAL_STAIRS = registerBlock("gray_fungal_stairs",
            new StairsBlock(ModBlocks.GRAY_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block GRAY_FUNGAL_SLAB = registerBlock("gray_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block GRAY_FUNGAL_FENCE = registerBlock("gray_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block GRAY_FUNGAL_FENCE_GATE = registerBlock("gray_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block GRAY_FUNGAL_PRESSURE_PLATE = registerBlock("gray_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block GRAY_FUNGAL_BUTTON = registerBlock("gray_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block BLACK_FUNGAL_PLANKS = registerBlock("black_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLACK_FUNGAL_STAIRS = registerBlock("black_fungal_stairs",
            new StairsBlock(ModBlocks.BLACK_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLACK_FUNGAL_SLAB = registerBlock("black_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLACK_FUNGAL_FENCE = registerBlock("black_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block BLACK_FUNGAL_FENCE_GATE = registerBlock("black_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block BLACK_FUNGAL_PRESSURE_PLATE = registerBlock("black_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLACK_FUNGAL_BUTTON = registerBlock("black_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block BROWN_FUNGAL_PLANKS = registerBlock("brown_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BROWN_FUNGAL_STAIRS = registerBlock("brown_fungal_stairs",
            new StairsBlock(ModBlocks.BROWN_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BROWN_FUNGAL_SLAB = registerBlock("brown_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BROWN_FUNGAL_FENCE = registerBlock("brown_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block BROWN_FUNGAL_FENCE_GATE = registerBlock("brown_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block BROWN_FUNGAL_PRESSURE_PLATE = registerBlock("brown_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BROWN_FUNGAL_BUTTON = registerBlock("brown_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block RED_FUNGAL_PLANKS = registerBlock("red_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block RED_FUNGAL_STAIRS = registerBlock("red_fungal_stairs",
            new StairsBlock(ModBlocks.RED_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block RED_FUNGAL_SLAB = registerBlock("red_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block RED_FUNGAL_FENCE = registerBlock("red_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block RED_FUNGAL_FENCE_GATE = registerBlock("red_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block RED_FUNGAL_PRESSURE_PLATE = registerBlock("red_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block RED_FUNGAL_BUTTON = registerBlock("red_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block ORANGE_FUNGAL_PLANKS = registerBlock("orange_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block ORANGE_FUNGAL_STAIRS = registerBlock("orange_fungal_stairs",
            new StairsBlock(ModBlocks.ORANGE_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block ORANGE_FUNGAL_SLAB = registerBlock("orange_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block ORANGE_FUNGAL_FENCE = registerBlock("orange_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block ORANGE_FUNGAL_FENCE_GATE = registerBlock("orange_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block ORANGE_FUNGAL_PRESSURE_PLATE = registerBlock("orange_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block ORANGE_FUNGAL_BUTTON = registerBlock("orange_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block YELLOW_FUNGAL_PLANKS = registerBlock("yellow_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOW_FUNGAL_STAIRS = registerBlock("yellow_fungal_stairs",
            new StairsBlock(ModBlocks.YELLOW_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOW_FUNGAL_SLAB = registerBlock("yellow_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOW_FUNGAL_FENCE = registerBlock("yellow_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block YELLOW_FUNGAL_FENCE_GATE = registerBlock("yellow_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block YELLOW_FUNGAL_PRESSURE_PLATE = registerBlock("yellow_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block YELLOW_FUNGAL_BUTTON = registerBlock("yellow_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block LIME_FUNGAL_PLANKS = registerBlock("lime_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIME_FUNGAL_STAIRS = registerBlock("lime_fungal_stairs",
            new StairsBlock(ModBlocks.LIME_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIME_FUNGAL_SLAB = registerBlock("lime_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIME_FUNGAL_FENCE = registerBlock("lime_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block LIME_FUNGAL_FENCE_GATE = registerBlock("lime_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block LIME_FUNGAL_PRESSURE_PLATE = registerBlock("lime_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIME_FUNGAL_BUTTON = registerBlock("lime_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block GREEN_FUNGAL_PLANKS = registerBlock("green_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block GREEN_FUNGAL_STAIRS = registerBlock("green_fungal_stairs",
            new StairsBlock(ModBlocks.GREEN_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block GREEN_FUNGAL_SLAB = registerBlock("green_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block GREEN_FUNGAL_FENCE = registerBlock("green_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block GREEN_FUNGAL_FENCE_GATE = registerBlock("green_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block GREEN_FUNGAL_PRESSURE_PLATE = registerBlock("green_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block GREEN_FUNGAL_BUTTON = registerBlock("green_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block CYAN_FUNGAL_PLANKS = registerBlock("cyan_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block CYAN_FUNGAL_STAIRS = registerBlock("cyan_fungal_stairs",
            new StairsBlock(ModBlocks.CYAN_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block CYAN_FUNGAL_SLAB = registerBlock("cyan_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block CYAN_FUNGAL_FENCE = registerBlock("cyan_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block CYAN_FUNGAL_FENCE_GATE = registerBlock("cyan_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block CYAN_FUNGAL_PRESSURE_PLATE = registerBlock("cyan_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block CYAN_FUNGAL_BUTTON = registerBlock("cyan_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block LIGHT_BLUE_FUNGAL_PLANKS = registerBlock("light_blue_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_BLUE_FUNGAL_STAIRS = registerBlock("light_blue_fungal_stairs",
            new StairsBlock(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_BLUE_FUNGAL_SLAB = registerBlock("light_blue_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_BLUE_FUNGAL_FENCE = registerBlock("light_blue_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block LIGHT_BLUE_FUNGAL_FENCE_GATE = registerBlock("light_blue_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));
    public static final Block LIGHT_BLUE_FUNGAL_PRESSURE_PLATE = registerBlock("light_blue_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block LIGHT_BLUE_FUNGAL_BUTTON = registerBlock("light_blue_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block BLUE_FUNGAL_PLANKS = registerBlock("blue_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLUE_FUNGAL_STAIRS = registerBlock("blue_fungal_stairs",
            new StairsBlock(ModBlocks.BLUE_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLUE_FUNGAL_SLAB = registerBlock("blue_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLUE_FUNGAL_FENCE = registerBlock("blue_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block BLUE_FUNGAL_FENCE_GATE = registerBlock("blue_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block BLUE_FUNGAL_PRESSURE_PLATE = registerBlock("blue_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block BLUE_FUNGAL_BUTTON = registerBlock("blue_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block PURPLE_FUNGAL_PLANKS = registerBlock("purple_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLE_FUNGAL_STAIRS = registerBlock("purple_fungal_stairs",
            new StairsBlock(ModBlocks.PURPLE_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLE_FUNGAL_SLAB = registerBlock("purple_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLE_FUNGAL_FENCE = registerBlock("purple_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block PURPLE_FUNGAL_FENCE_GATE = registerBlock("purple_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block PURPLE_FUNGAL_PRESSURE_PLATE = registerBlock("purple_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block PURPLE_FUNGAL_BUTTON = registerBlock("purple_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block MAGENTA_FUNGAL_PLANKS = registerBlock("magenta_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAGENTA_FUNGAL_STAIRS = registerBlock("magenta_fungal_stairs",
            new StairsBlock(ModBlocks.MAGENTA_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAGENTA_FUNGAL_SLAB = registerBlock("magenta_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAGENTA_FUNGAL_FENCE = registerBlock("magenta_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block MAGENTA_FUNGAL_FENCE_GATE = registerBlock("magenta_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block MAGENTA_FUNGAL_PRESSURE_PLATE = registerBlock("magenta_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block MAGENTA_FUNGAL_BUTTON = registerBlock("magenta_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block PINK_FUNGAL_PLANKS = registerBlock("pink_fungal_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PINK_FUNGAL_STAIRS = registerBlock("pink_fungal_stairs",
            new StairsBlock(ModBlocks.PINK_FUNGAL_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)
                            .instrument(NoteBlockInstrument.BASS)

                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block PINK_FUNGAL_SLAB = registerBlock("pink_fungal_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PINK_FUNGAL_FENCE = registerBlock("pink_fungal_fence",
            new FenceBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)
                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)
                    .solid()
                    .burnable()));

    public static final Block PINK_FUNGAL_FENCE_GATE = registerBlock("pink_fungal_fence_gate",
            new FenceGateBlock(
                    WoodType.OAK,
                    AbstractBlock.Settings.create()
                            .strength(2.0F, 3.0F)
                            .solid()
                            .instrument(NoteBlockInstrument.BASS)

                            .burnable()
            ));

    public static final Block PINK_FUNGAL_PRESSURE_PLATE = registerBlock("pink_fungal_pressure_plate",
            new PressurePlateBlock(BlockSetType.OAK,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)));

    public static final Block PINK_FUNGAL_BUTTON = registerBlock("pink_fungal_button",
            new ButtonBlock(
                    BlockSetType.OAK,
                    30,
                    AbstractBlock.Settings.create()
                            .burnable()
                            .strength(2.0F, 3.0F)

                            .noCollision()
                            .sounds(BlockSoundGroup.WOOD)
            ));

    public static final Block OAK_BEAM = registerBlock("oak_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block SPRUCE_BEAM = registerBlock("spruce_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .burnable()
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BIRCH_BEAM = registerBlock("birch_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block JUNGLE_BEAM = registerBlock("jungle_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block ACACIA_BEAM = registerBlock("acacia_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block DARK_OAK_BEAM = registerBlock("dark_oak_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block MANGROVE_BEAM = registerBlock("mangrove_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block CHERRY_BEAM = registerBlock("cherry_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WARPED_BEAM = registerBlock("warped_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block CRIMSON_BEAM = registerBlock("crimson_beam",
            new PillarBlock(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)

                    .instrument(NoteBlockInstrument.BASS)

                    .sounds(BlockSoundGroup.WOOD)));
    //</editor-fold>

    //<editor-fold desc="1.1.8 Finished">
    public static final Block ANDESITE_BRICKS = registerBlock("andesite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_ANDESITE = registerBlock("chiseled_andesite",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DIORITE_BRICKS = registerBlock("diorite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_DIORITE = registerBlock("chiseled_diorite",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRANITE_BRICKS = registerBlock("granite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_GRANITE = registerBlock("chiseled_granite",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_STONE = registerBlock("chiseled_stone",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_MUD = registerBlock("chiseled_mud",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_MUD = registerBlock("polished_mud",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STAINED_STONE_LIGHT_15 = registerBlock("stained_stone_light_15",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STAINED_STONE_LIGHT_30 = registerBlock("stained_stone_light_30",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STAINED_STONE_DARK_15 = registerBlock("stained_stone_dark_15",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STAINED_STONE_DARK_30 = registerBlock("stained_stone_dark_30",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STAINED_STONE_DARK_45 = registerBlock("stained_stone_dark_45",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STAINED_STONE_DARK_60 = registerBlock("stained_stone_dark_60",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STAINED_STONE_DARK_75 = registerBlock("stained_stone_dark_75",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STAINED_STONE_DARK_90 = registerBlock("stained_stone_dark_90",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STAINED_STONE_DARK_105 = registerBlock("stained_stone_dark_105",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block VERTICAL_OAK_PLANKS = registerBlock("vertical_oak_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_SPRUCE_PLANKS = registerBlock("vertical_spruce_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_BIRCH_PLANKS = registerBlock("vertical_birch_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_JUNGLE_PLANKS = registerBlock("vertical_jungle_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_ACACIA_PLANKS = registerBlock("vertical_acacia_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_DARK_OAK_PLANKS = registerBlock("vertical_dark_oak_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_MANGROVE_PLANKS = registerBlock("vertical_mangrove_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_CHERRY_PLANKS = registerBlock("vertical_cherry_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_CRIMSON_PLANKS = registerBlock("vertical_crimson_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_WARPED_PLANKS = registerBlock("vertical_warped_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block VERTICAL_BAMBOO_PLANKS = registerBlock("vertical_bamboo_planks",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block OAK_PAPER_LANTERN = registerBlock("oak_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block SPRUCE_PAPER_LANTERN = registerBlock("spruce_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block BIRCH_PAPER_LANTERN = registerBlock("birch_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block JUNGLE_PAPER_LANTERN = registerBlock("jungle_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block ACACIA_PAPER_LANTERN = registerBlock("acacia_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block DARK_OAK_PAPER_LANTERN = registerBlock("dark_oak_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block MANGROVE_PAPER_LANTERN = registerBlock("mangrove_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block CHERRY_PAPER_LANTERN = registerBlock("cherry_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block CRIMSON_SHROOM_LANTERN = registerBlock("crimson_shroom_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block WARPED_SHROOM_LANTERN = registerBlock("warped_shroom_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block MAPLE_PAPER_LANTERN = registerBlock("maple_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block BLEAK_PAPER_LANTERN = registerBlock("bleak_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block FIR_PAPER_LANTERN = registerBlock("fir_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block PALM_PAPER_LANTERN = registerBlock("palm_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block BAYOU_PAPER_LANTERN = registerBlock("bayou_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block WISTERIA_PAPER_LANTERN = registerBlock("wisteria_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block FUNGAL_PAPER_LANTERN = registerBlock("fungal_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.BAMBOO)));

    public static final Block BAOBAB_PAPER_LANTERN = registerBlock("baobab_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block BAMBOO_PAPER_LANTERN = registerBlock("bamboo_paper_lantern",
            new Block(AbstractBlock.Settings.create()
                    .luminance(state -> 15)
                    .breakInstantly()
                    .sounds(BlockSoundGroup.SCAFFOLDING)));

    public static final Block OAK_PLANKS_CARVED = registerBlock("oak_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block SPRUCE_PLANKS_CARVED = registerBlock("spruce_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block BIRCH_PLANKS_CARVED = registerBlock("birch_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block JUNGLE_PLANKS_CARVED = registerBlock("jungle_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block ACACIA_PLANKS_CARVED = registerBlock("acacia_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block DARK_OAK_PLANKS_CARVED = registerBlock("dark_oak_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block MANGROVE_PLANKS_CARVED = registerBlock("mangrove_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block CHERRY_PLANKS_CARVED = registerBlock("cherry_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block CRIMSON_PLANKS_CARVED = registerBlock("crimson_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block WARPED_PLANKS_CARVED = registerBlock("warped_planks_carved",
            new Block(AbstractBlock.Settings.create()
                    .burnable()
                    .strength(2.0F, 3.0F)
                    .sounds(BlockSoundGroup.WOOD)));

    public static final Block PACKED_DIRT = registerBlock("packed_dirt",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5F, 0.5F)
                    .sounds(BlockSoundGroup.GRAVEL)));

    public static final Block PACKED_DIRT_SLAB = registerBlock("packed_dirt_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .strength(0.5F, 0.5F)
                    .sounds(BlockSoundGroup.GRAVEL)));

    public static final Block PACKED_SAND = registerBlock("packed_sand",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5F, 0.5F)
                    .sounds(BlockSoundGroup.SAND)));

    public static final Block PACKED_RED_SAND = registerBlock("packed_red_sand",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5F, 0.5F)
                    .sounds(BlockSoundGroup.SAND)));


    public static final Block DIAMOND_BRICK = registerBlock("diamond_brick",
            new Block(AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block DIAMOND_PILLAR = registerBlock("diamond_pillar",
            new PillarBlock(AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block EMERALD_BRICK = registerBlock("emerald_brick",
            new Block(AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block EMERALD_PILLAR = registerBlock("emerald_pillar",
            new PillarBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BIT)
                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block GOLD_BRICK = registerBlock("gold_brick",
            new Block(AbstractBlock.Settings.create()
                    .strength(3.0F, 6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block GOLD_PILLAR = registerBlock("gold_pillar",
            new PillarBlock(AbstractBlock.Settings.create()
                    .requiresTool()

                    .instrument(NoteBlockInstrument.BELL)
                    .strength(3.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block IRON_BRICK = registerBlock("iron_brick",
            new Block(AbstractBlock.Settings.create()
                    .strength(5.0F, 6.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block IRON_PILLAR = registerBlock("iron_pillar",
            new PillarBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                    .strength(5.0F, 6.0F)
                    .sounds(BlockSoundGroup.METAL)));

    public static final Block NETHERITE_BRICK = registerBlock("netherite_brick",
            new Block(AbstractBlock.Settings.create()
                    .strength(50.0F, 1200.0F)
                    .requiresTool()
                    .sounds(BlockSoundGroup.NETHERITE)));

    public static final Block NETHERITE_PILLAR = registerBlock("netherite_pillar",
            new PillarBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(50.0F, 1200.0F)
                    .sounds(BlockSoundGroup.NETHERITE)));
    //</editor-fold>

    //<editor-fold desc="V1.2.1 Finished">
    public static final Block ASHEN_SAND = registerBlock("ashen_sand",
            new FallingBlock(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.0F, 3.0F)
                    .sounds(BlockSoundGroup.SAND)) {
                @Override
                protected MapCodec<? extends FallingBlock> getCodec() {
                    return null;
                }
            });

    public static final Block ASHEN_SANDSTONE = registerBlock("ashen_sandstone",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SMOOTH_ASHEN_SANDSTONE = registerBlock("smooth_ashen_sandstone",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));


    public static final Block CHISELED_ASHEN_SANDSTONE = registerBlock("chiseled_ashen_sandstone",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CUT_ASHEN_SANDSTONE = registerBlock("cut_ashen_sandstone",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DAMP_MOSS_BLOCK = registerBlock("damp_moss_block",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRIMOSS = registerBlock("grimoss",
            new CarpetBlock(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block PERMAFROST = registerBlock("permafrost",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.6F)
                    .sounds(BlockSoundGroup.GRASS)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block FROST = registerBlock("frost",
            new CarpetBlock(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.SNOW)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block DAMP_MOSS = registerBlock("damp_moss",
            new CarpetBlock(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block GRIMOSS_BLOCK = registerBlock("grimoss_block",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.1F)
                    .sounds(BlockSoundGroup.MOSS_BLOCK)
                    .pistonBehavior(PistonBehavior.DESTROY)));


    public static final Block GRIMWEED_BLOCK = registerBlock("grimweed_block",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.GRASS)));

    public static final Block PACKED_ASHEN_SAND = registerBlock("packed_ashen_sand",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.0F)
                    .sounds(BlockSoundGroup.SAND)));


    public static final Block PALE_GRIMWEED_BLOCK = registerBlock("pale_grimweed_block",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.5F)
                    .sounds(BlockSoundGroup.GRASS)));

    public static final Block BLIGHTED_SHROOMLIGHT = registerBlock("blighted_shroomlight",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.0F)
                    .luminance(state -> 15)
                    .sounds(BlockSoundGroup.SHROOMLIGHT)));

    public static final Block LIMESTONE = registerBlock("limestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block LIMESTONE_STAIRS = registerBlock("limestone_stairs",
            new StairsBlock(ModBlocks.LIMESTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block LIMESTONE_SLAB = registerBlock("limestone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block LIMESTONE_WALL = registerBlock("limestone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_LIMESTONE = registerBlock("chiseled_limestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block LIMESTONE_BRICKS = registerBlock("limestone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block LIMESTONE_BRICKS_STAIRS = registerBlock("limestone_bricks_stairs",
            new StairsBlock(ModBlocks.LIMESTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block LIMESTONE_BRICKS_SLAB = registerBlock("limestone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block LIMESTONE_BRICKS_WALL = registerBlock("limestone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_LIMESTONE = registerBlock("polished_limestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_LIMESTONE_STAIRS = registerBlock("polished_limestone_stairs",
            new StairsBlock(ModBlocks.POLISHED_LIMESTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_LIMESTONE_SLAB = registerBlock("polished_limestone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_LIMESTONE_WALL = registerBlock("polished_limestone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SANDY_LIMESTONE_BRICKS = registerBlock("sandy_limestone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SANDY_LIMESTONE_BRICKS_STAIRS = registerBlock("sandy_limestone_bricks_stairs",
            new StairsBlock(ModBlocks.SANDY_LIMESTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block SANDY_LIMESTONE_BRICKS_SLAB = registerBlock("sandy_limestone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SANDY_LIMESTONE_BRICKS_WALL = registerBlock("sandy_limestone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRIMROCK = registerBlock("grimrock",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRIMROCK_STAIRS = registerBlock("grimrock_stairs",
            new StairsBlock(ModBlocks.GRIMROCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block GRIMROCK_SLAB = registerBlock("grimrock_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRIMROCK_WALL = registerBlock("grimrock_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_GRIMROCK = registerBlock("chiseled_grimrock",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block COBBLED_GRIMROCK = registerBlock("cobbled_grimrock",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block COBBLED_GRIMROCK_STAIRS = registerBlock("cobbled_grimrock_stairs",
            new StairsBlock(ModBlocks.COBBLED_GRIMROCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block COBBLED_GRIMROCK_SLAB = registerBlock("cobbled_grimrock_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block COBBLED_GRIMROCK_WALL = registerBlock("cobbled_grimrock_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_GRIMROCK_BRICKS = registerBlock("cracked_grimrock_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_GRIMROCK_BRICKS_STAIRS = registerBlock("cracked_grimrock_bricks_stairs",
            new StairsBlock(ModBlocks.CRACKED_GRIMROCK_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_GRIMROCK_BRICKS_SLAB = registerBlock("cracked_grimrock_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CRACKED_GRIMROCK_BRICKS_WALL = registerBlock("cracked_grimrock_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRIMROCK_BRICKS = registerBlock("grimrock_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRIMROCK_BRICKS_STAIRS = registerBlock("grimrock_bricks_stairs",
            new StairsBlock(ModBlocks.GRIMROCK_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block GRIMROCK_BRICKS_SLAB = registerBlock("grimrock_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRIMROCK_BRICKS_WALL = registerBlock("grimrock_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_GRIMROCK_BRICKS = registerBlock("mossy_grimrock_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_GRIMROCK_BRICKS_STAIRS = registerBlock("mossy_grimrock_bricks_stairs",
            new StairsBlock(ModBlocks.MOSSY_GRIMROCK_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_GRIMROCK_BRICKS_SLAB = registerBlock("mossy_grimrock_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_GRIMROCK_BRICKS_WALL = registerBlock("mossy_grimrock_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_GRIMROCK = registerBlock("polished_grimrock",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_GRIMROCK_STAIRS = registerBlock("polished_grimrock_stairs",
            new StairsBlock(ModBlocks.POLISHED_GRIMROCK.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_GRIMROCK_SLAB = registerBlock("polished_grimrock_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_GRIMROCK_WALL = registerBlock("polished_grimrock_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block LOAM = registerBlock("loam",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_PACKED_LOAM = registerBlock("chiseled_packed_loam",
            new Block(AbstractBlock.Settings.create()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(0.8F, 0.8F)
                    .sounds(BlockSoundGroup.MUD)));

    public static final Block MOSSY_PACKED_LOAM_BRICKS = registerBlock("mossy_packed_loam_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_PACKED_LOAM_BRICKS_STAIRS = registerBlock("mossy_packed_loam_bricks_stairs",
            new StairsBlock(ModBlocks.MOSSY_PACKED_LOAM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_PACKED_LOAM_BRICKS_SLAB = registerBlock("mossy_packed_loam_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block MOSSY_PACKED_LOAM_BRICKS_WALL = registerBlock("mossy_packed_loam_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_LOAM = registerBlock("packed_loam",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_LOAM_STAIRS = registerBlock("packed_loam_stairs",
            new StairsBlock(ModBlocks.PACKED_LOAM.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_LOAM_SLAB = registerBlock("packed_loam_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_LOAM_WALL = registerBlock("packed_loam_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_LOAM_BRICKS = registerBlock("packed_loam_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_LOAM_BRICKS_STAIRS = registerBlock("packed_loam_bricks_stairs",
            new StairsBlock(ModBlocks.PACKED_LOAM_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_LOAM_BRICKS_SLAB = registerBlock("packed_loam_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_LOAM_BRICKS_WALL = registerBlock("packed_loam_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DRIED_SILT = registerBlock("dried_silt",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DRIED_SILT_STAIRS = registerBlock("dried_silt_stairs",
            new StairsBlock(ModBlocks.DRIED_SILT.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block DRIED_SILT_SLAB = registerBlock("dried_silt_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DRIED_SILT_WALL = registerBlock("dried_silt_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SILT = registerBlock("polished_silt",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SILT_STAIRS = registerBlock("polished_silt_stairs",
            new StairsBlock(ModBlocks.POLISHED_SILT.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SILT_SLAB = registerBlock("polished_silt_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SILT_WALL = registerBlock("polished_silt_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SILT_BRICKS = registerBlock("silt_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SILT_BRICKS_STAIRS = registerBlock("silt_bricks_stairs",
            new StairsBlock(ModBlocks.SILT_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block SILT_BRICKS_SLAB = registerBlock("silt_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SILT_BRICKS_WALL = registerBlock("silt_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));



    public static final Block SILT = registerBlock("silt",
            new Block(AbstractBlock.Settings.create()
                    .strength(0.5F, 0.5F)
                    .sounds(BlockSoundGroup.GRAVEL)));

    public static final Block CHISELED_SILT_BRICKS = registerBlock("chiseled_silt_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE = registerBlock("slate",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_STAIRS = registerBlock("slate_stairs",
            new StairsBlock(ModBlocks.SLATE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_SLAB = registerBlock("slate_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_WALL = registerBlock("slate_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_SLATE = registerBlock("chiseled_slate",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SLATE = registerBlock("polished_slate",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SLATE_STAIRS = registerBlock("polished_slate_stairs",
            new StairsBlock(ModBlocks.POLISHED_SLATE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SLATE_SLAB = registerBlock("polished_slate_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SLATE_WALL = registerBlock("polished_slate_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_BRICKS = registerBlock("slate_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_BRICKS_STAIRS = registerBlock("slate_bricks_stairs",
            new StairsBlock(ModBlocks.SLATE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_BRICKS_SLAB = registerBlock("slate_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SLATE_BRICKS_WALL = registerBlock("slate_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STRATA = registerBlock("strata",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STRATA_STAIRS = registerBlock("strata_stairs",
            new StairsBlock(ModBlocks.STRATA.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block STRATA_SLAB = registerBlock("strata_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STRATA_WALL = registerBlock("strata_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_STRATA = registerBlock("chiseled_strata",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_STRATA = registerBlock("polished_strata",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_STRATA_STAIRS = registerBlock("polished_strata_stairs",
            new StairsBlock(ModBlocks.POLISHED_STRATA.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_STRATA_SLAB = registerBlock("polished_strata_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_STRATA_WALL = registerBlock("polished_strata_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STRATA_BRICKS = registerBlock("strata_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STRATA_BRICKS_STAIRS = registerBlock("strata_bricks_stairs",
            new StairsBlock(ModBlocks.STRATA_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block STRATA_BRICKS_SLAB = registerBlock("strata_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block STRATA_BRICKS_WALL = registerBlock("strata_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));


    public static final Block CHISELED_POLISHED_BASALT = registerBlock("chiseled_polished_basalt",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CUT_POLISHED_BASALT = registerBlock("cut_polished_basalt",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CUT_POLISHED_BASALT_STAIRS = registerBlock("cut_polished_basalt_stairs",
            new StairsBlock(ModBlocks.CUT_POLISHED_BASALT.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block CUT_POLISHED_BASALT_SLAB = registerBlock("cut_polished_basalt_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CUT_POLISHED_BASALT_WALL = registerBlock("cut_polished_basalt_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_BASALT_BRICKS = registerBlock("polished_basalt_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_BASALT_BRICKS_STAIRS = registerBlock("polished_basalt_bricks_stairs",
            new StairsBlock(ModBlocks.POLISHED_BASALT_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_BASALT_BRICKS_SLAB = registerBlock("polished_basalt_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_BASALT_BRICKS_WALL = registerBlock("polished_basalt_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_BASALT_TILES = registerBlock("polished_basalt_tiles",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_BASALT_TILES_STAIRS = registerBlock("polished_basalt_tiles_stairs",
            new StairsBlock(ModBlocks.POLISHED_BASALT_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_BASALT_TILES_SLAB = registerBlock("polished_basalt_tiles_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_BASALT_TILES_WALL = registerBlock("polished_basalt_tiles_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));


    public static final Block ECHO_GLASS = Registry.register(
            Registries.BLOCK,
            Identifier.of(Xenon.MOD_ID, "echo_glass"),
            new EchoGlassBlock(
                    AbstractBlock.Settings.create()
                            .pistonBehavior(PistonBehavior.BLOCK)
                            .instrument(NoteBlockInstrument.HAT)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.STONE)
                            .allowsSpawning(Blocks::never)
                            .solidBlock(Blocks::never)
                            .nonOpaque()
                            .allowsSpawning(Blocks::never)
                            .blockVision((s, w, p) -> false)
                            .suffocates((s, w, p) -> false)

            )

    );

    public static final Block AQUARIUM_GLASS = Registry.register(
            Registries.BLOCK,
            Identifier.of(Xenon.MOD_ID, "aquarium_glass"),
            new TransparentBlock(
                    AbstractBlock.Settings.create()
                            .mapColor(MapColor.CLEAR)
                            .nonOpaque()
                            .allowsSpawning((s, w, p, e) -> false)
                            .solidBlock((s, w, p) -> false)
                            .suffocates((s, w, p) -> false)
                            .blockVision((s, w, p) -> false)
                            .strength(0.3F)
                            .sounds(BlockSoundGroup.GLASS)
            )

    );

    public static final Block GRAVESTONE = registerBlock("gravestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRAVESTONE_STAIRS = registerBlock("gravestone_stairs",
            new StairsBlock(ModBlocks.GRAVESTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block GRAVESTONE_SLAB = registerBlock("gravestone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRAVESTONE_WALL = registerBlock("gravestone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_GRAVESTONE = registerBlock("chiseled_gravestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRAVESTONE_BRICKS = registerBlock("gravestone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRAVESTONE_BRICKS_STAIRS = registerBlock("gravestone_bricks_stairs",
            new StairsBlock(ModBlocks.GRAVESTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block GRAVESTONE_BRICKS_SLAB = registerBlock("gravestone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block GRAVESTONE_BRICKS_WALL = registerBlock("gravestone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_GRAVESTONE = registerBlock("polished_gravestone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_GRAVESTONE_STAIRS = registerBlock("polished_gravestone_stairs",
            new StairsBlock(ModBlocks.POLISHED_GRAVESTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_GRAVESTONE_SLAB = registerBlock("polished_gravestone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_GRAVESTONE_WALL = registerBlock("polished_gravestone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DRIPSTONE_BRICKS = registerBlock("dripstone_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DRIPSTONE_BRICKS_STAIRS = registerBlock("dripstone_bricks_stairs",
            new StairsBlock(ModBlocks.DRIPSTONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block DRIPSTONE_BRICKS_SLAB = registerBlock("dripstone_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DRIPSTONE_BRICKS_WALL = registerBlock("dripstone_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DRIPSTONE = registerBlock("polished_dripstone",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs",
            new StairsBlock(ModBlocks.POLISHED_DRIPSTONE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DRIPSTONE_WALL = registerBlock("polished_dripstone_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICKS_STAIRS = registerBlock("blue_nether_bricks_stairs",
            new StairsBlock(ModBlocks.BLUE_NETHER_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICKS_SLAB = registerBlock("blue_nether_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block BLUE_NETHER_BRICKS_WALL = registerBlock("blue_nether_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block POLISHED_BLUE_NETHER_BRICKS = registerBlock("polished_blue_nether_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block POLISHED_NETHER_BRICKS = registerBlock("polished_nether_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block POLISHED_RED_NETHER_BRICKS = registerBlock("polished_red_nether_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block TAINTED_NETHER_BRICKS = registerBlock("tainted_nether_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block TAINTED_NETHER_BRICKS_STAIRS = registerBlock("tainted_nether_bricks_stairs",
            new StairsBlock(ModBlocks.TAINTED_NETHER_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block TAINTED_NETHER_BRICKS_SLAB = registerBlock("tainted_nether_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block TAINTED_NETHER_BRICKS_WALL = registerBlock("tainted_nether_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.NETHER_BRICKS)));

    public static final Block CHISELED_SOUL_BRICKS = registerBlock("chiseled_soul_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SOULSAND = registerBlock("polished_soulsand",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SOULSAND_STAIRS = registerBlock("polished_soulsand_stairs",
            new StairsBlock(ModBlocks.POLISHED_SOULSAND.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SOULSAND_SLAB = registerBlock("polished_soulsand_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_SOULSAND_WALL = registerBlock("polished_soulsand_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POSSESSED_CHISELED_SOUL_BRICKS = registerBlock("possessed_chiseled_soul_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .luminance(state -> 7)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SOUL_BRICKS = registerBlock("soul_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SOUL_BRICKS_STAIRS = registerBlock("soul_bricks_stairs",
            new StairsBlock(ModBlocks.SOUL_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block SOUL_BRICKS_SLAB = registerBlock("soul_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SOUL_BRICKS_WALL = registerBlock("soul_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_SNOW_BRICKS = registerBlock("chiseled_snow_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_SNOW = registerBlock("packed_snow",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_SNOW_STAIRS = registerBlock("packed_snow_stairs",
            new StairsBlock(ModBlocks.PACKED_SNOW.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_SNOW_SLAB = registerBlock("packed_snow_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_SNOW_WALL = registerBlock("packed_snow_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SNOW_BRICKS = registerBlock("snow_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SNOW_BRICKS_STAIRS = registerBlock("snow_bricks_stairs",
            new StairsBlock(ModBlocks.SNOW_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block SNOW_BRICKS_SLAB = registerBlock("snow_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block SNOW_BRICKS_WALL = registerBlock("snow_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_PACKED_ICE_BRICKS = registerBlock("chiseled_packed_ice_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_ICE_BRICKS = registerBlock("packed_ice_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_ICE_BRICKS_STAIRS = registerBlock("packed_ice_bricks_stairs",
            new StairsBlock(ModBlocks.PACKED_ICE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_ICE_BRICKS_SLAB = registerBlock("packed_ice_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PACKED_ICE_BRICKS_WALL = registerBlock("packed_ice_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_PACKED_ICE = registerBlock("polished_packed_ice",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_PACKED_ICE_STAIRS = registerBlock("polished_packed_ice_stairs",
            new StairsBlock(ModBlocks.POLISHED_PACKED_ICE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_PACKED_ICE_SLAB = registerBlock("polished_packed_ice_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_PACKED_ICE_WALL = registerBlock("polished_packed_ice_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_PRISMARINE = registerBlock("chiseled_prismarine",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_PRISMARINE = registerBlock("polished_prismarine",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_PRISMARINE_STAIRS = registerBlock("polished_prismarine_stairs",
            new StairsBlock(ModBlocks.POLISHED_PRISMARINE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_PRISMARINE_SLAB = registerBlock("polished_prismarine_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_PRISMARINE_WALL = registerBlock("polished_prismarine_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PRISMARINE_PILLAR = registerBlock("prismarine_pillar",
            new PillarBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PRISMARINE_TILES = registerBlock("prismarine_tiles",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PRISMARINE_TILES_STAIRS = registerBlock("prismarine_tiles_stairs",
            new StairsBlock(ModBlocks.PRISMARINE_TILES.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block PRISMARINE_TILES_SLAB = registerBlock("prismarine_tiles_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block PRISMARINE_TILES_WALL = registerBlock("prismarine_tiles_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block ROCK = registerBlock(
            "rock",
            new DecorationBlock(AbstractBlock.Settings.create()
                    .strength(0.0F)
                    .noCollision()
                    .offset(AbstractBlock.OffsetType.XZ)
                    .sounds(BlockSoundGroup.STONE)
                    .nonOpaque())

    );

    public static final Block PEBBLES = registerBlock(
            "pebbles",
            new DecorationBlock(AbstractBlock.Settings.create()
                    .strength(0.0F)
                    .noCollision()
                    .offset(AbstractBlock.OffsetType.XZ)
                    .sounds(BlockSoundGroup.STONE)
                    .nonOpaque())

    );

    public static final Block DOLOMITE = registerBlock("dolomite",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POROUS_DOLOMITE = registerBlock("porous_dolomite",
            new PorousDolomiteBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));


    public static final Block DOLOMITE_STAIRS = registerBlock("dolomite_stairs",
            new StairsBlock(ModBlocks.DOLOMITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block DOLOMITE_SLAB = registerBlock("dolomite_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DOLOMITE_WALL = registerBlock("dolomite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block CHISELED_DOLOMITE = registerBlock("chiseled_dolomite",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DOLOMITE = registerBlock("polished_dolomite",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DOLOMITE_STAIRS = registerBlock("polished_dolomite_stairs",
            new StairsBlock(ModBlocks.POLISHED_DOLOMITE.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DOLOMITE_SLAB = registerBlock("polished_dolomite_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block POLISHED_DOLOMITE_WALL = registerBlock("polished_dolomite_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DOLOMITE_BRICKS = registerBlock("dolomite_bricks",
            new Block(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DOLOMITE_BRICKS_STAIRS = registerBlock("dolomite_bricks_stairs",
            new StairsBlock(ModBlocks.DOLOMITE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create()
                            .requiresTool()
                            .instrument(NoteBlockInstrument.BASEDRUM)
                            .strength(1.5F, 6.0F)
                            .sounds(BlockSoundGroup.STONE)));

    public static final Block DOLOMITE_BRICKS_SLAB = registerBlock("dolomite_bricks_slab",
            new SlabBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DOLOMITE_BRICKS_WALL = registerBlock("dolomite_bricks_wall",
            new WallBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));

    public static final Block DOLOMITE_PILLAR = registerBlock("dolomite_pillar",
            new PillarBlock(AbstractBlock.Settings.create()
                    .requiresTool()
                    .instrument(NoteBlockInstrument.BASEDRUM)
                    .strength(1.5F, 6.0F)
                    .sounds(BlockSoundGroup.STONE)));
    //</editor-fold>


    public static void registerModBlocks() {
        Xenon.LOGGER.info("Registering Mod Blocks for " + Xenon.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
        });
    }
}
