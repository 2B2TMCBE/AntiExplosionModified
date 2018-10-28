/*
 * Decompiled with CFR 0_132.
 * 
 * Could not load the following classes:
 *  cn.nukkit.Server
 *  cn.nukkit.event.EventHandler
 *  cn.nukkit.event.Listener
 *  cn.nukkit.event.entity.EntityExplodeEvent
 *  cn.nukkit.event.entity.ExplosionPrimeEvent
 *  cn.nukkit.plugin.Plugin
 *  cn.nukkit.plugin.PluginBase
 *  cn.nukkit.plugin.PluginManager
 */
package me.dirouc.antiexplosion;

import cn.nukkit.Server;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityExplodeEvent;
import cn.nukkit.event.entity.ExplosionPrimeEvent;
import cn.nukkit.plugin.Plugin;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.plugin.PluginManager;

public class AntiExplosion
extends PluginBase
implements Listener {
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)this);
    }

    @EventHandler
    public void onExplosionPrime(ExplosionPrimeEvent event) {
	Entity ety = event.getEntity();
	if(ety.getNetworkId() == 71){
        	event.setCancelled(true);
	}
   }


    @EventHandler
    public void onEntityExplode(EntityExplodeEvent event) {
	Entity ety = event.getEntity();
	if(ety.getNetworkId() == 71){
        	event.setCancelled(true);
	}
        //event.setCancelled(true);
    }
}

