package com.adam.potatocraft.init.blocks;

import net.minecraft.block.BlockBush;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Random;

/**
 * Created by Adam on 07/07/2016.
 */
public class ModBushEmpty extends BlockBush {

    private int growTime;
    private ModBush modBush;

    public ModBushEmpty(ModBush modBush, int growTime) {
        super();

        this.growTime = growTime;
        this.modBush = modBush;

    }

    @Override
    public void randomTick(World worldIn, BlockPos pos, IBlockState state, Random random) {
        super.randomTick(worldIn, pos, state, random);


        if (random.nextInt(growTime) == 0) {
            worldIn.setBlockState(pos, modBush.bushFull.getDefaultState());
        }

    }

}
