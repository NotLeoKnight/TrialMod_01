package com.NotLeoKnight.trialmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier LEAD = new ForgeTier(3, 1200, 1.5f, 3f, 10, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.RAW_LEAD.get()));

    public static final ForgeTier ORICHALCUM = new ForgeTier(6, 2500, 12f, 7f, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.RAW_ORICHALCUM.get()));

}
