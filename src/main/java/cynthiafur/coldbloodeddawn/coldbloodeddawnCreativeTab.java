package cynthiafur.coldbloodeddawn;

import cynthiafur.coldbloodeddawn.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class coldbloodeddawnCreativeTab extends CreativeTabs {

	public coldbloodeddawnCreativeTab() {
		super("coldbloodeddawn");
		
	}

	@Override
	public ItemStack getTabIconItem() {
		ItemStack stack = new ItemStack(ModItems.ruby);
		return stack;
	}

}
