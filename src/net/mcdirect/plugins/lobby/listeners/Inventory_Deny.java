package net.mcdirect.plugins.lobby.listeners;

import net.mcdirect.plugins.lobby.Header;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class Inventory_Deny implements Listener {

	public Inventory_Deny (Header plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);		
	}
	
	@EventHandler
	public void onPlayerDropItemEvent(PlayerDropItemEvent e) {
		if(!(e.getPlayer().hasPermission("lobbyess.drop"))) {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onPlayerPickupItemEvent(PlayerPickupItemEvent e) {
		if (!(e.getPlayer().hasPermission("lobbyess.pickup"))) {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onInventoryClickEvent(InventoryClickEvent e) {
		if (!(e.getWhoClicked().hasPermission("lobbyess.click"))) {
			e.setCancelled(true);
		}
	}
	
	@EventHandler
	public void onInventoryDragEvent(InventoryDragEvent e) {
		if (!(e.getWhoClicked().hasPermission("lobbyess.drag"))) {
			e.setCancelled(true);	
		}
	}
}
