package techguns.blocks.machines;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fluids.capability.CapabilityFluidHandler;
import net.minecraftforge.fluids.capability.IFluidHandlerItem;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import techguns.TGConfig;
import techguns.Techguns;
import techguns.api.machines.IMachineType;
import techguns.blocks.GenericBlock;
import techguns.blocks.GenericItemBlockMeta;
import techguns.blocks.GenericItemBlockMetaMachineBlock;
import techguns.blocks.machines.multiblocks.MultiBlockRegister;
import techguns.events.TechgunsGuiHandler;
import techguns.tileentities.BasicInventoryTileEnt;
import techguns.tileentities.BasicOwnedTileEnt;
import techguns.tileentities.BasicRedstoneTileEnt;
import techguns.tileentities.MultiBlockMachineTileEntMaster;
import techguns.tileentities.MultiBlockMachineTileEntSlave;
import techguns.tileentities.TurretTileEnt;
import techguns.util.TextUtil;

/**
 * A Machine that can be rendered with TESR and has no properties besides type, 16 types per block.
 *
 * @param <T> Enum of all Machine Types
 */
public class BasicMachine<T extends Enum<T> & IStringSerializable & IMachineType> extends GenericBlock {
	protected Class<T> clazz;
	protected BlockStateContainer blockStateOverride;
	
	public PropertyEnum<T> MACHINE_TYPE;
	
	protected GenericItemBlockMeta itemblock;
	
	public BasicMachine(String name, Class<T> clazz) {
		super(name, Material.IRON);
		this.setSoundType(SoundType.METAL);
		setHardness(4.0f);
		this.clazz=clazz;
		MACHINE_TYPE = PropertyEnum.create("machinetype",clazz);
		this.blockStateOverride = new BlockStateContainer.Builder(this).add(MACHINE_TYPE).build();
		this.setDefaultState(this.getBlockState().getBaseState());
	}

