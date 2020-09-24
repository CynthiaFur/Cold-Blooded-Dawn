package cynthiafur.coldbloodeddawn;

import cynthiafur.coldbloodeddawn.init.ModBlocks;
import cynthiafur.coldbloodeddawn.item.ItemMcryAxe;
import cynthiafur.coldbloodeddawn.item.ItemMcryPickaxe;
import cynthiafur.coldbloodeddawn.item.ItemMcrySword;
import cynthiafur.coldbloodeddawn.materials.McryMaterials;
import cynthiafur.coldbloodeddawn.util.RegistryUtil;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
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
				RegistryUtil.setItemName(new Item(),  "ruby").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcryPickaxe(McryMaterials.MCRY_RUBY_PICKAXE), "ruby_pickaxe").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcrySword(McryMaterials.MCRY_RUBY_SWORD), "ruby_sword").setCreativeTab(Main.COLDBLOODEDDAWN_TAB),
				RegistryUtil.setItemName(new ItemMcryAxe(McryMaterials.MCRY_RUBY_AXE, 8.0F, -3.1F), "ruby_axe").setCreativeTab(Main.COLDBLOODEDDAWN_TAB)
				
		};
		
		final Item[] itemBlocks ={
				new ItemBlock(ModBlocks.ruby_block).setRegistryName(ModBlocks.ruby_block.getRegistryName())
		};
		
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
				RegistryUtil.setBlockName(new Block(Material.IRON), "ruby_block").setCreativeTab(Main.COLDBLOODEDDAWN_TAB)
		};
		
		event.getRegistry().registerAll(blocks);
		
	}

}
