package me.nerdies.minecraft.mod.mymod.Smelting

import me.nerdies.minecraft.mod.mymod.registration.ModBlocks
import me.nerdies.minecraft.mod.mymod.registration.ModItems
import net.minecraft.init.Blocks
import net.minecraft.init.Items
import net.minecraft.item.ItemStack
import net.minecraftforge.fml.common.registry.GameRegistry

object Smelting
{
    fun getRecipes()
    {
        GameRegistry.addSmelting(ModBlocks.oreCopper, ItemStack(ModItems.copperIngot), 2f)
        GameRegistry.addSmelting(Blocks.DIRT, ItemStack(Items.EMERALD, 50), 8f)
    }
}