package com.atalhlla.mod.explosionwand.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import com.atalhlla.mod.explosionwand.ExplosionWandMod;
import com.atalhlla.util.minecraft.EntityHelpers;

public class ExplosionWandItem extends Item {
	public static final String NAME = "explosion_wand";

	public ExplosionWandItem() {
		this.setCreativeTab( ExplosionWandMod.instance.creativeTabMain );
		this.setTextureName( ExplosionWandMod.MODID + ":" + NAME );

		this.maxStackSize = 1;
		this.setMaxDamage( 16 );
	}

	@Override
	public ItemStack onItemRightClick( ItemStack itemStack, World world, EntityPlayer player ) {
		if( !player.capabilities.isCreativeMode ) {
			itemStack.damageItem( 1, player );
		}

		world.playSoundEffect( player.posX, player.posY, player.posZ, ExplosionWandMod.MODID + ":explosionwand.throw", 2.0F, 1F );

		if( !world.isRemote ) {
			EntityTNTPrimed tnt = new EntityTNTPrimed( world, player.posX, player.posY, player.posZ, player );
			tnt.fuse /= 2;
			EntityHelpers.throwEntity( tnt, 2F, player );
			world.spawnEntityInWorld( tnt );
		}

		return itemStack;
	}
}
