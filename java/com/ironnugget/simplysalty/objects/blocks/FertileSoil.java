package com.ironnugget.simplysalty.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.common.PlantType;

public class FertileSoil extends Block {

	public FertileSoil(Properties properties) {
		super(properties);
	}
	
	public boolean isFertile(World world, BlockPos pos) {
		return true;
	}

	@Override
	public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction direction,
			net.minecraftforge.common.IPlantable plantable) {
		//IBlockState plant = plantable.getPlant(world, pos.offset(direction));
        PlantType plantType = plantable.getPlantType(world, pos.offset(direction));
        
		if((plantType == PlantType.NETHER) || (plantType == PlantType.WATER)) {
        	
        	return false;
        	
        }
        else {
        	
        	return true;
        	
        }
		
	}

}
