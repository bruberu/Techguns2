package techguns.entities.projectiles;

import io.netty.buffer.ByteBuf;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.PotionEffect;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.BlockSnapshot;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.fml.common.registry.IEntityAdditionalSpawnData;
import techguns.TGBlocks;
import techguns.TGSounds;
import techguns.Techguns;
import techguns.api.damagesystem.DamageType;
import techguns.client.ClientProxy;
import techguns.damagesystem.TGDamageSource;
import techguns.deatheffects.EntityDeathUtils.DeathType;
import techguns.items.guns.GenericGun;
import techguns.items.guns.IChargedProjectileFactory;
import techguns.tileentities.BioBlobTileEnt;

public class BioGunProjectile extends GenericProjectile implements IEntityAdditionalSpawnData{

	public int level;


	public BioGunProjectile(World worldIn, double posX, double posY, double posZ, float yaw, float pitch, float damage, float speed, int TTL, float spread, float dmgDropStart,
			float dmgDropEnd, float dmgMin, float penetration, boolean blockdamage, EnumBulletFirePos leftGun, double gravity, int level) {
		super(worldIn, posX, posY, posZ, yaw, pitch, damage, speed, TTL, spread, dmgDropStart, dmgDropEnd, dmgMin, penetration, blockdamage, leftGun);
		this.level=level;
		this.gravity=gravity;
	}

	public BioGunProjectile(World par2World, EntityLivingBase p, float damage, float speed, int TTL, float spread, float dmgDropStart, float dmgDropEnd, float dmgMin,
			float penetration, boolean blockdamage, EnumBulletFirePos leftGun, double gravity, int level) {
		super(par2World, p, damage, speed, TTL, spread, dmgDropStart, dmgDropEnd, dmgMin, penetration, blockdamage, leftGun);
		this.level=level;
		this.gravity=gravity;
	}
	
	public BioGunProjectile(World worldIn) {
		super(worldIn);
		ClientProxy.get().createFXOnEntity("BioGunTrail", this);
	}

	 @Override
	protected void onHitEffect(EntityLivingBase ent, RayTraceResult rayTraceResult) {
 		ent.addPotionEffect(new PotionEffect(MobEffects.POISON,100,3,false,true));
 		
 		doImpactEffects(null, rayTraceResult, null);
 		
		//TGPackets.network.sendToAllAround(new PacketSpawnParticle("biogunImpact", -rayTraceResult.hitVec.x,-rayTraceResult.hitVec.y,-rayTraceResult.hitVec.z), TGPackets.targetPointAroundEnt(this, 25.0f));			
	}
	 
	@Override
	protected TGDamageSource getProjectileDamageSource() {
		TGDamageSource src = TGDamageSource.causePoisonDamage(this, this.shooter, DeathType.BIO);
    	src.goreChance = 1.0f;
    	src.armorPenetration = this.penetration;
    	src.setNoKnockback();
    	return src;
	}

	@Override
	protected void doImpactEffects(Material mat, RayTraceResult rayTraceResult, SoundType sound) {
		double x = rayTraceResult.hitVec.x;
    	double y = rayTraceResult.hitVec.y;
    	double z = rayTraceResult.hitVec.z;
    	boolean distdelay=true;
    	
    	float pitch = 0.0f;
    	float yaw = 0.0f;
    	if (rayTraceResult.typeOfHit == Type.BLOCK) {
    		if (rayTraceResult.sideHit == EnumFacing.UP) {
    			pitch = -90.0f;
    		}else if (rayTraceResult.sideHit == EnumFacing.DOWN) {
    			pitch = 90.0f;
    		}else {
    			yaw = rayTraceResult.sideHit.getHorizontalAngle();
    		}
    	}else {
    		pitch = -this.rotationPitch;
    		yaw = -this.rotationYaw;
    	}
    	
		this.world.playSound(x, y, z, TGSounds.BIOGUN_IMPACT, SoundCategory.AMBIENT, 1.0f, 1.0f, distdelay);
		Techguns.proxy.createFX("biogunImpact", world, x, y, z, 0.0D, 0.0D, 0.0D, pitch, yaw);
			
	}
	
	
	@Override
	protected void hitBlock(RayTraceResult mop) {
		 IBlockState statehit = this.world.getBlockState(mop.getBlockPos());
		 
		 if(statehit.getBlock() == TGBlocks.BIOBLOB){
			 //System.out.println("Hit Bioblob, increase size");       	
			 
			 TileEntity tile = this.world.getTileEntity(mop.getBlockPos());
			 if(tile!=null && tile instanceof BioBlobTileEnt){
				 
				 ((BioBlobTileEnt)tile).hitBlob(level, this.shooter);
			 }
			 
			 
		 } else {
			 if (!this.world.isRemote){
   
    			 BlockPos blobPos = mop.getBlockPos().offset(mop.sideHit);
    			 
    			 if (this.world.isAirBlock(blobPos)){
    				 
    				 if(this.blockdamage) {
	    				 boolean canPlace = true;
	    				 
	    				 if ( this.shooter instanceof EntityPlayer){
		    				 final BlockEvent.PlaceEvent placeEvent = new BlockEvent.PlaceEvent(BlockSnapshot.getBlockSnapshot(world, blobPos), statehit, (EntityPlayer) this.shooter,EnumHand.MAIN_HAND);
		    				 MinecraftForge.EVENT_BUS.post(placeEvent);
		    				 canPlace = !placeEvent.isCanceled();
	    				 }
	    				 
	    				 if (canPlace){
	    					 IBlockState state = TGBlocks.BIOBLOB.getDefaultState().withProperty(TGBlocks.BIOBLOB.FACING_ALL, mop.sideHit.getOpposite()).withProperty(TGBlocks.BIOBLOB.SIZE, 0);
	    					 int lvl = 0;
		    				 this.world.setBlockState(blobPos, TGBlocks.BIOBLOB.getDefaultState());
		    				 if (this.level>1){
		    					 TileEntity tile = this.world.getTileEntity(blobPos);
		    					 if(tile!=null && tile instanceof BioBlobTileEnt){
		    						 BioBlobTileEnt blob = (BioBlobTileEnt) tile;
		    						 blob.hitBlob(level-1, this.shooter);
		    					 }
		    					 lvl = level-1;
		    				 }
		    				 this.world.setBlockState(blobPos, state.withProperty(TGBlocks.BIOBLOB.SIZE, lvl), 3);
	    				 }
    				 }
    			 } else {
    				 
    				 TileEntity tile = this.world.getTileEntity(blobPos);
        			 if(tile!=null && tile instanceof BioBlobTileEnt){
        				 
        				 ((BioBlobTileEnt)tile).hitBlob(level, this.shooter);
        			 }
    				 
    			 }
    			 
    			 
    		 }
		 }
	
		 super.hitBlock(mop);
	    //this.world.spawnParticle(EnumParticleTypes.SLIME,mop.hitVec.x,mop.hitVec.y,mop.hitVec.z,0.0D, 0.0D, 0.0D);
		//TGPackets.network.sendToAllAround(new PacketSpawnParticle("biogunImpact", mop.hitVec.x,mop.hitVec.y,mop.hitVec.z), TGPackets.targetPointAroundEnt(this, 25.0f));
			
	}

	
	 
