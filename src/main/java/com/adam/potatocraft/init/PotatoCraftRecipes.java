package com.adam.potatocraft.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;
import net.minecraft.item.crafting.FurnaceRecipes;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoCraftRecipes {

    public static void init(){
        CraftingManager mgr = CraftingManager.getInstance();
        FurnaceRecipes furn = FurnaceRecipes.instance();

        regCraftingRecipes(mgr);
        regFurnaceRecipes(furn);

    }

    public static void regCraftingRecipes(CraftingManager mgr){
//        Shaped recipes
        mgr.addRecipe(new ItemStack(PotatoCraftBlocks.potato_block, 1), "ppp", "ppp", "ppp", 'p', Items.POTATO);

//        Shapeless recipes
        mgr.addShapelessRecipe(new ItemStack(Items.POTATO, 9), PotatoCraftBlocks.potato_block);

    }

    public static void regFurnaceRecipes(FurnaceRecipes furn){
//        Items
//        TODO: Change output to custom item
        furn.addSmelting(PotatoCraftItems.potato, new ItemStack(Items.POISONOUS_POTATO, 1), 0.5F);

//        Blocks
        furn.addSmeltingRecipeForBlock(PotatoCraftBlocks.potato_ore, new ItemStack(Items.POTATO, 2), 0.5F);
    }

    public static void regToolRecipes(){

    }
    
}
