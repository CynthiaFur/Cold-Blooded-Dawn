package cynthiafur.coldbloodeddawn.recipes;

import cynthiafur.coldbloodeddawn.init.ModBlocks;
import cynthiafur.coldbloodeddawn.init.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void initSmelting() {
		GameRegistry.addSmelting(ModBlocks.ruby_ore, new ItemStack(ModItems.ruby), 100F);
	}

}
