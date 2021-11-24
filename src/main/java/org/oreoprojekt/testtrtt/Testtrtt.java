package org.oreoprojekt.testtrtt;

import org.bukkit.plugin.java.JavaPlugin;

public final class Testtrtt extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getCommand("axe").setExecutor(new command());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
