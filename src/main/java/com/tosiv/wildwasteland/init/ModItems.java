package com.tosiv.wildwasteland.init;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.blocks.BlockItemBase;
import com.tosiv.wildwasteland.items.InsectFlesh;
import com.tosiv.wildwasteland.items.ItemBase;
import com.tosiv.wildwasteland.items.CookedInsectFlesh;
import com.tosiv.wildwasteland.items.ProcessedHealroot;
import net.minecraft.item.BlockItem;
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
    public static final RegistryObject<Item> RADIOACTIVE_INSECT_FLESH = ITEMS.register("radioactive_insect_flesh", ItemBase::new);
    public static final RegistryObject<Item> HEALROOT_CROP = ITEMS.register("healroot_crop", ItemBase::new);
    public static final RegistryObject<Item> ROPEROOT_CROP = ITEMS.register("roperoot_crop", ItemBase::new);
    public static final RegistryObject<Item> ROPE = ITEMS.register("rope", ItemBase::new);


    //Food
    public static final RegistryObject<CookedInsectFlesh> COOKED_INSECT_FLESH = ITEMS.register("cooked_insect_flesh", CookedInsectFlesh::new);
    public static final RegistryObject<InsectFlesh> INSECT_FLESH = ITEMS.register("insect_flesh", InsectFlesh::new);
    public static final RegistryObject<ProcessedHealroot> PROCESSED_HEALROOT = ITEMS.register("processed_healroot", ProcessedHealroot::new);


    //Crops
    public static final RegistryObject<Item> HEALROOT_SEED = ITEMS.register("healroot_seed", ()-> new BlockItem(ModBlocks.HEALROOT.get(), new Item.Properties().group(WildWastelandMod.TAB)));
    public static final RegistryObject<Item> ROPEROOT_SEED = ITEMS.register("roperoot_seed", ()-> new BlockItem(ModBlocks.ROPEROOT.get(), new Item.Properties().group(WildWastelandMod.TAB)));



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
