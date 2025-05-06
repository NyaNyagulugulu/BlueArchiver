package neko.bluearchive.client.renderer;

import neko.bluearchive.item.AzusaHaloItem;
import neko.bluearchive.client.model.AzusaHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AzusaHaloRenderer extends GeoArmorRenderer<AzusaHaloItem> {
    public AzusaHaloRenderer() {
        super(new AzusaHaloModel());
    }
}
