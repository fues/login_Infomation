/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation;

import org.bukkit.plugin.java.JavaPlugin;
import fues_ele.spigot.login_infomation.chat.Message;
import fues_ele.spigot.login_infomation.commands.CommandExecute;
import fues_ele.spigot.login_infomation.commands.TabComplete;
import fues_ele.spigot.login_infomation.config.JSON;
import fues_ele.spigot.login_infomation.events.PlayerJoin;

/**
 *
 * @author fues
 */
public class Init extends JavaPlugin {

    @Override
    public void onEnable() {
        JSON jsonFile = new JSON(this, "logininfo.json");
        Message message = new Message(this);
        Executor exe = new Executor(this, jsonFile, message);
        exe.loadFile();
        this.getCommand("logininfo").setExecutor(new CommandExecute(this, exe));
        this.getCommand("logininfo").setTabCompleter(new TabComplete(this));
        this.getServer().getPluginManager().registerEvents(new PlayerJoin(this, exe), this);
    }
}
