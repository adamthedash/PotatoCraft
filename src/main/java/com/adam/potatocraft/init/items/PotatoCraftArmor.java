package com.adam.potatocraft.init.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftArmor extends ItemArmor{

    public PotatoCraftArmor(ItemArmor.ArmorMaterial material, int textureIndex, EntityEquipmentSlot equipmentSlot){
        super(material, textureIndex, equipmentSlot);
    }

/*    @Override
    public Multimap<String, AttributeModifier> getAttributeModifiers(EntityEquipmentSlot slot, ItemStack stack) {

        Multimap modifiers = HashMultimap.create();

        if (this == PotatoCraftArmors.potato_boots) {
            modifiers.put(SharedMonsterAttributes.MOVEMENT_SPEED.getAttributeUnlocalizedName(), new AttributeModifier());

        } else if (this == PotatoCraftArmors.potato_chestplate) {


        } else if (this == PotatoCraftArmors.potato_helmet) {


        } else if (this == PotatoCraftArmors.potato_legs){

        }

        return modifiers;
    }*/
}
