package com.NotLeoKnight.trialmod.item;

import com.NotLeoKnight.trialmod.TrialMod;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.util.Lazy;

import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {
    ORICHALCUM("orichalcum", 30, new int[]{2, 3, 5, 3}, 21,
        SoundEvents.ARMOR_EQUIP_NETHERITE, 4F, 3F, () -> {
            return Ingredient.of(ModItems.ORICHALCUM_INGOT.get());
        }),

    NECRODERMIS("necrodermis", 40, new int[]{2, 3, 5, 3}, 21,
    SoundEvents.ARMOR_EQUIP_NETHERITE, 6F, 3F, () -> {
        return Ingredient.of(ModItems.NECRODERMIS_INGOT.get());
    }),
    CAKE("cake", 25, new int[]{2, 4, 5, 3}, 50,
    SoundEvents.CAKE_ADD_CANDLE, 0, .3F, () -> {
        return Ingredient.of(Items.CAKE);
    }),

    CLOUD("cloud", 25, new int[]{2, 4, 5, 3}, 50,
    SoundEvents.WEATHER_RAIN, 0, .3F, () -> {
        return Ingredient.of(ModItems.CLOUD.get());
    });



    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredient;

    ModArmorMaterials(String name, int durability, int[] slotProtections, int enchantment,
                      SoundEvent sound, float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durability;
        this.slotProtections = slotProtections;
        this.enchantmentValue = enchantment;
        this.sound = sound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = Lazy.of(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return TrialMod.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}