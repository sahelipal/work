package day22;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		System.out.println("title of page "+driver.getTitle());
		
		System.out.println("current url "+driver.getCurrentUrl());
		
//		System.out.println("source of page ");
//		String ps=driver.getPageSource();
//		System.out.println(ps.contains("html"));
		 
		//System.out.println("handle of page "+driver.getWindowHandle());
		//9888C2F1D33AB0866270BC672A0FDAEC
		//4293E2ADB1BD3B821869288DE6166C0B
		
		
		Thread.sleep(5000);
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();//open new browser window
		Set<String> windowIds=driver.getWindowHandles();
		
		for(String winid:windowIds)
		{
			System.out.println(winid);
		}
		
	}

}
