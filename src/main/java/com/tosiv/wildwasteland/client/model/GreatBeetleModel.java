package com.tosiv.wildwasteland.client.model;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import com.tosiv.wildwasteland.entities.GreatBeetleEntity;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.util.math.MathHelper;

import javax.swing.text.html.parser.Entity;

public class GreatBeetleModel<T extends GreatBeetleEntity> extends EntityModel<T> {

    private final ModelRenderer body;
    private final ModelRenderer left3;
    private final ModelRenderer left2;
    private final ModelRenderer left1;
    private final ModelRenderer right2;
    private final ModelRenderer right3;
    private final ModelRenderer right1;
    private final ModelRenderer head;
    private final ModelRenderer topfin;
    private final ModelRenderer leftfin;
    private final ModelRenderer rightfin;
    private final ModelRenderer horn;

    public GreatBeetleModel() {
        textureWidth = 64;
        textureHeight = 64;

        body = new ModelRenderer(this);
        body.setRotationPoint(0.0F, 24.0F, 0.0F);
        body.setTextureOffset(0, 14).addBox(-3.0F, -4.0F, -3.0F, 6.0F, 2.0F, 10.0F, 0.0F, false);
        body.setTextureOffset(22, 14).addBox(-2.0F, -5.875F, -6.0F, 4.0F, 3.0F, 5.0F, 0.0F, false);
        body.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -3.0F, 8.0F, 3.0F, 11.0F, 0.0F, false);
        body.setTextureOffset(22, 22).addBox(-3.0F, -8.0F, -3.0F, 6.0F, 1.0F, 10.0F, 0.0F, false);
        body.setTextureOffset(4, 4).addBox(-2.0F, -9.0F, -3.0F, 4.0F, 1.0F, 9.0F, 0.0F, false);

