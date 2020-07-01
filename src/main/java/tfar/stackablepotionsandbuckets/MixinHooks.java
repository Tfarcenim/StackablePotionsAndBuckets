package tfar.stackablepotionsandbuckets;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class MixinHooks {
	public static ItemStack getFilledBucket(ItemStack stack, PlayerEntity player){
		ItemStack copy = stack.copy();
		copy.decrement(1);
		player.giveItemStack(new ItemStack(Items.BUCKET));
		return copy;
	}
}
