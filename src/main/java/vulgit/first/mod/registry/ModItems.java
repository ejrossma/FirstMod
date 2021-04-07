package vulgit.first.mod.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vulgit.first.mod.tools.BatItem;
import vulgit.first.mod.FirstMod;
import vulgit.first.mod.tools.materials.ObsidianChunk;

public class ModItems {

    //Items
    public static final Item WOODEN_BAT = new BatItem(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static ToolItem OBSIDIAN_BAT = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    //BlockItems

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("firstmod", "bat"), WOODEN_BAT);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat"), OBSIDIAN_BAT);
    }
}