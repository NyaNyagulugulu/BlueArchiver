package neko.bluearchive.client.renderer;

import neko.bluearchive.client.model.HoshinoHaloModel;
import neko.bluearchive.item.HoshinoHaloItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HoshinoHaloRenderer extends GeoArmorRenderer<HoshinoHaloItem> {
    public HoshinoHaloRenderer() {
        super(new HoshinoHaloModel());
    }
}
