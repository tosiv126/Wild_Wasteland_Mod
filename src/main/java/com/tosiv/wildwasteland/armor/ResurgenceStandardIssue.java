package com.tosiv.wildwasteland.armor;

import com.tosiv.wildwasteland.WildWastelandMod;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ResurgenceStandardIssue extends ArmorBaseModel {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, WildWastelandMod.MOD_ID);

    private static final ResurgenceStandardIssue model= new ResurgenceStandardIssue();

    public static final RegistryObject<ArmorBaseItem> RESURGENCE_HELMET = ITEMS.register("resurgence_helmet",
            ()-> new ArmorBaseItem(ModArmorMaterial.FLAK, EquipmentSlotType.HEAD, new Item.Properties().group(WildWastelandMod.TAB), model));
    public static final RegistryObject<ArmorBaseItem> RESURGENCE_CHEST = ITEMS.register("resurgence_chest",
            ()-> new ArmorBaseItem(ModArmorMaterial.FLAK, EquipmentSlotType.CHEST, new Item.Properties().group(WildWastelandMod.TAB), model));
    public static final RegistryObject<ArmorBaseItem> RESURGENCE_LEGS = ITEMS.register("resurgence_legs",
            ()-> new ArmorBaseItem(ModArmorMaterial.FLAK, EquipmentSlotType.LEGS, new Item.Properties().group(WildWastelandMod.TAB), model));
    public static final RegistryObject<ArmorBaseItem> RESURGENCE_BOOTS = ITEMS.register("resurgence_boots",
            ()-> new ArmorBaseItem(ModArmorMaterial.FLAK, EquipmentSlotType.FEET, new Item.Properties().group(WildWastelandMod.TAB), model));


    public ResurgenceStandardIssue() {
        super(128,128, new ResourceLocation(WildWastelandMod.MOD_ID + ":textures/models/armor/rsi.png"));

    }

    @Override
    public void setupArmorParts() {

        armorHead.setTextureOffset(34, 13).addBox(-4.0F, -4.0F, 3.5F, 8.0F, 1.0F, 2.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 9).addBox(-5.5F, -4.0F, -2.0F, 11.0F, 1.0F, 6.0F, 0.0F, false);
        armorHead.setTextureOffset(18, 37).addBox(-4.0F, -8.0F, -4.1F, 8.0F, 8.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(18, 18).addBox(-4.1F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 16).addBox(3.1F, -8.0F, -4.0F, 1.0F, 8.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(50, 20).addBox(-4.0F, -3.0F, 3.1F, 8.0F, 3.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(28, 16).addBox(-5.0F, -6.0F, -5.0F, 10.0F, 1.0F, 3.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 0).addBox(-4.0F, -8.1F, -4.0F, 8.0F, 1.0F, 8.0F, 0.0F, false);
        armorHead.setTextureOffset(18, 22).addBox(-1.0F, -9.0F, -1.0F, 2.0F, 1.0F, 2.0F, 0.0F, false);
        armorHead.setTextureOffset(36, 27).addBox(-0.5F, -11.0F, -0.5F, 1.0F, 2.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(24, 34).addBox(-3.0F, -5.0F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(18, 34).addBox(1.0F, -5.0F, -4.5F, 2.0F, 2.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(52, 45).addBox(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        armorHead.setTextureOffset(0, 0).addBox(-1.0F, -3.0F, -6.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);

        ModelRenderer brimcurve1 = new ModelRenderer(this);
        brimcurve1.setRotationPoint(-2.0F, 0.0F, -1.0F);
        armorHead.addChild(brimcurve1);
        setRotationAngle(brimcurve1, 0.0F, 0.7854F, 0.0F);
        brimcurve1.setTextureOffset(24, 3).addBox(-6.0104F, -4.0F, 1.0607F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        ModelRenderer brimcurve2 = new ModelRenderer(this);
        brimcurve2.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(brimcurve2);
        setRotationAngle(brimcurve2, 0.0F, -0.7854F, 0.0F);
        brimcurve2.setTextureOffset(24, 0).addBox(4.7175F, -4.0F, -1.0607F, 2.0F, 1.0F, 2.0F, 0.0F, false);

        ModelRenderer frontbrimcurve1 = new ModelRenderer(this);
        frontbrimcurve1.setRotationPoint(0.0F, 0.0F, 2.0F);
        armorHead.addChild(frontbrimcurve1);
        setRotationAngle(frontbrimcurve1, 0.3054F, 0.0F, 0.0F);
        frontbrimcurve1.setTextureOffset(22, 16).addBox(-5.0F, -7.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        ModelRenderer frontbrimcurve2 = new ModelRenderer(this);
        frontbrimcurve2.setRotationPoint(0.0F, 0.0F, 2.0F);
        armorHead.addChild(frontbrimcurve2);
        setRotationAngle(frontbrimcurve2, 0.3054F, 0.0F, 0.0F);
        frontbrimcurve2.setTextureOffset(10, 16).addBox(4.0F, -7.0F, -3.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);

        ModelRenderer helmetcurve1 = new ModelRenderer(this);
        helmetcurve1.setRotationPoint(0.0F, 1.0F, 0.0F);
        armorHead.addChild(helmetcurve1);
        setRotationAngle(helmetcurve1, 0.0F, 0.0F, -0.2182F);
        helmetcurve1.setTextureOffset(20, 46).addBox(5.0F, -7.5F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
        helmetcurve1.setTextureOffset(0, 9).addBox(5.0F, -7.5F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        ModelRenderer helmetcurve2 = new ModelRenderer(this);
        helmetcurve2.setRotationPoint(0.0F, 1.0F, 0.0F);
        armorHead.addChild(helmetcurve2);
        setRotationAngle(helmetcurve2, 0.0F, 0.0F, 0.2182F);
        helmetcurve2.setTextureOffset(44, 45).addBox(-6.0F, -7.5F, -2.0F, 1.0F, 4.0F, 6.0F, 0.0F, false);
        helmetcurve2.setTextureOffset(28, 11).addBox(-6.0F, -7.5F, -4.0F, 1.0F, 2.0F, 2.0F, 0.0F, false);

        ModelRenderer helmetcurve3 = new ModelRenderer(this);
        helmetcurve3.setRotationPoint(0.0F, 0.0F, 0.0F);
        armorHead.addChild(helmetcurve3);
        setRotationAngle(helmetcurve3, 0.1745F, 0.0F, 0.0F);
        helmetcurve3.setTextureOffset(50, 6).addBox(-4.0F, -7.0F, 4.5F, 8.0F, 4.0F, 1.0F, 0.0F, false);

        ModelRenderer helmetcurve4 = new ModelRenderer(this);
        helmetcurve4.setRotationPoint(7.0F, 0.0F, 0.0F);
        armorHead.addChild(helmetcurve4);
        setRotationAngle(helmetcurve4, -0.1745F, 0.0F, 0.0F);
        helmetcurve4.setTextureOffset(10, 21).addBox(-11.0F, -7.0F, -4.5F, 8.0F, 2.0F, -1.0F, 0.0F, false);

        ModelRenderer gasmask2 = new ModelRenderer(this);
        gasmask2.setRotationPoint(2.0F, -4.0F, -6.0F);
        armorHead.addChild(gasmask2);
        setRotationAngle(gasmask2, 0.0F, 0.3491F, 0.0F);

        armorBody.setRotationPoint(0.0F, 0.0F, 0.0F);
        bipedBody.addChild(armorBody);
        armorBody.setTextureOffset(36, 37).addBox(-4.0F, 1.0F, -4.0F, 8.0F, 5.0F, 2.0F, 0.0F, false);
        armorBody.setTextureOffset(0, 20).addBox(3.0F, 0.5F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        armorBody.setTextureOffset(0, 16).addBox(-5.0F, 0.5F, -3.5F, 2.0F, 2.0F, 2.0F, 0.0F, false);
        armorBody.setTextureOffset(58, 45).addBox(-5.5F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
        armorBody.setTextureOffset(58, 24).addBox(3.5F, -1.0F, -2.5F, 2.0F, 2.0F, 5.0F, 0.0F, false);
        armorBody.setTextureOffset(50, 0).addBox(-3.5F, 6.0F, -3.5F, 7.0F, 4.0F, 2.0F, 0.0F, false);
        armorBody.setTextureOffset(28, 20).addBox(-3.0F, 10.0F, -3.25F, 6.0F, 3.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(32, 0).addBox(-4.0F, 0.0F, -2.1F, 8.0F, 12.0F, 1.0F, 0.0F, false);
        armorBody.setTextureOffset(0, 32).addBox(-4.0F, 0.0F, 1.1F, 8.0F, 12.0F, 1.0F, 0.0F, false);

        armorRightArm.setRotationPoint(4.0F, 22.0F, 0.0F);
        bipedRightArm.addChild(armorRightArm);
        armorRightArm.setTextureOffset(44, 27).addBox(-4.5F, -2.5F, -1.75F, 5.0F, 3.0F, 4.0F, 0.0F, false);
        armorRightArm.setTextureOffset(67, 46).addBox(-4.25F, -2.25F, -2.25F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        armorRightArm.setTextureOffset(0, 59).addBox(-4.0F, 0.0F, -2.1F, 4.0F, 10.0F, 1.0F, 0.0F, false);
        armorRightArm.setTextureOffset(10, 45).addBox(-4.1F, 0.0F, -2.0F, 1.0F, 10.0F, 4.0F, 0.0F, false);
        armorRightArm.setTextureOffset(56, 34).addBox(-4.0F, 0.0F, 1.1F, 4.0F, 10.0F, 1.0F, 0.0F, false);
        armorRightArm.setTextureOffset(51, 12).addBox(-4.0F, 10.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);

        armorLeftArm.setRotationPoint(4.0F, 4.0F, 0.0F);
        bipedLeftArm.addChild(armorLeftArm);
        armorLeftArm.setTextureOffset(32, 44).addBox(-0.5F, -2.5F, -1.75F, 5.0F, 3.0F, 4.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(67, 42).addBox(0.25F, -2.25F, -2.25F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(10, 16).addBox(0.0F, 10.0F, -2.0F, 4.0F, 1.0F, 4.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(20, 56).addBox(0.0F, 0.0F, -2.1F, 4.0F, 10.0F, 1.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(0, 45).addBox(3.1F, 0.0F, -2.0F, 1.0F, 10.0F, 4.0F, 0.0F, false);
        armorLeftArm.setTextureOffset(44, 55).addBox(0.0F, 0.0F, 1.1F, 4.0F, 10.0F, 1.0F, 0.0F, false);

        armorRightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedRightLeg.addChild(armorRightLeg);
        armorRightLeg.setTextureOffset(64, 52).addBox(2.0F, 0.0F, -2.1F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(54, 54).addBox(5.1F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);
        armorRightLeg.setTextureOffset(64, 64).addBox(2.0F, 0.0F, 1.1F, 4.0F, 8.0F, 1.0F, 0.0F, false);

        armorRightBoot.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedRightLeg.addChild(armorRightBoot);
        armorRightBoot.setTextureOffset(40, 66).addBox(5.1F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);
        armorRightBoot.setTextureOffset(36, 20).addBox(2.0F, 11.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
        armorRightBoot.setTextureOffset(67, 23).addBox(2.0F, 8.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        armorRightBoot.setTextureOffset(66, 37).addBox(2.0F, 8.0F, 1.1F, 4.0F, 4.0F, 1.0F, 0.0F, false);

        armorLeftLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftLeg);
        armorLeftLeg.setTextureOffset(30, 63).addBox(-2.0F, 0.0F, 1.1F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(10, 59).addBox(-2.0F, 0.0F, -2.1F, 4.0F, 8.0F, 1.0F, 0.0F, false);
        armorLeftLeg.setTextureOffset(34, 51).addBox(-2.1F, 0.0F, -2.0F, 1.0F, 8.0F, 4.0F, 0.0F, false);

        armorLeftBoot.setRotationPoint(2.0F, 12.0F, 0.0F);
        bipedLeftLeg.addChild(armorLeftBoot);
        armorLeftBoot.setTextureOffset(30, 30).addBox(-2.0F, 11.0F, -3.5F, 4.0F, 1.0F, 6.0F, 0.0F, false);
        armorLeftBoot.setTextureOffset(19, 67).addBox(-2.0F, 8.0F, -3.0F, 4.0F, 3.0F, 1.0F, 0.0F, false);
        armorLeftBoot.setTextureOffset(52, 45).addBox(-2.0F, 8.0F, 1.1F, 4.0F, 4.0F, 1.0F, 0.0F, false);
        armorLeftBoot.setTextureOffset(64, 7).addBox(-2.1F, 8.0F, -2.0F, 1.0F, 4.0F, 4.0F, 0.0F, false);

    }
}
