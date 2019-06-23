package me.nerdies.minecraft.mod.donottouch.base

import me.nerdies.minecraft.mod.donottouch.Nerdiesmod
import net.minecraft.item.ItemFood


open class FoodBase(var name: String, var hunger: Int, var saturation: Float, var wolf: Boolean) : ItemFood(hunger, saturation, wolf)
{
    init {
        setRegistryName(name)
        translationKey = name
        creativeTab = Nerdiesmod.creativeTab
    }

    fun registerItemModel() {
        Nerdiesmod.proxy.registerItemRenderer(this, 0, name)
    }
}