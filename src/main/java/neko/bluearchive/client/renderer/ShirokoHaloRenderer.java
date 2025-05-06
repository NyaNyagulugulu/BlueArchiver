package neko.bluearchive.client.renderer;

import neko.bluearchive.item.ShirokoHaloItem;
import neko.bluearchive.client.model.ShirokoHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ShirokoHaloRenderer extends GeoArmorRenderer<ShirokoHaloItem> {
    public ShirokoHaloRenderer() {
        super(new ShirokoHaloModel());
    }
}
