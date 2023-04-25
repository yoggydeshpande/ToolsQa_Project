package objectRepository;

import org.openqa.selenium.By;

public class WebElements {

	public static By elements=By.xpath("//h5[text()='Elements']");
	
	public static By fullName=By.id("userName");
	
	public static By emailId=By.id("userEmail");
	
	public static By currentAddress=By.id("currentAddress");
	
	public static By permanent=By.id("permanentAddress");
	
	public static By submit=By.id("submit");
	
	public static By expandBtnOrPlusBtn=By.xpath("//button[@title='Expand all']");
	
	public static By toggleBtn2=By.xpath("(//button[@title='Toggle'])[2]");
	
	public static By toggleBtn1=By.xpath("(//button[@title='Toggle'])[1]");
	
	public static By toggleBtn3=By.xpath("(//button[@title='Toggle'])[3]");
	
	public static By toggleBtn4=By.xpath("(//button[@title='Toggle'])[4]");
	
	public static By toggleBtn5=By.xpath("(//button[@title='Toggle'])[5]");
	
	public static By toggleBtn6=By.xpath("(//button[@aria-label='Toggle'])[6]");
	
	public static By homeCheckBox=By.xpath("//span[text()='Home']");
	
	public static By desktopCheckBox=By.xpath("//span[text()='Desktop']");
	
	public static By notesCheckBox=By.xpath("//span[text()='Notes']");
	
	public static By commandsCheckBox=By.xpath("//span[text()='Commands']");
	
	public static By documentsCheckBox=By.xpath("//span[text()='Documents']");
	
	public static By workspaceCheckBox=By.xpath("//span[text()='WorkSpace']");
	
	public static By reactCheckBox=By.xpath("//span[text()='React']");
	
	public static By angularCheckBox=By.xpath("//span[text()='Angular']");
	
	public static By veuCheckBox=By.xpath("//span[text()='Veu']");
	
	public static By officeCheckBox=By.xpath("//span[text()='Office']");
	
	public static By publicCheckBox=By.xpath("//span[text()='Public']");
	
	public static By privateCheckBox=By.xpath("//span[text()='Private']");
	
	public static By classifiedCheckBox=By.xpath("//span[text()='Classified']");
	
	public static By generalCheckBox=By.xpath("//span[text()='General']");
	
	public static By downloadsCheckBox=By.xpath("//span[text()='Downloads']");
	
	public static By wordCheckBox=By.xpath("//span[text()='Word File.doc']");
	
	public static By excelCheckBox=By.xpath("//span[text()='Excel File.doc']");
	
	public static By textbox=By.xpath("(//li[@class='btn btn-light '])[1]");
	
	public static By radioBtn=By.xpath("//span[text()='Radio Button']");
	
	public static By yesRadioBtn=By.id("yesRadio");
	
	public static By impressiveRadioBtn=By.id("impressiveRadio");
	
	public static By noRadioBtn=By.id("noRadio");
	
	public static By detailsConfirmMsg=By.xpath("//p[@id='name']");
	
	public static By result=By.id("result");
	
	public static By checkBox=By.xpath("//span[text()='Check Box']");

	public static By yesResult=By.xpath("//span[text()='Yes']");

	public static By impressiveResult=By.xpath("//span[text()='Impressive']");
	
	public static By doubleClick=By.id("doubleClickBtn");
	
	public static By rightClickMsg=By.id("rightClickMessage");
	
	public static By dynamicClickMsg=By.id("dynamicClickMessage");
	
	public static By doubleClickMsg=By.id("doubleClickMessage");
	
	public static By clickMe=By.xpath("//button[text()='Click Me']");
	
	public static By buttons=By.xpath("//span[text()='Buttons']");
	
	public static By rightClick=By.id("rightClickBtn");
	
	public static By download=By.xpath("//a[text()='Download']");
	
	public static By uploadFile=By.id("uploadFile");
	
	public static By uploadAndDownload=By.xpath("//span[text()='Upload and Download']");
	
	public static By webTables=By.xpath("//span[text()='Web Tables']");
	
	public static By addRecordBtn=By.id("addNewRecordButton");
	
	public static By firstNameRegForm=By.id("firstName");
	
	public static By lastNameRegForm=By.id("lastName");
	
	public static By emailRegForm=By.id("userEmail");
	
	public static By ageRegForm=By.id("age");
	
	public static By salaryRegForm=By.id("salary");
	
