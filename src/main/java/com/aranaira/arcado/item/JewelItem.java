package com.aranaira.arcado.item;

import com.aranaira.arcado.foundation.AttributeData;
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
    public static final HashMap<DyeColor, Pair<AttributeData, AttributeData>> JEWEL_DATA = new HashMap<>();

    public JewelItem(Properties pProperties, DyeColor pColor) {
        super(pProperties);
        color = pColor;

        if(JEWEL_DATA.size() == 0) {
            JEWEL_DATA.put(DyeColor.RED, new Pair<>(
                    new AttributeData(new Attribute[]{
                            AttributeRegistry.SPELL_DAMAGE.get(),
                            AttributeRegistry.SPELL_DAMAGE.get(),
                            AttributeRegistry.SPELL_DAMAGE.get(),
                            AttributeRegistry.SPELL_DAMAGE_MULTIPLIER.get(),
                            AttributeRegistry.SPELL_DAMAGE_MULTIPLIER.get()},
                            new double[]{2,3,4,0.3,0.4},
                            new double[]{1,1.5,2,0.2,0.3}),
                    new AttributeData(AttributeRegistry.SPELL_EFFICIENCY.get(),
                            new double[]{0.08,0.11,0.14,0.17,0.2},
                            new double[]{0.04,0.055,0.07,0.085,0.1})
            ));
            JEWEL_DATA.put(DyeColor.YELLOW, new Pair<>(
                    new AttributeData(Attributes.MOVEMENT_SPEED,
                            new double[]{0.04,0.06,0.08,0.10,0.12},
                            new double[]{0.02,0.03,0.04,0.05,0.06}),
                    new AttributeData(Attributes.ATTACK_SPEED,
                            new double[]{0.5,1.0,1.5,2.0,3.0},
                            new double[]{0.25,0.5,0.75,1.0,1.5})
                    ));
            JEWEL_DATA.put(DyeColor.LIME, new Pair<>(
                    new AttributeData(Attributes.LUCK,
                            new double[]{0.20,0.25,0.30,0.35,0.40},
                            new double[]{0.10,0.125,0.15,0.175,0.20}),
                    new AttributeData(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("attributeslib:dodge_chance")),
                            new double[]{0.03,0.05,0.06,0.07,0.08},
                            new double[]{0.015,0.025,0.030,0.035,0.040})
                    ));
            JEWEL_DATA.put(DyeColor.BLUE, new Pair<>(
                    new AttributeData(new Attribute[]{
                                    AttributeRegistry.MAX_MANA.get(),
                                    AttributeRegistry.MAX_MANA.get(),
                                    AttributeRegistry.MAX_MANA.get(),
                                    AttributeRegistry.MAX_MANA_MULTIPLIER_FINAL.get(),
                                    AttributeRegistry.MAX_MANA_MULTIPLIER_FINAL.get()},
                            new double[]{50,80,120,0.15,0.3},
                            new double[]{25,40,60,0.05,0.1}),
                    new AttributeData(AttributeRegistry.MANA_REGEN.get(),
                            new double[]{0.2,0.25,0.32,0.4,0.5},
                            new double[]{0.1,0.125,0.16,0.2,0.25})
                    ));
            JEWEL_DATA.put(DyeColor.PURPLE, new Pair<>(
                    new AttributeData(AttributeRegistry.CAST_SPEED.get(),
                            new double[]{0.4,0.5,0.6,0.7,0.8},
                            new double[]{0.3,0.35,0.4,0.45,0.5}),
                    new AttributeData(AttributeRegistry.SPELL_DURATION_MULTIPLIER.get(),
                            new double[]{0.18,0.21,0.24,0.27,0.30},
                            new double[]{0.09,0.105,0.12,0.135,0.15})
            ));
            JEWEL_DATA.put(DyeColor.PINK, new Pair<>(
                    new AttributeData(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("forge:block_reach")),
                            new double[]{2,3,4,5,6},
                            new double[]{1,1.5,2,2.5,3}),
                    new AttributeData(ForgeRegistries.ATTRIBUTES.getValue(new ResourceLocation("forge:entity_reach")),
                            new double[]{1,1.5,2,2.5,3},
                            new double[]{0.5,0.75,1,1.25,1.5})
                    ));
            JEWEL_DATA.put(DyeColor.BLACK, new Pair<>(
                    new AttributeData(new Attribute[]{
                                    Attributes.ARMOR,
                                    Attributes.ARMOR,
                                    Attributes.ARMOR,
                                    Attributes.ARMOR,
                                    Attributes.ARMOR_TOUGHNESS},
                            new double[]{3,5,7,10,10},
                            new double[]{1.5,2.5,3.5,5,5}),
                    new AttributeData(Attributes.MAX_HEALTH,
                            new double[]{4,8,12,16,20},
                            new double[]{2,4,6,8,10})
            ));
            JEWEL_DATA.put(DyeColor.WHITE, new Pair<>(
                    new AttributeData(Attributes.KNOCKBACK_RESISTANCE,
                            new double[]{0.4,0.55,0.7,0.85,1.0},
                            new double[]{0.2,0.275,0.35,0.425,0.5}),
                    new AttributeData(Attributes.ATTACK_KNOCKBACK,
                            new double[]{1.0,3.0,6.0,10.0,15.0},
                            new double[]{0.5,1.5,3.0,5.0,7.5})
            ));
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
            final Pair<AttributeData, AttributeData> attributes = JEWEL_DATA.get(color);
            Attribute choice = pIsGold ? attributes.getFirst().getAttribute(1) : attributes.getSecond().getAttribute(1);
            return Component.translatable(choice.getDescriptionId());
        }

        return Component.empty();
    }

    public DyeColor getColor() {
        return color;
    }
}
