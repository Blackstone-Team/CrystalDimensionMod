package pl.blackstone.crystaldimension.procedures;

import pl.blackstone.crystaldimension.entity.SkylightEntity;
import pl.blackstone.crystaldimension.CrystalDimensionModElements;
import pl.blackstone.crystaldimension.CrystalDimensionMod;

import net.minecraft.world.server.ServerWorld;
import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.entity.SpawnReason;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.Entity;

import java.util.Map;

@CrystalDimensionModElements.ModElement.Tag
public class LightSkylightLeavesBlockDestroyedByPlayerProcedure extends CrystalDimensionModElements.ModElement {
	public LightSkylightLeavesBlockDestroyedByPlayerProcedure(CrystalDimensionModElements instance) {
		super(instance, 35);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency x for procedure LightSkylightLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency y for procedure LightSkylightLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency z for procedure LightSkylightLeavesBlockDestroyedByPlayer!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				CrystalDimensionMod.LOGGER.warn("Failed to load dependency world for procedure LightSkylightLeavesBlockDestroyedByPlayer!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double SkyLights = 0;
		if ((Math.random() == 0.6)) {
			SkyLights = (double) 2;
		} else if ((Math.random() == 0.4)) {
			SkyLights = (double) 4;
		}
		if ((Math.random() == 0.5)) {
			if (world instanceof ServerWorld) {
				Entity entityToSpawn = new SkylightEntity.CustomEntity(SkylightEntity.entity, (World) world);
				entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
				if (entityToSpawn instanceof MobEntity)
					((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
							SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
				world.addEntity(entityToSpawn);
			}
		} else if ((Math.random() == 0.3)) {
			for (int index0 = 0; index0 < (int) ((SkyLights)); index0++) {
				if (world instanceof ServerWorld) {
					Entity entityToSpawn = new SkylightEntity.CustomEntity(SkylightEntity.entity, (World) world);
					entityToSpawn.setLocationAndAngles(x, y, z, world.getRandom().nextFloat() * 360F, 0);
					if (entityToSpawn instanceof MobEntity)
						((MobEntity) entityToSpawn).onInitialSpawn((ServerWorld) world, world.getDifficultyForLocation(entityToSpawn.getPosition()),
								SpawnReason.MOB_SUMMONED, (ILivingEntityData) null, (CompoundNBT) null);
					world.addEntity(entityToSpawn);
				}
			}
		}
	}
}
