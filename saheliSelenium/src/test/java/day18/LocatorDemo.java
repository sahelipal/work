package day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
			
			WebDriver driver=new ChromeDriver();
			
			//open app
			driver.get("http://www.automationpractice.pl/index.php");
			
			driver.manage().window().maximize();//mximize the browser
			
			//search box
			driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
			
			//search button
			driver.findElement(By.name("submit_search")).click();
			
			//link text
//			driver.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
			driver.findElement(By.partialLinkText("Faded Short")).click();
	}

}
