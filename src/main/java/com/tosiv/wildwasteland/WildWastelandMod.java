package com.tosiv.wildwasteland;


import com.tosiv.wildwasteland.entities.GreatBeetleEntity;
import com.tosiv.wildwasteland.init.ModBlocks;
import com.tosiv.wildwasteland.init.ModEntityTypes;
import com.tosiv.wildwasteland.init.ModItems;
import jdk.nashorn.internal.objects.Global;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("wwlm")
public class WildWastelandMod
{
    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "wwlm";

    public WildWastelandMod() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::doClientStuff);

        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModEntityTypes.ENTITY_TYPES.register(FMLJavaModLoadingContext.get().getModEventBus());

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(ModEntityTypes.GREAT_BEETLE.get(), GreatBeetleEntity.setCustomAttributes().create());

        });

    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        // do something that can only be done on the client

    }

    public static final ItemGroup TAB = new ItemGroup("WildWastelandTab") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.PIPE.get());
        }

    };

}
