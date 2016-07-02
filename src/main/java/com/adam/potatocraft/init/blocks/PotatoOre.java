package com.adam.potatocraft.init.blocks;

import com.adam.potatocraft.init.PotatoCraftItems;
import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoOre extends BlockOre{

    public PotatoOre(){

        super();
        this.setHarvestLevel("pickaxe", 2);
        setRegistryName("potato_ore");
        setResistance(3F);
        setHardness(3F);

    }

    @Override
    public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
        return 5;
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Items.POTATO;
    }

}
