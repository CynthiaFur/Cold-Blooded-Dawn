package cynthiafur.coldbloodeddawn.util;

import cynthiafur.coldbloodeddawn.Main;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;

public class RegistryUtil {
	
	public static Item setItemName(final Item item, final String name) {
		item.setRegistryName(Main.MODID, name).setUnlocalizedName(Main.MODID + "." + name);
		return item;
		}
	
	public static Block setBlockName(final Block block, final String name) {
		block.setRegistryName(Main.MODID, name).setUnlocalizedName(Main.MODID + "." + name);
		return block;
	}
	
	
}
