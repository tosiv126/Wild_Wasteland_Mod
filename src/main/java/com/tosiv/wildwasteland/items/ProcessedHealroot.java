package com.tosiv.wildwasteland.items;

import com.tosiv.wildwasteland.WildWastelandMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ProcessedHealroot extends Item {
    public ProcessedHealroot() {
        super(new Item.Properties()
                .group(WildWastelandMod.TAB)
                .food(new Food.Builder()
                        .hunger(0)
                        .saturation(0)
                        .fastToEat()
                        .setAlwaysEdible()
                        .effect(new EffectInstance(Effects.INSTANT_HEALTH, 80, 1),1)
                        .effect(new EffectInstance(Effects.REGENERATION, 80,1),0.5f)
                        .build()));
    }
}
