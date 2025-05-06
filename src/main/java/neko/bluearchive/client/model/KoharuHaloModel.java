package neko.bluearchive.client.model;

import neko.bluearchive.item.KoharuHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class KoharuHaloModel extends GeoModel<KoharuHaloItem> {
    @Override
    public Identifier getModelResource(KoharuHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/koharu.geo.json");
    }

    @Override
    public Identifier getTextureResource(KoharuHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/koharu.texture.png");
    }

    @Override
    public Identifier getAnimationResource(KoharuHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/koharu.animation.json");
    }
}
