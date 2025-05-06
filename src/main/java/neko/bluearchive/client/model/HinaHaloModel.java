package neko.bluearchive.client.model;

import neko.bluearchive.item.HinaHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HinaHaloModel extends GeoModel<HinaHaloItem> {
    @Override
    public Identifier getModelResource(HinaHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/hina.geo.json");
    }

    @Override
    public Identifier getTextureResource(HinaHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/hina.texture.png");
    }

    @Override
    public Identifier getAnimationResource(HinaHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/hina.animation.json");
    }
}
