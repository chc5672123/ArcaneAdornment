package com.aranaira.arcado.foundation;

import net.minecraft.world.entity.ai.attributes.Attribute;

public class AttributeData {
    private final Attribute[] attribute;
    private final double[] pureValues;
    private final double[] alloyedValues;

    public AttributeData(Attribute pAttribute, double[] pPureValues, double[] pAlloyedValues) {
        attribute = new Attribute[]{pAttribute, pAttribute, pAttribute, pAttribute, pAttribute};
        pureValues = pPureValues;
        alloyedValues = pAlloyedValues;
    }

    public AttributeData(Attribute[] pAttribute, double[] pPureValues, double[] pAlloyedValues) {
        attribute = pAttribute;
        pureValues = pPureValues;
        alloyedValues = pAlloyedValues;
    }

    public Attribute getAttribute(int pGrade) {
        return attribute[pGrade-1];
    }

    public double getPure(int pGrade) {
        return pureValues[pGrade-1];
    }

    public double getAlloyed(int pGrade) {
        return alloyedValues[pGrade-1];
    }
}
