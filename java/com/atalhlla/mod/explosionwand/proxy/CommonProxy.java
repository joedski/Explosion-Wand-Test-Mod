package com.atalhlla.mod.explosionwand.proxy;

import com.atalhlla.mod.explosionwand.ExplosionWandMod;

public class CommonProxy {
	public ExplosionWandMod mod;

	public CommonProxy() {
		this.mod = ExplosionWandMod.instance;
	}

	public void registerRenderers() {
		// ...
	}
}
