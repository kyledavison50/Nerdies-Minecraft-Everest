package me.nerdies.minecraft.mod.donottouch

import me.nerdies.minecraft.mod.donottouch.proxy.CommonProxy
import me.nerdies.minecraft.mod.mymod.registration.ModBlocks
import me.nerdies.minecraft.mod.mymod.registration.ModItems
import net.minecraft.block.Block
import net.minecraft.item.Item
import net.minecraftforge.client.event.ModelRegistryEvent
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.event.RegistryEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.SidedProxy
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent
import net.minecraftforge.fml.common.eventhandler.EventBus
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraft.init.SoundEvents
import net.minecraftforge.common.util.EnumHelper
import net.minecraft.item.ItemArmor




@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.VERSION, modLanguageAdapter = "net.shadowfacts.forgelin.KotlinAdapter")
object Nerdiesmod
{
    @SidedProxy(serverSide = ModInfo.commonProxyLocation, clientSide = ModInfo.clientProxyLocation)
    lateinit var proxy: CommonProxy
    lateinit var eventBus: EventBus

    val copperArmorMaterial = EnumHelper.addArmorMaterial("COPPER", ModInfo.MOD_ID + ":copper", 15, intArrayOf(2, 5, 6, 2), 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0f)

    val creativeTab = ExampleTab()

    @Mod.EventHandler
    fun preinit(event: FMLPreInitializationEvent)
    {
        eventBus = MinecraftForge.EVENT_BUS
        eventBus.register(ObjectRegistryHandler)
    }

    @Mod.EventHandler
    fun init(event: FMLInitializationEvent)
    {

    }

    @Mod.EventHandler
    fun postinit(event: FMLPostInitializationEvent)
    {

    }

    @Mod.EventBusSubscriber
    object ObjectRegistryHandler
    {
        @SubscribeEvent
        fun addItems(event: RegistryEvent.Register<Item>)
        {
            ModItems.register(event.registry)
            ModBlocks.registerItemBlocks(event.registry)
        }

        @SubscribeEvent
        fun addBlocks(event: RegistryEvent.Register<Block>)
        {
            ModBlocks.register(event.registry)
        }

        @SubscribeEvent
        fun registerModels(event: ModelRegistryEvent)
        {
            ModItems.registerModels()
            ModBlocks.registerModels()
        }
    }
}
