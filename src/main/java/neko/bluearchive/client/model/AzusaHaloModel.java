package neko.bluearchive.client.model;

import neko.bluearchive.item.AzusaHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class AzusaHaloModel extends GeoModel<AzusaHaloItem> {
    @Override
    public Identifier getModelResource(AzusaHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/azusa.geo.json");
    }

    @Override
    public Identifier getTextureResource(AzusaHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/azusa.texture.png");
    }

    @Override
    public Identifier getAnimationResource(AzusaHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/azusa.animation.json");
    }
}
