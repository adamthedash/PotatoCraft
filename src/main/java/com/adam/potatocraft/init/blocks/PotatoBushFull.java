package com.adam.potatocraft.init.blocks;

import com.adam.potatocraft.init.PotatoCraftBlocks;
import com.adam.potatocraft.init.PotatoCraftItems;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

/**
 * Created by Adam on 21/05/2016.
 */
public class PotatoBushFull extends PotatoBushEmpty{
    public PotatoBushFull()
    {
        super();
        this.setTickRandomly(false);

    }

    @Override
    public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn, EnumHand hand, ItemStack heldItem, EnumFacing side, float hitX, float hitY, float hitZ) {
//         make the cookie item to give the player
        if(!worldIn.isRemote)
        {
            EntityItem potato = new EntityItem(worldIn, playerIn.posX, playerIn.posY, playerIn.posZ, new ItemStack(Items.POTATO));
            potato.setNoPickupDelay();
            worldIn.spawnEntityInWorld(potato);
        }
        // replace this block with a non-cookie bush
        worldIn.setBlockState(pos, PotatoCraftBlocks.potato_bush_empty.getDefaultState(), 2);
        return true;
    }


}
