/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation.commands;

import fues_ele.spigot.login_infomation.Executor;
import java.util.ArrayList;
import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabExecutor;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author fues
 */
public class TabExecute implements TabExecutor {

    private final JavaPlugin plugin;
    private final Executor exe;

    public TabExecute(JavaPlugin plugin, Executor exe) {
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
    
    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        List<String> list = new ArrayList<>();
        int argc = args.length;
        switch (argc) {
        case 1:
            for (int i = 0; i < CommandsList.ARG1.length; i++) {
                if (CommandsList.ARG1[i].startsWith(args[0])) {
                    list.add(CommandsList.ARG1[i]);
                }
            }
            break;
        default:
        }
        return list;
    }
}
