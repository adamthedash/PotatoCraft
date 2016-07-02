package com.adam.potatocraft.structures;

import net.minecraft.init.Biomes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Adam on 21/05/2016.
 */
public class MyWorldGenerator implements IWorldGenerator {


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        // these are important!
        int blockX = chunkX * 16;
        int blockZ = chunkZ * 16;

        // generate differently based on dimension
        switch(world.provider.getDimension())
        {
            case -1: generateNether(world, random, blockX, blockZ);
                break;
            case 0: generateOverworld(world, random, blockX, blockZ);
                break;
            case 1: generateEnd(world, random, blockX, blockZ);
                break;
        }
    }

    private void generateNether(World world, Random random, int blockX, int blockZ) {
    }

    private void generateOverworld(World world, Random rand, int blockX, int blockZ) {


        /** COOKIE BUSH GEN **/
        // make a world generator to use
        WorldGenerator genCookieBushes = new WorldGenPotatoBush();

        // get the biome. I used 64 for Y, but you can use anything between 0 and 255
        Biome biome = world.getBiomeGenForCoords(new BlockPos(blockX, 64, blockZ));

        /*
        check that it's a Plains biome
        we could also use: if(biome instanceof BiomeGenPlains)
        */
        if(biome == Biomes.PLAINS)
        {
            /*
            how many we want to make per chunk
            let's make it random between MIN and MAX
            */
            int MIN = 1;
            int MAX = 4;
            int numBushes = MIN + rand.nextInt(MAX - MIN);

            // now let's generate the bushes
            for(int i = 0; i < numBushes; i++)
            {
                // get a random position in the chunk
                int randX = blockX + rand.nextInt(16);
                int randZ = blockZ + rand.nextInt(16);

                // the y-value we pass here will be used as minimum spawn height
                genCookieBushes.generate(world, rand, new BlockPos(randX, 24, randZ));
            }
        }
        /** END COOKIE BUSH GEN **/




    }

    private void generateEnd(World world, Random random, int blockX, int blockZ) {

    }

}
