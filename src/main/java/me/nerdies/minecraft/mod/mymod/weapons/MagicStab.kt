package me.nerdies.minecraft.mod.mymod.weapons

import me.nerdies.minecraft.mod.donottouch.Nerdiesmod
import me.nerdies.minecraft.mod.donottouch.base.SwordBase
import net.minecraft.entity.Entity
import net.minecraft.entity.EntityLivingBase
import net.minecraft.entity.passive.EntityCow
import net.minecraft.item.ItemStack

class MagicStab : SwordBase("magic_stab", Nerdiesmod.godMaterial!!)
{
    override fun hitEntity(stack: ItemStack, target: EntityLivingBase, attacker: EntityLivingBase): Boolean
    {
        if(target is Entity)
        {
            target.setFire(10)
            target.knockBack(target, 50f, .5, .5)
        }
        return super.hitEntity(stack, target, attacker)
    }
}