package black.black;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.ServerListPingEvent;
import org.bukkit.plugin.java.*;

public class BlackMotd extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(this, this);
        getServer().getPluginManager().registerEvents(this, this);
    }

    @Override
    public void onDisable() {

    }

    @EventHandler
    public void server(ServerListPingEvent event) {
        if (getServer().hasWhitelist()) {
            event.setMotd(getConfig().getString("linhas.whitelist").replace("&", "§"));
        }
        event.setMotd(getConfig().getString("linhas.normal").replace("&", "§"));
    }
}