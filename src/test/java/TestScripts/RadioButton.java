package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class RadioButton extends WebDriverUtilities {
	
	@Test (priority=1)
	public void yesRadioButtons() {
		
		scrollBar(WebElements.elements);
		
		click(WebElements.elements);
		
		click(WebElements.radioBtn);
		
		scrollView(WebElements.yesRadioBtn);
		
		Assert.assertTrue(isDisplayed(WebElements.yesResult));
		System.out.println("You have selected : Yes \n"+"Message is displayed");
		
        scrollView(WebElements.impressiveRadioBtn);
		
        Assert.assertTrue(isDisplayed(WebElements.impressiveResult));
		System.out.println("You have selected : Impressive \n"+"Message is displayed");
		
		scrollView(WebElements.noRadioBtn);
		
		if(isEnabled(WebElements.noRadioBtn)) {
		System.out.println("we can select no radio button");}
		else {
			System.out.println("we cant select no radio button");
		}
		
	}
	
//	@Test (priority=2)
//	public void impressiveRadioButtons() throws InterruptedException {
//		
////		scrollBar(WebElements.elements);
////		
////		click(WebElements.elements);
////		
////		click(WebElements.radioBtn);
//		
////		if (isEnabled(WebElements.impressiveRadioBtn) && isDisplayed(WebElements.impressiveRadioBtn)) {
////			click(WebElements.impressiveRadioBtn); 
////		}
////		else {
////			System.out.println("element is not enabled or not displayed");
////		}
//
//		scrollView(WebElements.impressiveRadioBtn);
//		
//        Assert.assertTrue(isDisplayed(WebElements.impressiveResult));
//		System.out.println("You have selected : Impressive \n"+"Message is displayed");
//
//    }
//	
//	@Test (priority=3)
//	public void noRadioButtons() {
//		
////		scrollBar(WebElements.elements);
////		
////		click(WebElements.elements);
////		
////		click(WebElements.radioBtn);
//		
//		scrollView(WebElements.noRadioBtn);
//	
//		if(isEnabled(WebElements.noRadioBtn)) {
//		System.out.println("we can select no radio button");}
//		else {
//			System.out.println("we cant select no radio button");
//		}
//    }
}
