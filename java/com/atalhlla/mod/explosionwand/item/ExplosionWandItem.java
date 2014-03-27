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

		// TODO: Sound
		// Might just preplace this with an actual explosion...
		world.playSoundEffect( player.posX, player.posY, player.posZ, "random.explode", 4.0F, (1.0F + (world.rand.nextFloat() - world.rand.nextFloat()) * 0.2F) * 0.7F );

		if( !world.isRemote ) {
//			world.spawnEntityInWorld( new EntitySnowball( world, player ) );
			Entity tnt = new EntityTNTPrimed( world, player.posX, player.posY, player.posZ, player );
			EntityHelpers.throwEntity( tnt, 2F, player );
			world.spawnEntityInWorld( tnt );
		}

		return itemStack;
	}
}
