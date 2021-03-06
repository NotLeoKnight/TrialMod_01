package com.NotLeoKnight.trialmod;

import com.NotLeoKnight.trialmod.block.ModBlocks;
import com.NotLeoKnight.trialmod.core.EntityInit;
import com.NotLeoKnight.trialmod.item.ModItems;
import com.NotLeoKnight.trialmod.sound.ModSounds;
import com.NotLeoKnight.trialmod.util.ModTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(TrialMod.MOD_ID)
public class TrialMod
{
    public static final String MOD_ID = "trialmod";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();


    public TrialMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModSounds.register(eventBus);
        EntityInit.ENTITIES.register(eventBus);
        ModTags.register();

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }
}
