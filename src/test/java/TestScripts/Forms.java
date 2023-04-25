package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class Forms extends WebDriverUtilities {
	
	@Test
	public void practiceForm() throws InterruptedException, EncryptedDocumentException, IOException {
		
		scrollBar(WebElements.forms);
		
		click(WebElements.forms);
		 
		click(WebElements.practiceForm);
		
		String name = readDataFromExcelSheet("Forms",1,0);
		
		sendKeys(WebElements.nameSRF,name);
		
		String lastname=readDataFromExcelSheet("Forms",1,1);
		
		sendKeys(WebElements.lastNameSRF,lastname);
		
		String email=readDataFromExcelSheet("Forms",1,2);
		
		sendKeys(WebElements.emailSRF,email);
		
		click(WebElements.genderSRF);
		
		String mobNo=readDataFromExcelSheet("Forms",1,3);
		
		sendKeys(WebElements.mobileSRF,"9587907834");
		
		click(WebElements.dobSRF);
		
		String month=readDataFromExcelSheet("Forms",1,4);
		
		dropDownAction(WebElements.monthSRF,month);
		
		waitUntilPresenceOfElement(WebElements.yearSRF);
		
		String year = readDataFromExcelSheet("Forms",1,5);
		
		dropDownActionByValue(WebElements.yearSRF,"2029");
		
		scrollView(WebElements.daySRF);
		
		scrollBar(WebElements.subjectSRF);
		
		waitUntilElementToClickable(WebElements.subjectSRF);
		
//		if(isDisplayed(WebElements.subjectSRF)) { 
//		sendKeys(WebElements.subjectSRF,"Science");
//		}
		String subject=readDataFromExcelSheet("Forms",1,6);
		
		sendKeysEnter(WebElements.subjectSRF,subject);
		
//		sendkeys(WebElements.subjectSRF,"Physics",Keys.ENTER);
//		
//		sendkeys(WebElements.subjectSRF,"Maths",Keys.ENTER);
		
		click(WebElements.hobbiesSportSRF);
		
		click(WebElements.hobbiesMusicSRF);
		
		String picture=readDataFromExcelSheet("Forms",1,7);
		
		sendKeys(WebElements.pictureSRF,picture);
		
		String address=readDataFromExcelSheet("Forms",1,8);
		
        sendKeys(WebElements.currentAddressSRF,address);
        
        scrollBar(WebElements.stateSRF);
        
        waitUntilElementToClickable(WebElements.stateSRF);
        
        String state=readDataFromExcelSheet("Forms",1,9);
        
        sendKeysEnter(WebElements.stateSRF,state);
        
        waitUntilElementToClickable(WebElements.citySRF);
        
        String city=readDataFromExcelSheet("Forms",1,10);
        
        sendKeysEnter(WebElements.citySRF,city);
        
        clickByJavascript(WebElements.submitSRF);
        
	}

}
