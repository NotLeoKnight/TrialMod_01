package com.NotLeoKnight.trialmod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier LEAD = new ForgeTier(3, 1200, 1.5f, 3f, 10, BlockTags.NEEDS_STONE_TOOL,
            () -> Ingredient.of(ModItems.LEAD_INGOT.get()));

    public static final ForgeTier ORICHALCUM = new ForgeTier(6, 2500, 12f, 7f, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ORICHALCUM_INGOT.get()));

    public static final ForgeTier NECRODERMIS = new ForgeTier(7, 4000, 14f, 5f, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.NECRODERMIS_INGOT.get()));

    public static final ForgeTier CAKE = new ForgeTier(3, 750, 7f, 2f, 50, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(Items.CAKE));


}
