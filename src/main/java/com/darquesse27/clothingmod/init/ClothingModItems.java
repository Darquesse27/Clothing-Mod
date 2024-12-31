package com.darquesse27.clothingmod.init;

import com.darquesse27.clothingmod.ClothingMod;
import com.darquesse27.clothingmod.item.ClothesPieceItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ClothingModItems {


    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ClothingMod.MODID);

    public static final DeferredItem<Item> CLOTHES_PIECE_ITEM = ITEMS.register(ClothesPieceItem.NAME,
            () -> new ClothesPieceItem(ClothesPieceItem.PROPERTIES));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
