package neko.bluearchive.client.model;

import neko.bluearchive.item.HifumiHaloItem;
import net.minecraft.util.Identifier;
import software.bernie.geckolib.model.GeoModel;

public class HifumiHaloModel extends GeoModel<HifumiHaloItem> {
    @Override
    public Identifier getModelResource(HifumiHaloItem animatable) {
        return Identifier.of("bluearchive", "geo/hifumi.geo.json");
    }

    @Override
    public Identifier getTextureResource(HifumiHaloItem animatable) {
        return Identifier.of("bluearchive", "textures/item/hifumi.texture.png");
    }

    @Override
    public Identifier getAnimationResource(HifumiHaloItem animatable) {
        return Identifier.of("bluearchive", "animations/hifumi.animation.json");
    }
}
