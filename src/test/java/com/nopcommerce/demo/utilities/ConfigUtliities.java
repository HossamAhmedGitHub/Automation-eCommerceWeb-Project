package com.nopcommerce.demo.utilities;

import java.util.Properties;

public class ConfigUtliities {
    private Properties data;
    private static ConfigUtliities configUtlis;
    private ConfigUtliities(){
        data = PropertiesUtils.loadProperties("src/test/java/com/nopcommerce/demo/config/productionconfig/production.properties");
    }
    public static ConfigUtliities createInstance(){
        if(configUtlis == null){
            configUtlis = new ConfigUtliities();
        }
        return configUtlis;

    }
    public String getURL(){
        return data.getProperty("baseUrl");
    }
    public String getEmail(){
        return data.getProperty("email");
    }
    public String getPassword(){
        return data.getProperty("password");
    }
}
