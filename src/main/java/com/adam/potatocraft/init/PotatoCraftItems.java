package com.adam.potatocraft.init;

/**
 * Created by Adam on 29/06/2016.
 */
import com.adam.potatocraft.main.Reference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;


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


    /**	registerItem start**/

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

    public static Item registerItem(Item item, String name){
        return registerItem(item, name, null);

    }

    public static Item registerItem(Item item, String name, CreativeTabs tab){
        GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
        return item;

    }

    /**	registerItem start**/

}