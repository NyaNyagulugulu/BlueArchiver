package neko.bluearchive.client.model;

import neko.bluearchive.item.IrohaHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class IrohaHaloModel extends GeoModel<IrohaHaloItem> {
    @Override
    public Identifier getModelResource(IrohaHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/iroha.geo.json");
    }

    @Override
    public Identifier getTextureResource(IrohaHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/iroha.texture.png");
    }

    @Override
    public Identifier getAnimationResource(IrohaHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/iroha.animation.json");
    }
}
