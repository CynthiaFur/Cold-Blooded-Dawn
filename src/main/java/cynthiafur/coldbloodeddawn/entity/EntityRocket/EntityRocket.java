package cynthiafur.coldbloodeddawn.entity.EntityRocket;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

public class EntityRocket extends EntityThrowable{

	public EntityRocket(World worldIn) {
		super(worldIn);
	}
	
	public EntityRocket(World worldIn, EntityLivingBase throwerIn) {
		super(worldIn, throwerIn);
	}
	
	public EntityRocket(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}
	
	@Override
	protected void onImpact(RayTraceResult result) {
		
		if(!this.world.isRemote) {
			setDead();
			
			if(result.entityHit instanceof EntityLivingBase) {
			EntityLivingBase entity = (EntityLivingBase)result.entityHit;
			entity.attackEntityFrom(DamageSource.causeExplosionDamage(entity), 20);
			
			
				
			}
		}
		
	}
	
}
