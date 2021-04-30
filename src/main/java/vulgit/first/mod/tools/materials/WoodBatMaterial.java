package vulgit.first.mod.tools.materials;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class WoodBatMaterial implements ToolMaterial {
    public static final WoodBatMaterial INSTANCE = new WoodBatMaterial();
    @Override
    public int getDurability() {
        return 60;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 2.0F;
    }
    @Override
    public float getAttackDamage() {
        return 0.0F;
    }
    @Override
    public int getMiningLevel() {
        return 0;
    }
    @Override
    public int getEnchantability() {
       return 15;
    }
    @Override
    public Ingredient getRepairIngredient() {
       return Ingredient.ofItems(Items.OAK_PLANKS);
    }
}
