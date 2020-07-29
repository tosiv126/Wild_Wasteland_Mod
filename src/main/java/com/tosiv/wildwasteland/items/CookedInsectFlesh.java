package com.tosiv.wildwasteland.items;

import com.tosiv.wildwasteland.WildWastelandMod;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CookedInsectFlesh extends Item {
    public CookedInsectFlesh() {
        super(new Item.Properties()
                .group(WildWastelandMod.TAB)
                .food(new Food.Builder()
                        .hunger(8)
                        .saturation(1.2f)
                        .effect(new EffectInstance(Effects.NAUSEA, 80, 1),0.4f)
                        .build())

        );
    }
}
