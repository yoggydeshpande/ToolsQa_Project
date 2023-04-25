package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class DynamicProperties extends WebDriverUtilities {
	
	@Test
	public void visibilityOfElement() throws InterruptedException {
		
        scrollBar(WebElements.elements);
		
		click(WebElements.elements);
		
		click(WebElements.dynamicProperties);
		
		Thread.sleep(5000);
		
		waitUntilPresenceOfElement(WebElements.enableAfter);
		
		Assert.assertTrue(isEnabled(WebElements.enableAfter));
		System.out.println("Element is enable");

		waitUntilElementIsVisible(WebElements.visibleAfter);
		if(isDisplayed(WebElements.visibleAfter)) {
			System.out.println("Element is visible");
		}
		else {
			System.out.println("element is not visible");
		}
		colorChangeOfElement(WebElements.colourChange,"#ffff");
	}

}
