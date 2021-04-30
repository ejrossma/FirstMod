package vulgit.first.mod.tools.materials;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class StoneBatMaterial implements ToolMaterial {
    public static final StoneBatMaterial INSTANCE = new StoneBatMaterial();
    @Override
    public int getDurability() {
        return 130;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 4.0F;
    }
    @Override
    public float getAttackDamage() {
        return 1.0F;
    }
    @Override
    public int getMiningLevel() {
        return 1;
    }
    @Override
    public int getEnchantability() {
       return 5;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.STONE);
    }
}
