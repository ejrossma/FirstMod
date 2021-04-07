package vulgit.first.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import vulgit.first.mod.registry.ModItems;

public class FirstMod implements ModInitializer {
	
	

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier("firstmod", "general"),	
		() -> new ItemStack(ModItems.WOODEN_BAT));
	
	@Override
	public void onInitialize() {
		
		ModItems.registerItems();

	}
}
