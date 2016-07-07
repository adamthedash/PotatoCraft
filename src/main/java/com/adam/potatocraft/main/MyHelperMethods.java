package com.adam.potatocraft.main;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Adam on 07/07/2016.
 */
public class MyHelperMethods {

    /**
     * Register start
     **/
    public static void registerName(Block block) {
        GameRegistry.register(block);
        GameRegistry.register(new ItemBlock(block), block.getRegistryName());

    }

    public static void registerRender(Item item) {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

    public static void registerRender(Block block) {

        Item item = Item.getItemFromBlock(block);

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher()
                .register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

    public static Item registerItem(Item item, String name) {
        return registerItem(item, name, null);

    }

    public static Item registerItem(Item item, String name, CreativeTabs tab) {
        GameRegistry.register(item, new ResourceLocation(Reference.MODID, name));
        return item;

    }

    /**
     * Register end
     **/

    // find a grass or dirt block to place the bush on
    public static int getGroundFromAbove(World world, int x, int z) {
        int y = 255;
        boolean foundGround = false;
        while (!foundGround && y-- >= 0) {
            Block blockAt = world.getBlockState(new BlockPos(x, y, z)).getBlock();
            // "ground" for our bush is grass or dirt
            foundGround = blockAt == Blocks.DIRT || blockAt == Blocks.GRASS;
        }

        return y;
    }


}
