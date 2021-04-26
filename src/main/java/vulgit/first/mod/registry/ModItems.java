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

    //Testing
    public static final Item HATCH = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));

    //************ Bats ******************
    //Wooden
    public static final ToolItem WOODEN_BAT_W = new BatItem(new ObsidianChunk());
    public static final ToolItem WOODEN_BAT_S = new BatItem(new ObsidianChunk());
    public static final ToolItem WOODEN_BAT_I = new BatItem(new ObsidianChunk());
    public static final ToolItem WOODEN_BAT_G = new BatItem(new ObsidianChunk());
    public static final ToolItem WOODEN_BAT_O = new BatItem(new ObsidianChunk());
    public static final ToolItem WOODEN_BAT_D = new BatItem(new ObsidianChunk());

    //Stone
    public static final ToolItem STONE_BAT_W = new BatItem(new ObsidianChunk());
    public static final ToolItem STONE_BAT_S = new BatItem(new ObsidianChunk());
    public static final ToolItem STONE_BAT_I = new BatItem(new ObsidianChunk());
    public static final ToolItem STONE_BAT_G = new BatItem(new ObsidianChunk());
    public static final ToolItem STONE_BAT_O = new BatItem(new ObsidianChunk());
    public static final ToolItem STONE_BAT_D = new BatItem(new ObsidianChunk());

    //Iron
    public static final ToolItem IRON_BAT_W = new BatItem(new ObsidianChunk());
    public static final ToolItem IRON_BAT_S = new BatItem(new ObsidianChunk());
    public static final ToolItem IRON_BAT_I = new BatItem(new ObsidianChunk());
    public static final ToolItem IRON_BAT_G = new BatItem(new ObsidianChunk());
    public static final ToolItem IRON_BAT_O = new BatItem(new ObsidianChunk());
    public static final ToolItem IRON_BAT_D = new BatItem(new ObsidianChunk());

    //Gold
    public static final ToolItem GOLD_BAT_W = new BatItem(new ObsidianChunk());
    public static final ToolItem GOLD_BAT_S = new BatItem(new ObsidianChunk());
    public static final ToolItem GOLD_BAT_I = new BatItem(new ObsidianChunk());
    public static final ToolItem GOLD_BAT_G = new BatItem(new ObsidianChunk());
    public static final ToolItem GOLD_BAT_O = new BatItem(new ObsidianChunk());
    public static final ToolItem GOLD_BAT_D = new BatItem(new ObsidianChunk());
    
    //Obsidian
    public static final ToolItem OBSIDIAN_BAT_W = new BatItem(new ObsidianChunk());
    public static final ToolItem OBSIDIAN_BAT_S = new BatItem(new ObsidianChunk());
    public static final ToolItem OBSIDIAN_BAT_I = new BatItem(new ObsidianChunk());
    public static final ToolItem OBSIDIAN_BAT_G = new BatItem(new ObsidianChunk());
    public static final ToolItem OBSIDIAN_BAT_O = new BatItem(new ObsidianChunk());
    public static final ToolItem OBSIDIAN_BAT_D = new BatItem(new ObsidianChunk());
    
    //************ Barrels ******************
    public static final Item WOODEN_BARREL = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item STONE_BARREL = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item IRON_BARREL = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item GOLD_BARREL = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item OBSIDIAN_BARREL = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    
    //************ Handles ******************
    public static final Item WOODEN_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item STONE_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item IRON_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item GOLD_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item OBSIDIAN_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    public static final Item DIAMOND_HANDLE = new Item(new Item.Settings().group(FirstMod.ITEM_GROUP));
    

    public static void registerItems() {
        //Test
        //Registry.register(Registry.ITEM, new Identifier("firstmod", "hatch"), HATCH);

        //************ Bats ******************
        //Wooden
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_w"), WOODEN_BAT_W);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_s"), WOODEN_BAT_S);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_i"), WOODEN_BAT_I);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_g"), WOODEN_BAT_G);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_o"), WOODEN_BAT_O);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_bat_d"), WOODEN_BAT_D);
        //Stone
        Registry.register(Registry.ITEM, new Identifier("firstmod", "stone_bat_w"), STONE_BAT_W);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "stone_bat_s"), STONE_BAT_S);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "stone_bat_i"), STONE_BAT_I);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "stone_bat_g"), STONE_BAT_G);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "stone_bat_o"), STONE_BAT_O);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "stone_bat_d"), STONE_BAT_D);
        //Iron
        Registry.register(Registry.ITEM, new Identifier("firstmod", "iron_bat_w"), IRON_BAT_W);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "iron_bat_s"), IRON_BAT_S);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "iron_bat_i"), IRON_BAT_I);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "iron_bat_g"), IRON_BAT_G);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "iron_bat_o"), IRON_BAT_O);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "iron_bat_d"), IRON_BAT_D);
        //Gold
        Registry.register(Registry.ITEM, new Identifier("firstmod", "gold_bat_w"), GOLD_BAT_W);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "gold_bat_s"), GOLD_BAT_S);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "gold_bat_i"), GOLD_BAT_I);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "gold_bat_g"), GOLD_BAT_G);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "gold_bat_o"), GOLD_BAT_O);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "gold_bat_d"), GOLD_BAT_D);
        //Obsidian
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat_w"), OBSIDIAN_BAT_W);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat_s"), OBSIDIAN_BAT_S);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat_i"), OBSIDIAN_BAT_I);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat_g"), OBSIDIAN_BAT_G);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat_o"), OBSIDIAN_BAT_O);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "obsidian_bat_d"), OBSIDIAN_BAT_D);

        //************ Barrels ******************
        Registry.register(Registry.ITEM, new Identifier("firstmod", "wooden_barrel"), WOODEN_BARREL);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "stone_barrel"), STONE_BARREL);
        Registry.register(Registry.ITEM, new Identifier("firstmod", "iron_barrel"), IRON_BARREL);
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