	public static By departmentRegForm=By.id("department");
	
	public static By submitRegForm=By.id("submit");
	
	public static By editRecord1=By.xpath("(//span[contains(@id,'edit-record')])[1]");
	
	public static By deleteRecord1=By.xpath("(//span[@title='Delete'])[1]");
	
	public static By table=By.xpath("//div[contains(@class,'ReactTable -striped')]");
	
	public static By tableHeaders=By.xpath("//div[contains(@class,'thead -header')]");
	
	public static By allTableData=By.xpath("//div[contains(@class,'rt-tbody')]");
	
	public static By secondRow=By.xpath("//div[@class='rt-tr -even']");
	
	public static By visibleAfter=By.id("visibleAfter");
	
	public static By colourChange=By.id("colorChange");
	
	public static By enableAfter=By.id("enableAfter");
	
	public static By dynamicProperties=By.xpath("//span[text()='Dynamic Properties']");

	public static By brokenLinksImages=By.xpath("//span[text()='Broken Links - Images']");
	
	public static By validLink=By.xpath("//a[text()='Click Here for Valid Link']");
	
    public static By brokenLink=By.xpath("//a[text()='Click Here for Broken Link']");
	
	public static By hereLink=By.xpath("//a[text()='here']");

	public static By elementalSelenium=By.xpath("//a[text()='Elemental Selenium']");

	public static By homeLink=By.xpath("//span[text()='Home']");
	
	public static By movedLink=By.id("moved");
	
	public static By badReqLink=By.id("bad-request");
	
	public static By unauthorizedLink=By.id("unauthorized");
	
	public static By sauceLab=By.xpath(" //a[text()='Sauce Labs']");
	
	public static By linkTag=By.tagName("a");
	
	public static By links=By.xpath("//span[text()='Links']");
	
	public static By homeQePLOLink=By.id("dynamicLink");
	
	public static By createdLink=By.id("created");
	
	public static By noContentLink=By.id("no-content");
	
	public static By forbidden=By.id("forbidden");
	
	public static By notFound=By.id("invalid-url");
	
	public static By createdResponse=By.xpath("//b[text()='Created']");
	
	public static By noContentResponse=By.xpath("//b[text()='No Content']");
	
	public static By movedResponse=By.xpath("//b[text()='Moved Permanently']");
	
	public static By badReqResponse=By.xpath("//b[text()='Bad Request']");
	
	public static By unauthorizedResponse=By.xpath("//b[text()='Unauthorized']");
	
	public static By forbiddenResponse=By.xpath("//b[text()='Forbidden']");
	
	public static By notFoundResponse=By.xpath("//b[text()='Not Found']");
	
	public static By home=By.id("simpleLink");
	
	public static By forms=By.xpath("(//div[@class='card mt-4 top-card'])[2]");
	
	public static By practiceForm=By.xpath("//span[text()='Practice Form']");
	
	public static By nameSRF=By.id("firstName");
	
	public static By lastNameSRF=By.id("lastName");
	
	public static By emailSRF=By.id("userEmail");
	
	public static By genderSRF=By.xpath("//label[@for='gender-radio-1']");
	
	public static By mobileSRF=By.id("userNumber");
	
	public static By dobSRF=By.id("dateOfBirthInput");
	
	public static By monthSRF=By.xpath("//select[@class='react-datepicker__month-select']");
	
	public static By yearSRF=By.xpath("//select[@class='react-datepicker__year-select']");
	
	public static By daySRF=By.xpath("//div[text()='27']");
	
	public static By subjectSRF=By.id("subjectsInput");
	
	public static By hobbiesSportSRF=By.xpath("//label[text()='Sports']");
	
	public static By pictureSRF=By.id("uploadPicture");
	
	public static By currentAddressSRF=By.id("currentAddress");
	
	public static By stateSRF=By.id("react-select-3-input");
	
	public static By citySRF=By.id("react-select-4-input");
	
	public static By submitSRF=By.id("submit");
	
	public static By hobbiesMusicSRF=By.xpath("//label[text()='Music']");
	
	public static By alertFrameAndWindows=By.xpath("(//div[@class='avatar mx-auto white'])[3]");
	
	public static By tabBtn=By.id("tabButton");
	
	public static By windowBtn=By.id("windowButton");
	
	public static By windowMsgBtn=By.id("messageWindowButton");
	
	public static By alertBtn=By.id("alertButton");
	
	public static By timerAlertBtn=By.id("timerAlertButton");
	
