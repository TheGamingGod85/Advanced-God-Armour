package net.tgg.advancedgodarmour.procedures;

import net.tgg.advancedgodarmour.AdvancedGodArmourMod;

import net.minecraft.potion.Effects;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import java.util.Map;

public class FlyPressOnKeyReleasedProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AdvancedGodArmourMod.LOGGER.warn("Failed to load dependency entity for procedure FlyPressOnKeyReleased!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity) {
			((LivingEntity) entity).removePotionEffect(Effects.LEVITATION);
		}
	}
}
