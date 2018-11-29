package Steps;

import java.util.List;

import Base.BaseUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MurkeryToursMainPage;
import pages.RegisterPage;
import pages.SignOnPage;
import pages.UiUtility;

public class Registration extends BaseUtil{

	private BaseUtil base;

	public Registration(BaseUtil base) {
		this.base = base;
	}

	MurkeryToursMainPage murkerytoursmaipage = null;
	RegisterPage registerPage = null;
	SignOnPage signOn = null;
	

	@Given("^Should launch url \"([^\"]*)\"$")
	public void launchUrl(String url) throws Throwable {
		murkerytoursmaipage = PageFactory.initElements(base.driver, MurkeryToursMainPage.class);
		registerPage = PageFactory.initElements(base.driver, RegisterPage.class);
		signOn = PageFactory.initElements(base.driver, SignOnPage.class);
		base.driver.get(url);
	}

	@When("^Should click on Register button$")
	public void clickOnRegisterLink() throws Throwable {
		UiUtility.clickOnElementReference(murkerytoursmaipage.registerLink);
	}

	@When("^Verifyng register page open succesfully$")
	public void verifyng_register_page_open_succesfully() throws Throwable {
		UiUtility.verifyElementDisplayed(registerPage.submitButton);
	}

	@When("^Should enter all details into text box$")
	public void should_enter_all_details_into_text_box(DataTable allData) throws Throwable {
		WebElement[] allTextBox = { registerPage.firstName, registerPage.lastName, registerPage.phone,
				registerPage.email, registerPage.address, registerPage.userName, registerPage.password,
				registerPage.confirmPassword };
		List<List<String>> rawData = allData.raw();
		// Entering first name
		for (int i = 0; i < rawData.size(); i++) {
			UiUtility.setAndVerifyText(rawData.get(i).get(1), allTextBox[i]);
		}
		
	}

	@When("^Should Click on Submit button$")
	public void should_Click_on_Submit_button() throws Throwable {
		UiUtility.clickOnElementReference(registerPage.submitButton);
	}

	@Then("^Verifying user succsessfully register$")
	public void verifying_user_succsessfully_register() throws Throwable {
		UiUtility.verifyElementDisplayed(registerPage.registrationMessage);
	}
	
	@Then("^Should click on sign in link$")
	public void should_click_on_sign_in_link() throws Throwable {
		UiUtility.clickOnElementReference(registerPage.signInLink);
	}

	@Then("^Should enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void should_enter_and(String user, String pass) throws Throwable {
		UiUtility.setAndVerifyText(user, signOn.userName);
		UiUtility.setAndVerifyText(pass, signOn.password);
	}

	@Then("^Should Click on Submit button from login page$")
	public void should_Click_on_Submit_button_from_login_page() throws Throwable {
		 UiUtility.clickOnElementReference(signOn.submit);
	}

	@Then("^Verifying user succsessfully login$")
	public void verifying_user_succsessfully_login() throws Throwable {
	}
	
	@Then("^Should click on Sign Off button$")
	public void should_click_on_Sign_Off_button() throws Throwable {
		UiUtility.clickOnElementReference(signOn.signOff);
	}
	

}
