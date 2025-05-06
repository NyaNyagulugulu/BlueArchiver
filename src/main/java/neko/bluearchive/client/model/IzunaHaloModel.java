package neko.bluearchive.client.model;

import neko.bluearchive.item.IzunaHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class IzunaHaloModel extends GeoModel<IzunaHaloItem> {
    @Override
    public Identifier getModelResource(IzunaHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/izuna.geo.json");
    }

    @Override
    public Identifier getTextureResource(IzunaHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/izuna.texture.png");
    }

    @Override
    public Identifier getAnimationResource(IzunaHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/izuna.animation.json");
    }
}
