package com.tosiv.wildwasteland.init;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.entities.GreatBeetleEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.ENTITIES, WildWastelandMod.MOD_ID);

    //Entity Types
    public static final RegistryObject<EntityType<GreatBeetleEntity>> GREAT_BEETLE = ENTITY_TYPES.register("great_beetle",
            () -> EntityType.Builder.create(GreatBeetleEntity::new, EntityClassification.CREATURE)
                    .size(1.0f, 1.0f)
                    .build(new ResourceLocation(WildWastelandMod.MOD_ID, "great_beetle").toString()));

}
