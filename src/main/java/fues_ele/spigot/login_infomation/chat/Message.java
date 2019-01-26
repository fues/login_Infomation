/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation.chat;

import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.chat.ComponentSerializer;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author fues
 */
public class Message {

    private BaseComponent msg[];
    private final JavaPlugin plugin;

    public Message(JavaPlugin plugin) {
        this.plugin = plugin;
    }

    public void make(String jsonText) {
        this.msg = ComponentSerializer.parse(jsonText);
    }

    public void send(Player.Spigot player) {
        player.sendMessage(msg);
    }
}
