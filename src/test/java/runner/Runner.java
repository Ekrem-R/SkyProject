package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports/cucumber.html",
                "json:target/cucumber-reports/cucumber.json"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        //tags = "@deals,@login",
        dryRun = false



)

public class Runner {

}
