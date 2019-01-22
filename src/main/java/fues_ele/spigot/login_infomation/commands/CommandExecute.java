/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation.commands;

import fues_ele.spigot.login_infomation.Executor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author fues
 */
public class CommandExecute implements CommandExecutor {

    private final JavaPlugin plugin;
    private final Executor exe;

    public CommandExecute(JavaPlugin plugin, Executor exe) {
        this.plugin = plugin;
        this.exe = exe;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        boolean res = false;
        int argc = args.length;
        if (argc >= 1) {
//            plugin.getLogger().info(label);
//            for(i=0;i<argc;i++){
//                plugin.getLogger().info(args[i]);
//            }
            switch (args[0]) {
                case "reload":
                    exe.loadFile();
                    this.showResult(sender, "reload finish!");
                    res = true;
                    break;
                case "show":
                    exe.sendMssage(sender);
                    this.showResult(sender, "show info!");
                    res = true;
                    break;
                case "test":
                    exe.loadFile();
                    exe.sendMssage(sender);
                    this.showResult(sender, "test info!");
                    res = true;
                    break;
            }
        }
        return res;
    }

    private void showResult(CommandSender sender, String msg) {
        String name = plugin.getName();
        sender.sendMessage("[" + name + "] " + msg);
    }
}
