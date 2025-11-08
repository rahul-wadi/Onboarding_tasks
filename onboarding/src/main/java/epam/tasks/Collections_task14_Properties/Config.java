package epam.tasks.Collections_task14_Properties;

import java.io.*;
import java.util.*;

public class Config {

	public Properties config;

    public Config() throws IOException {
        reset();
    }

    public void reset() throws IOException {
        Properties mainProps = new Properties();
        try (FileInputStream fis = new FileInputStream("config.properties")) {
            mainProps.load(fis);
        }

        String defaults = mainProps.getProperty("default.filenames");
        Properties base = null;

        if (defaults != null && !defaults.trim().isEmpty()) {
            String[] files = defaults.split(",");
            for (int i = files.length - 1; i >= 0; i--) {
                String file = files[i].trim();
                if (!file.isEmpty()) {
                    Properties p = new Properties(base);
                    try (FileInputStream fis = new FileInputStream(file + ".properties")) {
                        p.load(fis);
                    }
                    base = p;
                }
            }
        }

        if (base != null) {
            this.config = new Properties(base);
            this.config.putAll(mainProps);
        } else {
            this.config = mainProps;
        }
    }

    public String get(String key) {
        return config.getProperty(key);
    }

    public void set(String key, String value) {
        config.setProperty(key, value);
    }

    public void remove(String key) {
        if (config.containsKey(key)) {
            config.remove(key);
        }
    }

    public void save() throws IOException {
        Properties mainOnly = new Properties();
        for (String key : config.stringPropertyNames()) {
            if (config.getProperty(key) != null && isFromMainConfig(key)) {
                mainOnly.setProperty(key, config.getProperty(key));
            }
        }

        try (FileOutputStream fos = new FileOutputStream("config.properties")) {
            mainOnly.store(fos, null);
        }
    }

    private boolean isFromMainConfig(String key) {
        return config.containsKey(key) && config.getProperty(key) != null;
    }
}
