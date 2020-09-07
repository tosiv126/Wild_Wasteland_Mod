package com.tosiv.wildwasteland.armor;

import com.tosiv.wildwasteland.WildWastelandMod;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.ResourceLocation;

public class Rags extends ArmorBaseModel {

    public Rags() {
        super(64,64, new ResourceLocation(WildWastelandMod.MOD_ID + ":textures/models/armor/rags.png"));
    }

    @Override
    public void setupArmorParts() {

        armorHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(armorHead);
        armorHead.setTextureOffset(0, 0).addBox(-3.5F, -8.5F, -5.0F, 7.0F, 1.0F, 9.0F, 0.0F, false);
        armorHead.setTextureOffset(20, 20).addBox(-4.2071F, -7.7929F, -5.0F, 1.0F, 8.0F, 9.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 17).addBox(3.2071F, -7.7929F, -5.0F, 1.0F, 8.0F, 9.0F, 0.0F, false);
        armorHead.setTextureOffset(5, 24).addBox(-1.0F, -8.0F, -4.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(23, 3).addBox(3.0F, 0.0F, -3.9F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(39, 41).addBox(-3.0F, -4.8045F, 4.5307F, 6.0F, 6.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(31, 21).addBox(0.0F, 1.1955F, 4.5307F, 3.0F, 1.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(4, 17).addBox(-3.0F, 1.1955F, 4.5307F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(24, 10).addBox(3.5F, -7.0F, -2.0F, 1.0F, 3.0F, 2.0F, 0.0F, false);

        ModelRenderer cornercloth = new ModelRenderer(this);
        cornercloth.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(cornercloth);
        setRotationAngle(cornercloth, 0.0F, 0.0F, -0.7854F);
        cornercloth.setTextureOffset(31, 17).addBox(2.5355F, -8.4853F, -5.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);

        ModelRenderer cornercloth2 = new ModelRenderer(this);
        cornercloth2.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(cornercloth2);
        setRotationAngle(cornercloth2, 0.0F, 0.0F, 0.7854F);
        cornercloth2.setTextureOffset(31, 31).addBox(-3.5355F, -8.4853F, -5.0F, 1.0F, 1.0F, 9.0F, 0.0F, false);

        ModelRenderer backslope = new ModelRenderer(this);
        backslope.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(backslope);
        setRotationAngle(backslope, 0.3927F, 0.0F, 0.0F);
        backslope.setTextureOffset(42, 31).addBox(-3.0F, -6.3222F, 5.9483F, 6.0F, 4.0F, 1.0F, 0.0F, false);

        ModelRenderer backsideslope1 = new ModelRenderer(this);
        backsideslope1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(backsideslope1);
        setRotationAngle(backsideslope1, 0.0F, 0.7854F, 0.0F);
        backsideslope1.setTextureOffset(0, 17).addBox(-5.8033F, -4.7929F, -0.1464F, 1.0F, 6.0F, 2.0F, 0.0F, false);

        ModelRenderer backsideslope3 = new ModelRenderer(this);
        backsideslope3.setRotationPoint(0.0F, -4.0F, 0.0F);
        armorHead.addChild(backsideslope3);
        setRotationAngle(backsideslope3, 0.0F, 0.7854F, 0.3927F);
        backsideslope3.setTextureOffset(0, 34).addBox(-5.7914F, -1.1225F, -0.1346F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        ModelRenderer backsideslope2 = new ModelRenderer(this);
        backsideslope2.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(backsideslope2);
        setRotationAngle(backsideslope2, 0.0F, -0.7854F, 0.0F);
        backsideslope2.setTextureOffset(0, 0).addBox(4.8033F, -4.7929F, -0.1464F, 1.0F, 7.0F, 2.0F, 0.0F, false);

        ModelRenderer backsideslope4 = new ModelRenderer(this);
        backsideslope4.setRotationPoint(0.0F, -4.0F, 0.0F);
        armorHead.addChild(backsideslope4);
        setRotationAngle(backsideslope4, 0.0F, -0.7854F, -0.3927F);
        backsideslope4.setTextureOffset(23, 0).addBox(4.7914F, -1.1225F, -0.1346F, 1.0F, 2.0F, 1.0F, 0.0F, false);

        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(armorBody);
        armorBody.setTextureOffset(42, 22).addBox(-4.0F, 2.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(40, 27).addBox(-5.0F, 2.0F, 2.0F, 8.0F, 3.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(20, 25).addBox(1.5F, 3.0F, -3.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(30, 8).addBox(-4.0F, 5.0F, -2.5F, 6.0F, 4.0F, 5.0F, 0.0F, false);
        armorBody.setTextureOffset(23, 0).addBox(-4.0F, 9.0F, -2.5F, 8.0F, 3.0F, 5.0F, 0.0F, false);
        armorBody.setTextureOffset(0, 10).addBox(-4.5F, 11.0F, -3.0F, 9.0F, 1.0F, 6.0F, 0.0F, false);
        armorBody.setTextureOffset(31, 23).addBox(-5.0F, 0.0F, -3.0F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(24, 17).addBox(-6.0F, 0.0F, 1.4142F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(0, 10).addBox(3.0F, 0.0F, 1.4142F, 2.0F, 4.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(31, 17).addBox(3.0F, 0.0F, -3.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(42, 17).addBox(-6.0F, -0.7071F, -2.2929F, 3.0F, 1.0F, 4.0F, 0.0F, false);
        armorBody.setTextureOffset(13, 34).addBox(4.0F, -0.7071F, -2.2929F, 1.0F, 1.0F, 4.0F, 0.0F, false);

        ModelRenderer frontshoulder1 = new ModelRenderer(this);
        frontshoulder1.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorBody.addChild(frontshoulder1);
        setRotationAngle(frontshoulder1, 0.7854F, 0.0F, 0.0F);
        frontshoulder1.setTextureOffset(27, 37).addBox(-6.0F, -2.1213F, -2.1213F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        ModelRenderer frontshoulder3 = new ModelRenderer(this);
        frontshoulder3.setRotationPoint(9.0F, 0.0F, 0.0F);
        armorBody.addChild(frontshoulder3);
        setRotationAngle(frontshoulder3, 0.7854F, 0.0F, 0.0F);
        frontshoulder3.setTextureOffset(4, 0).addBox(-5.0F, -2.1213F, -2.1213F, 1.0F, 1.0F, 1.0F, 0.0F, false);

        ModelRenderer frontshoulder2 = new ModelRenderer(this);
        frontshoulder2.setRotationPoint(0.0F, 0.0F, 4.0F);
        armorBody.addChild(frontshoulder2);
        setRotationAngle(frontshoulder2, 0.7854F, 0.0F, 0.0F);
        frontshoulder2.setTextureOffset(31, 27).addBox(-6.0F, -2.1213F, -2.1213F, 2.0F, 1.0F, 1.0F, 0.0F, false);
        frontshoulder2.setTextureOffset(28, 10).addBox(3.0F, -2.1213F, -2.1213F, 2.0F, 1.0F, 1.0F, 0.0F, false);

        ModelRenderer armorRightArm = new ModelRenderer(this);
        armorRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightArm.addChild(armorRightArm);

        armorLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftArm.addChild(armorLeftArm);

        armorRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedRightLeg.addChild(armorRightLeg);
        armorRightLeg.setTextureOffset(0, 34).addBox(2.0F, 0.0F, -2.5F, 4.0F, 5.0F, 5.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(27, 41).addBox(4.0F, 5.0F, -2.5F, 1.0F, 4.0F, 5.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(0, 44).addBox(5.5F, 0.0F, -2.0F, 1.0F, 6.0F, 4.0F, 0.0F, false);

        armorRightBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightLeg.addChild(armorRightBoot);

        armorLeftLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftLeg);
        armorLeftLeg.setTextureOffset(11, 17).addBox(-6.0F, 0.0F, -2.5F, 4.0F, 3.0F, 5.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(10, 44).addBox(-6.5F, 0.0F, -2.0F, 1.0F, 3.0F, 4.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(11, 17).addBox(-6.5F, 3.0F, -1.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(18, 37).addBox(-5.0F, 3.0F, -2.5F, 2.0F, 3.0F, 5.0F, 0.0F, false);

        armorLeftBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftBoot);

    }
}