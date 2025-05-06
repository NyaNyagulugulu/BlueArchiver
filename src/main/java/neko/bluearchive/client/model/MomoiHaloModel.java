package neko.bluearchive.client.model;

import neko.bluearchive.item.HomoiHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class MomoiHaloModel extends GeoModel<HomoiHaloItem> {
    @Override
    public Identifier getModelResource(HomoiHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/momoi.geo.json");
    }

    @Override
    public Identifier getTextureResource(HomoiHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/momoi.texture.png");
    }

    @Override
    public Identifier getAnimationResource(HomoiHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/momoi.animation.json");
    }
}
