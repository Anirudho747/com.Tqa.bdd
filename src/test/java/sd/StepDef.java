package sd;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDef {

    WebDriver driver;

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page(){
        driver = new ChromeDriver();
//        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://shop.demoqa.com/");
    }

    @When("he searches for Dress")
    public void he_searches_for_dress() {
        driver.findElement(By.xpath("//*[text()='Dismiss']")).click();
        driver.navigate().to("https://shop.demoqa.com/?s=" + "dress" + "&post_type=product");
    }

    @When("choose to but the first item")
    public void choose_to_but_the_first_item() {
        List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
        items.get(0).click();

        Select color = new Select(driver.findElement(By.id("pa_color")));
        color.selectByIndex(1);

        Select size = new Select(driver.findElement(By.id("pa_size")));
        size.selectByIndex(1);

        WebElement cart = driver.findElement(By.xpath("//button[contains(@class,'single_add_to_cart_button')]"));
        cart.click();
    }

    @When("^moves to checkout from mini cart$")
    public void moves_to_checkout_from_mini_cart(){
        WebElement continueToCheckout = driver.findElement(By.xpath("//a[text()='Checkout']"));
        continueToCheckout.click();
    }

    @When("^enter personal details on checkout page$")
    public void enter_personal_details_on_checkout_page() throws InterruptedException {
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

    }

    @When("^place the order$")
    public void place_the_order() {
        WebElement acceptTC = driver.findElement(By.cssSelector("#terms.input-checkbox"));
        acceptTC.click();

        WebElement placeOrder = driver.findElement(By.cssSelector("#place_order"));
        placeOrder.submit();
    }
}
