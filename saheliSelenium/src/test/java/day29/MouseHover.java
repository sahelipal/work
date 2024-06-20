package day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		WebElement desktop=driver.findElement(By.xpath("//li[@class=\"nav-item dropdown\"]//a"));
		WebElement mac=driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/div/div/ul/li[2]/a"));
		
		Actions act=new Actions(driver);
		act.moveToElement(desktop).moveToElement(mac).click().build().perform();
		
	}

}
