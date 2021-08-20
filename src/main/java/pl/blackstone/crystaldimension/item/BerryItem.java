
package pl.blackstone.crystaldimension.item;

import pl.blackstone.crystaldimension.itemgroup.CdTabItemGroup;
import pl.blackstone.crystaldimension.CrystalDimensionModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;

@CrystalDimensionModElements.ModElement.Tag
public class BerryItem extends CrystalDimensionModElements.ModElement {
	@ObjectHolder("crystal_dimension:berry")
	public static final Item block = null;
	public BerryItem(CrystalDimensionModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(CdTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(4).saturation(0.3f).build()));
			setRegistryName("berry");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}
	}
}
