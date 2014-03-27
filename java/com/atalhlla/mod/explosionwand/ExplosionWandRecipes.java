package com.atalhlla.mod.explosionwand;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class ExplosionWandRecipes {
	public ExplosionWandMod mod;
	
	public ExplosionWandRecipes( ExplosionWandMod mod ) {
		this.mod = mod;
	}
	
	public void register() {
		GameRegistry.addShapedRecipe( new ItemStack( mod.items.explodium ),
			"zrz",
			"rTr",
			"zrz",
			'r', Items.redstone,
			'z', Items.blaze_powder,
			'T', Blocks.tnt );
		
		GameRegistry.addShapedRecipe( new ItemStack( mod.items.explosionWand),
			"X",
			"g",
			"Z",
			'X', mod.items.explodium,
			'g', Items.gold_nugget,
			'Z', Items.blaze_rod );
	}
}
