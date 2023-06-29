package sd;

import io.cucumber.java.en.*;
import pageObjects.MiscPage;
import utils.BrowserFactory;
import utils.ConfigFileReader;
import utils.PageObjectManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import java.util.List;


public class StepDef {

    WebDriver driver;
    HomePage home;
    CartPage cartPage;
    MiscPage miscPage;
    CheckoutPage checkoutPage;
    PageObjectManager pageObjectManager;
    ConfigFileReader configFileReader;
    BrowserFactory browserFactory;

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page(){
        browserFactory = new BrowserFactory();
        driver = browserFactory.getDriver();
        pageObjectManager = new PageObjectManager(driver);
        configFileReader = new ConfigFileReader();
        home = pageObjectManager.getHomePage();
        driver.get(configFileReader.getURL());
    }

    @When("he searches for Dress")
    public void he_searches_for_dress() {
        driver.findElement(By.xpath("//*[text()='Dismiss']")).click();
        home.perform_Search();
    }

    @When("choose to but the first item")
    public void choose_to_but_the_first_item()
    {
        miscPage = pageObjectManager.getMiscPage();
        miscPage.perform_Search();
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

        browserFactory.closeDriver();
    }
}
