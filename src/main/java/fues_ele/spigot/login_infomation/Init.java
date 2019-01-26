/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation;

import org.bukkit.plugin.java.JavaPlugin;
import fues_ele.spigot.login_infomation.chat.Message;
import fues_ele.spigot.login_infomation.commands.TabExecute;
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
        TabExecute cmdTabExe = new TabExecute(this, exe);
        this.getCommand("logininfo").setExecutor(cmdTabExe);
        this.getCommand("logininfo").setTabCompleter(cmdTabExe);
        this.getServer().getPluginManager().registerEvents(new PlayerJoin(this, exe), this);
    }
}
