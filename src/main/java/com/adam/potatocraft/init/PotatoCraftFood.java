package com.adam.potatocraft.init;

import com.adam.potatocraft.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

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

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }


    //	registerItem
    public static Item registerItem(Item item, String name){
        return registerItem(item, name, null);

    }

    public static Item registerItem(Item item, String name, CreativeTabs tab){
        GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
        return item;

    }

//	RegisterItem end



}
