package com.NotLeoKnight.trialmod.core.event;

import com.NotLeoKnight.trialmod.TrialMod;
import com.NotLeoKnight.trialmod.common.entity.AtlantianGuard;
import com.NotLeoKnight.trialmod.core.EntityInit;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = TrialMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class CommonModEvents {

    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event) {
        event.put(EntityInit.ATLANTIAN_GUARD.get(), AtlantianGuard.createAttributes().build());
    }
}
