package TestScripts;

import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class WebTables extends WebDriverUtilities {

	@Test (priority=2)
	public void webTable() {
		
//		scrollBar(WebElements.elements);
//		
//		click(WebElements.elements);
//		
//		click(WebElements.webTables);
		
		webTableHandle(WebElements.tableHeaders,WebElements.allTableData,1,"Age",1,"Legal",WebElements.secondRow,"Cantrell");
		
	}
	
	@Test (priority=1)
	public void addData() {
		
        scrollBar(WebElements.elements);
		
		click(WebElements.elements);
		
		click(WebElements.webTables);
		
		click(WebElements.addRecordBtn);
		
		sendKeys(WebElements.firstNameRegForm,"ABC");
		
		sendKeys(WebElements.lastNameRegForm,"XYZ");
				
		sendKeys(WebElements.emailRegForm,"ABC@gnail.com");
						
		sendKeys(WebElements.ageRegForm,"25");
								
		sendKeys(WebElements.salaryRegForm,"23500");
										
		sendKeys(WebElements.departmentRegForm,"Civil");
												
		click(WebElements.submitRegForm);
														
			
	}
}
