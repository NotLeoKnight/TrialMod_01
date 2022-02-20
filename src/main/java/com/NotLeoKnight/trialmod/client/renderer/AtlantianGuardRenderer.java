package com.NotLeoKnight.trialmod.client.renderer;

import com.NotLeoKnight.trialmod.TrialMod;
import com.NotLeoKnight.trialmod.client.renderer.model.AtlantianGuardModel;
import com.NotLeoKnight.trialmod.common.entity.AtlantianGuard;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;


public class AtlantianGuardRenderer<Type extends AtlantianGuard> extends MobRenderer<Type, AtlantianGuardModel<Type>> {

    private static final ResourceLocation TEXTURE = new ResourceLocation(TrialMod.MOD_ID,
            "textures/entities/atlantian_guard.png");

    public AtlantianGuardRenderer(EntityRendererProvider.Context context) {
        super(context, new AtlantianGuardModel<>(), 0.5f);
    }


    @Override
    public ResourceLocation getTextureLocation(Type entity) {
        return TEXTURE;
    }
}


