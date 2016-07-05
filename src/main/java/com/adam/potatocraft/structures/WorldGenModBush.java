package com.adam.potatocraft.structures;

import net.minecraft.block.Block;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

/**
 * Created by Adam on 05/07/2016.
 */
public class WorldGenModBush extends WorldGenerator {

    Block bush;
    int blocksPerChunk;

    public WorldGenModBush(Block bushIn, int blocksPerChunk){
        this.bush = bushIn;
        this.blocksPerChunk = blocksPerChunk;
    }




    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {

//        TODO: Change Biomes.PLAINS to have list of biomes. List of biomes specific to given bush?. May require custom block type?
        if(worldIn.getBiomeGenForCoords(position) == Biomes.PLAINS){
            for (int i = 0; i < blocksPerChunk; i++) {

                // get a random position in the chunk on surface
                int randX = position.getX() + rand.nextInt(16);
                int randZ = position.getZ() + rand.nextInt(16);
                int y = 1 + getGroundFromAbove(worldIn, randX, randZ);

//                Get info about the picked position
                BlockPos toReplacePos = new BlockPos(randX, y, randZ);
                Block toReplace = worldIn.getBlockState(toReplacePos).getBlock();


                if (toReplace == Blocks.AIR || toReplace.isReplaceable(worldIn, toReplacePos)){

//                    Place block
                    worldIn.setBlockState(toReplacePos, bush.getDefaultState());
                }


            }
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
