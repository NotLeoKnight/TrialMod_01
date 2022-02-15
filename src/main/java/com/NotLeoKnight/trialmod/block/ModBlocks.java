package com.NotLeoKnight.trialmod.block;

import com.NotLeoKnight.trialmod.TrialMod;
import com.NotLeoKnight.trialmod.item.ModCreativeModeTab;
import com.NotLeoKnight.trialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TrialMod.MOD_ID);

    public static final RegistryObject<Block> LEAD_ORE_BLOCK = registerBlock("lead_ore_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE).strength(3f).requiresCorrectToolForDrops()), ModCreativeModeTab.Trial_Tab);

    public static final RegistryObject<Block> LEAD_BLOCK = registerBlock("lead_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.HEAVY_METAL).strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.Trial_Tab);



    private static  <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
