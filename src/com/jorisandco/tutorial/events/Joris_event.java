package com.jorisandco.tutorial.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import static org.bukkit.Bukkit.*;

public class Joris_event implements Listener {
    @EventHandler
    public static void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        if (player.getName().equals("Joris_en_Co")) {
            broadcastMessage(ChatColor.GREEN +  "Coffee JorisandCo has returned");
        }
    }
}
