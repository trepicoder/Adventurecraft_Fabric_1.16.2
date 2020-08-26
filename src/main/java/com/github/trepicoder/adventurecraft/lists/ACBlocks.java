package com.github.trepicoder.adventurecraft.lists;

import com.github.trepicoder.adventurecraft.blocks.ACCampfire;
import com.github.trepicoder.adventurecraft.blocks.ACFirewood;
import com.github.trepicoder.adventurecraft.blocks.ACLeafBlock;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class ACBlocks {
    public static final Block FIREWOOD_FRESH = new ACFirewood(FabricBlockSettings.of(Material.WOOD).breakByHand(false));
    public static final Block FIREWOOD_SEASONED = new ACFirewood(FabricBlockSettings.of(Material.WOOD));

    public static final Block SUGARMAPLE_LOG = new Block(FabricBlockSettings.of(Material.WOOD));
    public static final Block SUGARMAPLE_PLANKS = new Block(FabricBlockSettings.of(Material.WOOD));
    public static final Block SUGARMAPLE_LEAVES = new ACLeafBlock(FabricBlockSettings.of(Material.LEAVES)
            .sounds(BlockSoundGroup.VINE).nonOpaque());

    public static final Block CAMPFIRE = new ACCampfire(FabricBlockSettings.of(Material.STONE).nonOpaque());
}
