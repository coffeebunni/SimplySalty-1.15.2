package com.ironnugget.simplysalty.objects.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class SulphurChunk extends Item {

	public SulphurChunk(Properties properties) {
		super(properties);
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack) {
		return 1200;
	}

}
