
package net.tgg.advancedgodarmour.fuel;

import net.tgg.advancedgodarmour.item.AdvancedFuelItem;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

@Mod.EventBusSubscriber
public class AdvancedFuelAsFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == AdvancedFuelItem.block)
			event.setBurnTime(200000000);
	}
}
