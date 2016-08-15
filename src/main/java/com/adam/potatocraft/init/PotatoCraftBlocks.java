package com.adam.potatocraft.init;

import com.adam.potatocraft.init.blocks.*;
import net.minecraft.block.Block;

import static com.adam.potatocraft.main.MyHelperMethods.registerName;
import static com.adam.potatocraft.main.MyHelperMethods.registerRender;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftBlocks {

    public static PotatoBlock potato_block;
    public static ModBushFull potato_bush_full;
    public static Block potato_bush_empty;
    public static PotatoOre potato_ore;
    public static PotatoFurnace potato_furnace_off;
    public static PotatoFurnace potato_furnace_on;



    public static void init(){
//        Potato Block
        potato_block = new PotatoBlock();
        potato_block.setUnlocalizedName("potato_block")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

//        Potato Ore
        potato_ore = new PotatoOre();
        potato_ore.setUnlocalizedName("potato_ore")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

//        Potato Bush
        ModBush potato_bush = new ModBush("potato_bush");
        potato_bush_full = potato_bush.bushFull;
        potato_bush_empty = potato_bush.bushEmpty;

//        Potato Furnace
        potato_furnace_off = new PotatoFurnace(false, "potato_furnace_off");
        potato_furnace_off.setUnlocalizedName("potato_furnace_off")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_furnace_on = new PotatoFurnace(true, "potato_furnace_on");
        potato_furnace_on.setUnlocalizedName("potato_furnace_on")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);


        registerNames();

    }

    public static void registerRenders(){
        registerRender(potato_block);
        registerRender(potato_ore);
        registerRender(potato_bush_empty);
        registerRender(potato_bush_full);
        registerRender(potato_furnace_off);
        registerRender(potato_furnace_on);


    }

    public static void registerNames(){
        registerName(potato_ore);
        registerName(potato_block);
        registerName(potato_bush_empty);
        registerName(potato_bush_full);
        registerName(potato_furnace_off);
        registerName(potato_furnace_on);
    }
    
}
