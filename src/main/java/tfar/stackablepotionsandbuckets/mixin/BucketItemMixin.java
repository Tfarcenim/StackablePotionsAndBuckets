package tfar.stackablepotionsandbuckets.mixin;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BucketItem;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import tfar.stackablepotionsandbuckets.MixinHooks;

@Mixin(BucketItem.class)
public class BucketItemMixin {
	@Inject(method = "getEmptiedStack",at = @At("RETURN"),cancellable = true)
	protected void stackable(ItemStack stack, PlayerEntity player, CallbackInfoReturnable<ItemStack> cir){
		if (player.abilities.creativeMode || stack.getCount() == 1)return;
		cir.setReturnValue(MixinHooks.getFilledBucket(stack,player));
	}
}
