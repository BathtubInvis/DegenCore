package me.filthyWeebDegenerate.degenerateCore.API.armor;

import net.minecraft.inventory.EquipmentSlotType;

public class ArmorModelRequester {
    private final IArmorModelEnum<?> armorModelEnum;
    private final EquipmentSlotType correspondingSlot;

    public ArmorModelRequester(IArmorModelEnum<?> armorModelEnum, EquipmentSlotType slot) {
        this.armorModelEnum = armorModelEnum;
        this.correspondingSlot = slot;
    }

    @SuppressWarnings("unchecked")
    protected <A> A getArmorModel() {
        return (A) (armorModelEnum.getSlot() == correspondingSlot ? armorModelEnum.getCorrespondingArmorSlotModel() : armorModelEnum.getOtherArmorSlotModel());
    }
}
