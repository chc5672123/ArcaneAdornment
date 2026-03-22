package com.aranaira.arcado.events;


import com.aranaira.arcado.ArcaneAdornmentMod;
import com.aranaira.arcado.item.JewelryItem;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(
        modid = ArcaneAdornmentMod.MODID,
        bus = Mod.EventBusSubscriber.Bus.MOD,
        value = Dist.CLIENT
)
public class ClientEventHandler {

    @SubscribeEvent
    public static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        event.register((stack, layer) -> {
            if(stack.getItem() instanceof JewelryItem ji && layer == 1) {
                return ji.getPackedColor();
            }
            return 0xffffffff;
        });
    }
}
