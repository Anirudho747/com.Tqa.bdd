package simple;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class Simp {

    @Test
    public void rent () throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://shop.demoqa.com/");

        driver.findElement(By.xpath("//*[text()='Dismiss']")).click();

        driver.navigate().to("https://shop.demoqa.com/?s=" + "dress" + "&post_type=product");

        List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
        items.get(0).click();

        Select color = new Select(driver.findElement(By.id("pa_color")));
        color.selectByIndex(1);

        Select size = new Select(driver.findElement(By.id("pa_size")));
        size.selectByIndex(1);

        WebElement cart = driver.findElement(By.xpath("//button[contains(@class,'single_add_to_cart_button')]"));
        cart.click();

        WebElement continueToCheckout = driver.findElement(By.xpath("//a[text()='Checkout']"));
        continueToCheckout.click();

        Thread.sleep(5000);
        WebElement firstName = driver.findElement(By.cssSelector("#billing_first_name"));
        firstName.sendKeys("Lakshay");

        WebElement lastName = driver.findElement(By.cssSelector("#billing_last_name"));
        lastName.sendKeys("Sharma");

        WebElement emailAddress = driver.findElement(By.cssSelector("#billing_email"));
        emailAddress.sendKeys("test@gmail.com");

        WebElement phone = driver.findElement(By.cssSelector("#billing_phone"));
        phone.sendKeys("07438862327");

        WebElement city = driver.findElement(By.cssSelector("#billing_city"));
        city.sendKeys("Delhi");

        WebElement address = driver.findElement(By.cssSelector("#billing_address_1"));
        address.sendKeys("Shalimar Bagh");

        WebElement postcode = driver.findElement(By.cssSelector("#billing_postcode"));
        postcode.sendKeys("110088");

        WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
        acceptTC.click();

        WebElement placeOrder = driver.findElement(By.cssSelector("#place_order"));
        placeOrder.submit();

        driver.quit();
    }
}
