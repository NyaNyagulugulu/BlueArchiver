package neko.bluearchive.client.model;

import neko.bluearchive.item.MikuHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MikuHaloModel extends GeoModel<MikuHaloItem> {
    @Override
    public Identifier getModelResource(MikuHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/miku.geo.json");
    }

    @Override
    public Identifier getTextureResource(MikuHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/miku.texture.png");
    }

    @Override
    public Identifier getAnimationResource(MikuHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/miku.animation.json");
    }
}
