package sd2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import utils.BrowserFactory;
import utils.ConfigFileReader;
import utils.PageObjectManager;
import utils.TestContext;

public class HomePageSteps {

      HomePage home;
      TestContext testContext;
      WebDriver driver;

      public HomePageSteps()
      {
          testContext = new TestContext();
          home = testContext.getPageObjectManager().getHomePage();
          driver = testContext.getBrowserFactory().getDriver();
      }

    @Given("^user is on Home Page$")
    public void user_is_on_Home_Page()
    {
          driver.get(testContext.getConfigFileReader().getURL());
    }

    @When("he searches for Dress")
    public void he_searches_for_dress()
    {
        driver.findElement(By.xpath("//*[text()='Dismiss']")).click();
        home.perform_Search();
    }
}
