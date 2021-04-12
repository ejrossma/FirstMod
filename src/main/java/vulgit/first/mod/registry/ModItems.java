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

    //************ Bats ******************
    //Wooden Barrel
        //NEED TO FIX TO MAKE "new BatItem" RATHER THAN "new SwordItem"
        //CAN USE THE WAY WE ADDRESS TO GIVE DIFF STATS TO EACH ONE THROUGH A TEMPLATE RATHER THAN DOING IT FOR EACH ONE INDIVIDUALLY
    public static final ToolItem WOODEN_BAT_W = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final ToolItem WOODEN_BAT_S = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final ToolItem WOODEN_BAT_I = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final ToolItem WOODEN_BAT_G = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final ToolItem WOODEN_BAT_O = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final ToolItem WOODEN_BAT_D = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(FirstMod.ITEM_GROUP));
    
    //Obsidian Barrel
    public static final ToolItem OBSIDIAN_BAT = new SwordItem(ObsidianChunk.INSTANCE, 1, -2.4F, new Item.Settings().group(FirstMod.ITEM_GROUP));
    
    //************ Barrels ******************
    public static final Item WOODEN_BARREL = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item OBSIDIAN_BARREL = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    
    //************ Handles ******************
    public static final Item WOODEN_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item STONE_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item IRON_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item GOLD_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item OBSIDIAN_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item DIAMOND_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    

    public static void registerItems() {
        //************ Bats ******************
        //Wooden
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_w"), new BatItem(new ObsidianChunk()));
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_s"), new BatItem(new ObsidianChunk()));
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_i"), new BatItem(new ObsidianChunk()));
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_g"), new BatItem(new ObsidianChunk()));
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_o"), new BatItem(new ObsidianChunk()));
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_d"), new BatItem(new ObsidianChunk()));
        //Obsidian
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat"), new BatItem(new ObsidianChunk()));
        
        //************ Barrels ******************
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_barrel"), WOODEN_BARREL);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_barrel"), OBSIDIAN_BARREL);
        
        //************ Handles ******************
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_handle"), WOODEN_HANDLE);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "stone_handle"), STONE_HANDLE);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "iron_handle"), IRON_HANDLE);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "gold_handle"), GOLD_HANDLE);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_handle"), OBSIDIAN_HANDLE);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "diamond_handle"), DIAMOND_HANDLE);
    }
}