	/*private void updateBlockLevel(BlockPos pos, int level){
		
		 if (this.level>1){
			 TileEntity tile = this.world.getTileEntity(pos);
			 if(tile!=null && tile instanceof BioBlobTileEnt){
				 ((BioBlobTileEnt)tile).setLevel(int level);
			 }
		 }
	}
	 
	private void setBlockForLevel(int x, int y, int z, int level){
		if (level==0){
			if (this.world.isAirBlock(x, y+1, z)){
				updateBlockLevel(x,y+1,z,this.level);
			}
		} else {
			int newlvl = level+this.level;
			if (newlvl >3){
    			new ProjectileExplosion(this.world, x, y, z, this.shooter, 1.5f, 30, 1.0f, 2.0f).doExplosion(false, this.shooter);
    			this.world.setBlock(x, y, z, Blocks.fire);
			} else {
				updateBlockLevel(x,y,z,newlvl);
			}
		}
		
	};*/
	
	
	@Override
	public void onUpdate() {
		super.onUpdate();
		if (this.isInWater())
        {
            for (int l = 0; l < 4; ++l)
            {
                float f4 = 0.25F;
                this.world.spawnParticle(EnumParticleTypes.WATER_BUBBLE, this.posX - this.motionX * (double)f4, this.posY - this.motionY * (double)f4, this.posZ - this.motionZ * (double)f4, this.motionX, this.motionY, this.motionZ);
            }
            this.setDead();
        } else {
        	//float f5 = 0.1f;
        	//this.worldObj.spawnParticle("slime", this.posX, this.posY, this.posZ, this.motionX*f5, (this.motionY*f5)-this.getGravityVelocity(), this.motionZ*f5);
        	//Techguns.proxy.spawnParticle("BioTrail", this.worldObj, this.posX, this.posY, this.posZ, this.motionX*f5, (this.motionY*f5)-this.getGravityVelocity(), this.motionZ*f5);

        }
	}

	@Override
	public void writeSpawnData(ByteBuf buffer) {
		buffer.writeByte((byte)this.level);
	}

	@Override
	public void readSpawnData(ByteBuf additionalData) {
		this.level=additionalData.readByte();
	}
	
	public static class Factory implements IChargedProjectileFactory<BioGunProjectile> {

		@Override
		public BioGunProjectile createProjectile(GenericGun gun, World world, EntityLivingBase p, float damage, float speed, int TTL, float spread, float dmgDropStart, float dmgDropEnd,
				float dmgMin, float penetration, boolean blockdamage, EnumBulletFirePos firePos, float radius, double gravity) {
			return this.createChargedProjectile(world, p, damage, speed, TTL, spread, dmgDropStart, dmgDropEnd, dmgMin, penetration, blockdamage, firePos, radius, gravity, 0f, 1);
		}

		@Override
		public DamageType getDamageType() {
			return DamageType.POISON;
		}
		
		@Override
		public BioGunProjectile createChargedProjectile(World world, EntityLivingBase p, float damage, float speed, int TTL, float spread, float dmgDropStart, float dmgDropEnd,
				float dmgMin, float penetration, boolean blockdamage, EnumBulletFirePos firePos, float radius, double gravity, float charge, int ammoConsumed) {
			return new BioGunProjectile(world,p,damage,speed,TTL,spread,dmgDropStart,dmgDropEnd,dmgMin,penetration,blockdamage,firePos,gravity,ammoConsumed);
		}
		
	}
}