package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class BookStoreApplication extends WebDriverUtilities {

	@Test (enabled=false)
	public void LoginValid() throws EncryptedDocumentException, IOException {

		//scrollView(WebElements.bookStoreApplication);

		scrollView(WebElements.logInBookStoreApp);

		click(WebElements.newUserBtn);

		String firstName = readDataFromExcelSheet("BookStoreApp",1,0);

		sendKeys(WebElements.firstnameReg,firstName);

		String lastName = readDataFromExcelSheet("BookStoreApp",2,0);

		sendKeys(WebElements.lastnameReg,lastName);

		String userName = readDataFromExcelSheet("BookStoreApp",3,0);

		sendKeys(WebElements.userNameReg,userName);

		String password = readDataFromExcelSheet("BookStoreApp",4,0);

		sendKeys(WebElements.passwordReg,password);

		scrollBar(WebElements.registerBtn);

		waitUntilElementToClickable(WebElements.captchaCheck);

		click(WebElements.captchaCheck);

		click(WebElements.registerBtn);

		getTextFromPopUp();

		acceptPopUp();
	}

	@Test (priority=1)
	public void loginInvalid() throws InterruptedException, EncryptedDocumentException, IOException {

		//scrollView(WebElements.bookStoreApplication);

		scrollView(WebElements.logInBookStoreApp);

		click(WebElements.newUserBtn);

		String firstName = readDataFromExcelSheet("BookStoreApp",6,0);

		sendKeys(WebElements.firstnameReg,firstName);

		//Border Color Validation

		String initialColor = borderColorOfElement(WebElements.lastnameReg);

		scrollView(WebElements.registerBtn);

		Thread.sleep(2000);

		String finalColor = borderColorOfElement(WebElements.lastnameReg);

		if(initialColor.equalsIgnoreCase(finalColor)) {
			System.out.println("color not changed");
		}
		else {
			System.err.println("color changed");
		}

	}
	@Test
	public void loginInvalidMsg() throws InterruptedException, EncryptedDocumentException, IOException {

		//scrollView(WebElements.bookStoreApplication);

		scrollView(WebElements.logInBookStoreApp);

		click(WebElements.newUserBtn);

		String firstname = readDataFromExcelSheet("BookStoreApp",1,0);

		sendKeys(WebElements.firstnameReg,firstname);
		
		String lastName = readDataFromExcelSheet("BookStoreApp",2,0);

		sendKeys(WebElements.lastnameReg,lastName);
		
		String userName = readDataFromExcelSheet("BookStoreApp",3,0);

		sendKeys(WebElements.userNameReg,userName);
		
		String password = readDataFromExcelSheet("BookStoreApp",4,0);

		sendKeys(WebElements.passwordReg,password);

		scrollBar(WebElements.registerBtn);

		click(WebElements.registerBtn);

		waitUntilElementIsVisible(WebElements.reCaptcha);

		//if(isDisplayed(WebElements.reCaptcha)) {

		validateResult(WebElements.reCaptcha);
		//}

		Thread.sleep(2000);

	}

	@Test
	public void bookStore() {

		//scroll the page and click book store app 
		scrollView(WebElements.bookStoreApplication);

		scrollView(WebElements.bookStoreBookStoreApp);

		//send text search box
		sendKeys(WebElements.searchBox,"Programming"); 

		click(WebElements.javaScriptBook);

		//verify the element is diaplayed or not
		if(isDisplayed(WebElements.title)) {
			validateResult(WebElements.title);
		}
		else {
			System.err.println("book not displayed");
		}

		//scroll the page and click on the website
		scrollView(WebElements.website);

		//new tab will be open switch control to the tab
		switchBetweenTabs();

		//get the page url
		String url = getTheCurrentWebPageUrl();

		//print the url
		System.out.println("Website Url: "+url);

		//get the title of page
		String title = getTheCurrentWebPageTitle();

		//print the title
		System.out.println("Webpage title: "+title);
	}

}
