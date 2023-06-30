package sd2;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import utils.BrowserFactory;
import utils.TestContext;

public class CheckoutPageSteps {

    CheckoutPage checkoutPage;
    TestContext testContext;
    BrowserFactory browserFactory;

    public CheckoutPageSteps(TestContext context)
    {
        testContext = context;
        checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
        browserFactory = testContext.getBrowserFactory();
    }

    @When("^enter personal details on checkout page$")
    public void enter_personal_details_on_checkout_page()
    {
        checkoutPage.fill_PersonalDetails();
    }

    @When("^place the order$")
    public void place_the_order() {
        checkoutPage.check_TermsAndCondition(true);
        checkoutPage.clickOn_PlaceOrder();
    //    browserFactory.closeDriver();
    }
}
