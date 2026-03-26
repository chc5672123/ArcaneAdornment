package com.aranaira.arcado.registry;

import com.aranaira.arcado.ArcaneAdornmentMod;
import com.aranaira.arcado.foundation.MetalAlignment;
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

    ///////////////////
    // ELECTRUM RINGS
    ///////////////////

    public static final RegistryObject<Item> ELECTRUM_PLATED_MUNDANE_RING = MAGICHEM_ITEMS.register("mundane_ring_electrum",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> RING_GARNET_1_ELECTRUM = MAGICHEM_ITEMS.register("ring_garnet_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_GARNET_2_ELECTRUM = MAGICHEM_ITEMS.register("ring_garnet_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_GARNET_3_ELECTRUM = MAGICHEM_ITEMS.register("ring_garnet_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_GARNET_4_ELECTRUM = MAGICHEM_ITEMS.register("ring_garnet_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_GARNET_5_ELECTRUM = MAGICHEM_ITEMS.register("ring_garnet_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_CITRINE_1_ELECTRUM = MAGICHEM_ITEMS.register("ring_citrine_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_CITRINE_2_ELECTRUM = MAGICHEM_ITEMS.register("ring_citrine_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_CITRINE_3_ELECTRUM = MAGICHEM_ITEMS.register("ring_citrine_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_CITRINE_4_ELECTRUM = MAGICHEM_ITEMS.register("ring_citrine_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_CITRINE_5_ELECTRUM = MAGICHEM_ITEMS.register("ring_citrine_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_PERIDOT_1_ELECTRUM = MAGICHEM_ITEMS.register("ring_peridot_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_PERIDOT_2_ELECTRUM = MAGICHEM_ITEMS.register("ring_peridot_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_PERIDOT_3_ELECTRUM = MAGICHEM_ITEMS.register("ring_peridot_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_PERIDOT_4_ELECTRUM = MAGICHEM_ITEMS.register("ring_peridot_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_PERIDOT_5_ELECTRUM = MAGICHEM_ITEMS.register("ring_peridot_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_1_ELECTRUM = MAGICHEM_ITEMS.register("ring_tourmaline_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_2_ELECTRUM = MAGICHEM_ITEMS.register("ring_tourmaline_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_3_ELECTRUM = MAGICHEM_ITEMS.register("ring_tourmaline_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_4_ELECTRUM = MAGICHEM_ITEMS.register("ring_tourmaline_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_TOURMALINE_5_ELECTRUM = MAGICHEM_ITEMS.register("ring_tourmaline_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_KUNZITE_1_ELECTRUM = MAGICHEM_ITEMS.register("ring_kunzite_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_KUNZITE_2_ELECTRUM = MAGICHEM_ITEMS.register("ring_kunzite_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_KUNZITE_3_ELECTRUM = MAGICHEM_ITEMS.register("ring_kunzite_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_KUNZITE_4_ELECTRUM = MAGICHEM_ITEMS.register("ring_kunzite_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_KUNZITE_5_ELECTRUM = MAGICHEM_ITEMS.register("ring_kunzite_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_SPINEL_1_ELECTRUM = MAGICHEM_ITEMS.register("ring_spinel_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_SPINEL_2_ELECTRUM = MAGICHEM_ITEMS.register("ring_spinel_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_SPINEL_3_ELECTRUM = MAGICHEM_ITEMS.register("ring_spinel_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_SPINEL_4_ELECTRUM = MAGICHEM_ITEMS.register("ring_spinel_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_SPINEL_5_ELECTRUM = MAGICHEM_ITEMS.register("ring_spinel_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ONYX_1_ELECTRUM = MAGICHEM_ITEMS.register("ring_onyx_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ONYX_2_ELECTRUM = MAGICHEM_ITEMS.register("ring_onyx_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ONYX_3_ELECTRUM = MAGICHEM_ITEMS.register("ring_onyx_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ONYX_4_ELECTRUM = MAGICHEM_ITEMS.register("ring_onyx_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ONYX_5_ELECTRUM = MAGICHEM_ITEMS.register("ring_onyx_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ZIRCON_1_ELECTRUM = MAGICHEM_ITEMS.register("ring_zircon_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ZIRCON_2_ELECTRUM = MAGICHEM_ITEMS.register("ring_zircon_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ZIRCON_3_ELECTRUM = MAGICHEM_ITEMS.register("ring_zircon_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ZIRCON_4_ELECTRUM = MAGICHEM_ITEMS.register("ring_zircon_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> RING_ZIRCON_5_ELECTRUM = MAGICHEM_ITEMS.register("ring_zircon_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    ///////////////////
    // ELECTRUM BRACELETS
    ///////////////////

    public static final RegistryObject<Item> ELECTRUM_PLATED_MUNDANE_BRACELET = MAGICHEM_ITEMS.register("mundane_bracelet_electrum",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> BRACELET_GARNET_1_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_garnet_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_GARNET_2_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_garnet_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_GARNET_3_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_garnet_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_GARNET_4_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_garnet_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_GARNET_5_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_garnet_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_CITRINE_1_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_citrine_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_CITRINE_2_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_citrine_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_CITRINE_3_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_citrine_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_CITRINE_4_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_citrine_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_CITRINE_5_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_citrine_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_PERIDOT_1_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_peridot_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_PERIDOT_2_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_peridot_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_PERIDOT_3_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_peridot_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_PERIDOT_4_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_peridot_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_PERIDOT_5_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_peridot_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_TOURMALINE_1_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_tourmaline_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_TOURMALINE_2_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_tourmaline_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_TOURMALINE_3_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_tourmaline_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_TOURMALINE_4_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_tourmaline_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_TOURMALINE_5_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_tourmaline_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_KUNZITE_1_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_kunzite_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_KUNZITE_2_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_kunzite_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_KUNZITE_3_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_kunzite_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_KUNZITE_4_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_kunzite_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_KUNZITE_5_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_kunzite_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_SPINEL_1_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_spinel_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_SPINEL_2_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_spinel_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_SPINEL_3_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_spinel_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_SPINEL_4_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_spinel_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_SPINEL_5_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_spinel_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ONYX_1_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_onyx_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ONYX_2_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_onyx_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ONYX_3_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_onyx_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ONYX_4_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_onyx_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ONYX_5_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_onyx_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ZIRCON_1_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_zircon_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ZIRCON_2_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_zircon_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ZIRCON_3_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_zircon_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ZIRCON_4_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_zircon_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> BRACELET_ZIRCON_5_ELECTRUM = MAGICHEM_ITEMS.register("bracelet_zircon_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    ///////////////////
    // ELECTRUM AMULETS
    ///////////////////

    public static final RegistryObject<Item> ELECTRUM_PLATED_MUNDANE_AMULET = MAGICHEM_ITEMS.register("mundane_amulet_electrum",
            () -> new Item(new Item.Properties())
    );

    public static final RegistryObject<Item> AMULET_GARNET_1_ELECTRUM = MAGICHEM_ITEMS.register("amulet_garnet_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_GARNET_2_ELECTRUM = MAGICHEM_ITEMS.register("amulet_garnet_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_GARNET_3_ELECTRUM = MAGICHEM_ITEMS.register("amulet_garnet_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_GARNET_4_ELECTRUM = MAGICHEM_ITEMS.register("amulet_garnet_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_GARNET_5_ELECTRUM = MAGICHEM_ITEMS.register("amulet_garnet_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.RED, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_CITRINE_1_ELECTRUM = MAGICHEM_ITEMS.register("amulet_citrine_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_CITRINE_2_ELECTRUM = MAGICHEM_ITEMS.register("amulet_citrine_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_CITRINE_3_ELECTRUM = MAGICHEM_ITEMS.register("amulet_citrine_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_CITRINE_4_ELECTRUM = MAGICHEM_ITEMS.register("amulet_citrine_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_CITRINE_5_ELECTRUM = MAGICHEM_ITEMS.register("amulet_citrine_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.YELLOW, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_PERIDOT_1_ELECTRUM = MAGICHEM_ITEMS.register("amulet_peridot_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_PERIDOT_2_ELECTRUM = MAGICHEM_ITEMS.register("amulet_peridot_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_PERIDOT_3_ELECTRUM = MAGICHEM_ITEMS.register("amulet_peridot_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_PERIDOT_4_ELECTRUM = MAGICHEM_ITEMS.register("amulet_peridot_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_PERIDOT_5_ELECTRUM = MAGICHEM_ITEMS.register("amulet_peridot_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.LIME, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_TOURMALINE_1_ELECTRUM = MAGICHEM_ITEMS.register("amulet_tourmaline_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_TOURMALINE_2_ELECTRUM = MAGICHEM_ITEMS.register("amulet_tourmaline_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_TOURMALINE_3_ELECTRUM = MAGICHEM_ITEMS.register("amulet_tourmaline_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_TOURMALINE_4_ELECTRUM = MAGICHEM_ITEMS.register("amulet_tourmaline_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_TOURMALINE_5_ELECTRUM = MAGICHEM_ITEMS.register("amulet_tourmaline_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLUE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_KUNZITE_1_ELECTRUM = MAGICHEM_ITEMS.register("amulet_kunzite_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_KUNZITE_2_ELECTRUM = MAGICHEM_ITEMS.register("amulet_kunzite_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_KUNZITE_3_ELECTRUM = MAGICHEM_ITEMS.register("amulet_kunzite_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_KUNZITE_4_ELECTRUM = MAGICHEM_ITEMS.register("amulet_kunzite_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_KUNZITE_5_ELECTRUM = MAGICHEM_ITEMS.register("amulet_kunzite_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PURPLE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_SPINEL_1_ELECTRUM = MAGICHEM_ITEMS.register("amulet_spinel_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_SPINEL_2_ELECTRUM = MAGICHEM_ITEMS.register("amulet_spinel_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_SPINEL_3_ELECTRUM = MAGICHEM_ITEMS.register("amulet_spinel_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_SPINEL_4_ELECTRUM = MAGICHEM_ITEMS.register("amulet_spinel_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_SPINEL_5_ELECTRUM = MAGICHEM_ITEMS.register("amulet_spinel_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.PINK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ONYX_1_ELECTRUM = MAGICHEM_ITEMS.register("amulet_onyx_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ONYX_2_ELECTRUM = MAGICHEM_ITEMS.register("amulet_onyx_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ONYX_3_ELECTRUM = MAGICHEM_ITEMS.register("amulet_onyx_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ONYX_4_ELECTRUM = MAGICHEM_ITEMS.register("amulet_onyx_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ONYX_5_ELECTRUM = MAGICHEM_ITEMS.register("amulet_onyx_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.BLACK, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ZIRCON_1_ELECTRUM = MAGICHEM_ITEMS.register("amulet_zircon_1_electrum",
            () -> new JewelryItem(new Item.Properties(), 1, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ZIRCON_2_ELECTRUM = MAGICHEM_ITEMS.register("amulet_zircon_2_electrum",
            () -> new JewelryItem(new Item.Properties(), 2, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ZIRCON_3_ELECTRUM = MAGICHEM_ITEMS.register("amulet_zircon_3_electrum",
            () -> new JewelryItem(new Item.Properties(), 3, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ZIRCON_4_ELECTRUM = MAGICHEM_ITEMS.register("amulet_zircon_4_electrum",
            () -> new JewelryItem(new Item.Properties(), 4, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    public static final RegistryObject<Item> AMULET_ZIRCON_5_ELECTRUM = MAGICHEM_ITEMS.register("amulet_zircon_5_electrum",
            () -> new JewelryItem(new Item.Properties(), 5, DyeColor.WHITE, MetalAlignment.ELECTRUM)
    );

    ///////////////////
    // MISC ITEMS
    ///////////////////

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

    public static void registerCurios() {
        for (RegistryObject<Item> entry : MAGICHEM_ITEMS.getEntries()) {
            if(entry.get() instanceof JewelryItem ji) {
                ItemRegistry.CURIOS.add(ji);
            }
        }
    }
}
