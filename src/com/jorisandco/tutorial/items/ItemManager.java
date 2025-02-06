package com.jorisandco.tutorial.items;

import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ItemManager {
    public static ItemStack coffee;

    public static void init(){
        createCoffee();
    }

    private static void createCoffee(){
        ItemStack Item = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta)Item.getItemMeta();
        if (meta == null) return;
        meta.setDisplayName("coffee");
        meta.setColor(Color.BLACK);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 50, 100), true);
        Item.setItemMeta((ItemMeta)meta);
        coffee = Item;


        // crafting
        ShapelessRecipe s = new ShapelessRecipe(coffee);
        s.addIngredient(1, Material.POTION);
        s.addIngredient(1, Material.COCOA_BEANS);
        Bukkit.getServer().addRecipe(s);
    }
}
