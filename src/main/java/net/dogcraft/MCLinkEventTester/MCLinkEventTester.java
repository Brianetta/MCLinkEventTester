package net.dogcraft.MCLinkEventTester;

import net.dries007.mclink.MCLinkAuthEvent;
import net.dries007.mclink.api.Authentication;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Copyright © Brian Ronald
 * 18/02/18
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 */
public class MCLinkEventTester extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {
        MCLinkAuthEvent.getHandlerList().unregister((Plugin) this);
    }

    @EventHandler
    public void onMCLinkAuthEvent(MCLinkAuthEvent event) {
        getLogger().info("Responding to MCLink authentication event: " + event.getPlayer().getName());
        if(event.getAuthentication().isEmpty()) {
            getLogger().info("Player was not authenticated.");
        } else {
            for (Authentication a : event.getAuthentication()) {
                getLogger().info(String.format("Service: %s, additional info: %s", a.name, a.extra.toString()));
            }
        }
    }
}

