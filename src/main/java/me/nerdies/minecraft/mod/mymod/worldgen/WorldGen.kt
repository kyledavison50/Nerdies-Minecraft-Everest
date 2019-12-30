package me.nerdies.minecraft.mod.mymod.worldgen

import me.nerdies.minecraft.mod.donottouch.worldgenbase.WorldGenBase
import me.nerdies.minecraft.mod.mymod.registration.ModBlocks
import net.minecraft.world.World
import net.minecraft.world.chunk.IChunkProvider
import net.minecraft.world.gen.IChunkGenerator
import java.util.*

object WorldGen : WorldGenBase()
{
    override fun generate(random: Random, chunkX: Int, chunkZ: Int, world: World, chunkGenerator: IChunkGenerator, chunkProvider: IChunkProvider)
    {
        if (world.provider.dimension == 0)
        {
            generateOverworld(random, chunkX, chunkZ, world)
        }
    }

    fun generateOverworld(random: Random, chunkX: Int, chunkZ: Int, world: World)
    {
        generateOre(ModBlocks.oreCopper.defaultState, world, random, chunkX, chunkZ, 10, 64, 8 + random.nextInt(4), 30)
        generateOre(ModBlocks.c_block.defaultState, world, random, chunkX, chunkZ, 10, 64, 8 + random.nextInt(4), 30)
        generateOre(ModBlocks.jewelOre.defaultState, world, random, chunkX, chunkZ, 10, 64, 2 + random.nextInt(4), 30)
    }
}