package net.meh.xenon.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;

public final class BlockBuilders {
    private BlockBuilders() {}

    public static AbstractBlock.Settings metalBlock() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.IRON_XYLOPHONE)
                .strength(5.0F, 6.0F)
                .sounds(BlockSoundGroup.METAL)
                ;
    }

    public static AbstractBlock.Settings ore() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(3.0F, 3.0F)
                .sounds(BlockSoundGroup.STONE)
                ;
    }

    public static AbstractBlock.Settings deepslateOre() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(3.0F, 3.0F)
                .sounds(BlockSoundGroup.DEEPSLATE)
                ;
    }

    public static AbstractBlock.Settings log() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.WOOD)
                ;
    }
    public static AbstractBlock.Settings netherLog() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.NETHER_WOOD)
                ;
    }
    public static AbstractBlock.Settings cherryLog() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.CHERRY_WOOD)
                ;
    }

    public static AbstractBlock.Settings fence() {
        return AbstractBlock.Settings.create()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.WOOD)
                .burnable()
                ;
    }

    public static AbstractBlock.Settings fenceGate() {
        return AbstractBlock.Settings.create()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.WOOD)
                .burnable()
                ;
    }

    public static AbstractBlock.Settings oakPressurePlate() {
        return AbstractBlock.Settings.create()
                .solid()
                .instrument(NoteBlockInstrument.BASS)
                .noCollision()
                .strength(0.5F)
                .burnable()
                .pistonBehavior(PistonBehavior.DESTROY)
                ;
    }

    public static AbstractBlock.Settings leaves() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(0.2F)
                .instrument(NoteBlockInstrument.HAT)
                .sounds(BlockSoundGroup.GRASS)
                .nonOpaque()
                ;
    }

    public static AbstractBlock.Settings crown() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.WOOD)
                ;
    }


    public static AbstractBlock.Settings stoneBricks() {
        return AbstractBlock.Settings.create()
                .requiresTool()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(1.5F, 6.0F)
                .sounds(BlockSoundGroup.STONE)
                ;
    }

    public static AbstractBlock.Settings chiseledStone() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(1.5F, 6.0F)
                .sounds(BlockSoundGroup.STONE)
                ;
    }

    public static AbstractBlock.Settings stoneBlock() {
        return AbstractBlock.Settings.create()
                .requiresTool()
                .strength(1.5F, 6.0F)
                .sounds(BlockSoundGroup.STONE)
                .instrument(NoteBlockInstrument.BASEDRUM)
                ;
    }

    public static AbstractBlock.Settings planks() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.WOOD)
                ;
    }
    public static AbstractBlock.Settings crates() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.WOOD)
                ;
    }
    public static AbstractBlock.Settings bambooCrates() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.BAMBOO_WOOD)
                ;
    }
    public static AbstractBlock.Settings cactusCrates() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.WOOL)
                ;
    }
    public static AbstractBlock.Settings carved() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.WOOD)
                ;
    }
    public static AbstractBlock.Settings cherryCarved() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.CHERRY_WOOD)
                ;
    }
    public static AbstractBlock.Settings netherCarved() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.NETHER_WOOD)
                ;
    }
    public static AbstractBlock.Settings oakStairs() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.WOOD)
                ;
    }
    public static AbstractBlock.Settings oakSlab() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.WOOD)
                ;
    }
    public static AbstractBlock.Settings oakButton() {
        return AbstractBlock.Settings.create()
                .burnable()
                .noCollision()
                .strength(0.5F)
                .pistonBehavior(PistonBehavior.DESTROY)
                .sounds(BlockSoundGroup.WOOD)
                ;
    }
    public static AbstractBlock.Settings cherryPlanks() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.CHERRY_WOOD)
                ;
    }
    public static AbstractBlock.Settings netherPlanks() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.NETHER_WOOD)
                ;
    }
    public static AbstractBlock.Settings bambooPlanks() {
        return AbstractBlock.Settings.create()
                .burnable()
                .strength(2.0F, 3.0F)
                .sounds(BlockSoundGroup.BAMBOO)
                ;
    }

    public static AbstractBlock.Settings paperLantern() {
        return AbstractBlock.Settings.create()
                .luminance(state -> 15)
                .breakInstantly()
                .sounds(BlockSoundGroup.SCAFFOLDING)
                ;
    }

    public static AbstractBlock.Settings fungalPaperLantern() {
        return AbstractBlock.Settings.create()
                .luminance(state -> 15)
                .breakInstantly()
                .sounds(BlockSoundGroup.BAMBOO)
                ;
    }
    public static AbstractBlock.Settings shroomLantern() {
        return AbstractBlock.Settings.create()
                .luminance(state -> 15)
                .breakInstantly()
                .sounds(BlockSoundGroup.SHROOMLIGHT)
                ;
    }
    public static AbstractBlock.Settings bambooLantern() {
        return AbstractBlock.Settings.create()
                .luminance(state -> 15)
                .breakInstantly()
                .sounds(BlockSoundGroup.SCAFFOLDING)
                ;
    }

    public static AbstractBlock.Settings packedDirt() {
        return AbstractBlock.Settings.create()
                .strength(0.5F, 0.5F)
                .sounds(BlockSoundGroup.GRAVEL)
                ;
    }

    public static AbstractBlock.Settings packedSand() {
        return AbstractBlock.Settings.create()
                .strength(0.5F, 0.5F)
                .sounds(BlockSoundGroup.SAND)
                ;
    }

    public static AbstractBlock.Settings mineralBrick() {
        return AbstractBlock.Settings.create()
                .strength(5.0F, 6.0F)
                .requiresTool()
                .sounds(BlockSoundGroup.METAL)
                ;
    }

    public static AbstractBlock.Settings netherite() {
        return AbstractBlock.Settings.create()
                .strength(50.0F, 1200.0F)
                .requiresTool()
                .sounds(BlockSoundGroup.NETHERITE)
                ;
    }

    public static AbstractBlock.Settings sand() {
        return AbstractBlock.Settings.create()
                .mapColor(MapColor.PALE_YELLOW)
                .instrument(NoteBlockInstrument.SNARE)
                .strength(0.5F)
                .sounds(BlockSoundGroup.SAND)
                ;
    }

    public static AbstractBlock.Settings dampMossBlock() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(0.1F)
                .sounds(BlockSoundGroup.MOSS_BLOCK)
                .pistonBehavior(PistonBehavior.DESTROY)
                ;
    }

    public static AbstractBlock.Settings grass() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(0.6F)
                .sounds(BlockSoundGroup.GRASS)
                .pistonBehavior(PistonBehavior.DESTROY)
                ;
    }
    public static AbstractBlock.Settings dirt() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(0.6F)
                .sounds(BlockSoundGroup.GRAVEL)
                .pistonBehavior(PistonBehavior.DESTROY)
                ;
    }

    public static AbstractBlock.Settings frost() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(0.1F)
                .noCollision()
                .sounds(BlockSoundGroup.SNOW)
                .pistonBehavior(PistonBehavior.DESTROY)
                ;
    }

    public static AbstractBlock.Settings grimweedBlock() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(0.5F)
                .sounds(BlockSoundGroup.GRASS)
                ;
    }

    public static AbstractBlock.Settings shroomlight() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(1.0F)
                .luminance(state -> 15)
                .sounds(BlockSoundGroup.SHROOMLIGHT)
                ;
    }

    public static AbstractBlock.Settings packedMud() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(0.8F, 0.8F)
                .sounds(BlockSoundGroup.MUD)
                ;
    }

    public static AbstractBlock.Settings echoGlass() {
        return AbstractBlock.Settings.create()
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
                ;
    }

    public static AbstractBlock.Settings aquaGlass() {
        return AbstractBlock.Settings.create()
                .mapColor(MapColor.CLEAR)
                .nonOpaque()
                .allowsSpawning((s, w, p, e) -> false)
                .solidBlock((s, w, p) -> false)
                .suffocates((s, w, p) -> false)
                .blockVision((s, w, p) -> false)
                .strength(0.3F)
                .sounds(BlockSoundGroup.GLASS)
                ;
    }

    public static AbstractBlock.Settings netherBrick() {
        return AbstractBlock.Settings.create()
                .requiresTool()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(1.5F, 6.0F)
                .sounds(BlockSoundGroup.NETHER_BRICKS)
                ;
    }

    public static AbstractBlock.Settings possessed() {
        return AbstractBlock.Settings.create()
                .requiresTool()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(1.5F, 6.0F)
                .luminance(state -> 7)
                .sounds(BlockSoundGroup.STONE)
                ;
    }

    public static AbstractBlock.Settings rockItem() {
        return AbstractBlock.Settings.create()
                .strength(0.0F)
                .noCollision()
                .offset(AbstractBlock.OffsetType.XZ)
                .sounds(BlockSoundGroup.STONE)
                .nonOpaque()
                ;
    }

    public static AbstractBlock.Settings bone() {
        return AbstractBlock.Settings.create()
                .instrument(NoteBlockInstrument.XYLOPHONE)
                .requiresTool()
                .strength(2.0F)
                .sounds(BlockSoundGroup.BONE)
                ;
    }

    public static AbstractBlock.Settings terracottaShingles() {
        return AbstractBlock.Settings.create()
                .requiresTool()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(1.25F, 4.2F)
                .sounds(BlockSoundGroup.STONE)
                ;
    }

    public static AbstractBlock.Settings concreteBricks() {
        return AbstractBlock.Settings.create()
                .requiresTool()
                .instrument(NoteBlockInstrument.BASEDRUM)
                .strength(1.8F)
                .sounds(BlockSoundGroup.STONE)
                ;
    }

    public static AbstractBlock.Settings quiltedWool() {
        return AbstractBlock.Settings.create()
                .burnable()
                .instrument(NoteBlockInstrument.GUITAR)
                .strength(0.8F)
                .sounds(BlockSoundGroup.WOOL)
                ;
    }

    public static AbstractBlock.Settings crystal() {
        return AbstractBlock.Settings.create()
                .sounds(BlockSoundGroup.AMETHYST_CLUSTER)
                .strength(1.5F)
                .noCollision()
                .luminance(state -> 5)
                .pistonBehavior(PistonBehavior.DESTROY)
                .nonOpaque()
                ;
    }

    public static AbstractBlock.Settings crystalBlock() {
        return AbstractBlock.Settings.create()
                .ticksRandomly()
                .strength(1.5F)
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .requiresTool()
                ;
    }

    public static AbstractBlock.Settings crystalLantern() {
        return AbstractBlock.Settings.create()
                .ticksRandomly()
                .strength(1.5F)
                .luminance(state -> 15)
                .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                .requiresTool()
                ;
    }

    public static AbstractBlock.Settings shoji() {
        return AbstractBlock.Settings.create()
                .breakInstantly()
                .sounds(BlockSoundGroup.SCAFFOLDING)
                ;
    }

    public static AbstractBlock.Settings table() {
        return AbstractBlock.Settings.create()
                .requiresTool()
                .strength(2.0F, 3.0F)
                .instrument(NoteBlockInstrument.BASS)
                .sounds(BlockSoundGroup.WOOD)
                ;
    }

    public static AbstractBlock.Settings plants() {
        return AbstractBlock.Settings.create()
                .noCollision()
                .nonOpaque()
                .breakInstantly()
                .sounds(BlockSoundGroup.GRASS)
                .offset(AbstractBlock.OffsetType.XZ)
                .burnable()
                .pistonBehavior(PistonBehavior.DESTROY)
                ;
    }

    public static AbstractBlock.Settings smallLily() {
        return AbstractBlock.Settings.create()
                .noCollision()
                .mapColor(MapColor.DARK_GREEN)
                .breakInstantly()
                .sounds(BlockSoundGroup.GRASS)
                .nonOpaque()
                .pistonBehavior(PistonBehavior.DESTROY)
                ;
    }

    public static AbstractBlock.Settings bramble() {
        return AbstractBlock.Settings.create()
                .noCollision()
                .nonOpaque()
                .ticksRandomly()
                .breakInstantly()
                .sounds(BlockSoundGroup.GRASS)
                .offset(AbstractBlock.OffsetType.XZ)
                .burnable()
                .pistonBehavior(PistonBehavior.DESTROY)
                ;
    }

    public static AbstractBlock.Settings stickPlaceable() {
        return AbstractBlock.Settings.create()
                .noCollision()
                .nonOpaque()
                .breakInstantly()
                .sounds(BlockSoundGroup.WOOD)
                ;
    }

    public static AbstractBlock.Settings vines() {
        return AbstractBlock.Settings.create()
                .noCollision()
                .breakInstantly()
                .ticksRandomly()
                .sounds(BlockSoundGroup.CAVE_VINES)
                .nonOpaque()
                ;
    }

    public static AbstractBlock.Settings mossCover() {
        return AbstractBlock.Settings.create()
                .strength(0.1F)
                .sounds(BlockSoundGroup.MOSS_BLOCK)
                .pistonBehavior(PistonBehavior.DESTROY)
                .noCollision()
                .nonOpaque()
                ;
    }
    public static AbstractBlock.Settings ash() {
        return AbstractBlock.Settings.create()
                .strength(0.1F)
                .sounds(BlockSoundGroup.SOUL_SAND)
                .pistonBehavior(PistonBehavior.DESTROY)
                .noCollision()
                .nonOpaque()
                ;
    }

    public static AbstractBlock.Settings mossHang() {
        return AbstractBlock.Settings.create()
                .noCollision()
                .breakInstantly()
                .ticksRandomly()
                .nonOpaque()
                .sounds(BlockSoundGroup.CAVE_VINES)
                .pistonBehavior(PistonBehavior.DESTROY)
                .noCollision()
                ;
    }

}