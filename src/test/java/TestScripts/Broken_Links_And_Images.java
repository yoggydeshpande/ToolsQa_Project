package TestScripts;

import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class Broken_Links_And_Images extends WebDriverUtilities {

	@Test
	public void validLink() {

		scrollBar(WebElements.elements);

		click(WebElements.elements);

		click(WebElements.brokenLinksImages);

		click(WebElements.validLink);

		if(getTheCurrentWebPageTitle().equals("DEMOQA")) {
			System.out.println("Title matched");
			System.out.println(getTheCurrentWebPageTitle());
		}else {
			System.out.println("Title mismatched");
		}

		System.out.println(getTheCurrentWebPageUrl());
	}

	@Test(enabled=false)
	public void brokenLink() {

		scrollBar(WebElements.elements);

		click(WebElements.elements);

		click(WebElements.brokenLinksImages);
		
		click(WebElements.brokenLink);

		switchWindows();
		
		brokenLinks(WebElements.linkTag);
		
		click(WebElements.hereLink);
//		
//		switchWindows();
//		
//		brokenLinks(WebElements.linkTag);
		
//		click(WebElements.elementalSelenium);
//		
//		switchWindows();
//		
//		click(WebElements.sauceLab);
	
	}
}
