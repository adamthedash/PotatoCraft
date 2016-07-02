package com.adam.potatocraft.init;

import com.adam.potatocraft.init.items.PotatoCraftAxe;
import com.adam.potatocraft.init.items.PotatoCraftHoe;
import com.adam.potatocraft.init.items.PotatoCraftPickaxe;
import com.adam.potatocraft.init.items.PotatoCraftSpade;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftTools extends PotatoCraftItems{

    //	    New material for tools
    public static final Item.ToolMaterial TOOL_MATERIAL_POTATO = EnumHelper.addToolMaterial("POTATO", 1, 100, 5.0F, 1.5F, 8);

    public static Item potato_pickaxe;
    public static Item potato_axe;
    public static Item potato_spade;
    public static Item potato_hoe;

    public static void init(){
        potato_pickaxe = registerItem(new PotatoCraftPickaxe(TOOL_MATERIAL_POTATO), "potato_pickaxe")
                .setUnlocalizedName("potato_pickaxe")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_axe = registerItem(new PotatoCraftAxe(TOOL_MATERIAL_POTATO), "potato_axe")
                .setUnlocalizedName("potato_axe")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_spade = registerItem(new PotatoCraftSpade(TOOL_MATERIAL_POTATO), "potato_spade")
                .setUnlocalizedName("potato_spade")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);

        potato_hoe = registerItem(new PotatoCraftHoe(TOOL_MATERIAL_POTATO), "potato_hoe")
                .setUnlocalizedName("potato_hoe")
                .setCreativeTab(PotatoCraftTabs.tabPotatoCraft);



    }

    public static void registerRenders(){
        registerRender(potato_pickaxe);
        registerRender(potato_axe);
        registerRender(potato_spade);
        registerRender(potato_hoe);
    }




}
