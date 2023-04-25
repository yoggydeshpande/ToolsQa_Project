package TestScripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class Links extends WebDriverUtilities {
 
	@Test (priority=1)
	public void switchTabLinks() {
		
		scrollBar(WebElements.elements);
		
		click(WebElements.elements);
		
		click(WebElements.links);
		
		click(WebElements.home);
		
		switchBetweenTab();
		
		click(WebElements.homeQePLOLink);
		
		switchBetweenTab();
		
		switchBackToDefaultContent();
	}
	
	@Test (priority=2)
	public void checkLinksResponces() {
		
//        scrollBar(WebElements.elements);
//		
//		click(WebElements.elements);
//		
//		click(WebElements.links);
		
		scrollView(WebElements.createdLink);
		
		click(WebElements.createdLink);
		
		Assert.assertTrue(isDisplayed(WebElements.createdResponse));
		
		System.out.println("Link has responded with staus Created");
		
		click(WebElements.noContentLink);
		
		Assert.assertTrue(isDisplayed(WebElements.noContentResponse));
		System.out.println("Link has responded with staus No Content");
		
		click(WebElements.movedLink);
		
		Assert.assertTrue(isDisplayed(WebElements.movedResponse));
		System.out.println("Link has responded with staus Moved Permanently");
		
		click(WebElements.badReqLink);
		
		Assert.assertTrue(isDisplayed(WebElements.badReqResponse));
		System.out.println("Link has responded with staus Bad Request");
		
		click(WebElements.unauthorizedLink);
		
		Assert.assertTrue(isDisplayed(WebElements.unauthorizedResponse));
		System.out.println("Link has responded with staus Unauthorized");
		
		scrollView(WebElements.forbidden);
		
		click(WebElements.forbidden);
		
		Assert.assertTrue(isDisplayed(WebElements.forbiddenResponse));
		System.out.println("Link has responded with staus Forbidden");
		
		click(WebElements.notFound);
		
		Assert.assertTrue(isDisplayed(WebElements.notFoundResponse));
		System.out.println("Link has responded with staus Not Found");
	}
}
