package day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopUp {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		//http://the-internet.herokuapp.com/basic_auth
		//http://admin:admin@the-internet.herokuapp.com/basic_auth
		
		
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String act_text=driver.findElement(By.xpath("//*[@id=\"content\"]/div/p")).getText();
		if(act_text.contains("Congratulations")) 
		{
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}

	}

}
