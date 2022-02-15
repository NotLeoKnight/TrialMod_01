package com.NotLeoKnight.trialmod.item;

import com.NotLeoKnight.trialmod.TrialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TrialMod.MOD_ID);

    public static final RegistryObject<Item> BIGSTICK = ITEMS.register("big_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> LEAD_ORE = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
