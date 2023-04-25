package genericLibrary;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtilities {
	PropertiesFile propertyfile=new PropertiesFile();
	WebDriver driver; // object created for ChromeDriver, opens webbrowser 
	Actions actions;
	Select select;
	JavascriptExecutor js;
	WebDriverWait wait;
	long WAITFOREXPLICITWAITINSEC=5;

	public void dropDownAction(By by,String text) { 
		WebElement dropdown=driver.findElement(by);
		select =new Select(dropdown);
		select.selectByVisibleText(text);
		List<WebElement> list = select.getOptions();
		int size=list.size();
		System.out.println(size);
		for(WebElement ele:list) {
			String result = ele.getText();
			System.out.println(result);
		}
		WebElement firstSelected = select.getFirstSelectedOption();
		System.out.println(firstSelected.getText()+": is the first selecteditem in the list box");
	}


	public void multiSelectDropDown(By by,int index,String value,String text) {
		WebElement list=driver.findElement(by);
		select =new Select(list);
		List<WebElement> options = select.getOptions();
		int size=options.size();
		System.out.println("Number of elements present inside the listbox is : "+ size);

		//Print all the elements present in the list box
		for (WebElement webElement : options) {
			String textMsg = webElement.getText();
			System.out.println(textMsg);
		}
		select.selectByIndex(index);
		select.selectByValue(value);
		select.selectByVisibleText(text);

		System.out.println("************Print all selected options***********");
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		int size2 = allSelectedOptions.size();

		System.out.println("Number of items that is selected in the list box is : "+size2);
		System.out.println(" Selected items are printed below ");
		for (WebElement webElement : allSelectedOptions) {
			System.out.println(webElement.getText());
		}
		System.out.println("check whether it is a multiple select listbox or not");
		boolean multiple = select.isMultiple();
		System.out.println(multiple +" yes , it is multi select");

		if (multiple) {

			//Print the first selected option in the list box
			WebElement firstSelectedOption = select.getFirstSelectedOption();
			System.out.println(firstSelectedOption.getText()+" is the first selecteditem in the list box");

			//deselect the item present in 0th index.
			select.deselectByIndex(index);

			//Print the first selected option in the list box
			WebElement firstSelectedOption1 = select.getFirstSelectedOption();
			System.out.println(firstSelectedOption1.getText()+" is the first selecteditem");

			//deselect an item which has an attribute called value
			select.deselectByValue(value);

			//Print the first selected option in the list box
			WebElement firstSelectedOption2 = select.getFirstSelectedOption();
			System.out.println(firstSelectedOption2.getText()+" is the first selecteditem");
			select.deselectByVisibleText(text);
		}

	}

	public void dropDownActionByValue(By by,String value) {
		WebElement dropdown = driver.findElement(by);
		select =new Select(dropdown);
		select.selectByValue(value);
	}

	public String getAttribute(By by) {
		return driver.findElement(by).getAttribute("value");
	}

	public void acceptPopUp() {
		driver.switchTo().alert().accept();
	}

	public void dismisPopUp() {
		driver.switchTo().alert().dismiss();	
	}

	public void sendTextToPopUp(String text) {
		driver.switchTo().alert().sendKeys(text);
	}

	public String validateResult(By by) {
		WebElement result = driver.findElement(by);
		String actualResult = result.getText();
		return actualResult;

	}

	public void getTextFromPopUp() {  
		String text = driver.switchTo().alert().getText();
		System.out.println(text);
	}

	public void close() {
		if(driver!=null)
			driver.close(); 
	}

	public void quit() {
		if(driver!=null)
			driver.quit();
	}

	public void clear(By by) {
		driver.findElement(by).clear();
	}

	public void clearText(By ele,String text) {
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.textToBePresentInElementValue(ele, text));
		driver.findElement(ele).clear();
	}

	public void click(By element) {
		//isEnabled(element);
		driver.findElement(element).click();
	}

	public void sendKeys(By by,String Text) {
		driver.findElement(by).sendKeys(Text);
	}

	public void isAlertPresent() {
		wait=new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		wait.until(ExpectedConditions.alertIsPresent());
	}

	public boolean isSelected(By by) {
		return driver.findElement(by).isSelected();
	}

	public boolean isDisplayed(By by) {
		return driver.findElement(by).isDisplayed();
	}

	public boolean isEnabled(By by) {
		return driver.findElement(by).isEnabled();
	}

	public String getTextFromElement(By by) {
		String text = driver.findElement(by).getText();
		return text;
	}

	public void waitUntilElementIsVisible(By by) {
		wait=new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

	public void waitUntilElementToClickable(By by) {
		wait =new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	public void waitUntilFrameToBeAvailableAndSwitchToIt(By by) {
		wait=new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
	}

	public void waitElementToBeSelected(By by) {
		wait=new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		wait.until(ExpectedConditions.elementToBeSelected(by));
	}
	public void waitUntilPresenceOfElement(By by) {
		wait=new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	} 

	public boolean waitUntilInvisibilityOfElement(By by) {
		wait=new WebDriverWait(driver, WAITFOREXPLICITWAITINSEC);
		return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
	}

	public boolean isMultiple(By by) {
		select=new Select (driver.findElement(by));
		return select.isMultiple();
	}

	public String getTheCurrentWebPageTitle() {
		return driver.getTitle();
	}

	public void colorChangeOfElement(By by,String expected) {
		WebElement element = driver.findElement(by);	
		String color=element.getCssValue("color");
		String hex = Color.fromString(color).asHex();
		System.out.println(hex);
		if(hex.equals(expected)) {
			System.out.println("colour matched");
		}
		else {
			System.out.println("colour changed");
		}
	}
	
	public String borderColorOfElement(By by) {
		WebElement element = driver.findElement(by);
		String borderColor=element.getCssValue("border-color");
		String hex = Color.fromString(borderColor).asHex();
		System.out.println("borderColor : "+hex);
		return hex;
	}

	public String getTheCurrentWebPageUrl(){
		return driver.getCurrentUrl();
	}

	public void mouseOver(By by) {
		WebElement element=driver.findElement(by);
		actions=new Actions(driver);
		actions.moveToElement(element).perform();
	}

	public void mouseOverElementText(By by) {
		WebElement element=driver.findElement(by);
		actions=new Actions(driver);
		actions.moveToElement(element).perform();
		String text = element.getText();
		System.out.println("you are mouse over to :"+text+" Element");
	}

	public void rightClick(By by) {
		WebElement element=driver.findElement(by);
		actions=new Actions(driver);
		actions.contextClick(element).perform();
	}

	public void doubleClick(By by) {
		WebElement element=driver.findElement(by);
		actions=new Actions(driver);
		actions.doubleClick(element).perform();
	}

	public void dragAndDrop(By by,By by1,By by2) {
		WebElement sortableList = driver.findElement(by);
		actions = new Actions(driver);
		actions.dragAndDrop(sortableList.findElement(by1), sortableList.findElement(by2)).build().perform();
	}
	
	public void resize(By by,int horizontal,int vertical) {
		WebElement resizable = driver.findElement(by);
		actions = new Actions(driver);
		actions.clickAndHold(resizable).moveByOffset(horizontal, vertical).release().build().perform();
    }

	public void resizableAction(By by,int horizontal,int vertical) {
		//Identify the resizable element
		WebElement resizable = driver.findElement(by);

		//Create an object of the Actions class
		actions = new Actions(driver);

		// Get the initial size of the element
		int initialWidth = resizable.getSize().getWidth();
		int initialHeight = resizable.getSize().getHeight();

		//Perform click and hold on the resizable element
		actions.clickAndHold(resizable).moveByOffset(horizontal, vertical).release().build().perform();

		//		//Move the resizable element by an offset
		//		actions.moveByOffset(horizontal, vertical).build().perform();
		//
		//		//Release the resizable element
		//		actions.release().build().perform();

		// Get the new size of the element
		int newWidth = resizable.getSize().getWidth();
		int newHeight = resizable.getSize().getHeight();

		System.out.println(initialWidth);
		System.out.println(initialHeight);
		System.out.println(newWidth);
		System.out.println(newHeight);

		// Validate the action by checking that the size has changed
		if (newWidth > initialWidth && newHeight > initialHeight) {
			System.out.println("Resize successful");
		} else {
			System.out.println("Resize failed");
		}

		//		actions = new Actions(driver);
		//		WebElement element = driver.findElement(by);
		//
		//		// Get the location and size of the element
		//		Point location = element.getLocation();
		//		Dimension size = element.getSize();
		//
		//		// Calculate the target location
		//		int targetX = location.getX() + (size.getWidth() / 2);
		//		int targetY = location.getY() + (size.getHeight() / 2);
		//
		//		// Move the mouse to the target location
		//		actions.moveToElement(element, targetX, targetY).build().perform();


	}

	public void autoSuggestions(By by,String text) {
		select=new Select(driver.findElement(by));
		select.selectByVisibleText(text);
	}

	public void sendKeysArrowDown(By by,Keys arrowDown) {
		driver.findElement(by).sendKeys(arrowDown);

	}

	public void sendKeysEnter(By by,String text) {
		driver.findElement(by).sendKeys(text);
		driver.findElement(by).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(by).sendKeys(Keys.ENTER);

	}


	public void switchBetweenFrames(int index) {
		driver.switchTo().frame(index);
	}

	public void switchBackToDefaultContent() {
		driver.switchTo().defaultContent();
	}

	public void switchBetweenTab() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		if(child.size()==2) {
			for(String b:child) {
				if(!b.equals(parent)) {
					driver.switchTo().window(b);
					String title = driver.getTitle();
					String currentUrl = driver.getCurrentUrl();
					System.out.println(title);
					System.out.println(currentUrl);
					close();
				}
			}
		}
		driver.switchTo().window(parent);
	}

	public void switchBetweenTabs() {
		String targetWindowHandle=driver.getWindowHandle();
		// Get a list of all available windows
		Set<String> handles = driver.getWindowHandles();

		// Check if the window you want to interact with is still open
		if (!handles.contains(targetWindowHandle)) {
			// The window has been closed, so handle the situation accordingly
			System.out.println("Target window has been closed");
		} else {
			// Switch to the target window and interact with it
			driver.switchTo().window(targetWindowHandle);
			// Perform actions on the target window
		}
	}

	public void arrowDown(By by) {
		WebElement textbox=driver.findElement(by);
		textbox.sendKeys(Keys.ARROW_DOWN);
		textbox.sendKeys(Keys.ENTER);
	}

	public void scrollView(By by) {
		WebElement element = driver.findElement(by);
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
	}

	public void clickByJavascript(By by) {
		WebElement element = driver.findElement(by);
		js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementById(\"submit\").click();", element);
	}

	public void sliderByJavaScript(By by) {
		WebElement slider = driver.findElement(by);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('value', '100')", slider);
	}

	public void sliderByDragAndDrop(By by) {
		WebElement slider = driver.findElement(by);
		actions = new Actions(driver);
		actions.dragAndDropBy(slider, 25, 0).perform();
	}

	public void sliderByClickAndHold(By by) {
		WebElement slider = driver.findElement(by);
		Actions actions = new Actions(driver);
		actions.clickAndHold(slider).moveByOffset(50, 0).release().perform();
	}

	public void scrollBar(By by) {
		WebElement element = driver.findElement(by);
		int x=element.getLocation().getX();
		int y=element.getLocation().getY();
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}

	public void navigateToBackwardOnWebPage() {
		driver.navigate().back();
	}

	public void nevigateToForwardOnWebPage() {
		driver.navigate().forward();
	}

	public void reloadWebPage() {
		driver.navigate().refresh();
	}

	public void webTableHandle(By by,By data,int columnsize,String arg,int rowSize,String dataValue,By secondRow,String rowValue) {

		// To find all headers
		List<WebElement> allHeaders = driver.findElements(by);
		// To find count of headers
		System.out.println("No of headers are= "+allHeaders.size());
		Assert.assertEquals(allHeaders.size(), columnsize,"Column count is not same");
		System.out.println("=========================================================================================================================================================");

		//verification
		boolean status=false;

		// To Find data in the Table
		System.out.print("Header List: \n");
		for(WebElement ele: allHeaders) {
			String value=ele.getText();
			System.out.println(value);
			//validation
			if(value.contains(arg)) {
				status=true;
				break;
			}
		}
		//for checking invalid header
		Assert.assertTrue(status,"Header is not present");
		System.out.println("=======================================================================================================================================================");

		//count no of rows
		List<WebElement> numberOfRows = driver.findElements(by);

		System.out.println("Total count of rows "+numberOfRows.size());
		Assert.assertEquals(numberOfRows.size(),rowSize,"Table row count mismatched");

		System.out.println("=======================================================================================================================================================");

		// read all the data
		List<WebElement> allData = driver.findElements(data);
		System.out.println("All data count: \n"+allData.size());

		System.out.println("=======================================================================================================================================================");
		//verification
		//boolean dataStatus=false;

		// To Find data in the Table
		System.out.print("List of Data: \n");
		for(WebElement ele: allData) {
			String val=ele.getText();
			System.out.println(val);
			//validation
			if(val.contains(dataValue)) {
				status=true;
				break;
			}
		}
		//for checking invalid header
		//Assert.assertTrue(dataStatus,"Data is not present");

		System.out.println("=======================================================================================================================================================");
		//verification

		List<WebElement> rowData = driver.findElements(secondRow);
		System.out.println("All data count: \n"+rowData.size());

		boolean rowStatus=false;

		// To Find data in the Table
		System.out.print("List of Data: \n");
		for(WebElement ele: rowData) {
			String val=ele.getText();
			System.out.println(val);
			//validation
			if(val.contains(rowValue)) {
				status=true;
				break;
			}
		}
		//Assert.assertTrue(rowStatus,"row Data is not present");
	}

	public void switchWindows() {
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		Iterator<String>itr=child.iterator();
		while(itr.hasNext()) {
			String child2 = itr.next();
			if(!parent.equalsIgnoreCase(child2)) {
				driver.switchTo().window(child2);
				String title = driver.getTitle();
				String currentUrl = driver.getCurrentUrl();
				System.out.println(title);
				System.out.println(currentUrl);
			}
		}
		//driver.switchTo().window(parent);
	}

	public void brokenLinks(By by) {
		List<WebElement> links = driver.findElements(by);
		System.out.println("No of links are "+links.size());

		List<String>urlList=new ArrayList<String>();

		for(WebElement e:links) {
			String url=e.getAttribute("href");
			//urlList.add(url);
			checkBrokenLink(url);
		}

		long startTime=System.currentTimeMillis();
		urlList.parallelStream().forEach(e -> checkBrokenLink(e));
		long endTime=System.currentTimeMillis();

		System.out.println("total time taken: "+(endTime-startTime));
	}

	public void checkBrokenLink(String linkUrl) {

		try {
			URL url=new URL(linkUrl);
			url.openConnection();
			HttpURLConnection httpUrlConnection=(HttpURLConnection)url.openConnection();
			httpUrlConnection.setConnectTimeout(5000);
			httpUrlConnection.connect();

			if(httpUrlConnection.getResponseCode()>=400) {
				System.out.println(linkUrl+" ----> "+httpUrlConnection.getResponseMessage()+" is a broken link");
			}
			else {
				System.out.println(linkUrl+" ---> "+httpUrlConnection.getResponseMessage());
			}
		}
		catch(Exception e) {

		}
	}

	public void mouseOverText(By by) {
		//		js = (JavascriptExecutor) driver;
		//        String tooltipText = js.executeScript("return arguments[0].getAttribute('title');", by).toString();
		//        System.out.println("Tooltip text: " + tooltipText);

		//        WebElement elementWithText = driver.findElement(by);
		//        js = (JavascriptExecutor) driver;
		//        js.executeScript("arguments[0].scrollIntoView();", elementWithText);
		//
		//        // Trigger mouseover event using JavaScript
		//        String mouseOverScript = "if(document.createEvent){var evObj = document.createEvent('MouseEvents');evObj.initEvent('mouseover', true, false); arguments[0].dispatchEvent(evObj);} else if(document.createEventObject) { arguments[0].fireEvent('onmouseover');}";
		//        js.executeScript(mouseOverScript, elementWithText);
		//       
		//	    js = (JavascriptExecutor) driver;
		//		String newText = (String) js.executeScript("return arguments[0].textContent", by);
		//
		//		 Print the new text
		//		System.out.println(newText);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String newLabelText = (String) js.executeScript("return arguments[0].innerHTML;", by);
		System.out.println(newLabelText);
	}

	public void waitUntilProcessComplete(By by) {
		// Locate the progress bar element
		WebElement progressBar = driver.findElement(by);

		// Wait for the progress bar to complete
		// wait = new WebDriverWait(driver, 10);
		// wait.until(ExpectedConditions.attributeToBe(progressBar, "style", "width: 100%;"));

		// Wait for the progress bar to become visible
		wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.visibilityOf(progressBar));

		// Loop until the progress bar is complete
		while (progressBar.isDisplayed()) {
			// Get the current progress of the bar (as a percentage)
			String progress = progressBar.getAttribute("aria-valuenow");

			// Update the progress bar status
			System.out.println("Progress: " + progress + "%");
		}
	}
	
	public int getWidth(By by) {
		WebElement element = driver.findElement(by);
	    //String width = element.getAttribute("width");
	    int width = element.getSize().getWidth();
		return width;
	}
	
	 public int getHeight(By by) {
		WebElement element = driver.findElement(by);
		//String Height =element.getAttribute("height");
		int Height = element.getSize().getHeight();
		return Height;
	 }
	 
	 public String getLeft(By by) {
		 WebElement element = driver.findElement(by); 
		 String leftStyle = element.getCssValue("left");
		 System.out.println("Left position: "+leftStyle);
		return leftStyle;
	 }
	 
	 public String getTop(By by) {
		 WebElement element = driver.findElement(by);
		 String topStyle = element.getCssValue("top"); 
		 System.out.println("Top position: "+topStyle);
		return topStyle;
	 }
	 public String readDataFromExcelSheet(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException {
		 FileInputStream fis=new FileInputStream("C:\\Users\\yoges\\eclipse-workspace\\ToolsQA\\DemoQa.xlsx\\");
		 Workbook wb=WorkbookFactory.create(fis); 
		 String data=wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data;
	 }
	 
	 public void getScreenshots(String fileName) throws IOException {
		 Date date=new Date();
		 SimpleDateFormat simpleDate=new SimpleDateFormat("dd-mm-yy HH:MM:SS");
		 String today=simpleDate.format(date);
		 System.out.println(today);
		 TakesScreenshot ts=(TakesScreenshot)driver;
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 File dest=new File(AutoConstant.photoPath+fileName+".png");
		 FileUtils.copyFile(src, dest);
		 System.out.println("Screenshot taken");
	 }

	@BeforeClass 
	public void initApplication() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(propertyfile.getPropertydata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void resultAndScreenshotOfFaildTest(ITestResult result) throws IOException {
		if(ITestResult.FAILURE==result.getStatus()) {
			getScreenshots(result.getName());
		}
	}

	@AfterClass
	public void closeApp() throws IOException {
		quit();
	}
}
