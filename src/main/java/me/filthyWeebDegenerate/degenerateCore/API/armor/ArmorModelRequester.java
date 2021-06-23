package me.filthyWeebDegenerate.degenerateCore.API.armor;

import net.minecraft.inventory.EquipmentSlotType;

public class ArmorModelRequester {
    protected <A> A getArmorModel(IArmorModelEnum armorEnum, EquipmentSlotType correspondingSlot) {
        return (A) (armorEnum.getSlot() == correspondingSlot ? armorEnum.getCorrespondingArmorSlotModel() : armorEnum.getOtherArmorSlotModel());
    }
}
