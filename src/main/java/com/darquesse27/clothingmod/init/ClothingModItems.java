package com.darquesse27.clothingmod.init;

import com.darquesse27.clothingmod.ClothingMod;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ClothingModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ClothingMod.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
