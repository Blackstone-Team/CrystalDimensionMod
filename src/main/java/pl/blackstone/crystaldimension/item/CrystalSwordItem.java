
package pl.blackstone.crystaldimension.item;

import pl.blackstone.crystaldimension.itemgroup.CdTabItemGroup;
import pl.blackstone.crystaldimension.CrystalDimensionModElements;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

@CrystalDimensionModElements.ModElement.Tag
public class CrystalSwordItem extends CrystalDimensionModElements.ModElement {
	@ObjectHolder("crystal_dimension:crystal_sword")
	public static final Item block = null;
	public CrystalSwordItem(CrystalDimensionModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 450;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CrystalShardsItem.block, (int) (1)));
			}
		}, 3, -2.4f, new Item.Properties().group(CdTabItemGroup.tab)) {
		}.setRegistryName("crystal_sword"));
	}
}
