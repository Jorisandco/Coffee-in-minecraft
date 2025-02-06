package com.jorisandco.tutorial;

import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public class Coffee extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "Coffee Plugin Enabled");

    }

    @Override
    public void onDisable() {
        getServer().getConsoleSender().sendMessage(ChatColor.RED + "Coffee Plugin crashed");
    }
}
