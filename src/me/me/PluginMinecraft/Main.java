package me.me.PluginMinecraft;

import org.bukkit.plugin.java.JavaPlugin;

import me.me.PluginMinecraft.commands.HelloCommand;

public class Main extends JavaPlugin {
	
	@Override 
	public void onEnable() {
		new HelloCommand(this);
	}

}
