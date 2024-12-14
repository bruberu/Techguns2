package techguns.items.guns;

import java.util.List;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.NetworkRegistry.TargetPoint;
import techguns.TGItems;
import techguns.TGPackets;
import techguns.TGSounds;
import techguns.api.damagesystem.DamageType;
import techguns.damagesystem.TGDamageSource;
import techguns.deatheffects.EntityDeathUtils.DeathType;
import techguns.packets.PacketSpawnParticle;
import techguns.util.TextUtil;

public class MiningDrill extends GenericGunMeleeCharge {

	public MiningDrill(String name, ChargedProjectileSelector projectile_selector, boolean semiAuto, int minFiretime,
			int clipsize, int reloadtime, float damage, SoundEvent firesound, SoundEvent reloadsound, int TTL,
			float accuracy, float fullChargeTime, int ammoConsumedOnFullCharge) {
		super(name, projectile_selector, semiAuto, minFiretime, clipsize, reloadtime, damage, firesound, reloadsound, TTL,
				accuracy, fullChargeTime, ammoConsumedOnFullCharge);
		
		this.setMiningHeads(TGItems.MININGDRILLHEAD_CARBON);
	}

	@Override
	protected TGDamageSource getMeleeDamageSource(EntityPlayer player,ItemStack stack) {
		TGDamageSource src = new TGDamageSource("player", player, player, DamageType.PHYSICAL, DeathType.GORE);
		if(this.getCurrentAmmo(stack)>0){
			src.goreChance=0.5f;
			src.armorPenetration=this.penetration;
			src.knockbackMultiplier=1f;
		} else{
			src.deathType = DeathType.DEFAULT;
		}
		return src;
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer player, EnumHand handIn) {
		ItemStack stack = player.getHeldItem(handIn);
		this.shootGunPrimary(stack, worldIn, player, false, handIn, null);
		return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);
	}

	@Override
	public float getExtraDigSpeed(ItemStack stack) {
		int headlevel = this.getMiningHeadLevel(stack);
		return 2.0f*headlevel;
	}
	
	@Override
	protected void addMiningTooltip(ItemStack stack, World world, List<String> list, ITooltipFlag flagIn,
			boolean longTooltip) {
		super.addMiningTooltip(stack, world, list, flagIn, longTooltip);
		if (longTooltip) {
			list.add(TextUtil.trans("techguns.tooltip.sneaksilktouch"));
		}
	}

	@Override
	public int getExtraMiningRadius(ItemStack stack) {
		return 0;//this.getMiningHeadLevel(stack);
	}

	@Override
	protected SoundEvent getSwingSound() {
		return TGSounds.DRILLER_SWING; //TGSounds.CHAINSAW_LOOP;
	}
	
	@Override
	protected SoundEvent getBlockBreakSound() {
		return TGSounds.DRILLER_BREAK; //TGSounds.CHAINSAW_HIT;
	}
	
	@Override
	protected void spawnSweepParticle(World w, double x, double y, double z, double motionX, double motionY,
			double motionZ) {
		TGPackets.network.sendToAllAround(new PacketSpawnParticle("PowerhammerImpact",x,y,z), new TargetPoint(w.provider.getDimension(), x, y, z, 32.0f));
	}


	@Override
	protected void playSweepSoundEffect(EntityPlayer player) {
		player.world.playSound((EntityPlayer) null, player.posX, player.posY, player.posZ, TGSounds.DRILLER_HIT,
				player.getSoundCategory(), 1.0F, 1.0F);
	}
	
}
