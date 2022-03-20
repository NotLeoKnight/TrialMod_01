package com.NotLeoKnight.trialmod.util;

import com.NotLeoKnight.trialmod.TrialMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;

public class ModTags {

    public static void  register() {
        Blocks.registerBlockTags();
        Items.registerItemTags();
    }


    public static class Blocks{

//        public static final Tags.IOptionalNamedTag<Block> NAME =
//               tag("name");
        public static final TagKey<Block> PAXEL_MINEABLE =
                tag("mineable/paxel");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(TrialMod.MOD_ID, name));
        }
        private static TagKey<Block> ForgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
        public static void registerBlockTags(){}
    }
    public static class Items{

//        public static final Tags.IOptionalNamedTag<Item> NAME =
//               tag("name");

        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(TrialMod.MOD_ID, name));
        }

        private static TagKey<Item> ForgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
        public static void registerItemTags(){}
    }
}