	public static By confirmAlertBtn=By.id("confirmButton");
	
	public static By promtAlertBtn=By.id("promtButton");
	
	public static By framesOption=By.xpath("//span[text()='Frames']");
	
	public static By browserWindows=By.xpath("//span[text()='Browser Windows']");
	
	public static By alerts=By.xpath("//span[text()='Alerts']");
	
	public static By nestedFrames=By.xpath("//span[text()='Nested Frames']");
	
	public static By modalDialogs=By.xpath("//span[text()='Modal Dialogs']");
	
	public static By confirmResult=By.id("confirmResult");
	
	public static By promptResult=By.id("promptResult");
	
	public static By smallModal=By.id("showSmallModal");
	
	public static By largeModal=By.id("showLargeModal");
	
	public static By parentSampleHeading=By.xpath("//*[@id=\"sampleHeading\"]");
	
	public static By fristChildFrame=By.id("frame2Wrapper");
	
	public static By secondChildFrame=By.id("frame2");
	
	public static By nestedParentFrame=By.id("frame1");
	
	public static By nestedChildFrame=By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']");
	
	public static By smallModalResult=By.xpath("//div[@class='modal-body']");
	
	public static By largeModelresult =By.xpath("//div[@class='modal-body']");
	
	public static By closeSmallModal=By.id("closeSmallModal");
	
	public static By closeLargeModal=By.id("closeLargeModal");
	
	public static By widgets=By.xpath("(//div[@class='card-body'])[4]");
	
	public static By accordian=By.xpath("//span[text()='Accordian']");
	
	public static By autoComplete=By.xpath("//span[text()='Auto Complete']");
	
	public static By datePicker=By.xpath("//span[text()='Date Picker']");
	
	public static By slider=By.xpath("//span[text()='Slider']");
	
	public static By progressBar=By.xpath("//span[text()='Progress Bar']");
	
	public static By tabs=By.xpath("//span[text()='Tabs']");
	
	public static By toolTips=By.xpath("//span[text()='Tool Tips']");
	
	public static By menu=By.xpath("//span[text()='Menu']");
	
	public static By selectMenu=By.xpath("//span[text()='Select Menu']");
	
	public static By loremContent=By.id("section1Content");
	
	public static By comeFromHeading=By.id("section2Heading");
	
	public static By useHeading=By.id("section3Heading");
	
	public static By comeFromContent=By.id("section2Content");
	
	public static By useContent=By.id("section3Content");

	public static By multipleColorName=By.id("autoCompleteMultipleInput");

	public static By singleColorName=By.id("autoCompleteSingleInput");
	
	public static By monthDatePicker=By.xpath("//select[@class='react-datepicker__month-select']");
	
	public static By yearDatePicker=By.xpath("//select[@class='react-datepicker__year-select']");
	
	public static By dayDatePicker=By.xpath("(//div[text()='27'])[2]");
	
	public static By sliderElement=By.id("sliderContainer");
	
    public static By loremHeading=By.id("section1Heading");
	
	public static By dateAndTimePicker=By.id("dateAndTimePickerInput");
	
	public static By dayDateTimepicker=By.xpath("(//div[text()='28'])[2]");
	
	public static By monthDateTimepicker=By.xpath("//div[text()='September']");
	
	public static By yearDateTimepicker=By.xpath("//div[text()='2018']");
	
	public static By timeDateTimepicker=By.xpath("//li[text()='20:45']");
	
	public static By monthArrow=By.xpath("//span[@class='react-datepicker__month-read-view--down-arrow']");
	
	public static By yearArrow=By.xpath("//span[@class='react-datepicker__year-read-view--down-arrow']");
	
	public static By selectDate=By.id("datePickerMonthYearInput");
	
	public static By dateAndTime=By.id("dateAndTimePickerInput");
	
	public static By previousYears=By.xpath("//a[contains(@class,'previ')]");
	
	public static By upcomingYears=By.xpath("//a[contains(@class,'upcom')]");
	
	public static By toolTipBtn=By.id("toolTipButton");
	
	public static By textBoxToolTip=By.id("toolTipTextField");
	
	public static By contraryToolTip=By.xpath("//a[text()='Contrary']");
	
	public static By tooltipElement=By.xpath("//a[text()='1.10.32']");
	
	public static By progressBarEle=By.id("progressBar");
	
	public static By startPgBar=By.id("startStopButton");
	
	public static By resetBtn=By.id("resetButton");
	
