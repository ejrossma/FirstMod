package vulgit.first.mod.tools.materials;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class GoldBatMaterial implements ToolMaterial {
    public static final GoldBatMaterial INSTANCE = new GoldBatMaterial();
    @Override
    public int getDurability() {
        return 32;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 12.0F;
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
       return 22;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.GOLD_INGOT);
    }
}
