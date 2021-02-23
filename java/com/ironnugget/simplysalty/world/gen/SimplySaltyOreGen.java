package com.ironnugget.simplysalty.world.gen;

import com.ironnugget.simplysalty.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;


public class SimplySaltyOreGen {
	
	public static void generateOre(final BiomeLoadingEvent event) {
			
		if(!(event.getCategory().equals(Biome.Category.NETHER)) || (event.getCategory().equals(Biome.Category.THEEND))) {
				
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, 
				BlockInit.salt_ore.get().getDefaultState(), 20, 0, 255, 128);
			
			generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, 
				BlockInit.sulphur_ore.get().getDefaultState(), 8, 0, 16, 24);
				
		}
			
	}
		
	private static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int count) {
			
		settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, 
				Feature.ORE.withConfiguration(new OreFeatureConfig(fillerType, state, veinSize))
					.withPlacement(Placement.RANGE.configure(new TopSolidRangeConfig(minHeight, 0, maxHeight)))
					.square().func_242731_b(count));
	}
		
}