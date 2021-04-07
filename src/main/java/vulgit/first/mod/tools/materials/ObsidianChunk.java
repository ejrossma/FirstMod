package vulgit.first.mod.tools.materials;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class ObsidianChunk implements ToolMaterial {
    public static final ObsidianChunk INSTANCE = new ObsidianChunk();
    @Override
    public int getDurability() {
        return 800;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 1.0F;
    }
    @Override
    public float getAttackDamage() {
        return 3.0F;
    }
    @Override
    public int getMiningLevel() {
        return 1;
    }
    @Override
    public int getEnchantability() {
       return 10;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.POTATO);
    }
}
