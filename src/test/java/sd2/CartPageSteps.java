package sd2;


import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import utils.TestContext;

public class CartPageSteps {

    CartPage cartPage;
    TestContext testContext;
//    WebDriver driver;

    @When("^moves to checkout from mini cart$")
    public void moves_to_checkout_from_mini_cart(){

        testContext = new TestContext();
   //     driver = testContext.getBrowserFactory().getDriver();
        cartPage = testContext.getPageObjectManager().getCartPage();

        cartPage.clickOn_Cart();
        cartPage.clickOn_ContinueToCheckout();
    }



}
