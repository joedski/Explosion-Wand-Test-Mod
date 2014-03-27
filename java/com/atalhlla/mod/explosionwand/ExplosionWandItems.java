package com.atalhlla.mod.explosionwand;

import com.atalhlla.mod.explosionwand.item.ExplodiumItem;
import com.atalhlla.mod.explosionwand.item.ExplosionWandItem;

import net.minecraft.item.Item;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ExplosionWandItems {
	public ExplosionWandMod mod;
	
	public Item explodium;
	public Item explosionWand;
	
	public ExplosionWandItems( ExplosionWandMod mod ) {
		this.mod = mod;
	}
	
	public void initItems( FMLPreInitializationEvent event ) throws InstantiationException, IllegalAccessException {
		explodium = mod.utils.registerItem( ExplodiumItem.class );
		explosionWand = mod.utils.registerItem( ExplosionWandItem.class );
	}
}
