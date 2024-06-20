package Likith;

import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class OutReachMain {
	
	WebDriver driver;
	POMBeCognizant objBeCognizant;
	POMOneCognizant objOneCognizant;
	POMOutreach objOutReach;
	
	@BeforeClass
	void setUp() {
		
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://be.cognizant.com");
		
	}
	
	
	@Test(priority = 1)
	void beCognizant() throws InterruptedException, IOException {
		objBeCognizant = new POMBeCognizant(driver);
		Thread.sleep(10000);
		
		// fetching the profile details
		objBeCognizant.getProfileDetails();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,3000)","");
		objBeCognizant.takeScreenshot("SS1");
		
	}
	
	@Test(priority = 2)
	void oneCognizant() throws InterruptedException, IOException {
		
		objBeCognizant = new POMBeCognizant(driver);
		objOneCognizant = new POMOneCognizant(driver);
		
		Thread.sleep(6000);
		
		// switching the browser tab from BeCognizant to OneCognizant
		objBeCognizant.oneCognizantClick();		
		String childWindow = objBeCognizant.getWindows();
		driver.switchTo().window(childWindow);
		objOneCognizant.takeScreenshot("SS2");
		
	}
	
	@Test(priority = 3)
	void menu() {
		objOneCognizant = new POMOneCognizant(driver);
		
		objOneCognizant.getSearchButton();
	}
	
	@Test(priority = 4)
	void mainMenu() throws IOException {
		
		objOutReach = new POMOutreach(driver);
		
		objOutReach.getSwitchFrame();
		
		// Printing the list of menu
		objOutReach.getMainMenu();
		
		// printing the list of sub menu
		objOutReach.getSubMenu();
		objOutReach.takeScreenshot("SS3");
		
	}
	
	@Test(priority = 5)
	void interestCardList() {
		
		objOutReach = new POMOutreach(driver);
		// calling the Interest card list method and printing the card list
		objOutReach.helperLoop(objOutReach.getInterestCardList());
		
	}
	
	@Test(priority = 6)
	void filerButton() throws InterruptedException, IOException {
		
		objOutReach = new POMOutreach(driver);
		// opening the search event filter and selecting event type and week type
		objOutReach.filterEvent();
		objOutReach.takeScreenshot("SS4");

		
	}
	
	@Test(priority = 7)
	void fromDate() throws InterruptedException {
		
		objOutReach = new POMOutreach(driver);
		
		// select the from date
		objOutReach.fromDate();
		
	}
	
	@Test(priority = 8)
	void toDate() throws InterruptedException {
		
		objOutReach = new POMOutreach(driver);
		
		// selecting the to date
		objOutReach.toDate();
	}
	
	@Test(priority = 9)
	void filterSearchButton() throws IOException {
		// clicking upon the search button
		objOutReach.filterSearchButton();
	}
	
	@Test(priority = 10)
	void displaySearchResults() throws Exception {
		
		// displaying the search results after using search event filter
		objOutReach.displaySearchResult();
		
	}
	
	@Test(priority = 11)
	void vlounteerOption() throws Exception {
		
		// clicking upon the my volunteer option
		objOutReach.myVolunteerOption();
		objOutReach.takeScreenshot("SS6");
	}
	
	@AfterClass
	void closeBrowser() {
		driver.quit();
	}
	

	
	

	
	
	
	

}
