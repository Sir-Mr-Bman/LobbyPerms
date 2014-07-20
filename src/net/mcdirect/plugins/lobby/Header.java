package net.mcdirect.plugins.lobby;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

/*
 * MCDirect_ Lobby Essentials
 * Copyright (C) Sir_Mr_Bman and MCDirect.net
 * ALL RIGHTS RESERVED
 * Please see the license file on our web-site for more:
 * www.mcdirect.net/license
 */

public class Header extends JavaPlugin {
	
	public final Logger logger = Logger.getLogger("Minecraft");
	
	public void onEnable() {
		log("Plugin now Enabled.");
	}
	
	public void onDisable() {
		
	}
	
	public void log (String msg) { this.logger.info("[LobbyEssentials] " + msg); }
}
