package day24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		 List<WebElement>options=driver.findElements(By.xpath("//select[@id='country-list']/option"));
		 System.out.println(options.size());
		 for(WebElement option:options) 
		 {
			 String country=option.getText();
			 if(country.equals("China")) {
				 option.click();
				 break;
			 }
		 }
		 Thread.sleep(3000);
		 List<WebElement>states=driver.findElements(By.xpath("//*[@name='state']/option"));
		 System.out.println(states.size());
		 for(WebElement opt:states) 
		 {
			 if(opt.getText().equals("Beijing"))
			 {
				 opt.click();
				 break;
			 }
		 }
		
	}

}
