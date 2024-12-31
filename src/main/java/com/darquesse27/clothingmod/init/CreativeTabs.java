package com.darquesse27.clothingmod.init;

import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;

public class CreativeTabs {
    private final BuildCreativeModeTabContentsEvent event;
    public CreativeTabs(BuildCreativeModeTabContentsEvent event) {
        this.event = event;
    }

    public void addCreative() {
        if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ClothingModItems.CLOTHES_PIECE_ITEM);
        }
    }
}