	public static By originTab=By.id("demo-tab-origin");
	
	public static By useTab=By.id("demo-tab-use");
	
	public static By whatTab=By.id("demo-tab-what");
	
	public static By selectValue=By.xpath("(//div[@class=' css-tlfecz-indicatorContainer'])[1]");
	
	public static By selectOne=By.id("react-select-3-input");
	
	public static By oldSelectMenu=By.id("oldSelectMenu");
	
	public static By multiSelect=By.id("react-select-4-input");
	
	public static By standardMultiSelect=By.id("cars");
	
	public static By selectValOpt=By.xpath("//div[text()='A root option']");
	
	public static By mainItem1=By.xpath("//a[text()='Main Item 1']");
	
	public static By mainItem2=By.xpath("//a[text()='Main Item 2']");
	
	public static By subSubList=By.xpath("//a[text()='SUB SUB LIST »']");
	
	public static By subSubItem1=By.xpath("//a[text()='Sub Sub Item 1']");
	
	public static By subSubItem2=By.xpath("//a[text()='Sub Sub Item 2']");
	
	public static By subItem=By.xpath("(//a[text()='Sub Item'])[2]");
	
	public static By mainItem3=By.xpath("//a[text()='Main Item 3']");
	
	public static By whatTabDemo=By.id("demo-tabpane-what");
	
	public static By originTabDemo=By.id("demo-tabpane-origin");
	
	public static By useTabDemo=By.id("demo-tabpane-use");
	
	public static By interactions=By.xpath("(//div[@class='card-body'])[5]");
	
	public static By bookStoreApplication=By.xpath("(//div[@class='card-body'])[6]");
	
	public static By sortable=By.xpath("//span[text()='Sortable']");
	
	public static By selectable=By.xpath("//span[text()='Selectable']");
	
	public static By resizable=By.xpath("//span[text()='Resizable']");
	
	public static By droppable=By.xpath("//span[text()='Droppable']");
	
	public static By dragabble=By.xpath("//span[text()='Dragabble']");
	
	public static By oneList=By.xpath("//div[text()='One']");
	
	public static By twoList=By.xpath("//div[text()='Two']");
	
	public static By threeList=By.xpath("//div[text()='One']");
	
	public static By fourList=By.xpath("//div[text()='Three']");
	
	public static By fiveList=By.xpath("//div[text()='Four']");
	
	public static By sixList=By.xpath("//div[text()='Six']");
	
	public static By grid=By.id("demo-tab-grid");
	
	public static By oneGrid=By.xpath("(//div[text()='One'])[2]");
	
	public static By twoGrid=By.xpath("(//div[text()='Two'])[2]");
	
	public static By threeGrid=By.xpath("(//div[text()='Three'])[2]");
	
	public static By fourGrid=By.xpath("(//div[text()='Four'])[2]");
	
	public static By fiveGrid=By.xpath("(//div[text()='Five'])[2]");
	
	public static By sixGrid=By.xpath("(//div[text()='Six'])[2]");
	
	public static By sevenGrid=By.xpath("//div[text()='Seven']");
	
	public static By eightGrid=By.xpath("//div[text()='Eight']");
	
	public static By nineGrid=By.xpath("//div[text()='Nine']");
	
	public static By list=By.id("demo-tab-list");
	
	public static By selectableListText1=By.xpath("//li[text()='Cras justo odio']");
	
	public static By selectableListText2=By.xpath("//li[text()='Dapibus ac facilisis in']");
	
	public static By selectableListText3=By.xpath("//li[text()='Morbi leo risus']");
	
	public static By selectableListText4=By.xpath("//li[text()='Porta ac consectetur ac']");
	
	public static By oneGridSelectable=By.xpath("//li[text()='One']");
	
	public static By twoGridSelectable=By.xpath("//li[text()='Two']");
	
	public static By threeGridSelectable=By.xpath("//li[text()='Three']");
	
	public static By fourGridSelectable=By.xpath("//li[text()='Four']");
	
	public static By fiveGridSelectable=By.xpath("//li[text()='Five']");
	
	public static By sixGridSelectable=By.xpath("//li[text()='Six']");
	
	public static By sevenGridSelectable=By.xpath("//li[text()='Seven']");
	
	public static By eightGridSelectable=By.xpath("//li[text()='Eight']");
	
	public static By nineGridSelectable=By.xpath("//li[text()='Nine']");
	
