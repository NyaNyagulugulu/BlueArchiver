package neko.bluearchive.client.model;

import neko.bluearchive.item.AruHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class AruHaloModel extends GeoModel<AruHaloItem> {
    @Override
    public Identifier getModelResource(AruHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/aru.geo.json");
    }

    @Override
    public Identifier getTextureResource(AruHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/aru.texture.png");
    }

    @Override
    public Identifier getAnimationResource(AruHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/aru.animation.json");
    }
}
