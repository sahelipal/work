package prac;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://webapps.tekstac.com/FormRegistration/EMICalculator.html");
		driver.findElement(By.xpath("//*[@id=\"amount\"]")).sendKeys("6000");
		driver.findElement(By.xpath("//*[@id=\"year\"]")).sendKeys("2");
		driver.findElement(By.xpath("//*[@id=\"roi\"]")).sendKeys("2");
		
		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		driver.switchTo().alert().accept();
	String msg=driver.findElement(By.xpath("//*[@id=\"msg\"]")).getText();
	System.out.println(msg);
	}

}
