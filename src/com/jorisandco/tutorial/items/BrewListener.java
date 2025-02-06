package com.jorisandco.tutorial.items;

import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.BrewEvent;
import org.bukkit.inventory.BrewerInventory;
import org.bukkit.inventory.ItemStack;

public class BrewListener implements Listener {
    @EventHandler
    public void onBrew(BrewEvent event) {
        BrewerInventory inventory = event.getContents();
        ItemStack ingredient = inventory.getIngredient();

        // Check if the ingredient is Cocoa Beans (our coffee ingredient)
        if (ingredient != null && ingredient.getType() == Material.COCOA_BEANS) {
            for (int i = 0; i < 3; i++) {
                ItemStack potion = inventory.getItem(i);
                if (potion != null && potion.getType() == Material.POTION) {
                    inventory.setItem(i, ItemManager.coffee.clone()); // Replace with custom coffee potion
                }
            }
        }
    }
}
