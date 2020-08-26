package com.github.trepicoder.adventurecraft.registries;

import com.github.trepicoder.adventurecraft.Adventurecraft;
import com.github.trepicoder.adventurecraft.lists.ACBlocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ACBlockRegistry {
    public static void register() {
        Registry.register(Registry.BLOCK, new Identifier(Adventurecraft.modid, "firewood_fresh"), ACBlocks.FIREWOOD_FRESH);
        Registry.register(Registry.BLOCK, new Identifier(Adventurecraft.modid, "firewood_seasoned"), ACBlocks.FIREWOOD_SEASONED);

        Registry.register(Registry.BLOCK, new Identifier(Adventurecraft.modid, "sugarmaple_log"), ACBlocks.SUGARMAPLE_LOG);
        Registry.register(Registry.BLOCK, new Identifier(Adventurecraft.modid, "sugarmaple_planks"), ACBlocks.SUGARMAPLE_PLANKS);
        Registry.register(Registry.BLOCK, new Identifier(Adventurecraft.modid, "sugarmaple_leaves"), ACBlocks.SUGARMAPLE_LEAVES);
    }
}
