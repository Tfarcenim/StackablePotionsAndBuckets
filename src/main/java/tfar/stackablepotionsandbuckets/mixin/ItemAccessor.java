package tfar.stackablepotionsandbuckets.mixin;

import net.minecraft.item.Item;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.Shadow;
import tfar.stackablepotionsandbuckets.ItemInterface;

@Mixin(Item.class)
public class ItemAccessor implements ItemInterface {
	@Mutable @Shadow @Final private int maxCount;

	@Override
	public void setMaxCount(int count) {
		this.maxCount = count;
	}
}
