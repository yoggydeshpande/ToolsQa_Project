package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class CheckBox extends WebDriverUtilities {

	@Test(priority=1)
	public void homeCheckBox() throws InterruptedException {

		scrollBar(WebElements.elements);

		click(WebElements.elements);

		click(WebElements.checkBox);

		click(WebElements.homeCheckBox);
		
		Thread.sleep(2000);

		Assert.assertTrue(isDisplayed(WebElements.result));
		System.out.println("You have selected: home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile \n"+" Message is Displayed");	
	    
		click(WebElements.homeCheckBox);
	}

	@Test(priority=2)
	public void homeSubType() throws InterruptedException {

//		scrollBar(WebElements.elements);
//
//		click(WebElements.elements);
//
//    	click(WebElements.checkBox);

		click(WebElements.toggleBtn1);

		click(WebElements.desktopCheckBox);

		Assert.assertTrue(isDisplayed(WebElements.result));
		System.out.println("You have selected: desktop notes commands \n"+" Message is displayed");

		click(WebElements.documentsCheckBox);

		Assert.assertTrue(isDisplayed(WebElements.result));
		System.out.println("You have selected: home desktop notes commands documents workspace react angular veu office public private classified general \n"+"Message is displayed");

		click(WebElements.downloadsCheckBox);
		
		Thread.sleep(2000);

		Assert.assertTrue(isDisplayed(WebElements.result));
		System.out.println("You have selected: home desktop notes commands documents workspace react angular veu office public private classified general downloads wordFile excelFile \n"+" Message is Displayed");
		
		click(WebElements.homeCheckBox);

	}

	@Test(priority=3)
	public void desktop() {
//
//		scrollBar(WebElements.elements);
//
//		click(WebElements.elements);
//
//		click(WebElements.checkBox);
//
//		click(WebElements.toggleBtn1);

		click(WebElements.toggleBtn2);

		click(WebElements.notesCheckBox);

		Assert.assertTrue(isDisplayed(WebElements.result));
		System.out.println("You have selected: notes \n"+"Message is displayed");

		click(WebElements.notesCheckBox);

		click(WebElements.commandsCheckBox);

		Assert.assertTrue(isDisplayed(WebElements.result));
		System.out.println("You have selected: commands \n"+"Message is displayed");
	    
		click(WebElements.commandsCheckBox);
	}

	@Test(priority=4)
	public void documents() {

//		scrollBar(WebElements.elements);
//
//		click(WebElements.elements);
//
//		click(WebElements.checkBox);
//
//		click(WebElements.toggleBtn1);

		click(WebElements.toggleBtn3);

		click(WebElements.documentsCheckBox);

		Assert.assertTrue(isDisplayed(WebElements.result));
		System.out.println("You have selected: documents workspace react angular veu office public private classified general \n"+"Message is displayed");
	    
		click(WebElements.documentsCheckBox);
	}

	@Test(priority=5)
	public void downloads() {

//		scrollBar(WebElements.elements);
//
//		click(WebElements.elements);
//
//		click(WebElements.checkBox);
//
//		click(WebElements.toggleBtn1);

		click(WebElements.toggleBtn4);
		
		click(WebElements.downloadsCheckBox);

		Assert.assertTrue(isDisplayed(WebElements.result));
		System.out.println("You have selected: downloads wordFile excelFile \n"+" Message is Displayed");
		
		
	}
}
