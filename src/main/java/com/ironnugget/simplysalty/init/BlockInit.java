package com.ironnugget.simplysalty.init;

import java.util.function.ToIntFunction;

import com.ironnugget.simplysalty.SimplySalty;
import com.ironnugget.simplysalty.objects.blocks.FertileSoil;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.SandBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {
	
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, SimplySalty.MOD_ID);
	
	//This is a stupid piece of code that gets the lantern to work
		public static ToIntFunction<BlockState> lanternLightLevel = BlockState -> 15;
	
	//Salt
	public static final RegistryObject<Block> salt_ore = BLOCKS.register("salt_ore",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 6f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
	public static final RegistryObject<Block> salt_block = BLOCKS.register("salt_block",
			() -> new SandBlock(0, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).harvestTool(ToolType.SHOVEL).sound(SoundType.SAND)));
	public static final RegistryObject<Block> salt_stone = BLOCKS.register("salt_stone",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 6f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
	public static final RegistryObject<Block> salt_stone_slab = BLOCKS.register("salt_stone_slab",
			() -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 6f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));	
	public static final RegistryObject<Block> salt_stone_stairs = BLOCKS.register("salt_stone_stairs",
			() -> new StairsBlock(() -> BlockInit.salt_stone.get().getDefaultState(), Block.Properties.create(Material.ROCK)));
	public static final RegistryObject<Block> salt_stone_wall = BLOCKS.register("salt_stone_wall",
			() -> new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 6f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
			
	//Sulphur
	public static final RegistryObject<Block> sulphur_ore = BLOCKS.register("sulphur_ore",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 6f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
	public static final RegistryObject<Block> sulphur_block = BLOCKS.register("sulphur_block",
			() -> new SandBlock(0, Block.Properties.create(Material.SAND).hardnessAndResistance(0.5f, 0.5f).harvestTool(ToolType.SHOVEL).sound(SoundType.SAND)));
	public static final RegistryObject<Block> sulphur_stone = BLOCKS.register("sulphur_stone",
			() -> new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 6f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
	public static final RegistryObject<Block> sulphur_stone_slab = BLOCKS.register("sulphur_stone_slab",
			() -> new SlabBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 6f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));	
	public static final RegistryObject<Block> sulphur_stone_stairs = BLOCKS.register("sulphur_stone_stairs",
			() -> new StairsBlock(() -> BlockInit.sulphur_stone.get().getDefaultState(), Block.Properties.create(Material.ROCK)));
	public static final RegistryObject<Block> sulphur_stone_wall = BLOCKS.register("sulphur_stone_wall",
			() -> new WallBlock(Block.Properties.create(Material.ROCK).hardnessAndResistance(3f, 6f).harvestTool(ToolType.PICKAXE).sound(SoundType.STONE)));
	public static final RegistryObject<Block> sulphur_lantern = BLOCKS.register("sulphur_lantern",
			() -> new LanternBlock(Block.Properties.create(Material.IRON).hardnessAndResistance(3.5f).sound(SoundType.LANTERN).setLightLevel(lanternLightLevel).notSolid()));
	
	//FertileSoil
	public static final RegistryObject<Block> fertile_soil = BLOCKS.register("fertile_soil",
			() -> new FertileSoil(Block.Properties.create(Material.EARTH).tickRandomly().hardnessAndResistance(0.6F).sound(SoundType.GROUND)));
	
}