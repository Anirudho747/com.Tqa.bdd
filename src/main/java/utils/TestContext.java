package utils;

import org.openqa.selenium.WebDriver;

public class TestContext {

    private BrowserFactory browserFactory;
    private ConfigFileReader configFileReader;
    private PageObjectManager pageObjectManager;

    public TestContext()
    {
        browserFactory    = new BrowserFactory();
        configFileReader  = new ConfigFileReader();
        System.out.println(3);
        pageObjectManager = new PageObjectManager(browserFactory.getDriver());
    }

    public BrowserFactory getBrowserFactory()
    {
        return browserFactory;
    }

    public ConfigFileReader getConfigFileReader()
    {
        return configFileReader;
    }

    public PageObjectManager getPageObjectManager()
    {
        return pageObjectManager;
    }
}