	public static By selectableGrid=By.id("demo-tab-grid");
	
	public static By selectableList=By.id("demo-tab-list");
	
	public static By restrictedResizeBoxArrow=By.xpath("(//span[contains(@class,'resizable-handle')])[1]");
	
	public static By UnrestrictedSizeBoxArrow=By.xpath("(//span[contains(@class,'resizable-handle')])[2]");
	
	public static By restrictedResizeBox=By.id("resizableBoxWithRestriction");
	
	public static By UnrestrictedSizeBox=By.id("resizable");
	
	public static By draggableEle=By.id("draggable");
	
	public static By droppableEle=By.id("droppable");
	
	public static By acceptableEle=By.id("acceptable");
	
	public static By notAcceptableEle=By.id("notAcceptable");
	
	public static By dropHereEle=By.id("droppable");
	
	public static By dragBox=By.id("dragBox");
	
	public static By notGreedyDropBox=By.id("notGreedyDropBox");
	
	public static By notGreedyInnerDropBox=By.id("notGreedyInnerDropBox");
	
	public static By greedyDropBox=By.id("greedyDropBox");
	
	public static By greedyDropBoxInner=By.id("greedyDropBoxInner");
	
	public static By acceptTabDropable=By.id("droppableExample-tab-accept");
	
	public static By preventPropagationTab =By.id("droppableExample-tab-preventPropogation");
	
	public static By revertDropableTab=By.id("droppableExample-tab-revertable");
	
	public static By revertableEle=By.id("revertable");
	
	public static By notRevertableEle=By.id("notRevertable");
	
	public static By droppableRevert=By.id("droppable");
	
	public static By dragMeDraggable=By.id("dragBox");
	
	public static By onlyX=By.id("restrictedX");
	
	public static By onlyY=By.id("restrictedY");
	
	public static By axixRestricted=By.id("draggableExample-tab-axisRestriction");
	
	public static By containerRestricted=By.id("draggableExample-tab-containerRestriction");
	
	public static By dragElementWithinContainer=By.xpath("//*[@id=\"containmentWrapper\"]/div");
	
	public static By textElementWithinContainer=By.xpath("//*[@id=\"draggableExample-tabpane-containerRestriction\"]/div[2]/span");
	
	public static By curserStyleDraggable=By.id("draggableExample-tab-cursorStyle");
	
	public static By cursorCenter=By.id("cursorCenter");
	
	public static By cursorTopLeft=By.id("cursorTopLeft");
	
	public static By cursorBottom=By.id("cursorBottom");
	
	public static By simpleDropContainer=By.id("simpleDropContainer");
	
	public static By acceptDropContainer=By.id("acceptDropContainer");
	
	public static By ppDropContainer=By.id("ppDropContainer");
	
	public static By revertableDropContainer=By.id("revertableDropContainer");
	
	public static By logInBookStoreApp=By.xpath("(//span['text()=Login'])[43]");
	
	public static By bookStoreBookStoreApp=By.xpath("(//*[@id=\"item-2\"]/span)[5]");
	
	public static By profileBookStoreApp=By.xpath("(//*[@id=\"item-3\"]/span)[5]");
	
	public static By bookStoreAPI=By.xpath("(//*[@id=\"item-4\"]/span)[5]");
	
	public static By userName=By.id("userName");
	
	public static By password=By.id("password");
	
	public static By loginBtn=By.id("login");
	
	public static By newUserBtn=By.id("newUser");
	
	public static By firstnameReg=By.id("firstname");
	
	public static By lastnameReg=By.id("lastname");
	
	public static By userNameReg=By.id("userName");
	
	public static By passwordReg=By.id("password");
	
	public static By registerBtn=By.id("register");
	
	public static By backToLoginBtn=By.id("gotologin");
	
	public static By errorMsg=By.id("name");
	
	public static By title=By.xpath("(//*[@id=\"userName-value\"])[2]");
	
	public static By invalidPassOrUN=By.xpath("//p[text()='Invalid username or password!']");
	
	public static By captchaCheck=By.id("recaptcha-anchor");
	
	public static By reCaptcha=By.xpath("//p[@id='name']");
	
	public static By searchBox=By.id("searchBox");
	
	public static By searchBtn=By.id("basic-addon2");
	
	public static By javaScriptBook=By.xpath("//a[text()='Programming JavaScript Applications']");
	
	public static By website=By.xpath("(//*[@id=\"userName-value\"])[8]");
	
}
