package neko.bluearchive.client.renderer;

import neko.bluearchive.item.NoaHaloItem;
import neko.bluearchive.client.model.NoaHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class NoaHaloRenderer extends GeoArmorRenderer<NoaHaloItem> {
    public NoaHaloRenderer() {
        super(new NoaHaloModel());
    }
}
