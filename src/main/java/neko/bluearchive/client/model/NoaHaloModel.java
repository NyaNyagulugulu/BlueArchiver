package neko.bluearchive.client.model;

import neko.bluearchive.item.NoaHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class NoaHaloModel extends GeoModel<NoaHaloItem> {
    @Override
    public Identifier getModelResource(NoaHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/noa.geo.json");
    }

    @Override
    public Identifier getTextureResource(NoaHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/noa.texture.png");
    }

    @Override
    public Identifier getAnimationResource(NoaHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/noa.animation.json");
    }
}
