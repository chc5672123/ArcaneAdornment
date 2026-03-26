package com.aranaira.arcado.events;


import com.aranaira.arcado.ArcaneAdornmentMod;
import com.aranaira.arcado.item.JewelryItem;
import com.aranaira.arcado.registry.ItemRegistry;
import com.aranaira.arcado.registry.MagiChemItemRegistry;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(
        modid = ArcaneAdornmentMod.MODID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public class ClientEventHandler {

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {

        for (RegistryObject<Item> entry : ItemRegistry.ITEMS.getEntries()) {
            if(entry.get() instanceof JewelryItem ji) {
                ItemRegistry.CURIOS.add(ji);
            }
        }
        if(ModList.get().isLoaded("magichem")) {
            MagiChemItemRegistry.registerCurios();
        }

        event.register((stack, layer) -> {
            if(stack.getItem() instanceof JewelryItem ji && layer == 1) {
                return ji.getPackedColor();
            }
            return 0xffffffff;
        }, ItemRegistry.CURIOS.toArray(new Item[0]));
    }
}
