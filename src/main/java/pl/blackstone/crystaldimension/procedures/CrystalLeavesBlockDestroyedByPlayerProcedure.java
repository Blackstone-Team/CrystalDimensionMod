package pl.blackstone.crystaldimension.procedures;

import pl.blackstone.crystaldimension.item.CrystalBerryItem;
import pl.blackstone.crystaldimension.CrystalDimensionModElements;
import pl.blackstone.crystaldimension.CrystalDimensionMod;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;

import java.util.Map;

@CrystalDimensionModElements.ModElement.Tag
public class CrystalLeavesBlockDestroyedByPlayerProcedure extends CrystalDimensionModElements.ModElement {
	public CrystalLeavesBlockDestroyedByPlayerProcedure(CrystalDimensionModElements instance) {
		super(instance, 15);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency x for procedure CrystalLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency y for procedure CrystalLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency z for procedure CrystalLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency world for procedure CrystalLeavesBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((Math.random() == 0.5)) {
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(CrystalBerryItem.block, (int) (1)));
				entityToSpawn.setPickupDelay((int) 10);
				entityToSpawn.setNoDespawn();
				world.addEntity(entityToSpawn);
			}
		}
	}
}
