package com.adam.potatocraft.structures;

import com.adam.potatocraft.init.blocks.ModBushFull;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.feature.WorldGenerator;

import java.util.Random;

import static com.adam.potatocraft.main.MyHelperMethods.getGroundFromAbove;

/**
 * Created by Adam on 05/07/2016.
 */
public class WorldGenModBush extends WorldGenerator {

    private ModBushFull bush;
    private int blocksPerChunk;

    public WorldGenModBush(ModBushFull bushIn, int blocksPerChunk) {
        this.bush = bushIn;
        this.blocksPerChunk = blocksPerChunk;
    }

    @Override
    public boolean generate(World worldIn, Random rand, BlockPos position) {

//        TODO: Change to use list of biomes. List of biomes specific to given bush?. May require custom block type?

//        Uses temperature of biome for generation. Could be mod-compatible? TODO: Check if biome temp works with mod biomes
        if (worldIn.getBiomeGenForCoords(position).getTempCategory() == Biome.TempCategory.MEDIUM) {

//        Uses list of biomes for generation
//        if (Arrays.asList(bush.biomeList).contains(worldIn.getBiomeGenForCoords(position))){
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

}
