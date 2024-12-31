package com.darquesse27.clothingmod.clothing;

import com.darquesse27.clothingmod.init.ClothingModArmorMaterials;
import net.minecraft.core.Holder;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;

public class TShirtClothing extends ArmorItem {

    private static final Holder<ArmorMaterial> MATERIAL = ClothingModArmorMaterials.CLOTHES_MATERIAL;
    private static final Type TYPE = ArmorItem.Type.CHESTPLATE;
    private static final Properties PROPERTIES = new Item.Properties().durability(10);
    public static final String NAME = "t_shirt";

    public TShirtClothing() {
        super(MATERIAL, TYPE, PROPERTIES);
    }
}
