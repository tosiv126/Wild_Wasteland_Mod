package com.tosiv.wildwasteland.world.gen;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.init.ModEntityTypes;
import net.minecraft.entity.EntityClassification;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.registries.ForgeRegistries;

@Mod.EventBusSubscriber(modid = WildWastelandMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntitySpawns {

    @SubscribeEvent
    public static void spawnEntities(FMLLoadCompleteEvent event) {
        for(Biome biome : ForgeRegistries.BIOMES)

            if(biome.getCategory() != Biome.Category.OCEAN)
                biome.getSpawns(EntityClassification.CREATURE)
                        .add(new Biome.SpawnListEntry(ModEntityTypes.GREAT_BEETLE.get(),10, 2,4));

    }
}
