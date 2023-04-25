package TestScripts;

import org.testng.annotations.Test;

import genericLibrary.WebDriverUtilities;
import objectRepository.WebElements;

public class Interactions extends WebDriverUtilities {

	@Test (priority=1)
	public void sortable () throws InterruptedException{

		scrollView(WebElements.interactions);

		scrollView(WebElements.sortable);

		dragAndDrop(WebElements.list,WebElements.oneList,WebElements.sixList);

		dragAndDrop(WebElements.list,WebElements.oneList,WebElements.fiveList);

		dragAndDrop(WebElements.list,WebElements.oneList,WebElements.fourList);

		dragAndDrop(WebElements.list,WebElements.oneList,WebElements.threeList);

		dragAndDrop(WebElements.list,WebElements.oneList,WebElements.twoList);

		scrollBar(WebElements.grid);

		click(WebElements.grid);

		dragAndDrop(WebElements.grid,WebElements.oneGrid,WebElements.nineGrid);

		dragAndDrop(WebElements.grid,WebElements.oneGrid,WebElements.eightGrid);

		dragAndDrop(WebElements.grid,WebElements.oneGrid,WebElements.sevenGrid);

		dragAndDrop(WebElements.grid,WebElements.oneGrid,WebElements.sixGrid);

		dragAndDrop(WebElements.grid,WebElements.twoGrid,WebElements.fiveGrid);

		dragAndDrop(WebElements.grid,WebElements.threeGrid,WebElements.fourGrid);

		dragAndDrop(WebElements.grid,WebElements.oneGrid,WebElements.threeGrid);

		dragAndDrop(WebElements.grid,WebElements.oneGrid,WebElements.twoGrid);

	}

	@Test(priority=2)
	public void selectable() {

		//scrollView(WebElements.interactions);

		scrollView(WebElements.selectable);

		click(WebElements.selectableListText1);

		click(WebElements.selectableListText2);

		click(WebElements.selectableListText3);

		click(WebElements.selectableListText4);

		click(WebElements.selectableGrid);

		click(WebElements.oneGridSelectable);

		click(WebElements.threeGridSelectable);

		click(WebElements.fiveGridSelectable);

		scrollView(WebElements.sevenGridSelectable);

		scrollView(WebElements.nineGridSelectable);									
	}

	@Test(enabled=false)
	public void resizable() {

		scrollView(WebElements.interactions);

		scrollView(WebElements.resizable);

		scrollBar(WebElements.restrictedResizeBox);

//		String initialHeightOfRestBox = getHeight(WebElements.restrictedResizeBox);
//
//		String initialWidthRestBox = getWidth(WebElements.restrictedResizeBox);
//
//		resize(WebElements.restrictedResizeBoxArrow,200,210);
//
//		String newHeightRestBox = getHeight(WebElements.restrictedResizeBox);
//
//		String newWidthRestBox = getWidth(WebElements.restrictedResizeBox);

//		if (!newWidthRestBox.equals(initialWidthRestBox)  && !newHeightRestBox.equals(initialHeightOfRestBox)){
//			System.out.println("Resize successful");
//		} else {
//			System.out.println("Resize failed");
//		}

		//		scrollBar(WebElements.UnrestrictedSizeBox);
		//		
		//		resizableAction(WebElements.UnrestrictedSizeBox,200,250);

	}

