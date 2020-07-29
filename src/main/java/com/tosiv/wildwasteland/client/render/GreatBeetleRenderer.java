package com.tosiv.wildwasteland.client.render;

import com.tosiv.wildwasteland.WildWastelandMod;
import com.tosiv.wildwasteland.client.model.GreatBeetleModel;
import com.tosiv.wildwasteland.entities.GreatBeetleEntity;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;


public class GreatBeetleRenderer extends MobRenderer<GreatBeetleEntity, GreatBeetleModel<GreatBeetleEntity>> {

    protected static final ResourceLocation TEXTURE = new ResourceLocation(WildWastelandMod.MOD_ID, "textures/entity/great_beetle.png");

    public GreatBeetleRenderer(EntityRendererManager renderManagerIn) {
        super(renderManagerIn, new GreatBeetleModel<>(), 0.5f);
    }

    @Override
    public ResourceLocation getEntityTexture(GreatBeetleEntity entity) {
        return TEXTURE;
    }
}
