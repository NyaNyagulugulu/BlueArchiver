package neko.bluearchive.client.renderer;

import neko.bluearchive.item.AliceHaloItem;
import neko.bluearchive.client.model.AliceHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AliceHaloRenderer extends GeoArmorRenderer<AliceHaloItem> {
    public AliceHaloRenderer() {
        super(new AliceHaloModel());
    }
}
