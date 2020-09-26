package cynthiafur.coldbloodeddawn.item;

import cynthiafur.coldbloodeddawn.entity.EntityRocket.EntityRocket;
import cynthiafur.coldbloodeddawn.init.ModItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemMcryRocketLauncher extends Item{
	
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		ItemStack stack = playerIn.getHeldItem(handIn);
		Vec3d look = playerIn.getLookVec();
		EntityRocket rocket = new EntityRocket(worldIn, 1.0D, 1.0D, 1.0D);
		rocket.setPosition(playerIn.posX + look.x * 1.5D, playerIn.posY + look.y * 1.5D, playerIn.posZ + look.z * 1.5D);
		rocket.shoot(playerIn, playerIn.rotationPitch, playerIn.rotationYaw, 0.0F, 1.5F, 0.5F);
																		   // mess with these to test projectile speed and arc
		if(!worldIn.isRemote) {
			worldIn.spawnEntity(rocket);
		}
		
		worldIn.playSound(null, playerIn.getPosition(), SoundEvents.ENTITY_FIREWORK_BLAST, SoundCategory.PLAYERS, 1.0F, 1.0F);
		
		if(!playerIn.capabilities.isCreativeMode) {
			
		}
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
	
	}

}
