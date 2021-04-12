package vulgit.first.mod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import vulgit.first.mod.registry.ModItems;

public class FirstMod implements ModInitializer {
	
	

	public static final ItemGroup ITEM_GROUP = FabricItemGroupBuilder.build(
		new Identifier("firstmod", "general"),	
		() -> new ItemStack(ModItems.WOODEN_BAT_S));
	
	@Override
	public void onInitialize() {
		
		ModItems.registerItems();

	}
}
