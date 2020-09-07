package com.tosiv.wildwasteland.armor;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.init.ModItems;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum ModArmorMaterial implements IArmorMaterial {

    CES(WildWastelandMod.MOD_ID + ":ces",
            35,
            new int[]{2,5,6,2},
            8,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            2.0F,
            ()->{return Ingredient.fromItems(ModItems.STEEL_INGOT.get());}),
    COWBOY(WildWastelandMod.MOD_ID + ":cowboy",
            15,
            new int[]{2,5,6,2},
            8,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,
            ()->{return Ingredient.fromItems(Items.LEATHER);}),
    RAGS(WildWastelandMod.MOD_ID + ":rags",
            15,
            new int[]{1,4,5,1},
            8,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,
            ()->{return Ingredient.fromItems(Items.LEATHER);}),
    FLAK(WildWastelandMod.MOD_ID + ":flak",
            30,
            new int[]{2,5,6,2},
            8,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,
            ()->{return Ingredient.fromItems(ModItems.ARMOR_PLATE.get());}),
    DIVING(WildWastelandMod.MOD_ID + ":diving",
            30,
            new int[]{2,5,6,2},
            8,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,
            ()->{return Ingredient.fromItems(ModItems.STEEL_INGOT.get());}),
    PRIEST(WildWastelandMod.MOD_ID + ":priest",
            30,
            new int[]{2,5,6,2},
            8,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,
            ()->{return Ingredient.fromItems(ModItems.ROPE.get());}),
    BEETLE(WildWastelandMod.MOD_ID + ":beetle",
            25,
            new int[]{2,5,6,2},
            16,
            SoundEvents.ITEM_ARMOR_EQUIP_GENERIC,
            0.0F,
            ()->{return Ingredient.fromItems(ModItems.BEETLE_SHELL.get());});



    private static final int[] MAX_DAMAGE_ARRAY = new int[] {11,16,15,13};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final Supplier<Ingredient> repairMaterial;

    ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, Supplier<Ingredient> repairMaterial){
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.repairMaterial = repairMaterial;
    }


    @Override
    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    @Override
    public Ingredient getRepairMaterial() {
        return this.repairMaterial.get();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return 0;
    }
}


