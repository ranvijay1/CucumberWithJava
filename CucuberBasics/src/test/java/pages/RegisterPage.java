package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegisterPage extends MurkeryToursMainPage {
	
	@FindBy(how = How.NAME, using = "register")
	public WebElement submitButton;
	
	@FindBy(how = How.NAME, using = "firstName")
	public WebElement firstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	public WebElement lastName;
	
	@FindBy(how = How.NAME, using = "phone")
	public WebElement phone;
	
	@FindBy(how = How.NAME, using = "userName")
	public WebElement email;
	
	@FindBy(how = How.NAME, using = "email")
	public WebElement userName;
	
	@FindBy(how = How.NAME, using = "password")
	public WebElement password;
	
	@FindBy(how = How.NAME, using = "confirmPassword")
	public WebElement confirmPassword;
	
	@FindBy(how = How.NAME, using = "address1")
	public WebElement address;
	
	@FindBy(how = How.XPATH, using = "//p[contains(.,'Thank you for registering.')]")
	public WebElement registrationMessage;
	
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "sign-in")
	public WebElement signInLink;

}
