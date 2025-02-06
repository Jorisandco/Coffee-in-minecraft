package com.jorisandco.tutorial;

import com.jorisandco.tutorial.comands.Debugcomands;
import com.jorisandco.tutorial.events.Joris_event;
import com.jorisandco.tutorial.items.ItemManager;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Coffee extends JavaPlugin {

    @Override
    public void onEnable() {
        Debugcomands debugcomands = new Debugcomands();
        getServer().getPluginManager().registerEvents(new Joris_event(), this);
        ItemManager.init();
        getCommand("coffee").setExecutor(debugcomands);
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Coffee Plugin Enabled");
    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Coffee Plugin Closed");
    }
}
