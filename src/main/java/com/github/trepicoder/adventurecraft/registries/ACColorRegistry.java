package com.github.trepicoder.adventurecraft.registries;

import com.github.trepicoder.adventurecraft.lists.ACBlocks;
import com.github.trepicoder.adventurecraft.lists.ACItems;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;

public class ACColorRegistry {
    public static void register() {
        ColorProviderRegistry.BLOCK.register((state, world, pos, tintIndex) -> 0xEBC934, ACBlocks.SUGARMAPLE_LEAVES);
        ColorProviderRegistry.ITEM.register((stack, tintIndex) -> 0xEBC934, ACItems.SUGARMAPLE_LEAVES);
    }
}
