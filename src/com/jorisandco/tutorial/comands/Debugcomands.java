package com.jorisandco.tutorial.comands;

import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.ThrownPotion;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class Debugcomands implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender Sender, Command cmd, String label, String[] args) {
        if(!(Sender instanceof Player)) {
            return true;
        }
        Player player = (Player) Sender;

        //spawn coffee
        if(cmd.getName().equalsIgnoreCase("coffee")) {
            ItemStack poti = new ItemStack(Material.POTION);
            PotionMeta meta = (PotionMeta)poti.getItemMeta();
            meta.setDisplayName("coffee");
            meta.setColor(Color.BLACK);
            meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 50, 100), true);
            poti.setItemMeta((ItemMeta)meta);
            player.getInventory().addItem(poti);
        }
        return true;
    }
}
