package sd;

import io.cucumber.java.en.*;
import manager.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class StepDef {

    WebDriver driver;
    HomePage home;
    CartPage cartPage;
    CheckoutPage checkoutPage;
    PageObjectManager pageObjectManager;

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://shop.demoqa.com/");
        pageObjectManager = new PageObjectManager(driver);
    }

    @When("he searches for Dress")
    public void he_searches_for_dress() {
        driver.findElement(By.xpath("//*[text()='Dismiss']")).click();
        home = pageObjectManager.getHomePage();
        home.perform_Search();
    }

    @When("choose to but the first item")
    public void choose_to_but_the_first_item() {

        List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
        items.get(0).click();

        Select color = new Select(driver.findElement(By.id("pa_color")));
        color.selectByIndex(1);

        Select size = new Select(driver.findElement(By.id("pa_size")));
        size.selectByIndex(1);

    }

    @When("^moves to checkout from mini cart$")
    public void moves_to_checkout_from_mini_cart(){

        cartPage = pageObjectManager.getCartPage();
        cartPage.clickOn_Cart();
        cartPage.clickOn_ContinueToCheckout();
    }

    @When("^enter personal details on checkout page$")
    public void enter_personal_details_on_checkout_page() throws InterruptedException {

        checkoutPage = pageObjectManager.getCheckoutPage();
        checkoutPage.fill_PersonalDetails();
    }

    @When("^place the order$")
    public void place_the_order() {
        checkoutPage.check_TermsAndCondition(true);
        checkoutPage.clickOn_PlaceOrder();

        driver.quit();
    }
}
