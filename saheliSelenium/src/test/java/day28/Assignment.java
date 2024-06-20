package day28;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		
		driver.findElement(By.xpath("//*[@id=\"dob\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]")).click();
		
		WebElement months=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[1]"));
		Select moth=new Select(months);
		List<WebElement> options=moth.getOptions();
		for(WebElement op:options)
		{
			
			if(op.getText().equals("Apr")) {
				
				op.click();
				
				break;
			}
		}
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]")).click();
		WebElement years=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/div/select[2]"));
		Select year=new Select(years);
		List<WebElement> opts=year.getOptions();
		for(WebElement op:opts)
		{
			
			if(op.getText().equals("2001")) {
				
				op.click();
				
				break;
			}
		}
		List<WebElement>dates=driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody//td"));
		for(WebElement op:dates) {
			if(op.getText().equals("20")){
				op.click();
				break;
			}
		}
		
	}

}
