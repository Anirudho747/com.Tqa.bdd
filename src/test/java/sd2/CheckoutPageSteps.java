package sd2;

import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import utils.BrowserFactory;
import utils.TestContext;

public class CheckoutPageSteps {

//    WebDriver driver;
//    CheckoutPage checkoutPage;
//    TestContext testContext;
//    BrowserFactory browserFactory;
//
//    @When("^enter personal details on checkout page$")
//    public void enter_personal_details_on_checkout_page() throws InterruptedException {
//
//        testContext = new TestContext();
// //       driver = testContext.getBrowserFactory().getDriver();
//        checkoutPage = testContext.getPageObjectManager().getCheckoutPage();
//
//
//        checkoutPage.fill_PersonalDetails();
//    }
//
//    @When("^place the order$")
//    public void place_the_order() {
//
//        browserFactory = testContext.getBrowserFactory();
//        checkoutPage.check_TermsAndCondition(true);
//        checkoutPage.clickOn_PlaceOrder();
//
//        browserFactory.closeDriver();
//    }
}
