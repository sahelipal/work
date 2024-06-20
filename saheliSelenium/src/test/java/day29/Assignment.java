package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		Actions act=new Actions(driver);
		
	    WebElement source=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	    WebElement destination=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		act.dragAndDrop(source, destination).build().perform();
		
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	    WebElement destination1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(source1, destination1).build().perform();
		
		
		WebElement source3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
	    WebElement destination3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(source3, destination3).build().perform();
		
		WebElement source4=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
	    WebElement destination4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(source4, destination4).build().perform();
		
		if(driver.findElement(By.xpath("//a[contains(text(),'Perfect')]")).isDisplayed())							
     	{		
         	System.out.println("Perfect Displayed !!!");					
     	}
		else
     	{
        	System.out.println("Perfect not Displayed !!!");					
     	}
	}

}
