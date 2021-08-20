
package pl.blackstone.crystaldimension.item;

import pl.blackstone.crystaldimension.procedures.CrystalBerryFoodEatenProcedure;
import pl.blackstone.crystaldimension.itemgroup.CdTabItemGroup;
import pl.blackstone.crystaldimension.CrystalDimensionModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.item.UseAction;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.Food;
import net.minecraft.entity.LivingEntity;

import java.util.Map;
import java.util.HashMap;

@CrystalDimensionModElements.ModElement.Tag
public class CrystalBerryItem extends CrystalDimensionModElements.ModElement {
	@ObjectHolder("crystal_dimension:crystal_berry")
	public static final Item block = null;
	public CrystalBerryItem(CrystalDimensionModElements instance) {
		super(instance, 14);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new FoodItemCustom());
	}
	public static class FoodItemCustom extends Item {
		public FoodItemCustom() {
			super(new Item.Properties().group(CdTabItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON)
					.food((new Food.Builder()).hunger(2).saturation(0.3f).build()));
			setRegistryName("crystal_berry");
		}

		@Override
		public UseAction getUseAction(ItemStack itemstack) {
			return UseAction.EAT;
		}

		@Override
		public ItemStack onItemUseFinish(ItemStack itemstack, World world, LivingEntity entity) {
			ItemStack retval = super.onItemUseFinish(itemstack, world, entity);
			double x = entity.getPosX();
			double y = entity.getPosY();
			double z = entity.getPosZ();
			{
				Map<String, Object> $_dependencies = new HashMap<>();
				$_dependencies.put("entity", entity);
				CrystalBerryFoodEatenProcedure.executeProcedure($_dependencies);
			}
			return retval;
		}
	}
}
