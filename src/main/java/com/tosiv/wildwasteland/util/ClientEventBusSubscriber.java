package com.tosiv.wildwasteland.util;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.client.render.GreatBeetleRenderer;
import com.tosiv.wildwasteland.init.ModBlocks;
import com.tosiv.wildwasteland.init.ModEntityTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = WildWastelandMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientEventBusSubscriber {

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event){
        RenderTypeLookup.setRenderLayer(ModBlocks.HEALROOT.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(ModBlocks.ROPEROOT.get(), RenderType.getCutout());
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GREAT_BEETLE.get(), GreatBeetleRenderer::new);
    }

}
