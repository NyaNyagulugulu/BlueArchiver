package neko.bluearchive.client.model;

import neko.bluearchive.item.YuukaHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class YuukaHaloModel extends GeoModel<YuukaHaloItem> {
    @Override
    public Identifier getModelResource(YuukaHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/yuuka.geo.json");
    }

    @Override
    public Identifier getTextureResource(YuukaHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/yuuka.texture.png");
    }

    @Override
    public Identifier getAnimationResource(YuukaHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/yuuka.animation.json");
    }
}
