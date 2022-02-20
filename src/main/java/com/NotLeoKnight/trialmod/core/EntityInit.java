package com.NotLeoKnight.trialmod.core;

import com.NotLeoKnight.trialmod.TrialMod;
import com.NotLeoKnight.trialmod.common.entity.AtlantianGuard;
import com.NotLeoKnight.trialmod.item.ModItems;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public final class EntityInit {
    private EntityInit(){}

    public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITIES, TrialMod.MOD_ID);


    public static final RegistryObject<EntityType<AtlantianGuard>> ATLANTIAN_GUARD = ENTITIES.register("atlantian_guard",
            () -> EntityType.Builder.of(AtlantianGuard::new, MobCategory.MONSTER).sized(0.8f, 0.6f)
                    .build(new ResourceLocation(TrialMod.MOD_ID, "atlantian_guard").toString()));
}
