package com.aranaira.arcado.item;

import com.aranaira.arcado.foundation.AttributeData;
import com.aranaira.arcado.foundation.MetalAlignment;
import com.mojang.datafixers.util.Pair;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class JewelryItem extends Item {
    private final int grade;
    private final DyeColor color;
    private final MetalAlignment alignment;

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


        final Pair<AttributeData, AttributeData> options = JewelItem.JEWEL_DATA.get(color);
        if(alignment == MetalAlignment.ELECTRUM) {

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
    public void inventoryTick(ItemStack pStack, Level pLevel, Entity pEntity, int pSlotId, boolean pIsSelected) {
        super.inventoryTick(pStack, pLevel, pEntity, pSlotId, pIsSelected);
        if(pLevel.getGameTime() % 10 == 0 && !pStack.getOrCreateTag().contains("CurioAttributeModifiers")) {
            pStack.getOrCreateTag().put("CurioAttributeModifiers", createAttributeList());
        }
    }
}
