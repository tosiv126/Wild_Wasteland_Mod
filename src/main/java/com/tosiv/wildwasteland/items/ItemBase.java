package com.tosiv.wildwasteland.items;

import com.tosiv.wildwasteland.WildWastelandMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {

    public ItemBase() {
        super(new Item.Properties().group(WildWastelandMod.TAB));
    }
}
