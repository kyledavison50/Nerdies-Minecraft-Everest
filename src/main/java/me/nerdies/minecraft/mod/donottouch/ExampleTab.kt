package me.nerdies.minecraft.mod.donottouch

import me.nerdies.minecraft.mod.mymod.registration.ModItems
import net.minecraft.item.ItemStack
import net.minecraft.creativetab.CreativeTabs

class ExampleTab : CreativeTabs(ModInfo.MOD_ID)
{
    init
    {
        backgroundImageName = "tutorialmod.png"
    }
    override fun createIcon(): ItemStack
    {
        return ItemStack(ModItems.copperIngot)
    }

    override fun hasSearchBar(): Boolean
    {
        return true
    }
}