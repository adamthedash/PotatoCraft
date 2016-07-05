package com.adam.potatocraft.structures;

import com.adam.potatocraft.init.PotatoCraftBlocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

import java.util.Random;

/**
 * Created by Adam on 21/05/2016.
 */
public class MyWorldGenerator implements IWorldGenerator {


    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {

        // Current chunk 0,0 postions
        int blockX = chunkX * 16;
        int blockZ = chunkZ * 16;

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

    WorldGenMinable genPotatoOre;
    WorldGenerator genPotatoBushes;


    private void generateOverworld(World world, Random rand, int blockX, int blockZ) {

        genPotatoOre = new WorldGenMinable(PotatoCraftBlocks.potato_ore.getBlockState().getBaseState(), 20);
        genPotatoOre.generate(world, rand, new BlockPos(blockX, 64, blockZ));

        genPotatoBushes = new WorldGenModBush(PotatoCraftBlocks.potato_bush_full, 4);
        genPotatoBushes.generate(world, rand, new BlockPos(blockX, 64, blockZ));

    }

    private void generateEnd(World world, Random random, int blockX, int blockZ) {

    }

    private void generateNether(World world, Random random, int blockX, int blockZ) {
    }


}
