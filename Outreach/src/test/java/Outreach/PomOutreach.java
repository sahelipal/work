package Outreach;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

//import DriverSetUp.DriverSetUp;

public class PomOutreach
{
	WebDriver driver;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	JavascriptExecutor js = (JavascriptExecutor) driver;

	public PomOutreach(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Switch to iframe
	
	@FindBy(id="appFrame") WebElement iframe1;
	
	
	//menu list
	@FindBy(xpath="//ul[@class='navbar-nav paddingleft5']/li") List<WebElement> menu;
	
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']//li[1]") WebElement eventMenu;

	//	subMenu
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']//li[1]//div//a") List<WebElement> eventSubMenu;
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']//li[2]") WebElement myVolunteeringMenu;
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[3]") WebElement donateMenu;
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[3]/div/a") List<WebElement> donateSubMenu;
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[4]") WebElement exploreMenu;
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[4]/div/a") List<WebElement> exploreSubMenu;
	
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[5]") WebElement readmoreMenu;
	@FindBy(xpath = "//ul[@class='navbar-nav paddingleft5']/li[5]/div/a") List<WebElement> readmoreSubMenu;

	//card details
	//div[@class="row sectiondiv"]/div
	@FindBy(xpath = "//div[@class=\"row sectiondiv\"]/div") List<WebElement> interestedCardList;
	
	
	//search events 
	@FindBy(xpath = "//span[@class=\'vieweventDrop\']") WebElement searchEvents;
	
	//event type
	@FindBy(xpath = "//button[@data-id=\'jsonEventType\']//span[@class=\'caret\']") WebElement eventType;
	//select passion
	@FindBy(xpath = "//span[text()=\' Passion \' and @class=\'text\']") WebElement eventTypePassion;
	
	//weekend
	@FindBy(xpath = "//button[@data-id=\'jsonWeekType\']") WebElement weekEndButton;
	//select passion
	@FindBy(xpath = "//span[text()=\' Weekend \' and @class=\'text\']") WebElement weekEndOption;
	
	
	
	//From Date
	@FindBy(id = "fromDate") WebElement fromDateButton;
	//@FindBy(xpath = "//div[@class='datepicker-days']//thead//tr[2]//th[2]") WebElement fomDate;
	@FindBy(xpath = "//div[@class='datepicker-days']//thead//tr[2]//th[2]")	WebElement datepickerDay;
	@FindBy(xpath = "//div[@class='datepicker-months']//thead//tr[2]//th[2]") WebElement datepickerYear;
	@FindBy(xpath = "//div[@class='datepicker-months']//thead//tr[2]//th[3]") WebElement nextButton;
	@FindBy(xpath = "//div[@class='datepicker-months']//tbody//tr//span[contains(@class,'month')]") List<WebElement> monthsList;
	@FindBy(xpath = "//div[@class='datepicker-days']//tbody//tr//td[starts-with(@class,'day')]") List<WebElement> daysList;

	
//	ToDate
	@FindBy(id = "toDate") WebElement toDate;
	@FindBy(xpath = "//div[@class='datepicker-days']//thead//tr[2]//th[2]") WebElement toDatepicker;
	@FindBy(xpath = "//div[@class='datepicker-months']//thead//tr[2]//th[2]") WebElement toDatepickerYear;
	@FindBy(xpath = "//div[@class='datepicker-months']//thead//tr[2]//th[3]") WebElement nextMonth;
	@FindBy(xpath = "//div[@class='datepicker-months']//tbody//tr//span[contains(@class,'month')]") List<WebElement> toMonthList;
	@FindBy(xpath = "//div[@class='datepicker-days']//tbody//tr//td[starts-with(@class,'day')]") List<WebElement> toDaysList;

//	click search button
	@FindBy(id = "eventsHomeSearchBtn") WebElement filterSearchButton;
	@FindBy(xpath = "//div[@id='divsearchevents']//div[@class='title_event']") List<WebElement> serachResultDisplay;
	@FindBy(xpath = "//div[@class='container outind-app']") WebElement OneCognizantPage;
	
//	Volunteering button
	@FindBy(xpath = "//a[text()='My Volunteering']") WebElement myVolunteerButton;
	@FindBy(id = "divvolteer") WebElement volunteerAroundMe; 
	@FindBy(className = "profilevoltext") List<WebElement> listOfVolunteerAroundMe;
	
	
	
	//Get all menus are visible while mouse over cursor.
	public  List<WebElement> getMenu() {
		driver.switchTo().frame(iframe1);
		return menu;
	}
	
	
	void helperLoop(List<WebElement> list) {
		for (WebElement el : list) {
			System.out.println(el.getText());
		}
	}

	
	//	Get all submenus are visible while mouse over cursor.
	void getSubMenu() {
		Actions action = new Actions(driver);
		

		System.out.println("SubMenu: -----------> ");
		action.moveToElement(eventMenu).perform();
		System.out.print("Event: ");
		helperLoop(eventSubMenu);
		
		
		action.moveToElement(donateMenu).perform();
		System.out.print("Donate: ");
		helperLoop(donateSubMenu);

		action.moveToElement(exploreMenu).perform();
		System.out.print("Explore: ");
		helperLoop(exploreSubMenu);

		action.moveToElement(readmoreMenu).perform();
		System.out.print("ReadMore: ");
		helperLoop(readmoreSubMenu);

		action.moveToElement(myVolunteeringMenu).perform();
	}
	
	
	//	Print Event details based on interest is visible in Outreach.
	public List<WebElement> getInterestCardList() {
		return interestedCardList;
	}
	
	//	Validate Search event filter option based on Location, Event type, Weekend/Weekdays, From date and To date and print the search results.
	public void clickSearchFilterButton() {
		searchEvents.click();
		eventType.click();
		eventTypePassion.click();
		weekEndButton.click();
		weekEndOption.click();
	}
	
	
//	Selcting from date

	void helperLoopClick(List<WebElement> element, String data) {
		for (WebElement el : monthsList) {
			if (el.getText().equals(data)) {
				el.click();
				break;
			}
		}
	}

	void fromDateBButton() {
		fromDateButton.click();
		

		String fromYear = "2024";
		String fromMonth = "Jun";
		String fromDay = "5";

		datepickerDay.click();
//		selecting year
		while (true) {

			String yr = datepickerYear.getText();

			if (yr.equals(fromYear)) {
				break;
			}
			nextButton.click();
		}

//		selecting months
//		helperLoopClick(monthsList, fromMonth);
		for (WebElement el : monthsList) {
			if (el.getText().equals(fromMonth)) {
				el.click();
				break;
			}
		}

//		Selecting day
//		helperLoopClick(daysList, fromDay);
		for (WebElement el : daysList) {
			if (el.getText().equals(fromDay)) {
				el.click();
				break;
			}
		}
	}

//	selecting toDate
	void getToDate() 
	{
		toDate.click();
		toDatepicker.click();

		String toYear = "2024";
		String toMonth = "Jun";
		String toDay = "7";

//		selecting year
		while (true) 
		{
			String yrs = toDatepickerYear.getText();
			if (yrs.equals(toYear)) 
			{
				break;
			}
			nextMonth.click();
		}

		for (WebElement el : toMonthList) 
		{
			if (el.getText().equals(toMonth)) 
			{
				el.click();
				break;
			}
		}

		for (WebElement el : toDaysList) 
		{
			if (el.getText().equals(toDay)) 
			{
				el.click();
				break;
			}
		}
	}
	
	void clickFilterSearchButton() throws IOException {
		
		filterSearchButton.click();
		
		
	}
	
	
	void displaySearchResult() 
	{
		try {
			WebElement displayEvent = driver.findElement(By.xpath("//div[@class='card_eventscroll marginleft0']"));
			boolean status = displayEvent.isDisplayed();
			SoftAssert sa = new SoftAssert();
			System.out.println(status);
			sa.assertEquals(status, true);
			System.out.print("Event based on filters: ");
			for(WebElement el:serachResultDisplay) {
				System.out.println(el.getText());
			}
		}
		catch (Exception e) {
			System.out.println("No event to display");
		}
	}
	
	void myVolunteerOption() 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", myVolunteerButton);
		volunteerAroundMe.click();
		System.out.println("Volunteers around me: -->>");
		for(WebElement el:listOfVolunteerAroundMe) 
		{
			System.out.println(el.getText());
		}
	}
	
	
	public void takeScreenShot(String nameFile) throws IOException{
		String fileWithPath = "C:\\Users\\2332907\\eclipse-workspace\\Outreach\\Screenshots\\"+nameFile+".png";
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);

	}
	
}
