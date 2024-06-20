package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInnerFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		//frame1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//*[@id=\"id1\"]/div/input")).sendKeys("111");
		
		
		driver.switchTo().defaultContent();
		//frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src=\'frame_3.html\']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("333");
		
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"i5\"]/div[3]/div")).click();
	}

}
