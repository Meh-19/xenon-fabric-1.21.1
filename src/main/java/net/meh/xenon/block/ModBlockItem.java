package net.meh.xenon.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;

public class ModBlockItem extends BlockItem {

    public ModBlockItem(Block block, Settings settings) {
        super(block, settings);
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return false;
    }
}
