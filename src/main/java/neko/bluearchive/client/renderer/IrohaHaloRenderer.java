package neko.bluearchive.client.renderer;

import neko.bluearchive.item.IrohaHaloItem;
import neko.bluearchive.client.model.IrohaHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IrohaHaloRenderer extends GeoArmorRenderer<IrohaHaloItem> {
    public IrohaHaloRenderer() {
        super(new IrohaHaloModel());
    }
}
