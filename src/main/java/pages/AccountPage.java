package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * @author Sitaram Rajpoot
 * @date 17-May-2021
 */
public class AccountPage {
	private WebDriver driver;
//1. By Locator
	private By emailId = By.id("email");
	private By passWrod = By.id("passwd");
	private By signIn = By.id("SubmitLogin");
	private By forgotPassWordLink = By.linkText("Forgot your password?");

	// 2. Constractor
	public AccountPage(WebDriver driver) {
		this.driver = driver;
	}
	// 3. Method

	public String getLoginPageTitle() {
		return driver.getTitle();
	}

	public boolean forgotPassWordLinkExist() {
		return driver.findElement(forgotPassWordLink).isDisplayed();
	}

	public void enterUserName(String userName) {
		driver.findElement(emailId).sendKeys(userName);
	}

	public void enterpassWord(String passWord) {
		driver.findElement(passWrod).sendKeys(passWord);
	}

	public void clickOnSignInBtn() {
		driver.findElement(signIn).click();
	}

	public boolean WaitForTitle(String Title) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.titleContains(getLoginPageTitle()));
	}
}
