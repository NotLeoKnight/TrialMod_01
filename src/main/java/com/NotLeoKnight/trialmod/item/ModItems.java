package com.NotLeoKnight.trialmod.item;

import com.NotLeoKnight.trialmod.TrialMod;
import com.NotLeoKnight.trialmod.item.custom.ModArmorRegenItem;
import com.NotLeoKnight.trialmod.item.custom.ModArmorWaterItem;
import com.NotLeoKnight.trialmod.item.custom.PaxelItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TrialMod.MOD_ID);

    public static final RegistryObject<Item> BIGSTICK = ITEMS.register("big_stick",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

//----------------------------------------------------------------------------------------------------------------------

    public static final RegistryObject<Item> RAW_LEAD = ITEMS.register("raw_lead",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> LEAD_PICKAXE = ITEMS.register("lead_pickaxe",
            () -> new PickaxeItem(ModTiers.LEAD, 4, 1.2f,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

//----------------------------------------------------------------------------------------------------------------------

    public static final RegistryObject<Item> RAW_ORICHALCUM = ITEMS.register("raw_orichalcum",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_INGOT = ITEMS.register("orichalcum_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_SWORD = ITEMS.register("orichalcum_sword",
            () -> new SwordItem(ModTiers.ORICHALCUM, 10, 1.6f,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_AXE = ITEMS.register("orichalcum_axe",
            () -> new SwordItem(ModTiers.ORICHALCUM, 12, 1f,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_PICKAXE = ITEMS.register("orichalcum_pickaxe",
            () -> new PickaxeItem(ModTiers.ORICHALCUM, 4, 1.2f,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_SHOVEL = ITEMS.register("orichalcum_shovel",
            () -> new ShovelItem(ModTiers.ORICHALCUM, 0, 1.2f,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_HOE = ITEMS.register("orichalcum_hoe",
            () -> new HoeItem(ModTiers.ORICHALCUM, 0, 1.2f,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_HELMET = ITEMS.register("orichalcum_helmet",
            () -> new ModArmorWaterItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_CHESTPLATE = ITEMS.register("orichalcum_chestplate",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_LEGGINGS = ITEMS.register("orichalcum_leggings",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> ORICHALCUM_BOOTS = ITEMS.register("orichalcum_boots",
            () -> new ArmorItem(ModArmorMaterials.ORICHALCUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

//----------------------------------------------------------------------------------------------------------------------

    public static final RegistryObject<Item> RAW_NECRODERMIS = ITEMS.register("raw_necrodermis",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> NECRODERMIS_INGOT = ITEMS.register("necrodermis_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> NECRODERMIS_HELMET = ITEMS.register("necrodermis_helmet",
            () -> new ModArmorRegenItem(ModArmorMaterials.NECRODERMIS, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> NECRODERMIS_CHESTPLATE = ITEMS.register("necrodermis_chestplate",
            () -> new ArmorItem(ModArmorMaterials.NECRODERMIS, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> NECRODERMIS_LEGGINGS = ITEMS.register("necrodermis_leggings",
            () -> new ArmorItem(ModArmorMaterials.NECRODERMIS, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> NECRODERMIS_BOOTS = ITEMS.register("necrodermis_boots",
            () -> new ArmorItem(ModArmorMaterials.NECRODERMIS, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> NECRODERMIS_PAXEL = ITEMS.register("necrodermis_paxel",
            () -> new PaxelItem(ModTiers.NECRODERMIS, 4, 1.2f,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));

    public static final RegistryObject<Item> NECRODERMIS_SYTHE = ITEMS.register("necrodermis_sythe",
            () -> new SwordItem(ModTiers.NECRODERMIS, 20, 1.4f,
                    new Item.Properties().tab(ModCreativeModeTab.Trial_Tab)));
//----------------------------------------------------------------------------------------------------------------------

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
