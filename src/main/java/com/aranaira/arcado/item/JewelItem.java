package com.aranaira.arcado.item;

import com.energizedblast.mna_attributes.registry.AttributeRegistry;
import com.mojang.datafixers.util.Pair;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.level.Level;
import net.minecraftforge.common.capabilities.ForgeCapabilities;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.Nullable;

import java.util.HashMap;
import java.util.List;

public class JewelItem extends Item {
    private final DyeColor color;
    public static final HashMap<DyeColor, Pair<Attribute, Attribute>> JEWEL_DATA = new HashMap<>();

    public JewelItem(Properties pProperties, DyeColor pColor) {
        super(pProperties);
        color = pColor;

        if(JEWEL_DATA.size() == 0) {
            JEWEL_DATA.put(DyeColor.RED, new Pair<>(AttributeRegistry.SPELL_DAMAGE_MULTIPLIER.get(), AttributeRegistry.SPELL_EFFICIENCY.get()));
            JEWEL_DATA.put(DyeColor.YELLOW, new Pair<>(Attributes.MOVEMENT_SPEED, Attributes.ATTACK_SPEED));
            JEWEL_DATA.put(DyeColor.LIME, new Pair<>(
                    Attributes.LUCK,
                    ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("attributeslib:dodge_chance"))));
            JEWEL_DATA.put(DyeColor.BLUE, new Pair<>(AttributeRegistry.MAX_MANA_MULTIPLIER.get(), AttributeRegistry.MANA_REGEN.get()));
            JEWEL_DATA.put(DyeColor.PURPLE, new Pair<>(AttributeRegistry.CAST_SPEED.get(), AttributeRegistry.SPELL_EFFICIENCY.get()));
            JEWEL_DATA.put(DyeColor.PINK, new Pair<>(
                    ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("forge:block_reach")),
                    ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("forge:entity_reach"))));
            JEWEL_DATA.put(DyeColor.BLACK, new Pair<>(Attributes.ARMOR, Attributes.MAX_HEALTH));
            JEWEL_DATA.put(DyeColor.WHITE, new Pair<>(Attributes.KNOCKBACK_RESISTANCE, Attributes.ATTACK_KNOCKBACK));
        }
    }

    @Override
    public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltipComponents, TooltipFlag pIsAdvanced) {
        super.appendHoverText(pStack, pLevel, pTooltipComponents, pIsAdvanced);
        pTooltipComponents.add(
                Component.empty()
                        .append(Component.translatable("tooltip.arcado.prefix.gold").withStyle(ChatFormatting.GOLD))
                        .append(getTranslatedAttributeForColor(true))
        );
        pTooltipComponents.add(
                Component.empty()
                        .append(Component.translatable("tooltip.arcado.prefix.silver").withStyle(ChatFormatting.GRAY))
                        .append(getTranslatedAttributeForColor(false))
        );
    }

    private MutableComponent getTranslatedAttributeForColor(boolean pIsGold) {
        if(JEWEL_DATA.containsKey(color)) {
            final Pair<Attribute, Attribute> attributes = JEWEL_DATA.get(color);
            Attribute choice = pIsGold ? attributes.getFirst() : attributes.getSecond();
            return Component.translatable(choice.getDescriptionId());
        }

        return Component.empty();
    }

    public DyeColor getColor() {
        return color;
    }
}
