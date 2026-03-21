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
    private static final TagKey<Item>
            TAG_CURIOS = ItemTags.create(new ResourceLocation(ArcaneAdornmentMod.MODID, "curios"));

    private static final UUID
            UUID_NULL = UUID.fromString("00000000-0000-0000-0000-00000000000"),
            UUID_RED = UUID.fromString("85d0b0fe-defe-42e9-1233-d984bbca0000"),
            UUID_YELLOW = UUID.fromString("85d0b0fe-defe-42e9-1233-d984bbca0001"),
            UUID_LIME = UUID.fromString("85d0b0fe-defe-42e9-1233-d984bbca0002"),
            UUID_BLUE = UUID.fromString("85d0b0fe-defe-42e9-1233-d984bbca0003"),
            UUID_PURPLE = UUID.fromString("85d0b0fe-defe-42e9-1233-d984bbca0004"),
            UUID_PINK = UUID.fromString("85d0b0fe-defe-42e9-1233-d984bbca0005"),
            UUID_BLACK = UUID.fromString("85d0b0fe-defe-42e9-1233-d984bbca0006"),
            UUID_WHITE = UUID.fromString("85d0b0fe-defe-42e9-1233-d984bbca0007");
    @SubscribeEvent
    public static void onCurioChange(CurioChangeEvent event) {
        if(event.getTo().is(TAG_CURIOS)) {
            if(event.getTo().getItem() instanceof JewelryItem ji) {
                LinkedHashMultimap<Attribute, AttributeModifier> map = LinkedHashMultimap.create();
                final Pair<AttributeData, AttributeData> attributeOptions = JewelItem.JEWEL_DATA.get(ji.getColor());

                if(ji.getAlignment() == MetalAlignment.GOLD) {
                    AttributeModifier am = new AttributeModifier(getAttributeUUID(ji.getColor()), "arcado",
                            attributeOptions.getFirst().getPure(ji.getGrade()),
                            AttributeModifier.Operation.ADDITION);
                    map.put(attributeOptions.getFirst().getAttribute(ji.getGrade()), am);
                }
                else if(ji.getAlignment() == MetalAlignment.SILVER) {
                    AttributeModifier am = new AttributeModifier(getAttributeUUID(ji.getColor()), "arcado",
                            attributeOptions.getSecond().getPure(ji.getGrade()),
                            AttributeModifier.Operation.ADDITION);
                    map.put(attributeOptions.getSecond().getAttribute(ji.getGrade()), am);
                }
                else if(ji.getAlignment() == MetalAlignment.ELECTRUM) {
                    AttributeModifier amG = new AttributeModifier(getAttributeUUID(ji.getColor()), "arcado",
                            attributeOptions.getFirst().getAlloyed(ji.getGrade()),
                            AttributeModifier.Operation.ADDITION);
                    AttributeModifier amS = new AttributeModifier(getAttributeUUID(ji.getColor()), "arcado",
                            attributeOptions.getSecond().getPure(ji.getGrade()),
                            AttributeModifier.Operation.ADDITION);

                    map.put(attributeOptions.getFirst().getAttribute(ji.getGrade()), amG);
                    map.put(attributeOptions.getSecond().getAttribute(ji.getGrade()), amS);
                }

                event.getEntity().getAttributes().addTransientAttributeModifiers(map);
            }
        }
        else if(event.getFrom().is(TAG_CURIOS)) {
            if(event.getTo().getItem() instanceof JewelryItem ji) {
                LinkedHashMultimap<Attribute, AttributeModifier> map = LinkedHashMultimap.create();
                final Pair<AttributeData, AttributeData> attributeOptions = JewelItem.JEWEL_DATA.get(ji.getColor());

                if (ji.getAlignment() == MetalAlignment.GOLD) {
                    AttributeModifier am = new AttributeModifier(getAttributeUUID(ji.getColor()), "arcado",
                            attributeOptions.getFirst().getPure(ji.getGrade()),
                            AttributeModifier.Operation.ADDITION);
                    map.put(attributeOptions.getFirst().getAttribute(ji.getGrade()), am);
                } else if (ji.getAlignment() == MetalAlignment.SILVER) {
                    AttributeModifier am = new AttributeModifier(getAttributeUUID(ji.getColor()), "arcado",
                            attributeOptions.getSecond().getPure(ji.getGrade()),
                            AttributeModifier.Operation.ADDITION);
                    map.put(attributeOptions.getSecond().getAttribute(ji.getGrade()), am);
                } else if (ji.getAlignment() == MetalAlignment.ELECTRUM) {
                    AttributeModifier amG = new AttributeModifier(getAttributeUUID(ji.getColor()), "arcado",
                            attributeOptions.getFirst().getAlloyed(ji.getGrade()),
                            AttributeModifier.Operation.ADDITION);
                    AttributeModifier amS = new AttributeModifier(getAttributeUUID(ji.getColor()), "arcado",
                            attributeOptions.getSecond().getPure(ji.getGrade()),
                            AttributeModifier.Operation.ADDITION);

                    map.put(attributeOptions.getFirst().getAttribute(ji.getGrade()), amG);
                    map.put(attributeOptions.getSecond().getAttribute(ji.getGrade()), amS);
                }

                event.getEntity().getAttributes().removeAttributeModifiers(map);
            }
        }
    }

    private static UUID getAttributeUUID(DyeColor pColor) {
        if(pColor == DyeColor.RED) return UUID_RED;
        else if(pColor == DyeColor.YELLOW) return UUID_YELLOW;
        else if(pColor == DyeColor.LIME) return UUID_LIME;
        else if(pColor == DyeColor.BLUE) return UUID_BLUE;
        else if(pColor == DyeColor.PURPLE) return UUID_PURPLE;
        else if(pColor == DyeColor.PINK) return UUID_PINK;
        else if(pColor == DyeColor.BLACK) return UUID_BLACK;
        else if(pColor == DyeColor.WHITE) return UUID_WHITE;

        return UUID_NULL;
    }
}
