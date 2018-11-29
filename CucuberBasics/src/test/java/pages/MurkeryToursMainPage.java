package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MurkeryToursMainPage {
	
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")
	public WebElement registerLink;
	
	@FindBy(how = How.LINK_TEXT, using = "SIGN-ON")
	public WebElement signOnLink;
	
	@FindBy(how = How.LINK_TEXT, using = "SUPPORT")
	public WebElement supportLink;
	
	@FindBy(how = How.LINK_TEXT, using = "CONTACT")
	public WebElement contactLink;
	

}
