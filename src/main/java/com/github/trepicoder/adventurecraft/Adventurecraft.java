package com.github.trepicoder.adventurecraft;

import com.github.trepicoder.adventurecraft.lists.ACBlocks;
import com.github.trepicoder.adventurecraft.lists.ACItems;
import com.github.trepicoder.adventurecraft.registries.ACBlockRegistry;
import com.github.trepicoder.adventurecraft.registries.ACColorRegistry;
import com.github.trepicoder.adventurecraft.registries.ACItemRegistry;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Adventurecraft implements ModInitializer {
    public static final String modid = "adventurecraft";

    @Override
    public void onInitialize() {
        ACItemRegistry.register();
        ACBlockRegistry.register();
        ACColorRegistry.register();
    }
}
