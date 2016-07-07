package com.adam.potatocraft.init.blocks;

import com.adam.potatocraft.init.PotatoCraftTabs;
import net.minecraft.block.Block;
import net.minecraft.init.Items;

/**
 * Created by Adam on 07/07/2016.
 */
public class ModBush {

    public Block bushEmpty;
    public ModBushFull bushFull;

    public ModBush(String name) {

        String emptyName = name + "_empty";
        String fullName = name + "_full";


        bushEmpty = new ModBushEmpty(this, 3)
                .setUnlocalizedName(emptyName)
                .setRegistryName(emptyName)
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        bushFull = new ModBushFull(this, Items.POTATO);
        bushFull.setUnlocalizedName(fullName)
                .setRegistryName(fullName)
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);


    }


}
