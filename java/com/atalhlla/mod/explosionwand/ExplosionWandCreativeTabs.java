package com.atalhlla.mod.explosionwand;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class ExplosionWandCreativeTabs extends CreativeTabs {

	public ExplosionWandCreativeTabs( String tabLabel ) {
		super( tabLabel );
	}
	
	@Override
	public Item getTabIconItem() {
		return Item.getItemFromBlock( Blocks.tnt );
	}

}
