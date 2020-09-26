package cynthiafur.coldbloodeddawn.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderSnowball;
import cynthiafur.coldbloodeddawn.entity.EntityRocket.EntityRocket;
import cynthiafur.coldbloodeddawn.init.ModItems;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{
	
	@SuppressWarnings("deprecation")
	@Override
	public void render() {
		RenderingRegistry.registerEntityRenderingHandler(EntityRocket.class, new RenderSnowball<EntityRocket>(Minecraft.getMinecraft().getRenderManager(), ModItems.rocket, Minecraft.getMinecraft().getRenderItem()));
	}

}
