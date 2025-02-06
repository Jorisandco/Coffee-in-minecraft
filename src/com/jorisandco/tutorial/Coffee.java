package com.jorisandco.tutorial;

import com.jorisandco.tutorial.events.Joris_event;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Coffee extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new Joris_event(), this);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Coffee Plugin Enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Coffee Plugin Closed");
    }
}
