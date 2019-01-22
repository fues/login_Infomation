/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation;

import fues_ele.spigot.login_infomation.chat.Message;
import fues_ele.spigot.login_infomation.config.JSON;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author fues
 */
public class Executor {

    private final JavaPlugin plugin;
    private final JSON jsonFile;
    private final Message message;

    public Executor(JavaPlugin plugin, JSON jsonFile, Message message) {
        this.plugin = plugin;
        this.jsonFile = jsonFile;
        this.message = message;
    }

    public void loadFile() {
        jsonFile.load();
        message.make(jsonFile.getJSONText());
        plugin.getLogger().info("load finish!");
    }

    public void sendMssage(CommandSender sender) {
//        plugin.getLogger().info(sender.getClass().toString());
        if (sender instanceof Player) {
            message.send((Player.Spigot) sender.spigot());
            plugin.getLogger().info("msg sent!");
        } else {
            plugin.getLogger().info("this command must be call by player");
        }
    }

    public void sendMssage(Player player) {
        message.send(player.spigot());
        plugin.getLogger().info("msg sent!");
    }
}
