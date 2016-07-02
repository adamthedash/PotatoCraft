package com.adam.potatocraft.structures;

import com.adam.potatocraft.init.PotatoCraftBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by Adam on 21/05/2016.
 */
public class WorldGenPotatoBush extends WorldGenerator {


    @Override
    public boolean generate(World worldIn, Random rand, BlockPos pos) {
        // we randomly pick between a bush with a cookie and a bush without a cookie
        Block potatoBush = rand.nextBoolean() ? PotatoCraftBlocks.potato_bush_full : PotatoCraftBlocks.potato_bush_full;
        int y = 1 + getGroundFromAbove(worldIn, pos.getX(), pos.getZ());
        // debug:
        // System.out.println("Y-value of ground is " + y + " at (" + pos.getX() + ", " + pos.getZ() + ")");
        // the Y we passed earlier will be used here as the minimum spawn height allowed
        if(y >= pos.getY())
        {
            BlockPos bushPos = new BlockPos(pos.getX(), y, pos.getZ());
            // we know it's on top of grass or dirt, but what is here already?
            Block toReplace = worldIn.getBlockState(bushPos).getBlock();
            // only place bush if it is air or plant

            if (toReplace == Blocks.AIR || toReplace.isReplaceable(worldIn, pos))
            {
                // set the block to a bush
                // use 2 as the flag to prevent update -- you don't have to include that parameter
                worldIn.setBlockState(bushPos, potatoBush.getDefaultState(), 2);
                // debug:
                // System.out.println("placed a cookie bush!");
            }   // else System.out.println("Sadly, this block is occupied by " + toReplace.getUnlocalizedName());
        }
        return false;
    }

    /**HELPER METHODS**/
    // find a grass or dirt block to place the bush on
    public static int getGroundFromAbove(World world, int x, int z)
    {
        int y = 255;
        boolean foundGround = false;
        while(!foundGround && y-- >= 0)
        {
            Block blockAt = world.getBlockState(new BlockPos(x,y,z)).getBlock();
            // "ground" for our bush is grass or dirt
            foundGround = blockAt == Blocks.DIRT || blockAt == Blocks.GRASS;
        }

        return y;
    }

}
