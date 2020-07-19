package com.tosiv.wildwasteland.util;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.blocks.AshBlock;
import com.tosiv.wildwasteland.blocks.BlockItemBase;
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

	//Blocks
	public static final RegistryObject<Block> ASH_BLOCK = BLOCKS.register("ash_block", AshBlock::new);

	//Block Items
	public static final RegistryObject<Item> ASH_BLOCK_ITEM = ITEMS.register("ash_block", () -> new BlockItemBase(ASH_BLOCK.get()));

}



