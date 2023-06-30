package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import pageObjects.HomePage;

public class BrowserFactory {

    public WebDriver driver;
    public ConfigFileReader configFileReader;

    public BrowserFactory()
    {
        configFileReader = new ConfigFileReader();
    }

    public WebDriver getDriver()
    {
        return (driver == null) ? driver = createDriver() : driver;
    }

    public WebDriver createDriver()
    {

        String bName = configFileReader.getBrowser();
        if(bName.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        }
        else if(bName.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if(bName.equalsIgnoreCase("safari"))
        {
            driver = new SafariDriver();
        }
        else
        {
            System.out.println("Wrong Browser Name");
        }

        return driver;
    }

    public void closeDriver()
    {
        driver.quit();
    }
}
