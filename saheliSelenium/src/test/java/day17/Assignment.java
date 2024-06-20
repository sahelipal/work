package day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
		
		
		WebElement txtemail=driver.findElement(By.id("Email"));
		txtemail.clear();
		txtemail.sendKeys("admin@yourstore.com");
		
		WebElement txtpassword=driver.findElement(By.name("Password"));
		txtpassword.clear();
		txtpassword.sendKeys("admin");
		
		driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		String act_txt="";
		try {
		act_txt = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		}
		catch(NoSuchElementException e){
			
		}
		String exp_txt="Dashboard";
		if(act_txt.equals(exp_txt)) {
			System.out.println("test passed");
		}else {
			System.out.println("test failed");
		}

	}

}
