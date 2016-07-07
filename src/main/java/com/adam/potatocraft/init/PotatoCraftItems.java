package com.adam.potatocraft.init;

/**
 * Created by Adam on 29/06/2016.
 */
import net.minecraft.item.Item;

import static com.adam.potatocraft.main.MyHelperMethods.registerItem;
import static com.adam.potatocraft.main.MyHelperMethods.registerRender;


public class PotatoCraftItems {

    public static Item potato;

    public static void init(){
        potato = registerItem(new Item(), "potato")
                .setUnlocalizedName("potato");
//                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

    }

    public static void registerRenders(){
        registerRender(potato);
    }

}