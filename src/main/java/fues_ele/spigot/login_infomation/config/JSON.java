/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fues_ele.spigot.login_infomation.config;

import com.google.common.io.ByteStreams;
import file_reader.FastFileReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.bukkit.plugin.java.JavaPlugin;

/**
 *
 * @author fues
 */
public class JSON {

    private final JavaPlugin plugin;
    private String filename;
    private final File dir;
    private File file;
    private final String filePath;
    private String jsonText;

    public JSON(JavaPlugin plugin, String filename) {
        this.plugin = plugin;
        this.filename = filename;
        this.dir = plugin.getDataFolder();
        this.file = new File(dir, filename);
        this.filePath = file.getPath();
    }

    public void load() {
        try {
            this.make();
            jsonText = FastFileReader.readAll(filePath);
        } catch (IOException e) {
            plugin.getLogger().warning(e.getLocalizedMessage());
        }
    }

    public void make() throws IOException {
        if (!dir.exists()) {
            dir.mkdir();
        }
        if (!file.exists()) {
            plugin.getLogger().info("genarating file...");
            file.createNewFile();
            //copy default file
            try (
                    OutputStream outputStream = new FileOutputStream(file);
                    InputStream inputStream = plugin.getResource("logininfo.json");) {
                ByteStreams.copy(inputStream, outputStream);
            }
        }
    }

    public String getJSONText() {
        return jsonText;
    }
}