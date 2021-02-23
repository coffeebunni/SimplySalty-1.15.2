package com.ironnugget.simplysalty.init;

import com.ironnugget.simplysalty.SimplySalty;
import com.ironnugget.simplysalty.SimplySalty.SimplySaltyItemGroup;
import com.ironnugget.simplysalty.objects.items.SulphurChunk;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			SimplySalty.MOD_ID);

	// Salt
	public static final RegistryObject<Item> salt = ITEMS.register("salt",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance)));

	// Sulphur
	public static final RegistryObject<Item> sulphur = ITEMS.register("sulphur",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance)));
	public static final RegistryObject<Item> sulphur_chunk = ITEMS.register("sulphur_chunk",
			() -> new SulphurChunk(new Item.Properties().group(SimplySaltyItemGroup.instance)));
	public static final RegistryObject<Item> sulphur_lantern = ITEMS.register("sulphur_lantern",
			() -> new BlockItem(BlockInit.sulphur_lantern.get(), new Item.Properties().group(SimplySaltyItemGroup.instance)));

	// Salted
	public static final RegistryObject<Item> salted_chicken = ITEMS.register("salted_chicken",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(3)
					.saturation(0.6f).effect(() -> new EffectInstance(Effects.HUNGER, 600, 1), 0.1f).build())));
	public static final RegistryObject<Item> salted_beef = ITEMS.register("salted_beef",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(4)
					.saturation(0.6f).effect(() -> new EffectInstance(Effects.HUNGER, 600, 1), 0.1f).build())));
	public static final RegistryObject<Item> salted_mutton = ITEMS.register("salted_mutton",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(3)
					.saturation(0.6f).effect(() -> new EffectInstance(Effects.HUNGER, 600, 1), 0.1f).build())));
	public static final RegistryObject<Item> salted_pork = ITEMS.register("salted_pork",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(4)
					.saturation(0.6f).effect(() -> new EffectInstance(Effects.HUNGER, 600, 1), 0.1f).build())));
	public static final RegistryObject<Item> salted_rabbit = ITEMS.register("salted_rabbit",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(3)
					.saturation(0.6f).effect(() -> new EffectInstance(Effects.HUNGER, 600, 1), 0.1f).build())));
	public static final RegistryObject<Item> salted_cod = ITEMS.register("salted_cod",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(3)
					.saturation(0.6f).effect(() -> new EffectInstance(Effects.HUNGER, 600, 1), 0.1f).build())));
	public static final RegistryObject<Item> salted_salmon = ITEMS.register("salted_salmon",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(3)
					.saturation(0.6f).effect(() -> new EffectInstance(Effects.HUNGER, 600, 1), 0.1f).build())));
	
	// Salted
	public static final RegistryObject<Item> jerky_chicken = ITEMS.register("jerky_chicken",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(7)
					.saturation(1.6f).effect(() -> new EffectInstance(Effects.SLOW_FALLING, 300, 0), 1f).build())));
	public static final RegistryObject<Item> jerky_beef = ITEMS.register("jerky_beef",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(9)
					.saturation(1.6f).effect(() -> new EffectInstance(Effects.STRENGTH, 300, 0), 1f).build())));
	public static final RegistryObject<Item> jerky_mutton = ITEMS.register("jerky_mutton",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(7)
					.saturation(1.6f).effect(() -> new EffectInstance(Effects.RESISTANCE, 300, 0), 1f).build())));
	public static final RegistryObject<Item> jerky_pork = ITEMS.register("jerky_pork",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(9)
					.saturation(1.6f).effect(() -> new EffectInstance(Effects.HASTE, 300, 0), 1f).build())));
	public static final RegistryObject<Item> jerky_rabbit = ITEMS.register("jerky_rabbit",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(6)
					.saturation(1.6f).effect(() -> new EffectInstance(Effects.JUMP_BOOST, 300, 0), 1f).build())));
	public static final RegistryObject<Item> jerky_cod = ITEMS.register("jerky_cod",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(6)
					.saturation(1.6f).effect(() -> new EffectInstance(Effects.WATER_BREATHING, 300, 0), 1f).build())));
	public static final RegistryObject<Item> jerky_salmon = ITEMS.register("jerky_salmon",
			() -> new Item(new Item.Properties().group(SimplySaltyItemGroup.instance).food(new Food.Builder().hunger(7)
					.saturation(1.6f).effect(() -> new EffectInstance(Effects.SPEED, 300, 0), 1f).build())));
}