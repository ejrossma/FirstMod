package vulgit.first.mod.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vulgit.first.mod.BatItem;
import vulgit.first.mod.FirstMod;

public class ModItems {

    //Items
    public static final Item WOODEN_BAT = new BatItem(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item OBSIDIAN_BAT = new BatItem(new Item.Settings().group(FirstMod.ITEM_GROUP));
    //("obsidian_bat", 0, 800, 6.0F, 6.5F, 15);
    //BlockItems

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("firstmod", "bat"), WOODEN_BAT);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat"), OBSIDIAN_BAT);
    }
}