package com.tosiv.wildwasteland.armor;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.util.ResourceLocation;

public abstract class ArmorBaseModel extends BipedModel {
    protected final ModelRenderer armorHead;
    protected final ModelRenderer armorBody;
    protected final ModelRenderer armorRightArm;
    protected final ModelRenderer armorLeftArm;
    protected final ModelRenderer armorRightLeg;
    protected final ModelRenderer armorLeftLeg;
    protected final ModelRenderer armorRightBoot;
    protected final ModelRenderer armorLeftBoot;


    private String texture;

    public ArmorBaseModel(int textureWidth, int textureHeight, ResourceLocation texture){
        super(1F);
        this.textureWidth = textureWidth;
        this.textureHeight = textureHeight;
        this.texture = texture.toString();

        armorHead = new ModelRenderer(this);
        armorHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(armorHead);

        armorBody = new ModelRenderer(this);
        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(armorBody);
        armorRightArm = new ModelRenderer(this);
        armorRightArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightArm.addChild(armorRightArm);

        armorLeftArm = new ModelRenderer(this);
        armorLeftArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftArm.addChild(armorLeftArm);

        armorRightLeg = new ModelRenderer(this);
        armorRightLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightLeg.addChild(armorRightLeg);

        armorLeftLeg = new ModelRenderer(this);
        armorLeftLeg.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftLeg);


        armorRightBoot = new ModelRenderer(this);
        armorRightBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedRightLeg.addChild(armorRightBoot);

        armorLeftBoot = new ModelRenderer(this);
        armorLeftBoot.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftBoot);

        setupArmorParts();
    }

    public abstract void setupArmorParts();

    public final String getTexture(){
        return this.texture;
    }

    /**
     * Feel free to override this method as needed.
     * It's just required to hide armor parts depending on the equipment slot
     */
    public BipedModel applySlot(EquipmentSlotType slot){
        armorHead.showModel = false;
        armorBody.showModel = false;
        armorRightArm.showModel = false;
        armorLeftArm.showModel = false;
        armorRightLeg.showModel = false;
        armorLeftLeg.showModel = false;
        armorRightBoot.showModel = false;
        armorLeftBoot.showModel = false;

        switch(slot){
            case HEAD:
                armorHead.showModel = true;
                break;
            case CHEST:
                armorBody.showModel = true;
                armorRightArm.showModel = true;
                armorLeftArm.showModel = true;
                break;
            case LEGS:
                armorRightLeg.showModel = true;
                armorLeftLeg.showModel = true;
                break;
            case FEET:
                armorRightBoot.showModel = true;
                armorLeftBoot.showModel = true;
                break;
            default:
                break;
        }

        return this;
    }

    public final ArmorBaseModel applyEntityStats(BipedModel defaultArmor){
        this.isChild = defaultArmor.isChild;
        this.isSneak = defaultArmor.isSneak;
        this.isSitting = defaultArmor.isSitting;
        this.rightArmPose = defaultArmor.rightArmPose;
        this.leftArmPose = defaultArmor.leftArmPose;

        return this;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
        copyModelAngles(this.bipedHead, this.armorHead);
        copyModelAngles(this.bipedBody, this.armorBody);
        copyModelAngles(this.bipedRightArm, this.armorLeftArm);
        copyModelAngles(this.bipedLeftArm, this.armorRightArm);
        copyModelAngles(this.bipedRightLeg, this.armorLeftLeg);
        copyModelAngles(this.bipedLeftLeg, this.armorRightLeg);
        copyModelAngles(this.bipedRightLeg, this.armorLeftBoot);
        copyModelAngles(this.bipedLeftLeg, this.armorRightBoot);

        matrixStack.push();
        if(isSneak) matrixStack.translate(0, 0.2, 0);
        this.armorHead.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.armorBody.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.armorRightArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.armorLeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.armorRightLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.armorLeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.armorRightBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
        this.armorLeftBoot.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);

        matrixStack.pop();
    }

    public final void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    private final void copyModelAngles(ModelRenderer in, ModelRenderer out){
        out.rotateAngleX = in.rotateAngleX;
        out.rotateAngleY = in.rotateAngleY;
        out.rotateAngleZ = in.rotateAngleZ;
    }
}
