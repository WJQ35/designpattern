package com.example.designpattern.pattern.singleton;

import org.apache.commons.lang3.StringUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

public class PropertiesMgr {
    static Properties prop = new Properties();

    static {
        try {
            File file = new File(
                    Optional.ofNullable(System.getProperty("configPath"))
                            .orElse("./src/main/resources/config.properties") // for running in IDE
            );
            FileInputStream fis = new FileInputStream(file);
            prop.load(fis);
            fis.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private PropertiesMgr(){};

    public static Object getKey(String name){
        if(StringUtils.isAllBlank(name)){
            return null;
        }
        return prop.get(name);
    }
}
