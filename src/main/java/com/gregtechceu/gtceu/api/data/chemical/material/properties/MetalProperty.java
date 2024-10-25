package com.gregtechceu.gtceu.api.data.chemical.material.properties;

import lombok.Getter;
import lombok.Setter;

public class MetalProperty implements IMaterialProperty<MetalProperty> {


    @Getter
    @Setter
    private float malleableFactor;

    @Getter
    @Setter
    private float ductileFactor;

    @Getter
    @Setter
    private float hardnessFactor;

    @Override
    public void verifyProperty(MaterialProperties properties) {
        properties.ensureSet(PropertyKey.DUST, true);
    }
}
