package com.tosiv.wildwasteland.armor;

import com.tosiv.wildwasteland.WildWastelandMod;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class FlakVest extends ArmorBaseModel {

    public FlakVest() {
        super(64,64, new ResourceLocation(WildWastelandMod.MOD_ID + ":textures/models/armor/flak_vest_layer_1.png"));
    }

    @Override
    public void setupArmorParts() {
        armorHead.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedHead.addChild(armorHead);

        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(armorBody);
        armorBody.setTextureOffset(22, 0).addBox(-3.0F, 11.0F, -3.0F, 6.0F, 2.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(0, 0).addBox(-4.0F, 2.0F, -3.0F, 8.0F, 9.0F, 6.0F, 0.0F, false);
        armorBody.setTextureOffset(10, 16).addBox(-4.0F, 1.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
        armorBody.setTextureOffset(0, 15).addBox(2.0F, 1.0F, -3.0F, 2.0F, 1.0F, 6.0F, 0.0F, false);
        armorBody.setTextureOffset(0, 22).addBox(3.5F, -0.5F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);
        armorBody.setTextureOffset(20, 15).addBox(-4.5F, -0.5F, -2.5F, 1.0F, 2.0F, 5.0F, 0.0F, false);

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
