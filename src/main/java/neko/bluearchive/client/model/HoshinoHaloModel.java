package neko.bluearchive.client.model;

import neko.bluearchive.item.HoshinoHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HoshinoHaloModel extends GeoModel<HoshinoHaloItem> {
    @Override
    public Identifier getModelResource(HoshinoHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/hoshino.geo.json");
    }

    @Override
    public Identifier getTextureResource(HoshinoHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/hoshino.texture.png");
    }

    @Override
    public Identifier getAnimationResource(HoshinoHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/hoshino.animation.json");
    }
}