	@Test(priority=3)
	public void Droppable() {

		//Simple Tab Droppable

		//scrollView(WebElements.interactions);

		scrollView(WebElements.droppable);

		if(isDisplayed(WebElements.droppableEle)) {

			String initialText = getTextFromElement(WebElements.droppableEle);

			System.out.println("Before action: "+initialText);

			dragAndDrop(WebElements.simpleDropContainer,WebElements.draggableEle,WebElements.droppableEle);

			String finalText = getTextFromElement(WebElements.droppableEle);

			System.out.println("After action: "+finalText);

		}

		colorChangeOfElement(WebElements.droppableEle,"#fff");

		System.out.println("============================================================Simple Tab TestCase Complete======================================================================================");

		//Accept Tab Droppable

		click(WebElements.acceptTabDropable);

		//case-1

		if(isDisplayed(WebElements.dropHereEle)) {

			String initialText = getTextFromElement(WebElements.dropHereEle);

			System.out.println("Before action: "+initialText);

			dragAndDrop(WebElements.acceptDropContainer,WebElements.notAcceptableEle,WebElements.dropHereEle);//#fff

			String finalText = getTextFromElement(WebElements.dropHereEle);

			System.out.println("After action: "+finalText);

		}

		colorChangeOfElement(WebElements.dropHereEle,"#fff");
		System.out.println("============================================AcceptTab Case-1 Complete=========================================================================================================");

		//Case-2   

		if(isDisplayed(WebElements.dropHereEle)) {

			String initialText = getTextFromElement(WebElements.dropHereEle);

			System.out.println("Before action: "+initialText);

			dragAndDrop(WebElements.acceptDropContainer,WebElements.acceptableEle,WebElements.dropHereEle);

			String finalText = getTextFromElement(WebElements.dropHereEle);

			System.out.println("After action: "+finalText);

		}

		colorChangeOfElement(WebElements.dropHereEle,"#fff");
		System.out.println("==========================================AcceptTab Case-2 Complete======================================================================================================");

		click(WebElements.preventPropagationTab);

		//Prevent Propogation

		//case-1

		if(isDisplayed(WebElements.notGreedyDropBox)) {

			String initialText = getTextFromElement(WebElements.notGreedyDropBox);

			System.out.println("Before action: "+initialText);

			dragAndDrop(WebElements.ppDropContainer,WebElements.dragBox,WebElements.notGreedyDropBox);

			String finalText = getTextFromElement(WebElements.notGreedyDropBox);

			System.out.println("After action: "+finalText);

		}

		colorChangeOfElement(WebElements.notGreedyDropBox,"#fff");

		System.out.println("==========================================Prevent Propogation case-1 complete========================================================================================================");

		//case-2

		if(isDisplayed(WebElements.notGreedyInnerDropBox)) {

			String initialText = getTextFromElement(WebElements.notGreedyInnerDropBox);

			System.out.println("Before action: "+initialText);

			dragAndDrop(WebElements.ppDropContainer,WebElements.dragBox,WebElements.notGreedyInnerDropBox);

			String finalText = getTextFromElement(WebElements.notGreedyInnerDropBox);

			System.out.println("After action: "+finalText);

		}

		colorChangeOfElement(WebElements.notGreedyInnerDropBox,"#212529");

		System.out.println("=======================================Prevent Propogation case-2 complete===========================================================================================================");

		//case-3

		if(isDisplayed(WebElements.greedyDropBox)) {

			String initialText = getTextFromElement(WebElements.greedyDropBox);

			System.out.println("Before action: "+initialText);

			dragAndDrop(WebElements.ppDropContainer,WebElements.dragBox,WebElements.greedyDropBox);

			String finalText = getTextFromElement(WebElements.greedyDropBox);

			System.out.println("After action: "+finalText);

		}

		colorChangeOfElement(WebElements.greedyDropBox,"#fff");

		System.out.println("=======================================Prevent Propogation case-3 complete===========================================================================================================");

		//case-4

		if(isDisplayed(WebElements.greedyDropBoxInner)) {

			String initialText = getTextFromElement(WebElements.greedyDropBoxInner);

			System.out.println("Before action: "+initialText);

			dragAndDrop(WebElements.ppDropContainer,WebElements.dragBox,WebElements.greedyDropBoxInner);

			String finalText = getTextFromElement(WebElements.greedyDropBoxInner);

			System.out.println("After action: "+finalText);

		}

		colorChangeOfElement(WebElements.greedyDropBoxInner,"#212529");

		System.out.println("=======================================Prevent Propogation case-4 complete===========================================================================================================");

		//Revert Draggable
		
		//case-1
		
		click(WebElements.revertDropableTab);
		
		if(isDisplayed(WebElements.droppableRevert)) {

			String initialText = getTextFromElement(WebElements.droppableRevert);

			System.out.println("Before action: "+initialText);

			dragAndDrop(WebElements.ppDropContainer,WebElements.revertableEle,WebElements.droppableRevert);

			String finalText = getTextFromElement(WebElements.droppableRevert);

			System.out.println("After action: "+finalText);

		}

		colorChangeOfElement(WebElements.droppableRevert,"#fff");

		System.out.println("=======================================Revert Draggable case-1 complete===========================================================================================================");

		//case-2
		
		if(isDisplayed(WebElements.droppableRevert)) {

			String initialText = getTextFromElement(WebElements.droppableRevert);

			System.out.println("Before action: "+initialText);

			dragAndDrop(WebElements.ppDropContainer,WebElements.notRevertableEle,WebElements.droppableRevert);

			String finalText = getTextFromElement(WebElements.droppableRevert);

			System.out.println("After action: "+finalText);

		}

		colorChangeOfElement(WebElements.droppableRevert,"#212529");

		System.out.println("=======================================Revert Draggable case-2 complete===========================================================================================================");

	}

