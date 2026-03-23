package com.aranaira.arcado.item;

import com.aranaira.arcado.foundation.AttributeData;
import com.aranaira.arcado.foundation.MetalAlignment;
import com.google.common.collect.LinkedHashMultimap;
import com.google.common.collect.Multimap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.capabilities.ICapabilityProvider;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import static com.aranaira.arcado.item.JewelItem.JEWEL_DATA;

public class JewelryItem extends Item implements ICurioItem {
    private final int grade;
    private final DyeColor color;
    private final MetalAlignment alignment;

    public static final HashMap<DyeColor, int[]> JEWEL_COLORS = new HashMap();

    public JewelryItem(Properties pProperties, int pGrade, DyeColor pColor, MetalAlignment pAlignment) {
        super(pProperties);
        grade = pGrade;
        color = pColor;
        alignment = pAlignment;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
    }

    public ListTag createAttributeList() {
        ListTag attributeList = new ListTag();
        CompoundTag attributeTag = new CompoundTag();


        final Pair<AttributeData, AttributeData> options = JEWEL_DATA.get(color);
        if(alignment == MetalAlignment.ELECTRUM) {
            for(int i=0; i<2; i++){
                AttributeData data = i == 0 ? options.getFirst() : options.getSecond();
                final ResourceLocation key = ForgeRegistries.ATTRIBUTES.getKey(data.getAttribute(grade));
                if (key != null) {
                    attributeTag.putString("Slot", "ring");
                    attributeTag.putString("AttributeName", key.toString());
                    attributeTag.putString("Name", key.toString());
                    attributeTag.putDouble("Amount", data.getPure(grade));
                    attributeTag.putInt("Operation", 0);
                }
                attributeList.add(i, attributeTag);
            }

        } else if(alignment != MetalAlignment.NONE) {
            final AttributeData data = alignment == MetalAlignment.GOLD ? options.getFirst() :
                    (alignment == MetalAlignment.SILVER ? options.getSecond() : null);
            if (data != null) {
                final ResourceLocation key = ForgeRegistries.ATTRIBUTES.getKey(data.getAttribute(grade));
                if (key != null) {
                    attributeTag.putString("Slot", "ring");
                    attributeTag.putString("AttributeName", key.toString());
                    attributeTag.putString("Name", key.toString());
                    attributeTag.putDouble("Amount", data.getPure(grade));
                    attributeTag.putInt("Operation", 0);
                }
                attributeList.add(0, attributeTag);
            }
        }

        return attributeList;
    }

    public int getGrade() {
        return grade;
    }

    public DyeColor getColor() {
        return color;
    }

    public MetalAlignment getAlignment() {
        return alignment;
    }

    @Override
    public Multimap<Attribute, AttributeModifier> getAttributeModifiers(SlotContext slotContext, UUID uuid, ItemStack stack) {
        final Multimap<Attribute, AttributeModifier> out = ICurioItem.super.getAttributeModifiers(slotContext, uuid, stack);

        if(stack.getItem() instanceof JewelryItem ji) {
            final Pair<AttributeData, AttributeData> options = JEWEL_DATA.get(ji.color);
            if(alignment == MetalAlignment.ELECTRUM) {
                for(int i=0; i<2; i++) {
                    final AttributeData data = i == 0 ? options.getFirst() : options.getSecond();
                    if (data != null) {
                        out.put(data.getAttribute(grade), new AttributeModifier("arcado", data.getPure(grade), AttributeModifier.Operation.ADDITION));
                    }
                }
            } else if(alignment != MetalAlignment.NONE) {
                final AttributeData data = alignment == MetalAlignment.GOLD ? options.getFirst() :
                        (alignment == MetalAlignment.SILVER ? options.getSecond() : null);
                if (data != null) {
                    out.put(data.getAttribute(grade), new AttributeModifier("arcado", data.getPure(grade), AttributeModifier.Operation.ADDITION));
                }
            }
        }

        return out;
    }

    public int getPackedColor() {
        if(JEWEL_COLORS.size() == 0) fillColorData();

        int r = JEWEL_COLORS.get(color)[0];
        int g = JEWEL_COLORS.get(color)[1];
        int b = JEWEL_COLORS.get(color)[2];

        int pack = b;
        pack = pack | (g << 8);
        pack = pack | (r << 16);
        pack = pack | (255 << 24);

        return pack;
    }

    private void fillColorData() {
        JEWEL_COLORS.put(DyeColor.RED, new int[]{170, 0, 0});
        JEWEL_COLORS.put(DyeColor.YELLOW, new int[]{200, 165, 0});
        JEWEL_COLORS.put(DyeColor.LIME, new int[]{90, 215, 0});
        JEWEL_COLORS.put(DyeColor.BLUE, new int[]{0, 65, 200});
        JEWEL_COLORS.put(DyeColor.PURPLE, new int[]{95, 34, 145});
        JEWEL_COLORS.put(DyeColor.PINK, new int[]{190, 55, 130});
        JEWEL_COLORS.put(DyeColor.BLACK, new int[]{35, 25, 45});
        JEWEL_COLORS.put(DyeColor.WHITE, new int[]{180, 230, 240});
    }
}
