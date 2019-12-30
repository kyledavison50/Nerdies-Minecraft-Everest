package me.nerdies.minecraft.mod.mymod.registration

import me.nerdies.minecraft.mod.donottouch.registration.RegisterBlocks
import me.nerdies.minecraft.mod.mymod.blocks.CBlock
import me.nerdies.minecraft.mod.mymod.blocks.CopperOre
import me.nerdies.minecraft.mod.mymod.blocks.JewelOre
import me.nerdies.minecraft.mod.mymod.blocks.RedWindow


object ModBlocks : RegisterBlocks()
{
    val oreCopper = CopperOre()
    val c_block = CBlock()
    val redWindow = RedWindow()
    val jewelOre = JewelOre()

    init
    {
        blockList.add(oreCopper)
        blockList.add(c_block)
        blockList.add(redWindow)
        blockList.add(jewelOre)
    }
}