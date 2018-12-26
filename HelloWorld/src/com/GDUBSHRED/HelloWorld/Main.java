package com.GDUBSHRED.HelloWorld;

import org.bukkit.plugin.java.JavaPlugin;

import com.GDUBSHRED.HelloWorld.commands.HelloCommand;

public class Main extends JavaPlugin {
	
	@Override 
	public void onEnable() {
		new HelloCommand(this);
	}

}
