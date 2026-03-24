package com.aranaira.arcado.loot;

import com.google.common.base.Suppliers;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraftforge.common.loot.IGlobalLootModifier;
import net.minecraftforge.common.loot.LootModifier;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Supplier;

public class AddItemFromTagModifier extends LootModifier {
    private static final ArrayList<Item> TAG_ITEMS = new ArrayList<>();

    public static final Supplier<Codec<AddItemFromTagModifier>> CODEC = Suppliers.memoize(()
            -> RecordCodecBuilder.create(inst -> codecStart(inst)
            .and(Codec.STRING.fieldOf("tag").forGetter(m -> m.tagKey))
            .and(Codec.FLOAT.fieldOf("chance").forGetter(m -> m.chance))
            .and(Codec.INT.fieldOf("min").forGetter(m -> m.min))
            .and(Codec.INT.fieldOf("max").forGetter(m -> m.max))
            .apply(inst, AddItemFromTagModifier::new)
    ));

    private static final Random r = new Random();

    private final TagKey<Item> tag;
    private final String tagKey;
    private final float chance;
    private final int min;
    private final int max;

    public AddItemFromTagModifier(LootItemCondition[] pConditionsIn, String pTag, float pChance, int pMin, int pMax) {
        super(pConditionsIn);
        this.tagKey = pTag;
        this.tag = ItemTags.create(new ResourceLocation(tagKey));
        this.chance = pChance;
        this.min = pMin;
        this.max = pMax;
    }

    @Override
    protected @NotNull ObjectArrayList<ItemStack> doApply(ObjectArrayList<ItemStack> generatedLoot, LootContext context) {
        for(LootItemCondition condition : this.conditions) {
            if(!condition.test(context)) {
                return generatedLoot;
            }
        }

        if(r.nextFloat() <= chance) {
            int amount = min + r.nextInt(max + 1 - min);

            final ArrayList<Item> tagItems = getTagItems();
            if(tagItems != null && tagItems.size() > 0) {
                Item result = tagItems.get(r.nextInt(tagItems.size()));

                if(result != null)
                    generatedLoot.add(new ItemStack(result, amount));
            }

        }

        return generatedLoot;
    }

    private ArrayList<Item> getTagItems() {
        if(TAG_ITEMS.size() == 0) {
            for (Item value : ForgeRegistries.ITEMS.tags().getTag(tag)) {
                TAG_ITEMS.add(value);
            }
        }

        return TAG_ITEMS;
    }

    @Override
    public Codec<? extends IGlobalLootModifier> codec() {
        return null;
    }
}
