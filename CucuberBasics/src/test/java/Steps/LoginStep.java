package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;
import pages.MurkeryToursMainPage;
import pages.RegisterPage;
import pages.SignOnPage;
import pages.UiUtility;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil {


    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    public MurkeryToursMainPage murkerytoursmaipage = null;
    public RegisterPage registerPage = null;
    public SignOnPage signOn = null;

    @Given("^Should launch url \"([^\"]*)\" to do login$")
    public void should_launch_url(String url) {
        murkerytoursmaipage = PageFactory.initElements(base.driver, MurkeryToursMainPage.class);
        registerPage = PageFactory.initElements(base.driver, RegisterPage.class);
        signOn = PageFactory.initElements(base.driver, SignOnPage.class);
        base.driver.get(url);
    }

    @When("^Should click on Sign on button button in main page$")
    public void should_click_on_Sign_on_button_button() throws Throwable {
        UiUtility.clickOnElementReference(murkerytoursmaipage.signOnLink);
    }

    @When("^Should enter \"([^\"]*)\" and \"([^\"]*)\" in login page$")
    public void should_enter_and(String user, String pass) throws Throwable {
        UiUtility.setAndVerifyText(user, signOn.userName);
        UiUtility.setAndVerifyText(pass, signOn.password);
    }

    @When("^Should Click on Submit button from login page for login$")
    public void should_Click_on_Submit_button_from_login_page() throws Throwable {
        UiUtility.clickOnElementReference(signOn.submit);
    }

    @Then("^Verifying user succsessfully logged in$")
    public void verifying_user_succsessfully_login() throws Throwable {
        UiUtility.verifyElementDisplayed(signOn.signOff);
    }

    @Then("^Should click on Sign Off button to signout$")
    public void should_click_on_Sign_Off_button() throws Throwable {
        UiUtility.clickOnElementReference(signOn.signOff);
    }
}
