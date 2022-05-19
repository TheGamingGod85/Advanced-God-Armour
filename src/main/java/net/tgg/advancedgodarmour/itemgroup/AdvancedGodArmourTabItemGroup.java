
package net.tgg.advancedgodarmour.itemgroup;

import net.tgg.advancedgodarmour.item.PurifiedNetherStarItem;
import net.tgg.advancedgodarmour.AdvancedGodArmourModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@AdvancedGodArmourModElements.ModElement.Tag
public class AdvancedGodArmourTabItemGroup extends AdvancedGodArmourModElements.ModElement {
	public AdvancedGodArmourTabItemGroup(AdvancedGodArmourModElements instance) {
		super(instance, 27);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabadvanced_god_armour_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(PurifiedNetherStarItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}

	public static ItemGroup tab;
}
