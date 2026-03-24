package com.aranaira.arcado;

import com.aranaira.arcado.registry.CreativeTabRegistry;
import com.aranaira.arcado.registry.ItemRegistry;
import com.aranaira.arcado.registry.LootModifierRegistry;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import org.slf4j.Logger;

import java.lang.management.ManagementFactory;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(ArcaneAdornmentMod.MODID)
public class ArcaneAdornmentMod
{
    public static final String MODID = "arcado";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static ArcaneAdornmentMod INSTANCE = null;

    private static final String PROTOCOL_VERSION = "1.0";
    public static final SimpleChannel CHANNEL = NetworkRegistry.ChannelBuilder
            .named(new ResourceLocation(ArcaneAdornmentMod.MODID, "main"))
            .clientAcceptedVersions(PROTOCOL_VERSION::equals)
            .serverAcceptedVersions(PROTOCOL_VERSION::equals)
            .networkProtocolVersion(() -> PROTOCOL_VERSION)
            .simpleChannel();


    public ArcaneAdornmentMod()
    {
        INSTANCE = this;

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemRegistry.register(eventBus);
        LootModifierRegistry.register(eventBus);

        if(FMLEnvironment.dist.isClient()) {
            CreativeTabRegistry.register(eventBus);
        }

        eventBus.addListener(this::commonSetup);
        MinecraftForge.EVENT_BUS.register(this);

        //Only uncomment this nonsense if we need to generate the custom JSON files again
        //FixationSeparationRecipeGenerator.parseRecipeTable();
        //FixationSeparationRecipeGenerator.generateRecipes();
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {
        event.enqueueWork(() -> {
        });
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {
        // Do something when the server starts
    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            event.enqueueWork(() -> {
            });
        }
    }
}
