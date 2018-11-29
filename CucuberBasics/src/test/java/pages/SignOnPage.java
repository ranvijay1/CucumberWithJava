package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignOnPage {

	@FindBy(how = How.NAME, using = "userName")
	public WebElement userName;
	
	@FindBy(how = How.NAME, using = "password")
	public WebElement password;
	
	@FindBy(how = How.NAME, using = "login")
	public WebElement submit;
	
	@FindBy(how = How.LINK_TEXT, using = "SIGN-OFF")
	public WebElement signOff;
}
