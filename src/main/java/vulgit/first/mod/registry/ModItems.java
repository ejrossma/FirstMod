package vulgit.first.mod.registry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vulgit.first.mod.FirstMod;

public class ModItems {

    //Items
    public static final Item BAT = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));

    //BlockItems

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("firstmod", "bat"), BAT);
    }
}