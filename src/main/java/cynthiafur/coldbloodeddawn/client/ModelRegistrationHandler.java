package cynthiafur.coldbloodeddawn.client;

import cynthiafur.coldbloodeddawn.Main;
import cynthiafur.coldbloodeddawn.init.ModBlocks;
import cynthiafur.coldbloodeddawn.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = Main.MODID)
public class ModelRegistrationHandler {

	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		registerModel(ModItems.ruby, 0);
		registerModel(Item.getItemFromBlock(ModBlocks.ruby_block),0);
		
		registerModel(ModItems.MCRY_RUBY_HOE, 0);
		//registerModel(ModItems.MCRY_RUBY_SHOVEL, 0);
		//registerModel(ModItems.MCRY_RUBY_AXE, 0);
		//registerModel(ModItems.MCRY_RUBY_PICKAXE , 0);
		//registerModel(ModItems.MCRY_RUBY_SWORD, 0);
		
	}
	
	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
