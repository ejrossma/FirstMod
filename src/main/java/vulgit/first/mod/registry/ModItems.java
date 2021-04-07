package vulgit.first.mod.registry;

import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vulgit.first.mod.FirstMod;
import vulgit.first.mod.tools.BatItem;
import vulgit.first.mod.tools.materials.ObsidianChunk;

public class ModItems {

    //Bats (I think these can be commented out)
    public static final ToolItem WOODEN_BAT = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final ToolItem OBSIDIAN_BAT = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(FirstMod.ITEM_GROUP));
    //Barrels
    public static final Item WOODEN_BARREL = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item OBSIDIAN_BARREL = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    //Handles
    public static final Item STONE_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item OBSIDIAN_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat"), new BatItem(new ObsidianChunk()));
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat"), new BatItem(new ObsidianChunk()));
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_barrel"), WOODEN_BARREL);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_barrel"), OBSIDIAN_BARREL);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_handle"), OBSIDIAN_HANDLE);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "stone_handle"), STONE_HANDLE);
    }
}