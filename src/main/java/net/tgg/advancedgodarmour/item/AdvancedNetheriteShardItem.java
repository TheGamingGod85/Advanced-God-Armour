
package net.tgg.advancedgodarmour.item;

import net.tgg.advancedgodarmour.itemgroup.AdvancedGodArmourTabItemGroup;
import net.tgg.advancedgodarmour.AdvancedGodArmourModElements;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import java.util.List;

@AdvancedGodArmourModElements.ModElement.Tag
public class AdvancedNetheriteShardItem extends AdvancedGodArmourModElements.ModElement {
	@ObjectHolder("advanced_god_armour:advanced_netherite_shard")
	public static final Item block = null;

	public AdvancedNetheriteShardItem(AdvancedGodArmourModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(AdvancedGodArmourTabItemGroup.tab).maxStackSize(16).isImmuneToFire().rarity(Rarity.EPIC));
			setRegistryName("advanced_netherite_shard");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 0.5F;
		}

		@Override
		@OnlyIn(Dist.CLIENT)
		public boolean hasEffect(ItemStack itemstack) {
			return true;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("Used As Recipe Ingredient For God Armour"));
		}
	}
}
