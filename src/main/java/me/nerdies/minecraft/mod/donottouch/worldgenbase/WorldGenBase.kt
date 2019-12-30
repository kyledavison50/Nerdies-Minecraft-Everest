package me.nerdies.minecraft.mod.donottouch.worldgenbase

import me.nerdies.minecraft.mod.mymod.registration.ModBlocks
import net.minecraft.block.state.IBlockState
import net.minecraft.util.math.BlockPos
import net.minecraft.world.chunk.IChunkProvider
import net.minecraft.world.gen.IChunkGenerator
import net.minecraft.world.World
import net.minecraft.world.gen.feature.WorldGenMinable
import net.minecraftforge.fml.common.IWorldGenerator
import java.util.*

abstract class WorldGenBase : IWorldGenerator
{
    fun generateOre(ore : IBlockState, world : World, random : Random, x : Int, z : Int, minY : Int, maxY : Int, size : Int, chances : Int)
    {
        val deltaY = maxY - minY

        for (i in 0 until chances)
        {
            val pos = BlockPos(x * 16 + random.nextInt(16), minY + random.nextInt(deltaY), z * 16 + random.nextInt(16))

            val generator = WorldGenMinable(ore, size)
            generator.generate(world, random, pos)
        }
    }

}