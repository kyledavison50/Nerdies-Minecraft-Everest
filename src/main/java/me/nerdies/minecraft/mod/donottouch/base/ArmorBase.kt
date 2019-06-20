package me.nerdies.minecraft.mod.donottouch.base

import net.minecraft.inventory.EntityEquipmentSlot
import net.minecraft.item.Item
import me.nerdies.minecraft.mod.donottouch.Nerdiesmod
import net.minecraft.item.ItemArmor

open class ArmorBase(material: ArmorMaterial = ArmorMaterial.IRON, slot: EntityEquipmentSlot, var name: String) : ItemArmor(material, 0, slot)
{
    init
    {
        setRegistryName(name)
        translationKey = name
        creativeTab = Nerdiesmod.creativeTab
    }

    fun registerItemModel()
    {
        Nerdiesmod.proxy.registerItemRenderer(this, 0, name)
    }
}