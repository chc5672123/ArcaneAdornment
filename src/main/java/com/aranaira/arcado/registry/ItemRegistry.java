package com.aranaira.arcado.registry;

import com.aranaira.arcado.ArcaneAdornmentMod;
import com.aranaira.arcado.foundation.MetalAlignment;
import com.aranaira.arcado.item.*;
import net.minecraft.nbt.CompoundTag;
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
public class ItemRegistry {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ArcaneAdornmentMod.MODID);

    public static final RegistryObject<Item> JEWEL_GARNET = ITEMS.register("jewel_garnet",
            () -> new JewelItem(new Item.Properties(), DyeColor.RED)
    );

    public static final RegistryObject<Item> JEWEL_CITRINE = ITEMS.register("jewel_citrine",
            () -> new JewelItem(new Item.Properties(), DyeColor.YELLOW)
    );

    public static final RegistryObject<Item> JEWEL_PERIDOT = ITEMS.register("jewel_peridot",
            () -> new JewelItem(new Item.Properties(), DyeColor.LIME)
    );

    public static final RegistryObject<Item> JEWEL_TOURMALINE = ITEMS.register("jewel_tourmaline",
            () -> new JewelItem(new Item.Properties(), DyeColor.BLUE)
    );

    public static final RegistryObject<Item> JEWEL_KUNZITE = ITEMS.register("jewel_kunzite",
            () -> new JewelItem(new Item.Properties(), DyeColor.PURPLE)
    );

    public static final RegistryObject<Item> JEWEL_SPINEL = ITEMS.register("jewel_spinel",
            () -> new JewelItem(new Item.Properties(), DyeColor.PINK)
    );

    public static final RegistryObject<Item> JEWEL_ONYX = ITEMS.register("jewel_onyx",
            () -> new JewelItem(new Item.Properties(), DyeColor.BLACK)
    );

    public static final RegistryObject<Item> JEWEL_ZIRCON = ITEMS.register("jewel_zircon",
            () -> new JewelItem(new Item.Properties(), DyeColor.WHITE)
    );

    public static final RegistryObject<Item> GOLD_PLATED_MUNDANE_RING = ITEMS.register("mundane_ring_gold",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> RING_GARNET_1_GOLD = ITEMS.register("ring_garnet_1_gold",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_GARNET_2_GOLD = ITEMS.register("ring_garnet_2_gold",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_GARNET_3_GOLD = ITEMS.register("ring_garnet_3_gold",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_GARNET_4_GOLD = ITEMS.register("ring_garnet_4_gold",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_GARNET_5_GOLD = ITEMS.register("ring_garnet_5_gold",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_1_GOLD = ITEMS.register("ring_onyx_1_gold",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_2_GOLD = ITEMS.register("ring_onyx_2_gold",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_3_GOLD = ITEMS.register("ring_onyx_3_gold",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_4_GOLD = ITEMS.register("ring_onyx_4_gold",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_5_GOLD = ITEMS.register("ring_onyx_5_gold",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.RED, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> GOLD_PLATED_MUNDANE_BRACELET = ITEMS.register("mundane_bracelet_gold",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> GOLD_PLATED_MUNDANE_AMULET = ITEMS.register("mundane_amulet_gold",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> SILVER_PLATED_MUNDANE_RING = ITEMS.register("mundane_ring_silver",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> SILVER_PLATED_MUNDANE_BRACELET = ITEMS.register("mundane_bracelet_silver",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> SILVER_PLATED_MUNDANE_AMULET = ITEMS.register("mundane_amulet_silver",
            () -> new Item(new Item.Properties())
    );

    ///////////////
    // TECHNICAL HELPERS
    ///////////////

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);

        for (RegistryObject<Item> entry : ITEMS.getEntries()) {
            if(entry.get() instanceof JewelryItem ji) {
                entry.get().verifyTagAfterLoad(ji.createAttributeTag());
            }
        }

        if (ModList.get().isLoaded("magichem")) {
            MagiChemItemRegistry.register(eventBus);
        }
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public static RegistryObject<Item> getRegistryObject(DeferredRegister<Item> register, String name) {
        return register.getEntries().stream().filter(item -> item.getId().getPath().equals(name)).findFirst().get();
    }
}
