package neko.bluearchive.client.model;

import neko.bluearchive.item.AliceHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class AliceHaloModel extends GeoModel<AliceHaloItem> {
    @Override
    public Identifier getModelResource(AliceHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/alice.geo.json");
    }

    @Override
    public Identifier getTextureResource(AliceHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/alice.texture.png");
    }

    @Override
    public Identifier getAnimationResource(AliceHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/alice.animation.json");
    }
}
