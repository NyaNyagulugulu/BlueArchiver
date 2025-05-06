package neko.bluearchive.client.renderer;

import neko.bluearchive.item.KoharuHaloItem;
import neko.bluearchive.client.model.KoharuHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class KoharuHaloRenderer extends GeoArmorRenderer<KoharuHaloItem> {
    public KoharuHaloRenderer() {
        super(new KoharuHaloModel());
    }
}
