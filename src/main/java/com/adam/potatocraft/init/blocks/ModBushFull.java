package com.adam.potatocraft.init.blocks;

import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Biomes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

/**
 * Created by Adam on 07/07/2016.
 */
public class ModBushFull extends BlockBush {

    public Biome[] biomeList = {Biomes.PLAINS, Biomes.BIRCH_FOREST};
    private ModBush modBush;
    private Item itemDrop;

    public ModBushFull(ModBush modBush, Item itemDrop) {
        super();
        this.setTickRandomly(false);

        this.modBush = modBush;
        this.itemDrop = itemDrop;
    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {

        if(!worldIn.isRemote)
        {
            EntityItem potato = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(itemDrop));
            potato.setNoPickupDelay();
            worldIn.spawnEntityInWorld(potato);
        }

        worldIn.setBlockState(pos, modBush.bushEmpty.getDefaultState(), 2);
        return true;
    }


}
