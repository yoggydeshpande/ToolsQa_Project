package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class TestOne_TextBox extends WebDriverUtilities {
  
	@Test
	public void textBox() throws InterruptedException, EncryptedDocumentException, IOException{
		
		scrollBar(WebElements.elements);
		
		click(WebElements.elements);
		
		click(WebElements.textbox);
		
		String name = readDataFromExcelSheet("TextBox",1,0);
		
		sendKeys(WebElements.fullName,name);
		
		String mail = readDataFromExcelSheet("TextBox",1,1);
		
		sendKeys(WebElements.emailId,mail);
		
		 String address = readDataFromExcelSheet("TextBox",1,2);
		
		sendKeys(WebElements.currentAddress,address);
		
		 String perAdd = readDataFromExcelSheet("TextBox",1,3);
		
		sendKeys(WebElements.permanent,perAdd);
		
		scrollBar(WebElements.submit);
		
		click(WebElements.submit);
	}
}
