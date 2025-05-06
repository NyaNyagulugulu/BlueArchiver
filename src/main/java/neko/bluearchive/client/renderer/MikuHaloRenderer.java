package neko.bluearchive.client.renderer;

import neko.bluearchive.item.MikuHaloItem;
import neko.bluearchive.client.model.MikuHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MikuHaloRenderer extends GeoArmorRenderer<MikuHaloItem> {
    public MikuHaloRenderer() {
        super(new MikuHaloModel());
    }
}
