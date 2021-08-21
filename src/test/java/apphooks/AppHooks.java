package apphooks;
/*
 */
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.driver.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.ConfigReader;

public class AppHooks {

	private DriverFactory driverFactor;
	public WebDriver driver;
	private ConfigReader configReader;
	Properties prop;

	@Before(order = 0)

	public void getProperty() {
		System.out.println("Before Hooks Method ");
		configReader = new ConfigReader();

		prop = configReader.initProperties();
		System.out.println("getProperty" + prop);
	}

	@Before(order = 1)

	public void launchBrowser() {
		String browserName = prop.getProperty("browser");
		driverFactor = new DriverFactory();
		driver = driverFactor.InitDriver(browserName);

		System.out.println("launchBrowser" + driver);

	}

	@After(order = 0)
	public void quitBrowser() {
		driver.quit();

	}

	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");

			byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);

		}

	}
}
