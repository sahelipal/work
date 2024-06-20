package day25;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlertsWithExplicit {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		
		//explicitWait
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

		//driver.switchTo().alert().dismiss();
		
		//if you want to catch the alert mesaage
		
		Alert alertWnidow=mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(alertWnidow.getText());
		alertWnidow.dismiss();
		
	}

}
