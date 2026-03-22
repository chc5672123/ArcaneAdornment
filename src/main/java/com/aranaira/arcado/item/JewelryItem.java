package com.aranaira.arcado.item;

import com.aranaira.arcado.foundation.MetalAlignment;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;
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

    public CompoundTag createAttributeTag() {
        CompoundTag out = new CompoundTag();
        CompoundTag attributeTag = new CompoundTag();

        attributeTag.putString("Slot", "ring");
        attributeTag.putString("AttributeName", "generic.attack_damage");
        attributeTag.putString("Name", "generic.attack_damage");
        attributeTag.putDouble("Amount", 20.0);
        attributeTag.putInt("Operation", 0);

        out.put("AttributeModifiers", attributeTag);
        return out;
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
}
