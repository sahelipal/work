package testCases;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import pageObjects.HomePagePOM;
import pageObjects.PomCampus;
import utilities.ScreenShot;

import org.testng.Assert;
import org.testng.annotations.*;

public class IdentifyCoursesMain {
		  WebDriver driver;
		  HomePagePOM homePagePOM;
		  PomCampus pomCampus;
		  static TakesScreenshot takesScreenshot;
		  
		  @BeforeClass
			void setup()
			{
				driver = new EdgeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				driver.manage().window().maximize();
				driver.get("https://www.coursera.org/");
			}
		  
		  //Parallel Testing
//		  @BeforeClass
//		  @Parameters({"Browser","URL"})
//		  public void DriverSetUp(String browser,String url) {
//
//		  	if(browser.equalsIgnoreCase("Chrome")) {
//		  		driver = new ChromeDriver();
//		  	}
//		  	if(browser.equalsIgnoreCase("Edge")) {
//		  		driver = new EdgeDriver();
//		  	}
//		  	
//		  	driver.manage().window().maximize();
//		  	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		      driver.get(url);
//		  }
  
		  @Test(priority=1)
		  void search() throws Exception
			{
			  homePagePOM= new HomePagePOM(driver);
			  
			  homePagePOM.input();
			  Assert.assertEquals(driver.getTitle(),"Top Web Development Course Courses - Learn Web Development Course Online");
			  Thread.sleep(5000);
			  ScreenShot ss = new ScreenShot(driver);
			  ss.takeScreenShot("screenShot1");
			  takesScreenshot = (TakesScreenshot)driver;
			}
		  @Test(priority=2)
		  void checkBoxes()throws InterruptedException, IOException 
			{
			  homePagePOM= new HomePagePOM(driver);
			  homePagePOM.checkBoxes();
			  Thread.sleep(3000);
			  ScreenShot ss = new ScreenShot(driver);
			  ss.takeScreenShot("screenShot2");
			}
		  
  
  
		  @Test(priority=3)
		  void details() {
			  homePagePOM.displayDataofSearchCourses();
		  }
  

		  @Test(priority = 4)
		  void languages() 
		  { 
			  homePagePOM.daiplayLanguages();
					
				}
		  
		  @Test(priority = 5)
		  void levels() 
		  { 
			  homePagePOM.daiplayLevels();
					
		  }
		  
		  @Test(priority=6)
		  void backToHomePage()
		  {
			  homePagePOM.backToHomePage();
			  Assert.assertEquals(driver.getTitle(), "Coursera India | Online Courses & Credentials From Top Educators. Join for Free");
			  
		  }
		  @Test(priority=7)
		  void clickOnCampus() throws InterruptedException
		  {
			  pomCampus=new PomCampus(driver);
			  pomCampus.clickOnEnterpriseCampus();
		  }
		  
		  @DataProvider(name="dp")
		  String[][] inputData(){
			  String data[][]= {
				 {"Saheli",
				  "Pal",
				  "abcd",
				  "7384371636",
				  "University/4 Year College",
				  "UEM",
				  "President/Provost",
				  "Academic Affairs",
				  "Get in touch with sales",
				  "United States","AK"	  
			  }
			  };
			  return data;
		  }
		  
		  @Test(priority=8,dataProvider="dp")
		  void fromFill(String fname,String lname,String email,String phonenumber,String institutiontype,String institutionname,String jobrole,String department,String description,String country,String stateName) throws IOException, InterruptedException 
		  {
			  pomCampus.fillingForm(fname,lname,email,phonenumber,institutiontype,institutionname,jobrole,department,description,country,stateName);
			  Thread.sleep(3000);
			  ScreenShot ss = new ScreenShot(driver);
			  ss.takeScreenShot("screenShot3");
		  }
		  
		  @AfterClass
		  void tearDown() {
			  driver.quit();
		  }
		  
		  public static String captureScreen(String tname) throws IOException {
				File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
				String targetFilePath = System.getProperty("user.dir") + "\\ReportScreenshots\\" + tname + ".png";
				File targetFile = new File(targetFilePath);
				sourceFile.renameTo(targetFile);
				return targetFilePath;
			}
}
