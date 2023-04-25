package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class Alert_Frames_Windows extends WebDriverUtilities {

	@Test(priority=1)
	public void browserWindows() {

		//scroll the page until element is visible
		scrollBar(WebElements.alertFrameAndWindows);

		//click the element
		click(WebElements.alertFrameAndWindows);

		click(WebElements.browserWindows);

		click(WebElements.tabBtn);

		//switch the control to new tab
		switchBetweenTab();

		//click the desired element
		click(WebElements.windowBtn);

		//agin new window open switch control to the new window
		switchBetweenTab();

		click(WebElements.windowMsgBtn);

		//switch control back to default window
		switchBackToDefaultContent();

	}

	@Test(priority=2)
	public void alerts() throws EncryptedDocumentException, IOException {

		//scrollBar(WebElements.alertFrameAndWindows);

		//click(WebElements.alertFrameAndWindows);

		click(WebElements.alerts);

		click(WebElements.alertBtn);

		//Get the text from pop up 
		getTextFromPopUp();

		//accept the pop up
		acceptPopUp();

		click(WebElements.timerAlertBtn);

		//Check the alert is present or not
		isAlertPresent();

		getTextFromPopUp();

		acceptPopUp();

		click(WebElements.confirmAlertBtn);


		acceptPopUp();

		//verify the action performed
		String actualResult = validateResult(WebElements.confirmResult);
		String resultOk = readDataFromExcelSheet("AlertFrames",1,0);
		Assert.assertEquals(actualResult,resultOk);
		System.out.println("Result matched : tastcase pass");

		//click on the confirm alert button
		click(WebElements.confirmAlertBtn);

		//dismis the pop up
		dismisPopUp();

		//validate the action performed
		String actResult = validateResult(WebElements.confirmResult);
		String resultCancel = readDataFromExcelSheet("AlertFrames",2,0);
		Assert.assertEquals(actResult,resultCancel);
		System.out.println("Result matched : tastcase pass");


		//click on the prompt alert button
		click(WebElements.promtAlertBtn);
		
		String text = readDataFromExcelSheet("AlertFrames",3,1);

		//send text to pop up
		sendTextToPopUp(text);

		//accept the pop up
		acceptPopUp();

		//verification of entered text
		String result = validateResult(WebElements.promptResult);
		String textResult = readDataFromExcelSheet("AlertFrames",3,0);
		Assert.assertEquals(result,textResult);
		System.out.println("Result matched : tastcase pass");
	} 

	@Test(priority=3)
	public void modalDialogs() throws EncryptedDocumentException, IOException {

		//scrollBar(WebElements.alertFrameAndWindows);

		//click(WebElements.alertFrameAndWindows);

		click(WebElements.modalDialogs);
		
		waitUntilElementToClickable(WebElements.smallModal);

		click(WebElements.smallModal);

		//switch control to new opened window
		switchBetweenTabs();

		//verification of text present on element
		String actualResult=validateResult(WebElements.smallModalResult);
		System.out.println(actualResult);
		String smallModalResult = readDataFromExcelSheet("AlertFrames",4,0);
		Assert.assertEquals(actualResult,smallModalResult);
		System.out.println("Result matched : tastcase pass");

		click(WebElements.closeSmallModal);
		
		waitUntilElementToClickable(WebElements.largeModal);

		click(WebElements.largeModal);

		switchBetweenTabs();

		//Validate the result text
		String actResult=validateResult(WebElements.largeModelresult);
		System.out.println(actResult);
		String largeModalResult = readDataFromExcelSheet("AlertFrames",5,0);
		Assert.assertEquals(actResult,largeModalResult);
		System.out.println("Result matched : tastcase pass");

		click(WebElements.closeLargeModal);

	}

	@Test(enabled=false)
	public void frames() {

		//scrollBar(WebElements.alertFrameAndWindows);

		//click(WebElements.alertFrameAndWindows);

		click(WebElements.framesOption);

		switchBetweenFrames(0);

		//verification of window heading 
		String actualResult=validateResult(WebElements.parentSampleHeading);
		System.out.println(actualResult);
		Assert.assertEquals(actualResult,"This is a sample page");
		System.out.println("Result matched : tastcase pass");

		//switch to frame
		switchBetweenFrames(1);

		//Get attribute from frame
		String attribute = getAttribute(WebElements.fristChildFrame);

		//print the attribute
		System.out.println(attribute);

		switchBetweenFrames(2);

		//Verification of page content
		String actResult=validateResult(WebElements.secondChildFrame);
		System.out.println(actResult);
		Assert.assertEquals(actResult,"This is a sample page");
		System.out.println("Result matched : tastcase pass");
	}

	@Test(priority=4)
	public void nestedFrames() {

//		scrollBar(WebElements.alertFrameAndWindows);
//
//		click(WebElements.alertFrameAndWindows);

		click(WebElements.nestedFrames);

		//verification of frame content 
		String actualResult=validateResult(WebElements.nestedParentFrame);
		
		System.out.println(actualResult);
		Assert.assertEquals(actualResult,"");
		System.out.println("Result matched : tastcase pass");

	}
}
