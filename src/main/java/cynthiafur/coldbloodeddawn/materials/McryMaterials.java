package cynthiafur.coldbloodeddawn.materials;

import cynthiafur.coldbloodeddawn.Main;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class McryMaterials {
	
	//tool materials
	public static final ToolMaterial RUBY_TOOL = EnumHelper.addToolMaterial(Main.MODID + ":" + "ruby_tool", 4, 2500, 15.0F, 4.5F, 15);
	
	//armor materials
	public static final ArmorMaterial RUBY_ARMOR = EnumHelper.addArmorMaterial(Main.MODID + ":" + "ruby_armor", Main.MODID + ":ruby", 20, new int[] {4,7,8,5}, 15, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 3);
	
}