	public String getNameSuffix(int meta) {
		IBlockState state = this.getStateFromMeta(meta);
		T t = state.getValue(MACHINE_TYPE);
		return t.toString().toLowerCase();
	}
	
	
	@Override
	public BlockStateContainer getBlockState() {
		return this.blockStateOverride;
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return this.getMetaFromState(getDefaultState().withProperty(MACHINE_TYPE, state.getValue(MACHINE_TYPE)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items) {
		for (T t : clazz.getEnumConstants()) {
			if( (!t.debugOnly() || TGConfig.debug) && !(t.hideInCreative())) {
				items.add(new ItemStack(this,1,this.getMetaFromState(getDefaultState().withProperty(MACHINE_TYPE, t))));
			}
		}
	}
	
	@Override
	public void breakBlock(World worldIn, BlockPos pos, IBlockState state) {
		TileEntity tile = worldIn.getTileEntity(pos);
		if (tile!=null && tile instanceof BasicInventoryTileEnt) {
			((BasicInventoryTileEnt) tile).onBlockBreak();
		} else if (tile!=null && tile instanceof MultiBlockMachineTileEntSlave) {
			((MultiBlockMachineTileEntSlave) tile).onBlockBreak();
		}
		super.breakBlock(worldIn, pos, state);
	}
	
	
	@Override
	public void neighborChanged(IBlockState state, World worldIn, BlockPos pos, Block blockIn, BlockPos fromPos) {
		TileEntity tile = worldIn.getTileEntity(pos);
		if(tile!=null && tile instanceof BasicRedstoneTileEnt){
			((BasicRedstoneTileEnt)tile).onNeighborBlockChange();		
		}
	}

	@Override
	public boolean shouldCheckWeakPower(IBlockState state, IBlockAccess world, BlockPos pos, EnumFacing side) {
		return true;
	}

	@Override
	public boolean onBlockActivated(World world, BlockPos pos, IBlockState state, EntityPlayer player, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
		  /* if (world.isRemote) {
	            return true;
	        } else {*/

				TileEntity tile = world.getTileEntity(pos);
				if (!world.isRemote && tile!=null && tile instanceof BasicInventoryTileEnt) {
					BasicInventoryTileEnt tileent = (BasicInventoryTileEnt) tile;
					
					if (tileent.isUseableByPlayer(player)) {
						
						if(tile instanceof MultiBlockMachineTileEntMaster) {
							MultiBlockMachineTileEntMaster master = (MultiBlockMachineTileEntMaster) tile;
							if (!master.isFormed() && !player.isSneaking()) {
								//System.out.println("UNFORMED MASTER TRY FORM");
								if(MultiBlockRegister.canFormFromSide(tileent, facing)) {
									if (MultiBlockRegister.canForm(master, player, facing)) {
										if (MultiBlockRegister.form(tileent, player, facing)) {
											master.needUpdate();
										}
									}
									return true;
								}
							} 
						}
					
						ItemStack helditem = player.getHeldItem(hand);
						if (!helditem.isEmpty() && helditem.getItem().getToolClasses(helditem).contains("wrench")) {
							
							if (player.isSneaking() && tileent.canBeWrenchDismantled() && !world.isRemote) {
								
								NBTTagCompound tileEntTags =new NBTTagCompound();
								tileent.writeNBTforDismantling(tileEntTags);
								ItemStack item = new ItemStack(this,1,this.damageDropped(state));
								NBTTagCompound itemnbt = item.getTagCompound();
								if (itemnbt==null){
									itemnbt=new NBTTagCompound();
									item.setTagCompound(itemnbt);
								}
								itemnbt.setTag("TileEntityData", tileEntTags);
								tileent.emptyContent();
								world.setBlockToAir(pos);
								world.spawnEntity(new EntityItem(world,pos.getX()+0.5d, pos.getY()+0.5d, pos.getZ()+0.5d, item));
								
							} else if (tileent.canBeWrenchRotated()) {
								if(tileent.hasRotation()) {
									tileent.rotateTile(facing);
								} else {
									this.rotateBlock(world, pos, EnumFacing.UP);
								}
							}
							
						} else if (!helditem.isEmpty() && hasBucketInteraction(state) && helditem.hasCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null) ) { 
							
							IFluidHandlerItem fluidhandler = helditem.getCapability(CapabilityFluidHandler.FLUID_HANDLER_ITEM_CAPABILITY, null);
							
							boolean interacted = tileent.onFluidContainerInteract(player, hand, fluidhandler, helditem);
							
							if(interacted) {
								if(!world.isRemote) {
									world.playSound(null, pos.getX()+0.5d,pos.getY()+0.5d,pos.getZ()+0.5d, SoundEvents.ITEM_BUCKET_FILL, SoundCategory.BLOCKS, 1f, 1f);
								}
								
								return true;
							} else if (!world.isRemote) {
								TechgunsGuiHandler.openGuiForPlayer(player, tile);
							}
							
						} else {
							if(!world.isRemote) {
								TechgunsGuiHandler.openGuiForPlayer(player, tile);
							}
						}
					
					} else {
						player.sendStatusMessage(new TextComponentString(TextUtil.trans("techguns.container.security.denied")), true);
					}

				} else if (tile!=null && tile instanceof MultiBlockMachineTileEntSlave) {
					
					MultiBlockMachineTileEntSlave slave = (MultiBlockMachineTileEntSlave) tile;
					if(slave.hasMaster()) {
						if(!world.isRemote) {
							TileEntity master = world.getTileEntity(slave.getMasterPos());
							if (master!=null && master instanceof MultiBlockMachineTileEntMaster) {
								TechgunsGuiHandler.openGuiForPlayer(player, master);
							}
						}
						
					} else {
						return false;
					}	
				}
			return true;
		//}
  	
		//return super.onBlockActivated(world, pos, state, player, hand, facing, hitX, hitY, hitZ);
	}	
	
	protected boolean hasBucketInteraction(IBlockState state) {
		return state.getValue(MACHINE_TYPE) == EnumMachineType.CHEM_LAB;
	}
	
	@Override
	public TileEntity createTileEntity(World world, IBlockState state) {
		return state.getValue(MACHINE_TYPE).getTile();
	}
	
	@Override
	public boolean hasTileEntity(IBlockState state) {
		return true;
	}

	@Override
	public ItemBlock createItemBlock() {
		GenericItemBlockMeta itemblock =  new GenericItemBlockMetaMachineBlock(this);
		this.itemblock=itemblock;
		return itemblock;
	}

	@Override
	public void registerBlock(Register<Block> event) {
		super.registerBlock(event);
		for (T t : clazz.getEnumConstants()) {
			if(TileEntity.getKey(t.getTileClass())==null) {
				//GameRegistry.registerTileEntity(t.getTileClass(), Techguns.MODID+":"+t.getName());
				GameRegistry.registerTileEntity(t.getTileClass(), new ResourceLocation(Techguns.MODID,t.getName()));
			}
		}
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return state.getValue(MACHINE_TYPE).getIndex();
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState()
	    .withProperty(MACHINE_TYPE, clazz.getEnumConstants()[meta]);
    }

	@Override
	public EnumBlockRenderType getRenderType(IBlockState state) {
		T t = state.getValue(MACHINE_TYPE);
		return t.getRenderType();
	}

	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean canRenderInLayer(IBlockState state, BlockRenderLayer layer) {
		T t = state.getValue(MACHINE_TYPE);
		return t.getBlockRenderLayer()==layer;
	}

	public void onBlockPlacedByExtended(World world, BlockPos pos, IBlockState state, EntityLivingBase placer, ItemStack stack, EnumFacing sideHit) {
		
		TileEntity tile = world.getTileEntity(pos);
		
		if (placer instanceof EntityPlayer && tile instanceof BasicOwnedTileEnt){
			((BasicOwnedTileEnt)tile).setOwner((EntityPlayer)placer);
		}
		
		if(tile instanceof BasicInventoryTileEnt) {
			BasicInventoryTileEnt invtile = (BasicInventoryTileEnt) tile;
			if (invtile.hasRotation()) {
				
				int dir = MathHelper.floor((double)(placer.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
				invtile.rotation = (byte) (dir%4);
				
			}
			
			if (stack.getTagCompound()!=null && stack.getTagCompound().hasKey("TileEntityData")) {
				invtile.readNBTfromStackTag(stack.getTagCompound().getCompoundTag("TileEntityData"));
			}
		}
		
		if(tile instanceof TurretTileEnt){
			TurretTileEnt turret = (TurretTileEnt) tile;
			if(sideHit==EnumFacing.DOWN) {
				turret.setFacing(EnumFacing.DOWN);
			} else {
				turret.setFacing(EnumFacing.UP);
			}
        	
        	if(!turret.turretDeath){
        		turret.spawnTurret(world,pos);
        	}
		}
	}

	public Class<T> getClazz() {
		return clazz;
	}

	public GenericItemBlockMeta getItemblock() {
		return itemblock;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerItemBlockModels() {
		for(int i = 0; i< clazz.getEnumConstants().length;i++) {
			IBlockState state = getDefaultState().withProperty(MACHINE_TYPE, clazz.getEnumConstants()[i]);
			if(clazz.getEnumConstants()[i].getRenderType()==EnumBlockRenderType.MODEL) {
				//ModelLoader.setCustomModelResourceLocation(itemblock, i, new ModelResourceLocation(this.getRegistryName(),BlockUtils.getBlockStateVariantString(state)));
				ModelLoader.setCustomModelResourceLocation(itemblock, i, new ModelResourceLocation(new ResourceLocation(Techguns.MODID,clazz.getEnumConstants()[i].name().toLowerCase()),"inventory"));
			} else {
				ForgeHooksClient.registerTESRItemStack(itemblock, this.getMetaFromState(state), state.getValue(MACHINE_TYPE).getTileClass());
				ModelLoader.setCustomModelResourceLocation(itemblock, i, new ModelResourceLocation(itemblock.getRegistryName(),"inventory"));
			}
		}
	}

	@Override
	public boolean hasCustomBreakingProgress(IBlockState state) {
		return true;
	}

	@Override
	public boolean rotateBlock(World world, BlockPos pos, EnumFacing axis) {
		
		if (axis == EnumFacing.DOWN || axis==EnumFacing.UP) {
			TileEntity tile = world.getTileEntity(pos);
			if(tile!=null && tile instanceof BasicInventoryTileEnt) {
				BasicInventoryTileEnt invtile = (BasicInventoryTileEnt) tile;
				if (invtile.hasRotation()) {
					invtile.rotateTile();
					return true;
				}
			}
		
		}
		return false;
	}

	@Override
	public SoundType getSoundType(IBlockState state, World world, BlockPos pos, Entity entity) {
		return state.getValue(MACHINE_TYPE).getSoundType();
	}

}
