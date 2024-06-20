package IdentifyCourses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class IdentifyCoursesTest {

	WebDriver driver;
	POMSearch objPOMSearch;
	POMForm objPOMForm;
	
	static TakesScreenshot takesScreenshot;
	
	
	@BeforeClass
	@Parameters({"browser"})
	public void setUp(@Optional("edge") String browser) {
		if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}else if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.coursera.org/");
		
	}
	
	
	@Test(priority = 1)
	public void clickSearch() throws InterruptedException, IOException {
		
		objPOMSearch = new POMSearch(driver);
		objPOMSearch.clickSearch();
		Thread.sleep(3000);
		takesScreenshot =(TakesScreenshot)driver;
		
	}
	
	
	@Test(priority = 2)
	public void clickFilter() throws InterruptedException, IOException {
		
		objPOMSearch = new POMSearch(driver);
		
		objPOMSearch.clickFilter();
		Thread.sleep(5000);
		takesScreenshot =(TakesScreenshot)driver;

		
	}
	
	
	@Test(priority = 3)
	public void courseDetails() {
		
		objPOMSearch = new POMSearch(driver);
		
		objPOMSearch.courseDetails();
		takesScreenshot =(TakesScreenshot)driver;


		
	}
	
	
	@Test(priority = 4)
	public void diplayLangAndLevel() throws InterruptedException {
		objPOMSearch = new POMSearch(driver);
		
		objPOMSearch.displayLangAndLevel();
		takesScreenshot =(TakesScreenshot)driver;
	
	}
	
	
	@Test(priority = 5)
	public void getCampusForm() throws InterruptedException {
		
		objPOMForm = new POMForm(driver);
		objPOMForm.getCampusForm();
		takesScreenshot =(TakesScreenshot)driver;

		
	}
	
	@DataProvider(name="data")
	String[][] dataProvider()
	{
		
		String[][] data = {
				{"Likith","Shetty","abc@gma",
					"7715081177","University/4 Year College",
					"Sakec","Student","Student Affairs",
					"Courses for myself",
					"India","Maharashtra"}
		};
		
		return data;
	}
	
	@Test(priority = 6, dataProvider = "data")
	public void fillForm(String firstName, String lastName, String email, String phoneNumber,
			 String institutionType, String institutionName, String jobRole, String department,
			 String description, String country, String state) throws InterruptedException, IOException {
		
		objPOMForm = new POMForm(driver);
		
		Thread.sleep(3000);
		objPOMForm.fillForm(firstName, lastName, email, phoneNumber, institutionType, 
							institutionName, jobRole, department, description, country, state);
		Thread.sleep(5000);
		takesScreenshot =(TakesScreenshot)driver;

		
		
	}
	
	@AfterClass
	public void close() {
		driver.quit();
	}
	
	
	public static String captureScreen(String tname) throws IOException {
 
		File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
 
		String targetFilePath = System.getProperty("user.dir") + "\\Screenshots\\" + tname + ".png";
		File targetFile = new File(targetFilePath);
 
		sourceFile.renameTo(targetFile);
 
		return targetFilePath;
 
	}
	
	
	
}
