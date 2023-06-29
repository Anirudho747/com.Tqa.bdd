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
//    WebDriver driver;
      MiscPage miscPage;

//    public MiscPageSteps()
//    {
//        testContext = new TestContext();
// //       driver = testContext.getBrowserFactory().getDriver();
//        miscPage = testContext.getPageObjectManager().getMiscPage();
//    }

    @When("choose to but the first item")
    public void choose_to_but_the_first_item()
    {

//        List<WebElement> items = driver.findElements(By.cssSelector(".noo-product-inner"));
//        items.get(0).click();
//
//        Select color = new Select(driver.findElement(By.id("pa_color")));
//        color.selectByIndex(1);
//
//        Select size = new Select(driver.findElement(By.id("pa_size")));
//        size.selectByIndex(1);

//        miscPage.perform_Search();

    }
}
