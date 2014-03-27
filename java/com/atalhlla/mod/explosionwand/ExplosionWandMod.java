package com.atalhlla.mod.explosionwand;

import net.minecraft.creativetab.CreativeTabs;

import com.atalhlla.mod.explosionwand.proxy.CommonProxy;
import com.atalhlla.util.minecraft.ModUtils;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod( modid = ExplosionWandMod.MODID, version = ExplosionWandMod.VERSION, name = ExplosionWandMod.MODNAME )
public class ExplosionWandMod {
	public static final String MODID = "explosionwand";
	public static final String VERSION = "a0.0";
	public static final String MODNAME = "Wand of Explosion";
	
	@Instance
	public static ExplosionWandMod instance;
	
	@SidedProxy(
		clientSide = "com.atalhlla.mod.explosionwand.proxy.ClientProxy",
		serverSide = "com.atalhlla.mod.explosionwand.proxy.CommonProxy" )
	public static CommonProxy proxy;
	
	public ModUtils utils = new ModUtils( this );
	
	public ExplosionWandItems items = new ExplosionWandItems( this );
	public CreativeTabs creativeTabMain = new ExplosionWandCreativeTabs( MODID );
	public ExplosionWandRecipes recipes = new ExplosionWandRecipes( this );
	
	@EventHandler
	public void preInit( FMLPreInitializationEvent event ) throws InstantiationException, IllegalAccessException {
		items.initItems( event );
	}
	
	@EventHandler
	public void init( FMLInitializationEvent event ) {
		recipes.register();
	}
}
