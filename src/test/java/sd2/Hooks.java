package sd2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TestContext;

public class Hooks {

    TestContext testContext;

    public Hooks(TestContext context)
    {
        testContext = context;
    }

    @Before
    public void setup()
    {
        /*What all you can perform here
			Starting a webdriver
			Setting up DB connections
			Setting up test data
			Setting up browser cookies
			Navigating to certain page
			or anything before the test
		*/

 //We have not started our driver in the @Before method, because we have been doing the same in the TestContext class constructor.
        // Because our PageObjectModel needs the driver at the early stage
    }

    @After
    public void tearDown()
    {
        testContext.getBrowserFactory().closeDriver();
    }
}
