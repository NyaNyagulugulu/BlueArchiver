package neko.bluearchive.client.renderer;

import neko.bluearchive.item.MariHaloItem;
import neko.bluearchive.client.model.MariHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MariHaloRenderer extends GeoArmorRenderer<MariHaloItem> {
    public MariHaloRenderer() {
        super(new MariHaloModel());
    }
}
