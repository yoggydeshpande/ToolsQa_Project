package TestScripts;

import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class DownloadAndUpload extends WebDriverUtilities{

	@Test (priority=1)
	public void downloadFile() {
		scrollBar(WebElements.elements);
		
		click(WebElements.elements);
		
		click(WebElements.uploadAndDownload);
		
		scrollView(WebElements.download);
		
        
	
	}
	
	@Test(priority=2)
	public void uploadFile() {
		
//		scrollBar(WebElements.elements);
//		
//		click(WebElements.elements);
		
        waitUntilElementToClickable(WebElements.uploadAndDownload);
		
		click(WebElements.uploadAndDownload);
		
		sendKeys(WebElements.uploadFile,"C:\\Users\\yoges\\Downloads\\sampleFile.jpeg");
}
}
