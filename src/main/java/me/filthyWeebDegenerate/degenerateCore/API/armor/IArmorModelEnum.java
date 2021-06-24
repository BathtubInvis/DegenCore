package me.filthyWeebDegenerate.degenerateCore.API.armor;

import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.entity.LivingEntity;
import net.minecraft.inventory.EquipmentSlotType;

public interface IArmorModelEnum<I extends BipedModel<LivingEntity>> {
    EquipmentSlotType getSlot();
    I getOtherArmorSlotModel();
    I getCorrespondingArmorSlotModel();
}
