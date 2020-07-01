package tfar.stackablepotionsandbuckets;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Items;

public class StackableBucketsAndPotions implements ModInitializer {
	@Override
	public void onInitialize() {
		((ItemInterface) Items.WATER_BUCKET).setMaxCount(16);
		((ItemInterface) Items.LAVA_BUCKET).setMaxCount(16);
		((ItemInterface) Items.POTION).setMaxCount(16);
		((ItemInterface) Items.SPLASH_POTION).setMaxCount(64);
		((ItemInterface) Items.LINGERING_POTION).setMaxCount(64);
	}
}
