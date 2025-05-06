package neko.bluearchive.client.renderer;

import neko.bluearchive.item.HifumiHaloItem;
import neko.bluearchive.client.model.HifumiHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class HifumiHaloRenderer extends GeoArmorRenderer<HifumiHaloItem> {
    public HifumiHaloRenderer() {
        super(new HifumiHaloModel());
    }
}
