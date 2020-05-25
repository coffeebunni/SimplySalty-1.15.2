package com.ironnugget.simplysalty.world.gen;

import com.ironnugget.simplysalty.init.BlockInit;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class SimplySaltyOreGen {
	public static void generateOre() {
		for (Biome biome : ForgeRegistries.BIOMES) {
				
				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockInit.salt_ore.get().getDefaultState(), 10))
					.withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(20, 0, 0, 128))));

				biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE
					.withConfiguration(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE,BlockInit.sulphur_ore.get().getDefaultState(), 6))
					.withPlacement(Placement.COUNT_RANGE.configure(new CountRangeConfig(8, 0, 0, 24))));
		}
	}
}
		