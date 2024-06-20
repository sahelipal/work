package Outreach;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class OutreachMain {

	
	WebDriver driver;
	PomOutreach outreachObj;
	PomBeCognizant beCogniObj;
	PomOneCognizant oneCogniObj;
		
		
		@BeforeClass
		void setup()
		{
			driver = new EdgeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
			driver.get("https://be.cognizant.com");
		}
		
		
		@Test(priority = 1)
		void beCognizant() throws Exception
		{
			beCogniObj = new PomBeCognizant(driver);
			Thread.sleep(10000);
			beCogniObj.getProfileDetails();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			
			Thread.sleep(5000);
			beCogniObj.switcToOnecognizant();
		}
		
		@Test(priority = 2)
		void oneCognizant() throws Exception {
			beCogniObj = new PomBeCognizant(driver);
			oneCogniObj = new PomOneCognizant(driver);
			outreachObj=new PomOutreach(driver);
			String child = beCogniObj.getWindows();
			driver.switchTo().window(child);
			Thread.sleep(3000);
		//Search Outreach in Search bar and click on Outreach application from search results.
			Thread.sleep(3000);
			oneCogniObj.getSerachButton();	
			oneCogniObj.takeScreenShot("screenShot2");
			Assert.assertEquals(false, true);
		}
		
		
		void helperLoop(List<WebElement> menuList) {
			for(WebElement el:menuList) 
			{
				System.out.println(el.getText());
			}
		}
			@Test(priority = 3)
			void menu() {
				List<WebElement> menuList = outreachObj.getMenu();
				System.out.println("MenuList ------------ ");
				helperLoop(menuList);
				System.out.println();
				
			}
			
			@Test(priority = 4)
			void submenu() throws Exception {
				Thread.sleep(3000);
				outreachObj.getSubMenu();
			}
		
			//Print Event details based on interest is visible in Outreach.
			@Test(priority = 5)
			void interstCardList() {
				System.out.println("Cards ---> ");
				helperLoop(outreachObj.getInterestCardList());
			}
			
			@Test(priority = 6)
			void serachFilterButton() throws Exception {
				Thread.sleep(3000);
				outreachObj.clickSearchFilterButton();
				
			}
			
			//Selcting from date
			@Test(priority = 7)
			void fromDate()  {
				outreachObj.fromDateBButton();
				
			}
			
			@Test(priority = 8)
			void toDate() {
				outreachObj.getToDate();
			}
			
			@Test(priority = 9)
			void filterSearchButton() throws IOException {
				outreachObj.clickFilterSearchButton();
			}
			
			@Test(priority = 10)
			void displaySearchResults() throws Exception {
				
				outreachObj.displaySearchResult();
				Thread.sleep(5000);
				outreachObj.takeScreenShot("screenShot1");
				
			}
			
			@Test(priority = 11)
			void vlounteerOption() throws Exception {
				outreachObj.myVolunteerOption();
				
			}
			
			@AfterClass
			void closeBrowser() {
				driver.quit();
			}
			
}
	

		

	

	

