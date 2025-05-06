package neko.bluearchive.client.renderer;

import neko.bluearchive.item.HasumiHaloItem;
import neko.bluearchive.client.model.HasumiHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HasumiHaloRenderer extends GeoArmorRenderer<HasumiHaloItem> {
    public HasumiHaloRenderer() {
        super(new HasumiHaloModel());
    }
}
