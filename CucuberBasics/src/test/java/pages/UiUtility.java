package pages;

import org.openqa.selenium.WebElement;
import org.testng.Assert;



public class UiUtility {
	
	/**
	 * Used to click on any element
	 * @param element
	 */
	public static void clickOnElementReference(WebElement element) {
		element.click();
	}
	
	public static void setAndVerifyText(String text, WebElement element) {
		// Clearing text box
		element.clear();
		
		// Setting text
		element.sendKeys(text);
		
		// Verifying if text entered correct
		Assert.assertEquals(text, element.getAttribute("value"), "Text is note entered as per expected");
		
	}
	
	public static void verifyElementDisplayed(WebElement element) {
		Assert.assertEquals(true, element.isDisplayed(), "Element is not displayed");
	}

}
