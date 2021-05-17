package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	private WebDriver driver;
	// 1. By Locator
	private By emailId = By.id("email");
	private By password = By.id("passwd");
	private By signIn = By.id("SubmitLogin");
	private By forgotPassWordLink = By.linkText("Forgot your password?");

	// 2. Constractor
	public LoginPage(WebDriver driver) {
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
		driver.findElement(password).sendKeys(passWord);
	}

	public void clickOnSignInBtn() {
		driver.findElement(signIn).click();
	}

	public boolean WaitForTitle(String Title) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.titleContains(getLoginPageTitle()));
	}

	public AccountPage doLogin(String userName, String passWord) {
		driver.findElement(emailId).sendKeys(userName);
		driver.findElement(password).sendKeys(passWord);
		driver.findElement(signIn).click();
		return new AccountPage(driver);
	}
}
