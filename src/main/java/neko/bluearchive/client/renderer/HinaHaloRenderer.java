package neko.bluearchive.client.renderer;

import neko.bluearchive.item.HinaHaloItem;
import neko.bluearchive.client.model.HinaHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HinaHaloRenderer extends GeoArmorRenderer<HinaHaloItem> {
    public HinaHaloRenderer() {
        super(new HinaHaloModel());
    }
}
