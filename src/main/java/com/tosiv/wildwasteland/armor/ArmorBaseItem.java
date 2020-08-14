package com.tosiv.wildwasteland.armor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ArmorBaseItem extends ArmorItem {

    private ArmorBaseModel armorModel;

    public ArmorBaseItem(IArmorMaterial material, EquipmentSlotType equipmentSlot, Item.Properties properties, ArmorBaseModel armorModel) {
        super(material, equipmentSlot, properties);
        //set the creative tab, and everything you might want to set here additionally


        this.armorModel = armorModel;
    }

    @Override
    public final BipedModel getArmorModel(LivingEntity entity, ItemStack itemStack, EquipmentSlotType armorSlot, BipedModel defaultArmor) {
        return armorModel.applyEntityStats(defaultArmor).applySlot(armorSlot);
    }

    @Override
    public final String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlotType slot, String type) {
        return armorModel.getTexture();
    }
}
