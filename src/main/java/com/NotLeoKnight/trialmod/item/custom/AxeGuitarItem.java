package com.NotLeoKnight.trialmod.item.custom;

import com.NotLeoKnight.trialmod.sound.ModSounds;
import net.minecraft.client.resources.sounds.Sound;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;

public class AxeGuitarItem extends SwordItem {

    public AxeGuitarItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);

    }


    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        Player player = pContext.getPlayer();
        if (pContext.getLevel().isClientSide) {
            pContext.getLevel().playLocalSound( player.getX(), player.getY(), player.getZ(),  ModSounds.AXE_MUSIC.get(),
                    SoundSource.BLOCKS, 100f, 1f, false);

        }


        return super.useOn(pContext);
    }

}