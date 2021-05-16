package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(monochrome = true,
features = "src/test/resources/appfeatures", 
glue = "stepdefinitions", 
tags = "@Smoke",
dryRun = false,
plugin = {"json:target/cucumber.json",
		  "junit:target/cucumber.xml",
		 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
 publish = true)

public class SalesForceApplication_Test {

	
}
