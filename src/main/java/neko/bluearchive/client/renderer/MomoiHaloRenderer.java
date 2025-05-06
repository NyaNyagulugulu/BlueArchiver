package neko.bluearchive.client.renderer;

import neko.bluearchive.item.HomoiHaloItem;
import neko.bluearchive.client.model.MomoiHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MomoiHaloRenderer extends GeoArmorRenderer<HomoiHaloItem> {
    public MomoiHaloRenderer() {
        super(new MomoiHaloModel());
    }
}
