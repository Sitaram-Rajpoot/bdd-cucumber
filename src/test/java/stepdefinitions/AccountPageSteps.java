package stepdefinitions;

import java.util.List;
import java.util.Map;
import org.junit.Assert;

import com.driver.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AccountPage;
import pages.LoginPage;

public class AccountPageSteps {
	private AccountPage accountPage;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@When("User already logged in to the application successfully")
	public void user_already_logged_in_to_the_application_successfully(DataTable dataTable) {
		List<Map<String, String>> list = dataTable.asMaps();
		String userName = list.get(0).get("userName");
		String passWord = list.get(0).get("passWord");
		DriverFactory.getDriver()
				.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		accountPage = loginPage.doLogin(userName, passWord);
	}

	@Given("User is on Account page")
	public void user_is_on_account_page() {
		System.out.println("User is on account page");
	}

	@When("Get the Account page Title")
	public void get_the_account_page_title() {
		System.out.println("get_the_account_page_title" + loginPage.getLoginPageTitle());
	}

	@Then("Verify Account page Title should be {string}")
	public void verify_account_page_title_should_be(String title) {
		String expectedTitle = accountPage.getLoginPageTitle();
		Assert.assertEquals(title, expectedTitle);
		System.out.println("verify_account_page_title_should_be");
	}
}
