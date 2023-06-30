package tr;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Allin1.feature",
        glue= {"sd2"},
        plugin = { "pretty",
                   "html:cucumber-reports/cucumber.html",
                   "json:cucumber-reports/Cucumber.json",
                   "junit:cucumber-reports/Cucumber.xml"}
)
public class TestRunner {


}
