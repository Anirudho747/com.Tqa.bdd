package sd2;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.MiscPage;
import utils.BrowserFactory;
import utils.ConfigFileReader;
import utils.PageObjectManager;
import utils.TestContext;

import java.util.List;

public class MiscPageSteps {

      TestContext testContext;
      MiscPage miscPage;

    public MiscPageSteps(TestContext context)
    {
        System.out.println("MPS 28");
        testContext = context;
        System.out.println("HP 30");
        miscPage = testContext.getPageObjectManager().getMiscPage();
    }

    @When("choose to but the first item")
    public void choose_to_but_the_first_item()
    {
        System.out.println("35");
        miscPage.perform_Search();
    }
}
