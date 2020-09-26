package cynthiafur.coldbloodeddawn;

import cynthiafur.coldbloodeddawn.init.ModBlocks;
import cynthiafur.coldbloodeddawn.item.ItemMcryArmor;
import cynthiafur.coldbloodeddawn.item.ItemMcryAxe;
import cynthiafur.coldbloodeddawn.item.ItemMcryHoe;
import cynthiafur.coldbloodeddawn.item.ItemMcryPickaxe;
import cynthiafur.coldbloodeddawn.item.ItemMcryShovel;
import cynthiafur.coldbloodeddawn.item.ItemMcrySword;
import cynthiafur.coldbloodeddawn.item.RocketLauncher;
import cynthiafur.coldbloodeddawn.materials.McryMaterials;
import cynthiafur.coldbloodeddawn.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = Main.MODID)
public class RegistrationHandler {
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				
				//Item Registries
				RegistryUtil.setItemName(new Item(),  "ruby").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcryPickaxe(McryMaterials.RUBY_TOOL), "ruby_pickaxe").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcrySword(McryMaterials.RUBY_TOOL), "ruby_sword").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcryAxe(McryMaterials.RUBY_TOOL, 8.0F, -3.1F), "ruby_axe").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcryShovel(McryMaterials.RUBY_TOOL), "ruby_shovel").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new RocketLauncher(), "rocket_launcher").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new Item(), "rocket").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				
				//Armor Registies
				RegistryUtil.setItemName(new ItemMcryArmor(McryMaterials.RUBY_ARMOR, EntityEquipmentSlot.HEAD), "ruby_helmet").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcryArmor(McryMaterials.RUBY_ARMOR, EntityEquipmentSlot.CHEST), "ruby_chestplate").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcryArmor(McryMaterials.RUBY_ARMOR, EntityEquipmentSlot.LEGS),  "ruby_leggings").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcryArmor(McryMaterials.RUBY_ARMOR, EntityEquipmentSlot.FEET),  "ruby_boots").setCreativeTab(Main.COLDBLOODEDDAWN_TAB)
				
		};
		
		final Item[] itemBlocks ={
				
				//Block Registries
				new ItemBlock(ModBlocks.ruby_block).setRegistryName(ModBlocks.ruby_block.getRegistryName()),
				new ItemBlock(ModBlocks.ruby_ore).setRegistryName(ModBlocks.ruby_ore.getRegistryName())
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				
				//Block Registries
				RegistryUtil.setBlockName(new Block(Material.IRON), "ruby_block").setHardness(25F).setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setBlockName(new Block(Material.IRON), "ruby_ore").setHardness(25F).setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				
				
		};
		
		
		
		
		event.getRegistry().registerAll(blocks);
		
	}
	
	public static void initRegistries() {
		
		Main.proxy.render();
		
	}

}
