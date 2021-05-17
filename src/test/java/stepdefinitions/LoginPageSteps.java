package stepdefinitions;

import org.junit.Assert;

import com.driver.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageSteps {

	private static String loginTitle;

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("User is on Login page")

	public void user_is_on_login_page() {

		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

	}

	@When("Get the Login page Title")
	public void get_the_login_page_title() {

		loginTitle = loginPage.getLoginPageTitle();
		System.out.println("Login page Title " + loginTitle);
	}

	@Then("Verify Title should be {string}")
	public void verify_title_should_be(String expectedTitle) {

		Assert.assertTrue(loginTitle.contains(expectedTitle));
	}

	@When("Verify Forget password link is visible")
	public void verify_forget_password_link_is_visible() {
		Assert.assertTrue(loginPage.forgotPassWordLinkExist());
	}

	@When("User enter usernName {string}")
	public void user_enter_usern_name(String string) {
		loginPage.enterUserName(string);
	}

	@When("User enter Password {string}")
	public void user_enter_password(String string) {
		loginPage.enterpassWord(string);
	}

	@When("User Click on Sign in button")
	public void user_click_on_sign_in_button() {
		loginPage.clickOnSignInBtn();
	}

	@Then("Verify Account page Title")
	public void verify_Account_page_title() {
		Assert.fail("Explicitly failed");
		System.out.println(loginPage.getLoginPageTitle());
	}

	@Then("Account page Title should be {string}")
	public void account_page_title_should_be(String homePageTitle) {
		System.out.println("Home page Title" + DriverFactory.getDriver().getTitle() + "Expected Title" + homePageTitle);

		Assert.assertTrue(loginPage.WaitForTitle(homePageTitle));

	}

}
