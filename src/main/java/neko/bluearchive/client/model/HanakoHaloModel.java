package neko.bluearchive.client.model;

import neko.bluearchive.item.HanakoHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HanakoHaloModel extends GeoModel<HanakoHaloItem> {
    @Override
    public Identifier getModelResource(HanakoHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/hanako.geo.json");
    }

    @Override
    public Identifier getTextureResource(HanakoHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/hanako.texture.png");
    }

    @Override
    public Identifier getAnimationResource(HanakoHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/hanako.animation.json");
    }
}
