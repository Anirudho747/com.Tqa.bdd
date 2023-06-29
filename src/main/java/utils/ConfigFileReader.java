package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties prop;
    String filePath = System.getProperty("user.dir") + "/src/test/resources/Config.properties";

    public ConfigFileReader()
    {
        try
        {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(filePath);
            prop.load(fis);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowser()
    {
        return prop.getProperty("browser");
    }

    public String getURL()
    {
        return prop.getProperty("url");
    }

    public String getEnvironment()
    {
        return prop.getProperty("environment");
    }

}
