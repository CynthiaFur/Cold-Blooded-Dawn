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
		
		//Items
		registerModel(ModItems.ruby, 0);
		registerModel(ModItems.rocket, 0);

		registerModel(ModItems.ruby_helmet, 0);
		registerModel(ModItems.ruby_chestplate, 0);
		registerModel(ModItems.ruby_leggings, 0);
		registerModel(ModItems.ruby_boots, 0);
		
		//Blocks
		registerModel(Item.getItemFromBlock(ModBlocks.ruby_block),0);
		registerModel(Item.getItemFromBlock(ModBlocks.ruby_ore), 0);
		
		//Tools
		registerModel(ModItems.ruby_shovel, 0);
		registerModel(ModItems.ruby_axe, 0);
		registerModel(ModItems.ruby_pickaxe , 0);
		
		//Weapons
		registerModel(ModItems.ruby_sword, 0);
		registerModel(ModItems.rocket_launcher, 0);
		
	}
	
	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
}
