package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Cartpage {

    public Cartpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(how = How.XPATH, using = "//button[contains(@class,'single_add_to_cart_button')]")
    private WebElement btn_Cart;

    @FindBy(how = How.XPATH, using = "//a[text()='Checkout']")
    private WebElement btn_ContinueToCheckout;


    public void clickOn_Cart() {
        btn_Cart.click();
    }

    public void clickOn_ContinueToCheckout(){
        btn_ContinueToCheckout.click();
        try { Thread.sleep(5000);}
        catch (InterruptedException e) {}
    }

}
