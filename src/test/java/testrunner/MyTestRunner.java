package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        
    
        features = {"src\\test\\resources\\appfeatures"},
        glue = {"stepdefinitions", "apphooks"},
        tags="@Smoke",
        monochrome = true,
        plugin = { "pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","json:target/json.html","timeline:test-output-thread/"}
        
        )

public class MyTestRunner {

}
