package me.nerdies.minecraft.mod.mymod.weapons

import me.nerdies.minecraft.mod.donottouch.base.SwordBase
import net.minecraft.entity.EntityLivingBase
import net.minecraft.entity.passive.EntityCow
import net.minecraft.item.ItemStack

class CopperSword: SwordBase("copper_sword")
{
    override fun hitEntity(stack: ItemStack, target: EntityLivingBase, attacker: EntityLivingBase): Boolean
    {
        if(target is EntityCow)
        {
            target.setFire(10)
            target.health = 1f
            target.knockBack(target, 50f, .5, .5)
        }
        return super.hitEntity(stack, target, attacker)
    }
}