package sd2;


import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import utils.TestContext;

public class CartPageSteps {

    CartPage cartPage;
    TestContext testContext;

    public CartPageSteps(TestContext context)
    {
        testContext = context;
        cartPage = testContext.getPageObjectManager().getCartPage();
    }


    @When("^moves to checkout from mini cart$")
    public void moves_to_checkout_from_mini_cart()
    {
        cartPage.clickOn_Cart();
        cartPage.clickOn_ContinueToCheckout();
    }



}
