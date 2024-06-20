package DriverSetUp;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverSetUp {
	
	public static WebDriver driver;
	

	
	public static WebDriver driverSetUp(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
			
		}else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			
		}else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			
		}else {
			System.out.println("Incorrect Brower written");
		}
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;
		
		
	}
	
}
