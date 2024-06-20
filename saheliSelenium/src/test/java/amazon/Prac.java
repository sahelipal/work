package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		driver.findElement(By.xpath("//div[@data-cel-widget=\"search_result_2\"]//a[@class=\"a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal\"]")).click();
	}

}
