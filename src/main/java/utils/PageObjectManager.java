package utils;

import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.MiscPage;

public class PageObjectManager {

    private WebDriver driver;
    private CartPage cartPage;
    private HomePage homePage;
    private CheckoutPage checkoutPage;
    private MiscPage miscPage;

    public PageObjectManager(WebDriver driver) {
        System.out.println(4);
        this.driver = driver;
    }

    public HomePage getHomePage(){
        return (homePage == null) ? homePage = new HomePage(driver) : homePage;
    }

    public CartPage getCartPage() {
        return (cartPage == null) ? cartPage = new CartPage(driver) : cartPage;
    }

    public CheckoutPage getCheckoutPage() {
        return (checkoutPage == null) ? checkoutPage = new CheckoutPage(driver) : checkoutPage;
    }

    public MiscPage getMiscPage() {
        return (miscPage == null) ? miscPage = new MiscPage(driver) : miscPage;
    }

}
