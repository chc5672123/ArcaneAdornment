package com.aranaira.arcado.registry;

import com.aranaira.arcado.ArcaneAdornmentMod;
import com.aranaira.arcado.item.*;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = ArcaneAdornmentMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MagiChemItemRegistry {
    public static final DeferredRegister<Item> MAGICHEM_ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArcaneAdornmentMod.MODID);

    public static final RegistryObject<Item> ELECTRUM_PLATED_MUNDANE_RING = MAGICHEM_ITEMS.register("mundane_ring_electrum",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> ELECTRUM_PLATED_MUNDANE_BRACELET = MAGICHEM_ITEMS.register("mundane_bracelet_electrum",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> ELECTRUM_PLATED_MUNDANE_AMULET = MAGICHEM_ITEMS.register("mundane_amulet_electrum",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> ELECTRUM_PLATED_MUNDANE_CIRCLET = MAGICHEM_ITEMS.register("mundane_circlet_electrum",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> GRIMY_GRIT = MAGICHEM_ITEMS.register("grimy_grit",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> PREEMINENT_POLISH = MAGICHEM_ITEMS.register("preeminent_polish",
            () -> new Item(new Item.Properties())
    );

    ///////////////
    // TECHNICAL HELPERS
    ///////////////

    public static void register(IEventBus eventBus) {
        MAGICHEM_ITEMS.register(eventBus);
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public static RegistryObject<Item> getRegistryObject(DeferredRegister<Item> register, String name) {
        return register.getEntries().stream().filter(item -> item.getId().getPath().equals(name)).findFirst().get();
    }

    public static void acceptForCreativeTab(CreativeModeTab.Output output) {
        MAGICHEM_ITEMS.getEntries().forEach((item) -> {
            output.accept(item.get());
        });
    }
}
