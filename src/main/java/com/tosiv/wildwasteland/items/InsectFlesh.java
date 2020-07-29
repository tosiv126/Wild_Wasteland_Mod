package com.tosiv.wildwasteland.items;

import com.tosiv.wildwasteland.WildWastelandMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class InsectFlesh extends Item {
    public InsectFlesh() {
        super(new Item.Properties()
                .group(WildWastelandMod.TAB)
                .food(new Food.Builder()
                        .hunger(3)
                        .saturation(1f)
                        .effect(new EffectInstance(Effects.NAUSEA, 160, 1),0.5f)
                        .effect(new EffectInstance(Effects.POISON, 20, 1),0.5f)
                        .build())

        );
    }
}
