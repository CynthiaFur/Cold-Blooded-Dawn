package cynthiafur.coldbloodeddawn;

import org.apache.logging.log4j.Logger;

import cynthiafur.coldbloodeddawn.client.ModelRegistrationHandler;
import cynthiafur.coldbloodeddawn.init.ModBlocks;
import cynthiafur.coldbloodeddawn.init.ModItems;
import cynthiafur.coldbloodeddawn.proxy.CommonProxy;
import cynthiafur.coldbloodeddawn.recipes.ModRecipes;
import cynthiafur.coldbloodeddawn.world.gen.McryWorldGen;

import org.apache.logging.log4j.LogManager;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION, acceptedMinecraftVersions = Main.MC_VERSION)
public class Main {
	
	public static final String MODID = "coldbloodeddawn";
	public static final String NAME = "Cold Blooded Dawn";
	public static final String VERSION = "0.0.1";
	public static final String MC_VERSION = "1.12.2";
	public static final CreativeTabs COLDBLOODEDDAWN_TAB = new coldbloodeddawnCreativeTab();
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	public static final Logger LOGGER = LogManager.getLogger(Main.MODID);
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		
			LOGGER.info(Main.NAME + " says hi!");
			
			ModRecipes.initSmelting();
		
			GameRegistry.registerWorldGenerator(new McryWorldGen(), 0);
			ModBlocks.ruby_block.setHarvestLevel("pickaxe", 3);
			ModBlocks.ruby_ore.setHarvestLevel("pickaxe", 3);
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}

}
