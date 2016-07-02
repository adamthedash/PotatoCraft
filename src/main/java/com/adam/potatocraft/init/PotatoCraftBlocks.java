package com.adam.potatocraft.init;

import com.adam.potatocraft.init.blocks.PotatoBlock;
import com.adam.potatocraft.init.blocks.PotatoBushEmpty;
import com.adam.potatocraft.init.blocks.PotatoBushFull;
import com.adam.potatocraft.init.blocks.PotatoOre;
import com.adam.potatocraft.main.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftBlocks {

    public static PotatoBlock potato_block;
    public static Block potato_bush_full;
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
        potato_bush_empty = new PotatoBushEmpty();
        potato_bush_empty.setUnlocalizedName("potato_bush_empty");
        potato_bush_empty.setCreativeTab(PotatoCraftTabs.tabPotatoCraft);
        potato_bush_empty.setRegistryName("potato_bush_empty");

        potato_bush_full = new PotatoBushFull();
        potato_bush_full.setUnlocalizedName("potato_bush_full");
        potato_bush_full.setCreativeTab(PotatoCraftTabs.tabPotatoCraft);
        potato_bush_full.setRegistryName("potato_bush_full");

        registerNames();

    }

    public static void registerRenders(){
        registerRender(potato_block);
        registerRender(potato_ore);
        registerRender(potato_bush_empty);
        registerRender(potato_bush_full);
    }

    public static void registerRender(Block block){

        Item item = Item.getItemFromBlock(block);

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

    public static void registerNames(){
        registerName(potato_ore);
        registerName(potato_block);
        registerName(potato_bush_empty);
        registerName(potato_bush_full);
    }

    public static void registerName(Block block){

        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());


    }
    
}
