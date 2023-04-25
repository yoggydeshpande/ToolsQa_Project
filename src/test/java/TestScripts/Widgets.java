package TestScripts;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class Widgets extends WebDriverUtilities {

	@Test (priority=2)
	public void accordian() {

//		scrollBar(WebElements.widgets);
//
//		click(WebElements.widgets);

		scrollBar(WebElements.accordian);
		
		click(WebElements.accordian);

		//first heading 
		String actLoremHeading = validateResult(WebElements.loremHeading);
		String actLoremContent = validateResult(WebElements.loremContent);
		Assert.assertEquals(actLoremHeading, "What is Lorem Ipsum?");
		System.out.println("Lorem Heading matched");
		Assert.assertEquals(actLoremContent, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		System.out.println("Lorem Content matched");

		//scrollBar(WebElements.comeFromHeading);

		click(WebElements.comeFromHeading);

		//second heading
		String actSecondHeading = validateResult(WebElements.comeFromHeading);
		//String actSecondContent = validateResult(WebElements.comeFromContent);
		Assert.assertEquals(actSecondHeading, "Where does it come from?");
		System.out.println("Come from heading matched");
		/*Assert.assertEquals(actSecondContent, "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\r\n"
				+ "\r\n"
				+ "The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.");*/
		System.out.println("Come from content matched");

		//scrollBar(WebElements.useHeading);

		click(WebElements.useHeading);

		//Third heading
		String actThirdHeading = validateResult(WebElements.useHeading);
		String actThirdContent = validateResult(WebElements.useContent);
		Assert.assertEquals(actThirdHeading, "Why do we use it?");
		System.out.println("Come from heading matched");
		Assert.assertEquals(actThirdContent,"It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		System.out.println("use content matched");
	}

	@Test (priority=1)
	public void slider() throws InterruptedException {

//		scrollBar(WebElements.widgets);
//
//		click(WebElements.widgets);

		scrollView(WebElements.slider);

		sliderByDragAndDrop(WebElements.sliderElement);
	}

	@Test (priority=3)
	public void autoComplete() {

//		scrollBar(WebElements.widgets);
//
//		click(WebElements.widgets);

		scrollView(WebElements.autoComplete);

		sendKeysEnter(WebElements.multipleColorName,"red");

		sendKeysEnter(WebElements.multipleColorName,"ye");

		sendKeysEnter(WebElements.multipleColorName,"bl");

		sendKeysEnter(WebElements.multipleColorName,"w");

		sendKeysEnter(WebElements.singleColorName,"p");
	}

	@Test (priority=4)
	public void datePicker() {

//		scrollBar(WebElements.widgets);
//
//		click(WebElements.widgets);
		
		scrollView(WebElements.datePicker);
        
        waitUntilElementToClickable(WebElements.selectDate);

		scrollView(WebElements.selectDate);

		dropDownAction(WebElements.monthDatePicker,"September");

		dropDownActionByValue(WebElements.yearDatePicker,"2023");

		click(WebElements.dayDatePicker);

		click(WebElements.dateAndTime);

		click(WebElements.monthArrow);

		click(WebElements.monthDateTimepicker);

		click(WebElements.yearArrow);

		scrollBar(WebElements.yearDateTimepicker);

		while(!isDisplayed(WebElements.yearDateTimepicker)) {
			click(WebElements.previousYears);
		}

		click(WebElements.yearDateTimepicker);

		click(WebElements.dayDateTimepicker);

		scrollView(WebElements.timeDateTimepicker);
	}

	@Test (priority=5)
	public void toolTips() {

//		scrollBar(WebElements.widgets);
//
//		click(WebElements.widgets);

		scrollView(WebElements.toolTips);
		
		waitUntilPresenceOfElement(WebElements.toolTipBtn);

		mouseOver(WebElements.toolTipBtn);

		String result1 = validateResult(WebElements.toolTipBtn);
		System.out.println(result1);

		mouseOver(WebElements.textBoxToolTip);

		String result2 = validateResult(WebElements.textBoxToolTip);
		System.out.println(result2);

		mouseOver(WebElements.contraryToolTip);

		String result3 = validateResult(WebElements.contraryToolTip);
		System.out.println(result3);
		 
        mouseOver(WebElements.tooltipElement);
		
		String result4 = validateResult(WebElements.tooltipElement);
		System.out.println(result4);
	}
	
	@Test (priority=6)
	public void progressBar() {
		
//		scrollBar(WebElements.widgets);
//
//		click(WebElements.widgets);

		scrollView(WebElements.progressBar);
		
		click(WebElements.startPgBar);
		
		waitUntilElementIsVisible(WebElements.resetBtn);
		
		click(WebElements.resetBtn);
	}
	
	@Test 
	public void selectMenu() {
		
		scrollBar(WebElements.widgets);

		click(WebElements.widgets);
		
		scrollView(WebElements.selectMenu);
		
		click(WebElements.selectValue);
		
		scrollView(WebElements.selectValOpt);
		
		scrollBar(WebElements.selectOne);
		
		sendKeysEnter(WebElements.selectOne,"Mr");
		
		sendKeysEnter(WebElements.multiSelect,"Black");
		
		sendKeysEnter(WebElements.multiSelect,"Bl");
		
		sendKeysEnter(WebElements.multiSelect,"Bl");
		
		dropDownAction(WebElements.standardMultiSelect,"Audi");
		
		dropDownAction(WebElements.oldSelectMenu,"Indigo");
		}
	
	@Test (priority=8)
	public void menu() {
		
//		scrollBar(WebElements.widgets);
//
//		click(WebElements.widgets);
		
		scrollView(WebElements.menu);
		
		mouseOverElementText(WebElements.mainItem1);
		
		mouseOverElementText(WebElements.mainItem3);
			
		mouseOverElementText(WebElements.mainItem2);
		
		click(WebElements.mainItem2);
		
		mouseOverElementText(WebElements.subSubList);
		
		mouseOverElementText(WebElements.subItem);
		
		click(WebElements.subSubList);
		
		mouseOverElementText(WebElements.subSubItem1);
		
	}
	
	@Test (priority=9) 
	public void tabs() {
		
//		scrollBar(WebElements.widgets);
//
//		click(WebElements.widgets);
//		
		scrollView(WebElements.tabs);
		
		String result1 = validateResult(WebElements.whatTabDemo);
		System.out.println("WhatTab demo : \n"+ result1);
		Assert.assertEquals(result1, "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
		System.out.println("Status: WhatTab demo Content matched \n");
		
		click(WebElements.originTab);
		
		String result2 = validateResult(WebElements.originTabDemo);
		System.out.println("OriginTab demo : \n"+ result2);
		//Assert.assertEquals(result2,"Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of \"de Finibus Bonorum et Malorum\" (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum, \"Lorem ipsum dolor sit amet..\", comes from a line in section 1.10.32.\r\n.The standard chunk of Lorem Ipsum used since the 1500s is reproduced below for those interested. Sections 1.10.32 and 1.10.33 from \"de Finibus Bonorum et Malorum\" by Cicero are also reproduced in their exact original form, accompanied by English versions from the 1914 translation by H. Rackham.");
		
		
		click(WebElements.useTab);
		String result3 = validateResult(WebElements.useTabDemo);
		System.out.println("UseTab demo : \n"+ result3);
		//Assert.assertEquals(result3,"It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using 'Content here, content here', making it look like readable English. Many desktop publishing packages and web page editors now use Lorem Ipsum as their default model text, and a search for 'lorem ipsum' will uncover many web sites still in their infancy. Various versions have evolved over the years, sometimes by accident, sometimes on purpose (injected humour and the like).");
		//System.out.println("UseTab demo Content matched \n");
		
		click(WebElements.whatTab);
	}
	
}
