package neko.bluearchive.client.renderer;

import neko.bluearchive.item.MidoriHaloItem;
import neko.bluearchive.client.model.MidoriHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MidoriHaloRenderer extends GeoArmorRenderer<MidoriHaloItem> {
    public MidoriHaloRenderer() {
        super(new MidoriHaloModel());
    }
}
