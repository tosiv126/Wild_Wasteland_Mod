package com.tosiv.wildwasteland.armor;

import com.tosiv.wildwasteland.WildWastelandMod;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class CowboyHatBrown extends ArmorBaseModel {

    public CowboyHatBrown() {
        super(64,64, new ResourceLocation(WildWastelandMod.MOD_ID + ":textures/models/armor/cowboyhatbrownmodel.png"));
    }

    @Override
    public void setupArmorParts() {

        armorHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(armorHead);
        armorHead.setTextureOffset(0, 0).addBox(-5.0F, -8.1F, -6.0F, 10.0F, 1.0F, 12.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 13).addBox(-3.0F, -10.0F, -4.0F, 6.0F, 2.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(30, 20).addBox(0.5F, -11.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
        armorHead.setTextureOffset(30, 13).addBox(-2.5F, -11.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);

        ModelRenderer brim1 = new ModelRenderer(this);
        brim1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(brim1);
        setRotationAngle(brim1, 0.0F, 0.0F, -0.3927F);
        brim1.setTextureOffset(0, 23).addBox(7.3365F, -5.6461F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);

        ModelRenderer bone = new ModelRenderer(this);
        bone.setRotationPoint(3.854F, 3.7612F, 0.0F);
        brim1.addChild(bone);
        setRotationAngle(bone, 0.0F, 0.0F, -0.5672F);
        bone.setTextureOffset(26, 30).addBox(8.2977F, -5.6822F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);

        ModelRenderer brim2 = new ModelRenderer(this);
        brim2.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(brim2);
        setRotationAngle(brim2, 0.0F, 0.0F, 0.3927F);
        brim2.setTextureOffset(17, 17).addBox(-8.3365F, -5.6461F, -5.5F, 1.0F, 1.0F, 11.0F, 0.0F, false);

        ModelRenderer bone2 = new ModelRenderer(this);
        bone2.setRotationPoint(-2.7716F, 1.1481F, 0.0F);
        brim2.addChild(bone2);
        setRotationAngle(bone2, 0.0F, 0.0F, 0.5672F);
        bone2.setTextureOffset(14, 29).addBox(-8.8065F, -2.8968F, -5.0F, 1.0F, 1.0F, 10.0F, 0.0F, false);

        ModelRenderer bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(bone3);
        setRotationAngle(bone3, -0.1745F, 0.0F, 0.0F);

        armorRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightArm.addChild(armorRightArm);

        armorLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftArm.addChild(armorLeftArm);

        armorRightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightLeg.addChild(armorRightLeg);

        armorRightBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightLeg.addChild(armorRightBoot);

        armorLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftLeg);

        armorLeftBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftBoot);
    }
}