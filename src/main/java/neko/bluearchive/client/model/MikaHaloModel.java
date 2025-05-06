package neko.bluearchive.client.model;

import neko.bluearchive.item.MikaHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MikaHaloModel extends GeoModel<MikaHaloItem> {
    @Override
    public Identifier getModelResource(MikaHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/mika.geo.json");
    }

    @Override
    public Identifier getTextureResource(MikaHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/mika.texture.png");
    }

    @Override
    public Identifier getAnimationResource(MikaHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/mika.animation.json");
    }
}
