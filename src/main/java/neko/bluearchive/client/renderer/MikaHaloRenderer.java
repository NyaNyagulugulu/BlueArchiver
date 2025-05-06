package neko.bluearchive.client.renderer;

import neko.bluearchive.item.MikaHaloItem;
import neko.bluearchive.client.model.MikaHaloModel;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class MikaHaloRenderer extends GeoArmorRenderer<MikaHaloItem> {
    public MikaHaloRenderer() {
        super(new MikaHaloModel());
    }
}
