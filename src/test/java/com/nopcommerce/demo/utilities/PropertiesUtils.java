package com.nopcommerce.demo.utilities;

import java.io.*;
import java.util.Properties;

public class PropertiesUtils {
    public static Properties loadProperties(String url){
        File file = new File(url);
        Properties property = new Properties();
        try {
            InputStream inputstream = new FileInputStream(file);
            property.load(inputstream);
            inputstream.close();
        } catch (FileNotFoundException ex) {
            System.out.println("error in file not found");
        } catch (IOException ex) {
            System.out.println("errror in IOException");
        }
        return property;
    }
}
