package com.jorisandco.tutorial.items;

import com.jorisandco.tutorial.Coffee;
import org.bukkit.Bukkit;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapelessRecipe;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class ItemManager {
    public static ItemStack coffee;
    public static ItemStack MilkCoffee;

    public static void init(Plugin plugin) {  // Pass the plugin instance
        createCoffee(plugin);
        createBrownCoffee(plugin);
    }

    private static void createCoffee(Plugin plugin) {
        ItemStack item = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) item.getItemMeta();
        if (meta == null) return;

        meta.setDisplayName("Coffee");
        meta.setColor(Color.BLACK);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 5000, 100), true);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 5000, 100), true);
        item.setItemMeta(meta);
        coffee = item;

        // Crafting recipe
        NamespacedKey key = new NamespacedKey(plugin, "coffee");
        ShapelessRecipe recipe = new ShapelessRecipe(key, coffee);  // Use `coffee` directly
        recipe.addIngredient(Material.POTION);
        recipe.addIngredient(Material.COCOA_BEANS);
        Bukkit.addRecipe(recipe);
    }

    private static void createBrownCoffee(Plugin plugin) {
        ItemStack item = new ItemStack(Material.POTION);
        PotionMeta meta = (PotionMeta) item.getItemMeta();
        if (meta == null) return;

        meta.setDisplayName("Cappuccino");
        meta.setColor(Color.fromRGB(150, 75, 0));
        meta.addCustomEffect(new PotionEffect(PotionEffectType.NIGHT_VISION, 2500, 100), true);
        meta.addCustomEffect(new PotionEffect(PotionEffectType.SPEED, 2500, 100), true);
        item.setItemMeta(meta);
        MilkCoffee = item;

        // Crafting recipe
        NamespacedKey key = new NamespacedKey(plugin, "milk_coffee");
        ShapelessRecipe recipe = new ShapelessRecipe(key, MilkCoffee);
        recipe.addIngredient(Material.POTION);
        recipe.addIngredient(Material.COCOA_BEANS);
        recipe.addIngredient(Material.MILK_BUCKET);
        Bukkit.addRecipe(recipe);
    }
}
