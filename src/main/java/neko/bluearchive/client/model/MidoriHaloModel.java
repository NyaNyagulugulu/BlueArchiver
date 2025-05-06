package neko.bluearchive.client.model;

import neko.bluearchive.item.MidoriHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MidoriHaloModel extends GeoModel<MidoriHaloItem> {
    @Override
    public Identifier getModelResource(MidoriHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/midori.geo.json");
    }

    @Override
    public Identifier getTextureResource(MidoriHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/midori.texture.png");
    }

    @Override
    public Identifier getAnimationResource(MidoriHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/midori.animation.json");
    }
}
