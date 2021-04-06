package vulgit.first.mod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FirstMod implements ModInitializer {
	
	public static final Item BAT = new Item(new Item.Settings().group(ItemGroup.COMBAT));
	
	@Override
	public void onInitialize() {
		
		Registry.register(Registry.ITEM, new Identifier("firstmod", "bat"), BAT);

	}
}