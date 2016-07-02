package com.adam.potatocraft.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoBlock extends Block{

    public PotatoBlock(){
        super(Material.IRON);
        setRegistryName("potato_block");
        setResistance(3F);
        setHardness(3F);
        setHarvestLevel("pickaxe", 2);
    }
}
