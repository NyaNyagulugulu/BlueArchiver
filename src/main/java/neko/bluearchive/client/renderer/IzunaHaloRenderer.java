package neko.bluearchive.client.renderer;

import neko.bluearchive.item.IzunaHaloItem;
import neko.bluearchive.client.model.IzunaHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class IzunaHaloRenderer extends GeoArmorRenderer<IzunaHaloItem> {
    public IzunaHaloRenderer() {
        super(new IzunaHaloModel());
    }
}
