/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation.commands;

import java.util.ArrayList;
import java.util.List;
import org.bukkit.command.Command;
import org.bukkit.command.TabCompleter;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author fues
 */
public class TabComplete implements TabCompleter {

    private final JavaPlugin plugin;

    public TabComplete(JavaPlugin plugin) {
        this.plugin = plugin;
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
