package neko.bluearchive.client.model;

import neko.bluearchive.item.HasumiHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HasumiHaloModel extends GeoModel<HasumiHaloItem> {
    @Override
    public Identifier getModelResource(HasumiHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/hasumi.geo.json");
    }

    @Override
    public Identifier getTextureResource(HasumiHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/hasumi.texture.png");
    }

    @Override
    public Identifier getAnimationResource(HasumiHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/hasumi.animation.json");
    }
}
