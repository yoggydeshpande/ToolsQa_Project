package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class Buttons extends WebDriverUtilities {
	
	@Test 
	public void Click() {

		scrollBar(WebElements.elements);
		
		click(WebElements.elements);
		
		click(WebElements.buttons);
		
		click(WebElements.clickMe);
		
		Assert.assertTrue(isDisplayed(WebElements.dynamicClickMsg));
		System.out.println("You have done a dynamic click \n"+"Message is displayed");
		
		waitUntilElementToClickable(WebElements.rightClick);
		
        rightClick(WebElements.rightClick);
		
		Assert.assertTrue(isDisplayed(WebElements.rightClickMsg));
		System.out.println("You have done a right click \n"+"Message is displayed");
		
        waitUntilElementToClickable(WebElements.doubleClick);
		
		doubleClick(WebElements.doubleClick);
		
		Assert.assertTrue(isDisplayed(WebElements.doubleClickMsg));
		
		System.out.println("You have done a double click \n"+"Message is displayed");
	}
}
