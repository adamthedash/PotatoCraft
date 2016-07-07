package com.adam.potatocraft.init;

import com.adam.potatocraft.init.blocks.ModBush;
import com.adam.potatocraft.init.blocks.ModBushFull;
import com.adam.potatocraft.init.blocks.PotatoBlock;
import com.adam.potatocraft.init.blocks.PotatoOre;
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



    public static void init(){
//        Potato Block
        potato_block = new PotatoBlock();
        potato_block.setUnlocalizedName("potato_block");
        potato_block.setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

//        Potato Ore
        potato_ore = new PotatoOre();
        potato_ore.setUnlocalizedName("potato_ore");
        potato_ore.setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

//        Potato Bush
        ModBush potato_bush = new ModBush("potato_bush");
        potato_bush_full = potato_bush.bushFull;
        potato_bush_empty = potato_bush.bushEmpty;


        registerNames();

    }

    public static void registerRenders(){
        registerRender(potato_block);
        registerRender(potato_ore);
        registerRender(potato_bush_empty);
        registerRender(potato_bush_full);


    }

    public static void registerNames(){
        registerName(potato_ore);
        registerName(potato_block);
        registerName(potato_bush_empty);
        registerName(potato_bush_full);
    }
    
}
