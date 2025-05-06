package neko.bluearchive.client.model;

import neko.bluearchive.item.MariHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MariHaloModel extends GeoModel<MariHaloItem> {
    @Override
    public Identifier getModelResource(MariHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/mari.geo.json");
    }

    @Override
    public Identifier getTextureResource(MariHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/mari.texture.png");
    }

    @Override
    public Identifier getAnimationResource(MariHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/mari.animation.json");
    }
}
