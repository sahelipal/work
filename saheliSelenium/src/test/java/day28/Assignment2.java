package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://blazedemo.com/");
		
		driver.findElement(By.xpath("/html/body/div[3]/form/select[1]")).click();
		
		WebElement departs=driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		Select depart_city=new Select(departs);
		List<WebElement>depart_city_options=depart_city.getOptions();
		for(WebElement op:depart_city_options) {
			if(op.getText().equals("Portland")) {
				op.click();
				break;
				
			}
		}
		driver.findElement(By.xpath("//form/select[2]")).click();
		
		WebElement destination=driver.findElement(By.xpath("//form/select[2]"));
		Select destination_city=new Select(destination);
		List<WebElement>destination_city_options=destination_city.getOptions();
		for(WebElement op:destination_city_options)
		{
			if(op.getText().equals("Berlin")) {
				op.click();
				break;
				
			}
		}
		driver.findElement(By.xpath("//form//input")).click();
		
		
		
		int rows=driver.findElements(By.xpath("//table[@class=\"table\"]//tr")).size();
		
		
		
		int cols=driver.findElements(By.xpath("//table[@class=\"table\"]//th")).size();
		
		List<WebElement>prices = null;
		
		for(int r=1;r<rows;r++)
		{
			prices=driver.findElements(By.xpath("//table[@class='table']//tbody//tr["+r+"]/td[6]"));
			//System.out.println(price);
				
			
		}
		
		for(WebElement arr: prices) {
			System.out.println(arr.getText());
		}
		
		System.out.println("End");
	}
}
