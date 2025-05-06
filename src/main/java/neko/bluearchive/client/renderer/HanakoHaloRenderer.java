package neko.bluearchive.client.renderer;

import neko.bluearchive.item.HanakoHaloItem;
import neko.bluearchive.client.model.HanakoHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HanakoHaloRenderer extends GeoArmorRenderer<HanakoHaloItem> {
    public HanakoHaloRenderer() {
        super(new HanakoHaloModel());
    }
}
