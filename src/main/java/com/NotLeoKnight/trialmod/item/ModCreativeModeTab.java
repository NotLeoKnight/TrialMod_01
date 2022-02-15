package com.NotLeoKnight.trialmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab Trial_Tab = new CreativeModeTab("trialtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.BIGSTICK.get());
        }
    };
}
