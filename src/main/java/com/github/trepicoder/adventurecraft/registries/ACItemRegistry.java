package com.github.trepicoder.adventurecraft.registries;

import com.github.trepicoder.adventurecraft.Adventurecraft;
import com.github.trepicoder.adventurecraft.lists.ACItems;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ACItemRegistry {
    public static void register() {
        // ===== MISC =====
        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "plantfibres"), ACItems.PLANTFIBRES);
        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "twine"), ACItems.TWINE);
        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "stickbundle"), ACItems.STICKBUNDLE);
        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "treesap"), ACItems.TREESAP);

        // ===== TOOLS =====
        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "wooden_treetap"), ACItems.WOODEN_TREETAP);

        // ===== BUILDING BLOCKS =====
        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "firewood_fresh"), ACItems.FIREWOOD_FRESH);
        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "firewood_seasoned"), ACItems.FIREWOOD_SEASONED);

        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "sugarmaple_log"), ACItems.SUGARMAPLE_LOG);
        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "sugarmaple_planks"), ACItems.SUGARMAPLE_PLANKS);
        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "sugarmaple_leaves"), ACItems.SUGARMAPLE_LEAVES);

        Registry.register(Registry.ITEM, new Identifier(Adventurecraft.modid, "campfire"), ACItems.CAMPFIRE);
    }
}
