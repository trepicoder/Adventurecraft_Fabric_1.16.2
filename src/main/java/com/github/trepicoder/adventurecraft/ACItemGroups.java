package com.github.trepicoder.adventurecraft;

import com.github.trepicoder.adventurecraft.lists.ACItems;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ACItemGroups {
    public static final ItemGroup MISC_ITEMS = FabricItemGroupBuilder.create(
        new Identifier(Adventurecraft.modid, "miscitems"))
            .icon(() -> new ItemStack(ACItems.PLANTFIBRES))
            .build();

    public static final ItemGroup TOOL_ITEMS = FabricItemGroupBuilder.create(
        new Identifier(Adventurecraft.modid, "toolitems"))
            .icon(() -> new ItemStack(ACItems.WOODEN_TREETAP))
            .build();

    public static final ItemGroup BUILDING_BLOCKS = FabricItemGroupBuilder.create(
        new Identifier(Adventurecraft.modid, "buildingblocks"))
            .icon(() -> new ItemStack(ACItems.FIREWOOD_SEASONED))
            .build();
}
