package vulgit.first.mod.tools.materials;


import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class IronBatMaterial implements ToolMaterial {
    public static final IronBatMaterial INSTANCE = new IronBatMaterial();
    @Override
    public int getDurability() {
        return 250;
    }
    @Override
    public float getMiningSpeedMultiplier() {
        return 6.0F;
    }
    @Override
    public float getAttackDamage() {
        return 2.0F;
    }
    @Override
    public int getMiningLevel() {
        return 2;
    }
    @Override
    public int getEnchantability() {
       return 14;
    }
    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.IRON_INGOT);
    }
}
