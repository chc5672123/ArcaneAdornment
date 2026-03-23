package com.aranaira.arcado.events;

import com.aranaira.arcado.ArcaneAdornmentMod;
import com.aranaira.arcado.foundation.AttributeData;
import com.aranaira.arcado.foundation.MetalAlignment;
import com.aranaira.arcado.item.JewelItem;
import com.aranaira.arcado.item.JewelryItem;
import com.google.common.collect.LinkedHashMultimap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import top.theillusivec4.curios.api.CuriosApi;
import top.theillusivec4.curios.api.event.CurioChangeEvent;

import javax.annotation.Nullable;
import java.util.UUID;

@Mod.EventBusSubscriber(
        modid = ArcaneAdornmentMod.MODID,
        bus = Mod.EventBusSubscriber.Bus.FORGE
)
public class CommonEventHandler {
}
