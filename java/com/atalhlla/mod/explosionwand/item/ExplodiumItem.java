package com.atalhlla.mod.explosionwand.item;

import net.minecraft.item.Item;

import com.atalhlla.mod.explosionwand.ExplosionWandMod;

public class ExplodiumItem extends Item {
	public static final String NAME = "explodium_item";
	
	public ExplodiumItem() {
		this.setCreativeTab( ExplosionWandMod.instance.creativeTabMain );
		this.setTextureName( ExplosionWandMod.MODID + ":" + NAME );
	}
}
