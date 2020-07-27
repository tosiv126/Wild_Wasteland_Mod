package com.tosiv.wildwasteland.init;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.blocks.BlockItemBase;
import com.tosiv.wildwasteland.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WildWastelandMod.MOD_ID);

    //Items
    public static final RegistryObject<Item> PIPE = ITEMS.register("pipe", ItemBase::new);
    public static final RegistryObject<Item> STEEL_MIX = ITEMS.register("steel_mix", ItemBase::new);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot",ItemBase::new);
    public static final RegistryObject<Item> COPPER_WIRE = ITEMS.register("copper_wire",ItemBase::new);
    public static final RegistryObject<Item> LEAD_INGOT = ITEMS.register("lead_ingot",ItemBase::new);
    public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",ItemBase::new);
    public static final RegistryObject<Item> LEAD_CAST = ITEMS.register("lead_cast",ItemBase::new);
    public static final RegistryObject<Item> MOLTEN_LEAD_CAST = ITEMS.register("molten_lead_cast",ItemBase::new);
    public static final RegistryObject<Item> COPPER_CAST = ITEMS.register("copper_cast",ItemBase::new);
    public static final RegistryObject<Item> MOLTEN_COPPER_CAST = ITEMS.register("molten_copper_cast",ItemBase::new);
    public static final RegistryObject<Item> COPPER_CASE = ITEMS.register("copper_case",ItemBase::new);
    public static final RegistryObject<Item> CASTING_BIN = ITEMS.register("casting_bin",ItemBase::new);
    public static final RegistryObject<Item> LEAD_BULLET = ITEMS.register("lead_bullet",ItemBase::new);
    public static final RegistryObject<Item> LOWCAL_BULLET = ITEMS.register("lowcal_bullet",ItemBase::new);

    //Tools

    //Armor

    //Block Items
    public static final RegistryObject<Item> ASH_BLOCK_ITEM = ITEMS.register("ash_block",
            () -> new BlockItemBase(ModBlocks.ASH_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block",
            () -> new BlockItemBase(ModBlocks.COPPER_BLOCK.get()));
    public static final RegistryObject<Item> LEAD_BLOCK_ITEM = ITEMS.register("lead_block",
            () -> new BlockItemBase(ModBlocks.LEAD_BLOCK.get()));
    public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block",
            () -> new BlockItemBase(ModBlocks.STEEL_BLOCK.get()));
    public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore",
            () -> new BlockItemBase(ModBlocks.COPPER_ORE.get()));
    public static final RegistryObject<Item> LEAD_ORE_ITEM = ITEMS.register("lead_ore",
            () -> new BlockItemBase(ModBlocks.LEAD_ORE.get()));

}
