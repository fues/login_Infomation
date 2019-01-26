/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation.config;

import com.google.common.io.ByteStreams;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author fues
 */
public class JSON {

    private final JavaPlugin plugin;
    private final File dir;
    private File file;
    private String jsonText;

    public JSON(JavaPlugin plugin, String filename) {
        this.plugin = plugin;
        this.dir = plugin.getDataFolder();
        this.setFile(filename);
    }
    public void setFile(String filename){
        this.file = new File(dir, filename);
    }
    public void load() {
        try {
            this.make();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"))) {
                this.jsonText="";
                for(int buf;(buf=bufferedReader.read())!=-1;jsonText+=(char)buf);
//                this.plugin.getLogger().info(jsonText);
            }
        } catch (IOException e) {
            this.plugin.getLogger().warning(e.getLocalizedMessage());
        }
    }

    public void make() throws IOException {
        if (!this.dir.exists()) {
            this.dir.mkdir();
        }
        if (!this.file.exists()) {
            this.plugin.getLogger().info("genarating file...");
            this.file.createNewFile();
            //copy default file
            try (
                    OutputStream outputStream = new FileOutputStream(this.file);
                    InputStream inputStream = this.plugin.getResource("logininfo.json");) {
                ByteStreams.copy(inputStream, outputStream);
            }
        }
    }

    public String getJSONText() {
        return jsonText;
    }
}
