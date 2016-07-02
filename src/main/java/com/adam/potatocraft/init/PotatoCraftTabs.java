package com.adam.potatocraft.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftTabs {

    //    Make copies of this method for more tabs
    public static final CreativeTabs tabPotatoCraft = new CreativeTabs("tabPotatoCraft") {

        //    Gets icon for tab. Use Item.getItemFromBlock(block) for block as icon
        @Override
        public Item getTabIconItem() {
            return PotatoCraftItems.potato;
        }
    };
}
