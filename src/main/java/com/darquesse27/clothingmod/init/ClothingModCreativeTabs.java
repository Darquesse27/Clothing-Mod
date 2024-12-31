package com.darquesse27.clothingmod.init;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class ClothingModCreativeTabs {
    private final BuildCreativeModeTabContentsEvent event;
    public ClothingModCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        this.event = event;
    }

    public void addCreative() {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ClothingModItems.CLOTHES_PIECE_ITEM);
        } else if (event.getTabKey() == CreativeModeTabs.COMBAT) {
            event.accept(ClothingModItems.CLOTHES_PIECE_TSHIRT);
        }
    }
}
