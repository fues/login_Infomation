/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation.events;

import fues_ele.spigot.login_infomation.Executor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author fues
 */
public class PlayerJoin implements Listener {
    private final JavaPlugin plugin;
    private final Executor exe;
    public PlayerJoin(JavaPlugin _plugin,Executor _exe){
        plugin=_plugin;
        exe = _exe;
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event){
        exe.sendMssage(event.getPlayer());
    }
}
