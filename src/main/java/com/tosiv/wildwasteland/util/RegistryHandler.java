package com.tosiv.wildwasteland.util;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.blocks.*;
import com.tosiv.wildwasteland.items.ItemBase;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {
	public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, WildWastelandMod.MOD_ID);
	public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, WildWastelandMod.MOD_ID);


	public static void init() {

		ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
		BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

	}

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


	//Blocks
	public static final RegistryObject<Block> ASH_BLOCK = BLOCKS.register("ash_block", AshBlock::new);
	public static final RegistryObject<Block> COPPER_BLOCK = BLOCKS.register("copper_block", CopperBlock::new);
	public static final RegistryObject<Block> LEAD_BLOCK = BLOCKS.register("lead_block", LeadBlock::new);
	public static final RegistryObject<Block> STEEL_BLOCK = BLOCKS.register("steel_block", SteelBlock::new);
	public static final RegistryObject<Block> COPPER_ORE = BLOCKS.register("copper_ore", CopperOre::new);
	public static final RegistryObject<Block> LEAD_ORE = BLOCKS.register("lead_ore", LeadOre::new);

	//Block Items
	public static final RegistryObject<Item> ASH_BLOCK_ITEM = ITEMS.register("ash_block", () -> new BlockItemBase(ASH_BLOCK.get()));
	public static final RegistryObject<Item> COPPER_BLOCK_ITEM = ITEMS.register("copper_block",() -> new BlockItemBase(COPPER_BLOCK.get()));
	public static final RegistryObject<Item> LEAD_BLOCK_ITEM = ITEMS.register("lead_block",() -> new BlockItemBase(LEAD_BLOCK.get()));
	public static final RegistryObject<Item> STEEL_BLOCK_ITEM = ITEMS.register("steel_block",() -> new BlockItemBase(STEEL_BLOCK.get()));
	public static final RegistryObject<Item> COPPER_ORE_ITEM = ITEMS.register("copper_ore",() -> new BlockItemBase(COPPER_ORE.get()));
	public static final RegistryObject<Item> LEAD_ORE_ITEM = ITEMS.register("lead_ore", () -> new BlockItemBase(LEAD_ORE.get()));

}