	@Test (priority=4)
	public void Dragabble() {

		//scrollView(WebElements.interactions);

		scrollView(WebElements.dragabble);
		
		//Simple Tab
		
		//Verification
		
		System.out.println("Initial positions of Element \n");
		
		String initialLeft = getLeft(WebElements.dragMeDraggable);
		
		String initialTop = getTop(WebElements.dragMeDraggable);
		
		resize(WebElements.dragMeDraggable,100,100);
		
		System.out.println("\n After Draging action:- \n");
		
        String finalLeft = getLeft(WebElements.dragMeDraggable);
		
		String finalTop = getTop(WebElements.dragMeDraggable);
		
		//Validation
		
		if(!initialLeft.equalsIgnoreCase(finalLeft)&&!initialTop.equalsIgnoreCase(finalTop)) {
			System.out.println("Position changed");
		}
		else {
			System.out.println("Position not changed");
		}
		System.out.println("=============================================Simple Tab Complete===================================================================================================================================================");
       
		click(WebElements.axixRestricted);
		
		//Axis Restricted
		
		//case-1
		
		System.out.println("Initial positions of Element \n");
		
        String initialLeft_X_Axis = getLeft(WebElements.onlyX);
		
		String initialTop_X_Axis = getTop(WebElements.onlyX);
		
		resize(WebElements.onlyX,100,100);
		
		System.out.println("\n After Draging action:- \n");
		
        String finalLeft_X_Axis = getLeft(WebElements.onlyX);
		
		String finalTop_X_Axis = getTop(WebElements.onlyX);
		
		//Validation
		
		if(!initialLeft_X_Axis.equalsIgnoreCase(finalLeft_X_Axis)&&!initialTop_X_Axis.equalsIgnoreCase(finalTop_X_Axis)) {
			System.out.println("Position changed");
		}
		else {
			System.out.println("Position not changed");
		}
		System.out.println("=============================================Axis restricted Case-1 Complete===================================================================================================================================================");
        
        //case-2
		
		System.out.println("Initial positions of Element \n");
		
        String initialLeft_Y_Axis = getLeft(WebElements.onlyY);
		
		String initialTop_Y_Axis = getTop(WebElements.onlyY);
		
		resize(WebElements.onlyY,100,100);
		
		System.out.println("\n After Draging action:- \n");
		
        String finalLeft_Y_Axis = getLeft(WebElements.onlyY);
		
		String finalTop_Y_Axis = getTop(WebElements.onlyY);
		
		//Validation
		
		if(!initialLeft_Y_Axis.equalsIgnoreCase(finalLeft_Y_Axis)&&!initialTop_Y_Axis.equalsIgnoreCase(finalTop_Y_Axis)) {
			System.out.println("Position changed");
		}
		else {
			System.out.println("Position not changed");
		}
		System.out.println("=============================================Axis restricted Case-2 Complete===================================================================================================================================================");
        
		click(WebElements.containerRestricted);
		
		//Container Restricted
		
		//case-1
		
		System.out.println("Initial positions of Element \n");
		
        String initialLeftposOfBox = getLeft(WebElements.dragElementWithinContainer);
		
		String initialTopposOfBox = getTop(WebElements.dragElementWithinContainer);
		
		resize(WebElements.dragElementWithinContainer,100,100);
		
		System.out.println("\n After Draging action:- \n");
		
        String finalLeftposOfBox  = getLeft(WebElements.dragElementWithinContainer);
		
		String finalTopposOfBox = getTop(WebElements.dragElementWithinContainer);
		
		//Validation
		
		if(!initialLeftposOfBox .equalsIgnoreCase(finalLeftposOfBox )&&!initialTopposOfBox .equalsIgnoreCase(finalTopposOfBox )) {
			System.out.println("Position changed");
		}
		else {
			System.out.println("Position not changed");
		}
		System.out.println("=============================================Container restricted Case-1 Complete===================================================================================================================================================");
        
		//case-2
		
		System.out.println("Initial positions of Element \n");
		
		scrollBar(WebElements.textElementWithinContainer);
		
        String initialLeftText = getLeft(WebElements.textElementWithinContainer);
		
		String initialTopText = getTop(WebElements.textElementWithinContainer);
		
		resize(WebElements.textElementWithinContainer,100,100);
		
		System.out.println("\n After Draging action:- \n");
		
        String finalLeftText  = getLeft(WebElements.textElementWithinContainer);
		
		String finalTopText = getTop(WebElements.textElementWithinContainer);
		
		//Validation
		
		if(!initialLeftText .equalsIgnoreCase(finalLeftText )&&!initialTopText .equalsIgnoreCase(finalTopText )) {
			System.out.println("Position changed");
		}
		else {
			System.out.println("Position not changed");
		}
		System.out.println("=============================================Container restricted Case-2 Complete===================================================================================================================================================");
        
		click(WebElements.curserStyleDraggable);
		
		//Cursor Style
		
		//case-1
		
        System.out.println("Initial positions of : \n"+getTextFromElement(WebElements.cursorCenter));
		
		scrollBar(WebElements.cursorCenter);
		
        String initialLeftCenter = getLeft(WebElements.cursorCenter);
		
		String initialTopCenter = getTop(WebElements.cursorCenter);
		
		resize(WebElements.cursorCenter,400,400);
		
		System.out.println("\n After Draging action:- \n");
		
        String finalLeftCenter  = getLeft(WebElements.cursorCenter);
		
		String finalTopCenter = getTop(WebElements.cursorCenter);
		
		//Validation
		
		if(!initialLeftCenter .equalsIgnoreCase(finalLeftCenter )&&!initialTopCenter .equalsIgnoreCase(finalTopCenter )) {
			System.out.println("Position changed");
		}
		else {
			System.out.println("Position not changed");
		}
		System.out.println("=============================================Cursor Style Case-1 Complete===================================================================================================================================================");
        
//case-2
		
        System.out.println("Initial positions of : \n"+getTextFromElement(WebElements.cursorTopLeft));
		
		scrollBar(WebElements.cursorTopLeft);
		
        String initialLeftTopLeft = getLeft(WebElements.cursorTopLeft);
		
		String initialTopTopLeft = getTop(WebElements.cursorTopLeft);
		
		resize(WebElements.cursorTopLeft,400,400);
		
		System.out.println("\n After Draging action:- \n");
		
        String finalLeftTopLeft  = getLeft(WebElements.cursorTopLeft);
		
		String finalTopTopLeft = getTop(WebElements.cursorTopLeft);
		
		//Validation
		
		if(!initialLeftTopLeft .equalsIgnoreCase(finalLeftTopLeft )&&!initialTopTopLeft .equalsIgnoreCase(finalTopTopLeft )) {
			System.out.println("Position changed");
		}
		else {
			System.out.println("Position not changed");
		}
		System.out.println("=============================================Cursor Style Case-2 Complete===================================================================================================================================================");
        
        //case-3
		
        System.out.println("Initial positions of : \n"+getTextFromElement(WebElements.cursorBottom));
		
		scrollBar(WebElements.cursorBottom);
		
        String initialLeftBottom = getLeft(WebElements.cursorBottom);
		
		String initialTopBottom = getTop(WebElements.cursorBottom);
		
		resize(WebElements.cursorBottom,200,200);
		
		System.out.println("\n After Draging action:- \n");
		
        String finalLeftBottom = getLeft(WebElements.cursorBottom);
		
		String finalTopBottom = getTop(WebElements.cursorBottom);
		
		//Validation
		
		if(!initialLeftBottom.equalsIgnoreCase(finalLeftBottom )&&!initialTopBottom .equalsIgnoreCase(finalTopBottom )) {
			System.out.println("Position changed");
		}
		else {
			System.out.println("Position not changed");
		}
		System.out.println("=============================================Cursor Style Case-3 Complete===================================================================================================================================================");
        
	}
}
