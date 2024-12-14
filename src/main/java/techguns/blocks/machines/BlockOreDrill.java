package techguns.blocks.machines;

import net.minecraft.block.Block;
import net.minecraft.block.state.BlockFaceShape;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import techguns.blocks.GenericItemBlockMeta;
import techguns.blocks.GenericItemBlockMetaMachineBlock;
import techguns.blocks.ItemBlockOreDrill;

public class BlockOreDrill extends MultiBlockMachine<EnumOreDrillType> {

	public BlockOreDrill(String name) {
		super(name, EnumOreDrillType.class);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public boolean shouldSideBeRendered(IBlockState blockState, IBlockAccess blockAccess, BlockPos pos,
			EnumFacing side) {

        IBlockState iblockstate = blockAccess.getBlockState(pos.offset(side));
        Block block = iblockstate.getBlock();

        if(this.getClass().isInstance(block)) {
        	if(blockState.getValue(MACHINE_TYPE)==EnumOreDrillType.SCAFFOLD && blockState.getValue(FORMED)) {
        		return iblockstate!=blockState;
        	}
        }
        return super.shouldSideBeRendered(blockState, blockAccess, pos, side);	
	}

	@Override
	public ItemBlock createItemBlock() {
		ItemBlockOreDrill itemblock =  new ItemBlockOreDrill(this);
		this.itemblock=itemblock;
		return itemblock;
	}

	@Override
	public BlockFaceShape getBlockFaceShape(IBlockAccess worldIn, IBlockState state, BlockPos pos, EnumFacing face) {
		return BlockFaceShape.SOLID;
	}
	
}
