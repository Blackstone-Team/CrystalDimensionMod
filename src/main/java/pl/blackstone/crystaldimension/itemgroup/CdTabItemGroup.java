
package pl.blackstone.crystaldimension.itemgroup;

import pl.blackstone.crystaldimension.block.LightGrassBlock;
import pl.blackstone.crystaldimension.CrystalDimensionModElements;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

@CrystalDimensionModElements.ModElement.Tag
public class CdTabItemGroup extends CrystalDimensionModElements.ModElement {
	public CdTabItemGroup(CrystalDimensionModElements instance) {
		super(instance, 2);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcd_tab") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(LightGrassBlock.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static ItemGroup tab;
}
