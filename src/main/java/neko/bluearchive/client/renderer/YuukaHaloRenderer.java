package neko.bluearchive.client.renderer;

import neko.bluearchive.item.YuukaHaloItem;
import neko.bluearchive.client.model.YuukaHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class YuukaHaloRenderer extends GeoArmorRenderer<YuukaHaloItem> {
    public YuukaHaloRenderer() {
        super(new YuukaHaloModel());
    }
}
