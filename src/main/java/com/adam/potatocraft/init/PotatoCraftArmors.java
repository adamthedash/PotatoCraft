package com.adam.potatocraft.init;

import com.adam.potatocraft.init.items.PotatoCraftArmor;
import com.adam.potatocraft.main.Reference;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftArmors extends PotatoCraftItems{

    //		New material for armor
//	    TODO: Find out what goes in textureName. "pc:potato" as placeholder
    public static final ItemArmor.ArmorMaterial ARMOR_MATERIAL_POTATO = EnumHelper.addArmorMaterial("POTATO", Reference.MODID + ":potato", 5, new int[]{1, 3, 4, 1}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 1F);


    public static Item potato_helmet;
    public static Item potato_chest;
    public static Item potato_legs;
    public static Item potato_boots;

    public static void init(){
        //		Armor
        potato_helmet = registerItem(new PotatoCraftArmor(ARMOR_MATERIAL_POTATO, 1, EntityEquipmentSlot.HEAD), "potato_helmet")
                .setUnlocalizedName("potato_helmet")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_chest = registerItem(new PotatoCraftArmor(ARMOR_MATERIAL_POTATO, 1, EntityEquipmentSlot.CHEST), "potato_chest")
                .setUnlocalizedName("potato_chest")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_legs = registerItem(new PotatoCraftArmor(ARMOR_MATERIAL_POTATO, 1, EntityEquipmentSlot.LEGS), "potato_legs")
                .setUnlocalizedName("potato_legs")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_boots = registerItem(new PotatoCraftArmor(ARMOR_MATERIAL_POTATO, 1, EntityEquipmentSlot.FEET), "potato_boots")
                .setUnlocalizedName("potato_boots")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

    }

    public static void registerRenders(){
        registerRender(potato_helmet);
        registerRender(potato_chest);
        registerRender(potato_legs);
        registerRender(potato_boots);
    }
    
    
}
