package neko.bluearchive.client.renderer;

import neko.bluearchive.item.AruHaloItem;
import neko.bluearchive.client.model.AruHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AruHaloRenderer extends GeoArmorRenderer<AruHaloItem> {
    public AruHaloRenderer() {
        super(new AruHaloModel());
    }
}
