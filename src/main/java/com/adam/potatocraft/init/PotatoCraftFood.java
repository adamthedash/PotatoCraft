package com.adam.potatocraft.init;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

import static com.adam.potatocraft.main.MyHelperMethods.registerItem;
import static com.adam.potatocraft.main.MyHelperMethods.registerRender;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftFood {

    public static Item potato_cake;

    public static void init(){
        potato_cake = registerItem(new ItemFood(10, 0.5F, false), "potato_cake").setUnlocalizedName("potato_cake").setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

    }

    public static void registerRenders(){
        registerRender(potato_cake);
    }

}
