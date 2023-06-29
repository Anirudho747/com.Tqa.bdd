package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MiscPage {

    WebDriver driver;

    public MiscPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void perform_Search()
    {
        List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
        items.get(0).click();

        Select color = new Select(driver.findElement(By.id("pa_color")));
        color.selectByIndex(1);

        Select size = new Select(driver.findElement(By.id("pa_size")));
        size.selectByIndex(1);
    }
}
