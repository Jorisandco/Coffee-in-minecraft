package com.jorisandco.tutorial.comands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Debugcomands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {
        if(!(Sender instanceof Player)) {
            return true;
        }
        Player player = (Player) Sender;

        //spawn coffee
        if(cmd.getName().equalsIgnoreCase("coffee")) {
            player.setExp(1);
        }
        return true;
    }
}
