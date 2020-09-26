package cynthiafur.coldbloodeddawn.init;

import cynthiafur.coldbloodeddawn.Main;
import cynthiafur.coldbloodeddawn.entity.EntityRocket.EntityRocket;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class EntityInit {
	public static void registerEntities() {
	registerProjectile("rocket", ModEntities.ENTITY_ROCKET, EntityRocket.class, ModItems.rocket);
	}
	
	private static void registerProjectile(String name, int id, Class<? extends Entity> entity, Item item) {
		EntityRegistry.registerModEntity(new ResourceLocation(name), entity, name, id, Main.instance, 64, 10, true);
	}

}
