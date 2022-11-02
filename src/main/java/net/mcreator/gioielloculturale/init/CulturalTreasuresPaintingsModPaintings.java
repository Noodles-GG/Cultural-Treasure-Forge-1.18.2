
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gioielloculturale.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.entity.decoration.Motive;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class CulturalTreasuresPaintingsModPaintings {
	@SubscribeEvent
	public static void registerMotives(RegistryEvent.Register<Motive> event) {
		event.getRegistry().register(new Motive(288, 128).setRegistryName("alongthe_river_duringthe_qingming_festival"));
		event.getRegistry().register(new Motive(144, 64).setRegistryName("river_medium"));
		event.getRegistry().register(new Motive(80, 32).setRegistryName("river_small"));
		event.getRegistry().register(new Motive(288, 128).setRegistryName("the_odeofthe_river_goddess"));
		event.getRegistry().register(new Motive(144, 64).setRegistryName("river_godness_medium"));
		event.getRegistry().register(new Motive(80, 32).setRegistryName("river_godness_small"));
		event.getRegistry().register(new Motive(288, 128).setRegistryName("bu_nian_tu"));
		event.getRegistry().register(new Motive(144, 64).setRegistryName("bu_nian_medium"));
		event.getRegistry().register(new Motive(80, 32).setRegistryName("bu_nian_small"));
		event.getRegistry().register(new Motive(288, 128).setRegistryName("jiang_shan_tu"));
		event.getRegistry().register(new Motive(144, 64).setRegistryName("jiang_shan_medium"));
		event.getRegistry().register(new Motive(80, 32).setRegistryName("jiang_shan_small"));
	}
}
