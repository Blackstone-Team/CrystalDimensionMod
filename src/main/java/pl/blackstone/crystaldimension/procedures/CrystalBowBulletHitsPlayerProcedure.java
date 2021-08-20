package pl.blackstone.crystaldimension.procedures;

import pl.blackstone.crystaldimension.CrystalDimensionModElements;
import pl.blackstone.crystaldimension.CrystalDimensionMod;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

@CrystalDimensionModElements.ModElement.Tag
public class CrystalBowBulletHitsPlayerProcedure extends CrystalDimensionModElements.ModElement {
	public CrystalBowBulletHitsPlayerProcedure(CrystalDimensionModElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency entity for procedure CrystalBowBulletHitsPlayer!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.SLOWNESS, (int) 60, (int) 0.5));
	}
}
