package com.darquesse27.clothingmod.init;

import com.darquesse27.clothingmod.ClothingMod;
import com.darquesse27.clothingmod.clothing.TShirtClothing;
import com.darquesse27.clothingmod.item.ClothesPieceItem;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ClothingModItems {
    // Creating item register
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ClothingMod.MODID);

    // Registering items
    public static final DeferredItem<Item> CLOTHES_PIECE_ITEM = ITEMS.register(ClothesPieceItem.NAME,
            ClothesPieceItem::new);
    public static final DeferredItem<ArmorItem> CLOTHES_PIECE_TSHIRT = ITEMS.register(TShirtClothing.NAME,
            TShirtClothing::new);

    // Register function used for item registration
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
