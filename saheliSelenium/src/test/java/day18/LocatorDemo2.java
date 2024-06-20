package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2 {

	public static void main(String[] args) {
		
			
			WebDriver driver=new ChromeDriver();
			
			//open app
			driver.get("http://www.automationpractice.pl/index.php");
			
			driver.manage().window().maximize();//mximize the browser
			List<WebElement>sliders=driver.findElements(By.className("homeslider-container"));
			System.out.println("number of sliders"+sliders.size());
		
			
			//find total number of images in home page
			
			List<WebElement>images=driver.findElements(By.tagName("img"));
			System.out.println("total number of images"+images.size());
			
			List<WebElement>links=driver.findElements(By.tagName("a"));
			System.out.println("total number of links"+links.size());
			
			driver.quit();
	}

}
