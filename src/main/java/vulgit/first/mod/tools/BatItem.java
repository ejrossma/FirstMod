package vulgit.first.mod.tools;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;
import vulgit.first.mod.FirstMod;

public class BatItem extends SwordItem {
    public BatItem(ToolMaterial toolMaterial_1) {
        super(toolMaterial_1, -1, -2.2f, new Item.Settings().group(FirstMod.ITEM_GROUP));
    }

    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity PlayerEntity, Hand hand){
        PlayerEntity.playSound(SoundEvents.ENTITY_DOLPHIN_DEATH, 1.5F, 0.8F);
        return new TypedActionResult<ItemStack>(ActionResult.SUCCESS, PlayerEntity.getStackInHand(hand));
    }
}