package com.ironnugget.simplysalty.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

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
        net.minecraftforge.common.PlantType plantType = plantable.getPlantType(world, pos.offset(direction));
		switch (plantType) {
            case Desert: return true;
            case Nether: return false;
            case Crop:   return true;
            case Cave:   return true;
            case Plains: return true;
            case Water:  return false;
            case Beach:  return true;
        }
		return super.canSustainPlant(state, world, pos, direction, plantable);
	}

}