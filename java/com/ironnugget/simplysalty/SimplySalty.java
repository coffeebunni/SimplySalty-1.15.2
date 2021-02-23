package com.ironnugget.simplysalty;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ironnugget.simplysalty.init.BlockInit;
import com.ironnugget.simplysalty.init.ItemInit;
import com.ironnugget.simplysalty.world.gen.SimplySaltyOreGen;

import net.minecraft.block.LanternBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.IForgeRegistry;

@Mod("simplysalty")
@Mod.EventBusSubscriber(modid = SimplySalty.MOD_ID , bus = Bus.MOD)
public class SimplySalty {
	
    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "simplysalty";
    public static SimplySalty instance;

    public SimplySalty() {
    	
    	final IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
    	modEventBus.addListener(this::setup);
        
    	ItemInit.ITEMS.register(modEventBus);
    	BlockInit.BLOCKS.register(modEventBus);
    	
        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, SimplySaltyOreGen::generateOre);
        
    }
    
    @SubscribeEvent
    public static void onRegisterItems(final RegistryEvent.Register<Item> event) {
    	
    	final IForgeRegistry<Item> registry = event.getRegistry();
    	
    	BlockInit.BLOCKS.getEntries().stream()
    		.filter(block -> !(block.get() instanceof LanternBlock))
    		.map(RegistryObject::get).forEach(block -> {
    		final Item.Properties properties = new Item.Properties().group(SimplySaltyItemGroup.instance);
    		final BlockItem blockItem = new BlockItem(block,properties);
    		blockItem.setRegistryName(block.getRegistryName());
    		registry.register(blockItem);
    	});
    	
    	LOGGER.debug("Registered BlockItems!");
    	
    }

    private void setup(final FMLCommonSetupEvent event) {
    	
    	System.out.println("Simply Salty preinit, we hope you're having a nice day :)");
    	
    }
    
    public static class SimplySaltyItemGroup extends ItemGroup
    {
    	public static final SimplySaltyItemGroup instance = new SimplySaltyItemGroup(ItemGroup.GROUPS.length, "simplysalty");
    	private SimplySaltyItemGroup(int index, String label)
    	{
    		super(index,label);
    	}
    	
    	@Override
    	public ItemStack createIcon()
    	{
    		return new ItemStack(BlockInit.salt_ore.get());
    	}
    }
}
