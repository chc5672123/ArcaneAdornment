package com.aranaira.arcado.item;

import com.aranaira.arcado.foundation.AttributeData;
import com.aranaira.arcado.foundation.MetalAlignment;
import com.google.common.collect.Multimap;
import com.mojang.datafixers.util.Pair;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
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

    public JewelryItem(Properties pProperties, int pGrade, DyeColor pColor, MetalAlignment pAlignment) {
        super(pProperties);
        grade = pGrade;
        color = pColor;
        alignment = pAlignment;
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        pTooltipComponents.add(
                Component.empty()
                        .append(Component.translatable("tooltip.arcado.curio.wrought"))
                        .append(getTranslatedMetal().withStyle(ChatFormatting.DARK_AQUA))
                        .append(Component.translatable("tooltip.arcado.curio.set"))
                        .append(getTranslatedGem().withStyle(ChatFormatting.DARK_AQUA))
        );
        pTooltipComponents.add(
                Component.empty()
                        .append(Component.translatable("tooltip.arcado.curio.grade").withStyle(ChatFormatting.DARK_AQUA))
                        .append(Component.literal(""+grade).withStyle(ChatFormatting.DARK_AQUA))
        );
    }

    private MutableComponent getTranslatedMetal() {
        if(alignment == MetalAlignment.GOLD) return Component.translatable("tooltip.arcado.metal.gold");
        else if(alignment == MetalAlignment.SILVER) return Component.translatable("tooltip.arcado.metal.silver");
        else if(alignment == MetalAlignment.ELECTRUM) return Component.translatable("tooltip.arcado.metal.electrum");

        return Component.literal("?");
    }

    private MutableComponent getTranslatedGem() {
        if(color == DyeColor.RED) return Component.translatable("item.arcado.jewel_garnet");
        else if(color == DyeColor.YELLOW) return Component.translatable("item.arcado.jewel_citrine");
        else if(color == DyeColor.LIME) return Component.translatable("item.arcado.jewel_peridot");
        else if(color == DyeColor.BLUE) return Component.translatable("item.arcado.jewel_tourmaline");
        else if(color == DyeColor.PURPLE) return Component.translatable("item.arcado.jewel_kunzite");
        else if(color == DyeColor.PINK) return Component.translatable("item.arcado.jewel_spinel");
        else if(color == DyeColor.BLACK) return Component.translatable("item.arcado.jewel_onyx");
        else if(color == DyeColor.WHITE) return Component.translatable("item.arcado.jewel_zircon");

        return Component.literal("?");
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
                        out.put(data.getAttribute(grade), new AttributeModifier(getAttributeUUID(color), "arcado", data.getPure(grade), AttributeModifier.Operation.ADDITION));
                    }
                }
            } else if(alignment != MetalAlignment.NONE) {
                final AttributeData data = alignment == MetalAlignment.GOLD ? options.getFirst() :
                        (alignment == MetalAlignment.SILVER ? options.getSecond() : null);
                if (data != null) {
                    out.put(data.getAttribute(grade), new AttributeModifier(getAttributeUUID(color), "arcado", data.getPure(grade), AttributeModifier.Operation.ADDITION));
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
