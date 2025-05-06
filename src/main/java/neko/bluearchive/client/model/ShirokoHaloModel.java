package neko.bluearchive.client.model;

import neko.bluearchive.item.ShirokoHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class ShirokoHaloModel extends GeoModel<ShirokoHaloItem> {
    @Override
    public Identifier getModelResource(ShirokoHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/shiroko.geo.json");
    }

    @Override
    public Identifier getTextureResource(ShirokoHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/shiroko.texture.png");
    }

    @Override
    public Identifier getAnimationResource(ShirokoHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/shiroko.animation.json");
    }
}
