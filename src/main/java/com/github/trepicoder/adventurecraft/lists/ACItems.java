package com.github.trepicoder.adventurecraft.lists;

import com.github.trepicoder.adventurecraft.ACItemGroups;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import org.lwjgl.system.CallbackI;

public class ACItems {
    //========== MISC ITEMS ==========//
    public static final Item PLANTFIBRES = new Item(new Item.Settings()
        .group(ACItemGroups.MISC_ITEMS)
        .maxCount(16));

    public static final Item TWINE = new Item(new Item.Settings()
        .group(ACItemGroups.MISC_ITEMS)
        .maxCount(8));

    public static final Item STICKBUNDLE = new Item(new Item.Settings()
        .group(ACItemGroups.MISC_ITEMS));

    public static final Item TREESAP = new Item(new Item.Settings()
        .group(ACItemGroups.MISC_ITEMS));


    //========== TOOL ITEMS ==========//
    public static final Item WOODEN_TREETAP = new Item(new Item.Settings()
        .group(ACItemGroups.TOOL_ITEMS));


    //========== BUILDING BLOCKS ==========//
    public static final Item FIREWOOD_FRESH = new BlockItem(ACBlocks.FIREWOOD_FRESH, new Item.Settings()
        .group(ACItemGroups.BUILDING_BLOCKS));
    public static final Item FIREWOOD_SEASONED = new BlockItem(ACBlocks.FIREWOOD_SEASONED, new Item.Settings()
        .group(ACItemGroups.BUILDING_BLOCKS));

    public static final Item SUGARMAPLE_LOG = new BlockItem(ACBlocks.SUGARMAPLE_LOG, new Item.Settings()
        .group(ACItemGroups.BUILDING_BLOCKS));
    public static final Item SUGARMAPLE_PLANKS = new BlockItem(ACBlocks.SUGARMAPLE_PLANKS, new Item.Settings()
        .group(ACItemGroups.BUILDING_BLOCKS));
    public static final Item SUGARMAPLE_LEAVES = new BlockItem(ACBlocks.SUGARMAPLE_LEAVES, new Item.Settings()
        .group(ACItemGroups.BUILDING_BLOCKS));

    public static final Item CAMPFIRE = new BlockItem(ACBlocks.CAMPFIRE, new Item.Settings()
        .group(ACItemGroups.MISC_ITEMS));
}
