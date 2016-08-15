package com.adam.potatocraft.init;

import com.adam.potatocraft.init.items.*;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

import static com.adam.potatocraft.main.MyHelperMethods.registerItem;
import static com.adam.potatocraft.main.MyHelperMethods.registerRender;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftTools extends PotatoCraftItems{

    //	    New material for tools
    private static final Item.ToolMaterial TOOL_MATERIAL_POTATO = EnumHelper.addToolMaterial("POTATO", 1, 100, 5.0F, 1.5F, 8);

    private static Item potato_pickaxe;
    private static Item potato_axe;
    private static Item potato_shovel;
    private static Item potato_hoe;
    private static Item potato_sword;

    public static void init(){
        potato_pickaxe = registerItem(new PotatoCraftPickaxe(TOOL_MATERIAL_POTATO), "potato_pickaxe")
                .setUnlocalizedName("potato_pickaxe")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_axe = registerItem(new PotatoCraftAxe(TOOL_MATERIAL_POTATO), "potato_axe")
                .setUnlocalizedName("potato_axe")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_shovel = registerItem(new PotatoCraftShovel(TOOL_MATERIAL_POTATO), "potato_shovel")
                .setUnlocalizedName("potato_shovel")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_hoe = registerItem(new PotatoCraftHoe(TOOL_MATERIAL_POTATO), "potato_hoe")
                .setUnlocalizedName("potato_hoe")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_sword = registerItem(new PotatoCraftSword(TOOL_MATERIAL_POTATO), "potato_sword")
                .setUnlocalizedName("potato_sword")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

    }

    public static void registerRenders(){
        registerRender(potato_pickaxe);
        registerRender(potato_axe);
        registerRender(potato_shovel);
        registerRender(potato_hoe);
        registerRender(potato_sword);
    }




}
