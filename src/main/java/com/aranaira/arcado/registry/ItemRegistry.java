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

    public static final RegistryObject<Item> RING_CITRINE_1_GOLD = ITEMS.register("ring_citrine_1_gold",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.YELLOW, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_CITRINE_2_GOLD = ITEMS.register("ring_citrine_2_gold",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.YELLOW, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_CITRINE_3_GOLD = ITEMS.register("ring_citrine_3_gold",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.YELLOW, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_CITRINE_4_GOLD = ITEMS.register("ring_citrine_4_gold",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.YELLOW, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_CITRINE_5_GOLD = ITEMS.register("ring_citrine_5_gold",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.YELLOW, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_PERIDOT_1_GOLD = ITEMS.register("ring_peridot_1_gold",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.LIME, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_PERIDOT_2_GOLD = ITEMS.register("ring_peridot_2_gold",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.LIME, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_PERIDOT_3_GOLD = ITEMS.register("ring_peridot_3_gold",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.LIME, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_PERIDOT_4_GOLD = ITEMS.register("ring_peridot_4_gold",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.LIME, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_PERIDOT_5_GOLD = ITEMS.register("ring_peridot_5_gold",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.LIME, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_1_GOLD = ITEMS.register("ring_tourmaline_1_gold",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLUE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_2_GOLD = ITEMS.register("ring_tourmaline_2_gold",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLUE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_3_GOLD = ITEMS.register("ring_tourmaline_3_gold",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLUE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_4_GOLD = ITEMS.register("ring_tourmaline_4_gold",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLUE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_5_GOLD = ITEMS.register("ring_tourmaline_5_gold",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLUE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_KUNZITE_1_GOLD = ITEMS.register("ring_kunzite_1_gold",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PURPLE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_KUNZITE_2_GOLD = ITEMS.register("ring_kunzite_2_gold",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PURPLE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_KUNZITE_3_GOLD = ITEMS.register("ring_kunzite_3_gold",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PURPLE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_KUNZITE_4_GOLD = ITEMS.register("ring_kunzite_4_gold",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PURPLE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_KUNZITE_5_GOLD = ITEMS.register("ring_kunzite_5_gold",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PURPLE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_SPINEL_1_GOLD = ITEMS.register("ring_spinel_1_gold",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PINK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_SPINEL_2_GOLD = ITEMS.register("ring_spinel_2_gold",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PINK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_SPINEL_3_GOLD = ITEMS.register("ring_spinel_3_gold",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PINK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_SPINEL_4_GOLD = ITEMS.register("ring_spinel_4_gold",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PINK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_SPINEL_5_GOLD = ITEMS.register("ring_spinel_5_gold",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PINK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_1_GOLD = ITEMS.register("ring_onyx_1_gold",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLACK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_2_GOLD = ITEMS.register("ring_onyx_2_gold",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLACK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_3_GOLD = ITEMS.register("ring_onyx_3_gold",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLACK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_4_GOLD = ITEMS.register("ring_onyx_4_gold",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLACK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ONYX_5_GOLD = ITEMS.register("ring_onyx_5_gold",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLACK, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ZIRCON_1_GOLD = ITEMS.register("ring_zircon_1_gold",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.WHITE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ZIRCON_2_GOLD = ITEMS.register("ring_zircon_2_gold",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.WHITE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ZIRCON_3_GOLD = ITEMS.register("ring_zircon_3_gold",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.WHITE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ZIRCON_4_GOLD = ITEMS.register("ring_zircon_4_gold",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.WHITE, MetalAlignment.GOLD)
    );

    public static final RegistryObject<Item> RING_ZIRCON_5_GOLD = ITEMS.register("ring_zircon_5_gold",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.WHITE, MetalAlignment.GOLD)
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

    public static final RegistryObject<Item> RING_GARNET_1_SILVER = ITEMS.register("ring_garnet_1_silver",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.RED, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_GARNET_2_SILVER = ITEMS.register("ring_garnet_2_silver",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.RED, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_GARNET_3_SILVER = ITEMS.register("ring_garnet_3_silver",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.RED, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_GARNET_4_SILVER = ITEMS.register("ring_garnet_4_silver",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.RED, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_GARNET_5_SILVER = ITEMS.register("ring_garnet_5_silver",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.RED, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_CITRINE_1_SILVER = ITEMS.register("ring_citrine_1_silver",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.YELLOW, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_CITRINE_2_SILVER = ITEMS.register("ring_citrine_2_silver",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.YELLOW, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_CITRINE_3_SILVER = ITEMS.register("ring_citrine_3_silver",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.YELLOW, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_CITRINE_4_SILVER = ITEMS.register("ring_citrine_4_silver",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.YELLOW, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_CITRINE_5_SILVER = ITEMS.register("ring_citrine_5_silver",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.YELLOW, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_PERIDOT_1_SILVER = ITEMS.register("ring_peridot_1_silver",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.LIME, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_PERIDOT_2_SILVER = ITEMS.register("ring_peridot_2_silver",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.LIME, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_PERIDOT_3_SILVER = ITEMS.register("ring_peridot_3_silver",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.LIME, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_PERIDOT_4_SILVER = ITEMS.register("ring_peridot_4_silver",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.LIME, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_PERIDOT_5_SILVER = ITEMS.register("ring_peridot_5_silver",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.LIME, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_1_SILVER = ITEMS.register("ring_tourmaline_1_silver",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLUE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_2_SILVER = ITEMS.register("ring_tourmaline_2_silver",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLUE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_3_SILVER = ITEMS.register("ring_tourmaline_3_silver",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLUE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_4_SILVER = ITEMS.register("ring_tourmaline_4_silver",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLUE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_5_SILVER = ITEMS.register("ring_tourmaline_5_silver",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLUE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_KUNZITE_1_SILVER = ITEMS.register("ring_kunzite_1_silver",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PURPLE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_KUNZITE_2_SILVER = ITEMS.register("ring_kunzite_2_silver",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PURPLE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_KUNZITE_3_SILVER = ITEMS.register("ring_kunzite_3_silver",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PURPLE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_KUNZITE_4_SILVER = ITEMS.register("ring_kunzite_4_silver",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PURPLE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_KUNZITE_5_SILVER = ITEMS.register("ring_kunzite_5_silver",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PURPLE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_SPINEL_1_SILVER = ITEMS.register("ring_spinel_1_silver",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PINK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_SPINEL_2_SILVER = ITEMS.register("ring_spinel_2_silver",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PINK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_SPINEL_3_SILVER = ITEMS.register("ring_spinel_3_silver",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PINK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_SPINEL_4_SILVER = ITEMS.register("ring_spinel_4_silver",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PINK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_SPINEL_5_SILVER = ITEMS.register("ring_spinel_5_silver",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PINK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ONYX_1_SILVER = ITEMS.register("ring_onyx_1_silver",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLACK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ONYX_2_SILVER = ITEMS.register("ring_onyx_2_silver",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLACK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ONYX_3_SILVER = ITEMS.register("ring_onyx_3_silver",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLACK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ONYX_4_SILVER = ITEMS.register("ring_onyx_4_silver",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLACK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ONYX_5_SILVER = ITEMS.register("ring_onyx_5_silver",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLACK, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ZIRCON_1_SILVER = ITEMS.register("ring_zircon_1_silver",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.WHITE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ZIRCON_2_SILVER = ITEMS.register("ring_zircon_2_silver",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.WHITE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ZIRCON_3_SILVER = ITEMS.register("ring_zircon_3_silver",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.WHITE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ZIRCON_4_SILVER = ITEMS.register("ring_zircon_4_silver",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.WHITE, MetalAlignment.SILVER)
    );

    public static final RegistryObject<Item> RING_ZIRCON_5_SILVER = ITEMS.register("ring_zircon_5_silver",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.WHITE, MetalAlignment.SILVER)
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

        if (ModList.get().isLoaded("magichem")) {
            MagiChemItemRegistry.register(eventBus);
        }
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public static RegistryObject<Item> getRegistryObject(DeferredRegister<Item> register, String name) {
        return register.getEntries().stream().filter(item -> item.getId().getPath().equals(name)).findFirst().get();
    }
}
