package vulgit.first.mod.registry;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vulgit.first.mod.tools.materials.ObsidianChunk;

public class ModItems {

    //Items
    public static final ToolItem WOODEN_BAT = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    public static final ToolItem OBSIDIAN_BAT = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(ItemGroup.COMBAT));
    //BlockItems

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat"), WOODEN_BAT);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat"), OBSIDIAN_BAT);
    }
}