        left3 = new ModelRenderer(this);
        left3.setRotationPoint(3.0F, 21.0F, 5.0F);
        setRotationAngle(left3, 0.0F, 0.0F, -0.3927F);
        left3.setTextureOffset(0, 33).addBox(-0.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        left3.setTextureOffset(16, 36).addBox(4.0F, -0.4693F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        left2 = new ModelRenderer(this);
        left2.setRotationPoint(3.0F, 21.0F, 2.0F);
        setRotationAngle(left2, 0.0F, 0.0F, -0.3927F);
        left2.setTextureOffset(14, 33).addBox(-0.9197F, -0.8764F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        left2.setTextureOffset(8, 36).addBox(3.5803F, -0.3764F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        left1 = new ModelRenderer(this);
        left1.setRotationPoint(3.0F, 21.0F, -1.0F);
        setRotationAngle(left1, 0.0F, 0.0F, -0.3927F);
        left1.setTextureOffset(28, 33).addBox(-0.5F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        left1.setTextureOffset(20, 36).addBox(4.0F, -0.4693F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        right2 = new ModelRenderer(this);
        right2.setRotationPoint(-3.0F, 21.0F, 2.0F);
        setRotationAngle(right2, 0.0F, 0.0F, 0.3927F);
        right2.setTextureOffset(27, 3).addBox(-4.426F, -0.6006F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        right2.setTextureOffset(12, 36).addBox(-4.926F, -0.1627F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        right3 = new ModelRenderer(this);
        right3.setRotationPoint(-3.0F, 21.0F, 5.0F);
        setRotationAngle(right3, 0.0F, 0.0F, 0.3927F);
        right3.setTextureOffset(27, 0).addBox(-4.0F, -0.5F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);
        right3.setTextureOffset(4, 36).addBox(-4.4672F, 0.0F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);

        right1 = new ModelRenderer(this);
        right1.setRotationPoint(-4.0F, 21.0F, -1.0F);
        setRotationAngle(right1, 0.0F, 0.0F, 0.3927F);
        right1.setTextureOffset(0, 36).addBox(-3.9922F, -0.25F, -0.5F, 1.0F, 5.0F, 1.0F, 0.0F, false);
        right1.setTextureOffset(27, 6).addBox(-3.525F, -0.75F, -1.0F, 5.0F, 1.0F, 2.0F, 0.0F, false);

        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 20.6658F, -4.0245F);
        head.setTextureOffset(0, 26).addBox(-3.0F, -3.6658F, -1.9755F, 6.0F, 4.0F, 3.0F, 0.0F, false);
        head.setTextureOffset(0, 0).addBox(-2.0F, -2.6658F, -2.9755F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(35, 14).addBox(-2.0F, -1.6658F, -4.9755F, 4.0F, 2.0F, 2.0F, 0.0F, false);
        head.setTextureOffset(6, 19).addBox(2.0F, -0.6221F, -3.9765F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 9).addBox(-3.0F, -0.6221F, -3.9765F, 1.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(27, 9).addBox(-3.0F, -4.6658F, 0.0245F, 6.0F, 1.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(24, 36).addBox(-4.0F, -3.6658F, 0.0245F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(22, 14).addBox(3.0F, -3.6658F, 0.0245F, 1.0F, 4.0F, 1.0F, 0.0F, false);
        head.setTextureOffset(0, 19).addBox(-1.0F, -3.0981F, -4.7916F, 2.0F, 2.0F, 2.0F, 0.0F, false);

        topfin = new ModelRenderer(this);
        topfin.setRotationPoint(0.0F, 3.3342F, 5.0245F);
        head.addChild(topfin);
        setRotationAngle(topfin, 0.6545F, 0.0F, 0.0F);
        topfin.setTextureOffset(18, 26).addBox(-2.0F, -10.0F, -1.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);

        leftfin = new ModelRenderer(this);
        leftfin.setRotationPoint(0.0F, 3.3342F, 5.0245F);
        head.addChild(leftfin);
        setRotationAngle(leftfin, 0.0F, -0.7854F, 0.0F);
        leftfin.setTextureOffset(0, 14).addBox(-3.0F, -6.9F, -7.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);

        rightfin = new ModelRenderer(this);
        rightfin.setRotationPoint(0.0F, 3.3342F, 5.0245F);
        head.addChild(rightfin);
        setRotationAngle(rightfin, 0.0F, 0.7854F, 0.0F);
        rightfin.setTextureOffset(0, 4).addBox(0.0F, -6.9F, -7.0F, 3.0F, 4.0F, 1.0F, 0.0F, false);

        horn = new ModelRenderer(this);
        horn.setRotationPoint(0.0F, 3.3342F, 5.0245F);
        head.addChild(horn);
        setRotationAngle(horn, 0.0436F, 0.0F, 0.0F);
        horn.setTextureOffset(7, 8).addBox(-0.5F, -8.4305F, -9.7288F, 1.0F, 2.0F, 1.0F, 0.0F, false);
    }


    @Override
    public void setRotationAngles(T entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
        //this.head.rotateAngleX = headPitch * ((float)Math.PI / 1F);
        //this.head.rotateAngleY = netHeadYaw * ((float)Math.PI / 1F);
        // this.body.rotateAngleX = ((float)Math.PI / 2F);
        this.right1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.right2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.right3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
        this.left2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.left3.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    }

    @Override
    public void render(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
        body.render(matrixStack, buffer, packedLight, packedOverlay);
        left3.render(matrixStack, buffer, packedLight, packedOverlay);
        left2.render(matrixStack, buffer, packedLight, packedOverlay);
        left1.render(matrixStack, buffer, packedLight, packedOverlay);
        right2.render(matrixStack, buffer, packedLight, packedOverlay);
        right3.render(matrixStack, buffer, packedLight, packedOverlay);
        right1.render(matrixStack, buffer, packedLight, packedOverlay);
        head.render(matrixStack, buffer, packedLight, packedOverlay);
    }

    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }


}
