package pl.blackstone.crystaldimension.procedures;

import pl.blackstone.crystaldimension.CrystalDimensionModElements;
import pl.blackstone.crystaldimension.CrystalDimensionMod;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import java.util.Map;

@CrystalDimensionModElements.ModElement.Tag
public class CrystalBerryFoodEatenProcedure extends CrystalDimensionModElements.ModElement {
	public CrystalBerryFoodEatenProcedure(CrystalDimensionModElements instance) {
		super(instance, 14);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency entity for procedure CrystalBerryFoodEaten!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.SWEET_BERRY_BUSH, (float) 1);
	}
}
