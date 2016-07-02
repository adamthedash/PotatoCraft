package com.adam.potatocraft.init.blocks;

import com.adam.potatocraft.init.PotatoCraftBlocks;
import net.minecraft.block.BlockBush;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Adam on 29/06/2016.
 */
public class PotatoBushEmpty extends BlockBush {

    public PotatoBushEmpty()
    {
        super();

        this.setTickRandomly(true); // this allows the plant to randomly update
        this.setSoundType(SoundType.PLANT);
//        float f = 0.4F;
//        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.5F + f, 0.5F + f);

    }

    @Override
    public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random rand)
    {
        super.randomTick(worldIn, pos, state, rand);
        // doesn't grow with every update.
        // 40% of the time it grows
        final int GROW_CHANCE = 30;
        if(rand.nextInt(100) < GROW_CHANCE)
        {
            worldIn.setBlockState(pos, PotatoCraftBlocks.potato_bush_full.getDefaultState());
        }
    }

}
