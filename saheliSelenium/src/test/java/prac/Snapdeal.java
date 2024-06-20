package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Snapdeal {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		JavascriptExecutor js=driver;
		
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		driver.findElement(By.xpath("//*[@id=\"inputValEnter\"]")).sendKeys("head");
		driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button/span")).click();
		WebElement min=driver.findElement(By.xpath("//a[@href=\"#bcrumbLabelId:175\"][1]"));
		act.dragAndDropBy(min, 60,0).perform();
		System.out.println("forward"+min.getLocation());
		
		WebElement max=driver.findElement(By.xpath("//*[@class=\"price-slider-scroll right-handle ui-slider-handle ui-state-default ui-corner-all hashAdded\"]"));
		js.executeScript("arguments[0].style.left=arguments[1];",max,"-30%");
				
		
	
	}
}
