package techguns.world;

import net.minecraft.block.BlockDirectional;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.BlockLever;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockLog.EnumAxis;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumFacing;
import techguns.blocks.BlockTGDoor3x3;

public class BlockRotator {

	public static IBlockState getRotatedHorizontal(IBlockState state, int times) {
		
		if(state.getProperties().containsKey(BlockHorizontal.FACING)) {
			return getRotatedWithProperty(state, times, BlockHorizontal.FACING);
			
		} else if (state.getProperties().containsKey(BlockDirectional.FACING)) {
			return getRotatedWithProperty(state, times, BlockDirectional.FACING);
			
		} else if (state.getProperties().containsKey(BlockTorch.FACING)) {
			return getRotatedWithProperty(state, times, BlockTorch.FACING);
			
		} else if (state.getProperties().containsKey(BlockLever.FACING)) {
			return getRotatedLever(state, times);
			
		} else if (state.getProperties().containsKey(BlockTGDoor3x3.ZPLANE)) {
			return rotateBooleanPlane(state, times, BlockTGDoor3x3.ZPLANE);
		} else if (state.getProperties().containsKey(BlockLog.LOG_AXIS)) {
			if (times == 1 || times == 3) {
				if (state.getValue(BlockLog.LOG_AXIS) == EnumAxis.X) return state.withProperty(BlockLog.LOG_AXIS, EnumAxis.Z);
				if (state.getValue(BlockLog.LOG_AXIS) == EnumAxis.Z) return state.withProperty(BlockLog.LOG_AXIS, EnumAxis.X);
			}
		}
		
		return state;
	}
	
	public static IBlockState getWithFacing(IBlockState state, EnumFacing target) {
		if(state.getProperties().containsKey(BlockHorizontal.FACING)) {
			return state.withProperty(BlockHorizontal.FACING, target);
			
		} else if (state.getProperties().containsKey(BlockDirectional.FACING)) {
			return state.withProperty(BlockDirectional.FACING, target);
			
		} else if (state.getProperties().containsKey(BlockTorch.FACING)) {
			return state.withProperty(BlockTorch.FACING, target);
		} 
		
		return state;
	}
	
	protected static IBlockState getRotatedWithProperty(IBlockState state, int times, PropertyDirection property) {
		EnumFacing facing = state.getValue(property);
		if (!(facing == EnumFacing.UP || facing == EnumFacing.DOWN)) {
			while (times-- > 0) {
				facing = facing.rotateYCCW();
			}
		}
		return state.withProperty(property, facing);	
	}
	
	protected static IBlockState rotateBooleanPlane(IBlockState state, int times, PropertyBool property) {
		boolean plane = state.getValue(property);
		if((times % 2)==0) {
			return state;
		} else {
			return state.withProperty(property, !plane);
		}
	}
	
	protected static IBlockState getRotatedLever(IBlockState state, int times) {
		BlockLever.EnumOrientation rot = state.getValue(BlockLever.FACING);	
		while (times-- > 0) {
			switch(rot) {
			case DOWN_X:
				rot = BlockLever.EnumOrientation.DOWN_Z;
				break;
			case DOWN_Z:
				rot = BlockLever.EnumOrientation.DOWN_X;
				break;
			case EAST:
				rot = BlockLever.EnumOrientation.NORTH;
				break;
			case NORTH:
				rot = BlockLever.EnumOrientation.WEST;
				break;
			case SOUTH:
				rot = BlockLever.EnumOrientation.EAST;
				break;
			case UP_X:
				rot = BlockLever.EnumOrientation.UP_Z;
				break;
			case UP_Z:
				rot = BlockLever.EnumOrientation.UP_X;
				break;
			case WEST:
				rot = BlockLever.EnumOrientation.SOUTH;
				break;
			default:
				break;		
			}
		}
		return state.withProperty(BlockLever.FACING, rot);
	}
}
