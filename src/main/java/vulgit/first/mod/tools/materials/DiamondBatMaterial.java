package vulgit.first.mod.tools.materials;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class DiamondBatMaterial implements ToolMaterial {
    public static final DiamondBatMaterial INSTANCE = new DiamondBatMaterial();
    @Override
    public int getDurability() {
        return 1561;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 8.0F;
    }
    @Override
    public float getAttackDamage() {
        return 3.0F;
    }
    @Override
    public int getMiningLevel() {
        return 3;
    }
    @Override
    public int getEnchantability() {
       return 10;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.DIAMOND);
    }
}
