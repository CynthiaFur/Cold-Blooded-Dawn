package cynthiafur.coldbloodeddawn.item;

import cynthiafur.coldbloodeddawn.entity.rocket.EntityRocket;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class RocketLauncher extends Item{
	
	public int cooldown;
	
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn){
		
		cooldown = 15;
		
		ItemStack item = playerIn.getHeldItem(handIn);
		Vec3d look = playerIn.getLookVec();
		EntityRocket rocket = new EntityRocket(worldIn, 2.5D, 2.5D, 2.5D);
		rocket.setPosition(playerIn.posX + look.x * 1.5D, playerIn.posY + look.y * 1.5D, playerIn.posZ + look.z * 1.5D);
		rocket.motionX = look.x * 1.0F;
		rocket.motionY = look.y * 1.0F;
		rocket.motionZ = look.z * 1.0F;
		playerIn.getCooldownTracker().setCooldown(this, cooldown);
		worldIn.spawnEntity(rocket);
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
		
	}

}
