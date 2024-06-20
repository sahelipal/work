package prac;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.amazon.in/");
//		driver.manage().window().maximize();
//		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung");
//		driver.findElement(By.id("nav-search-submit-button")).click();
//		driver.findElement(By.xpath("//div[@data-index=\"3\"]//span[@id=\"a-autoid-1\"]")).click();

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.findElement(By.partialLinkText("Top")).click();
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement link:links) {
			String hrefAttri=link.getAttribute("href");
			System.out.println(hrefAttri);
			URL  linkurl=new URL(hrefAttri);
			
				URLConnection conn=linkurl.openConnection();
			conn.connect();
			System.out.println(conn.getResponseCode());
		}
		
		
		
	}

}
