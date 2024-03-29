package com.nopcommerce.demo.utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class DataUtils {

    private static final String  CONFIG_PATH = "src/test/java/com/nopcommerce/demo/config/productionconfig/";
    public static String getConfigValue(String fileName, String key) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream(CONFIG_PATH + fileName + ".properties"));
            return properties.getProperty(key);
        } catch (Exception e) {
            return "";
        }
    }
}
