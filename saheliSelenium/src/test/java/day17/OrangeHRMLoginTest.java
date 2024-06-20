package day17;



import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//WebDriverManager.chromedriver().setup();
		
		//Launch Browser
		//ChromeDriver driver=new ChromeDriver();
		
		//1)We use this when we work with multiple browser
			WebDriver driver=new ChromeDriver();//(Preferable)
			
			
		//	2)Open url of the browser
			driver.get("https://opensource-demo.orangehrmlive.com");
			driver.manage().window().maximize();//maximize the window
			Thread.sleep(4000);
		//3)Provide username-Admin
//			
//			WebElement txtUsername=driver.findElement(By.name("username"));
//			txtUsername.sendKeys("Admin");
	
			driver.findElement(By.name("username")).sendKeys("Admin");
			
			//4)Provide password-admin123
			
			driver.findElement(By.name("password")).sendKeys("admin");
			//5)Click on log in button
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			Thread.sleep(7000);
			
			//6)verify the title of dash board
			//title validation
			/*
			String act_title=driver.getTitle();
			String exp_title="OrangeHRM";
			 if(act_title.equals(exp_title)) 
			 {
				System.out.println("test passed"); 
			 }
			 else {
				 System.out.println("failed");
			 }
			 */
			 
			
			//Label validation after successful login
			String act_label="";
			try
			{
				act_label=driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
			}
			catch(NoSuchElementException e) {
				
			}
			String exp_label="Dashboard";
			if(act_label.equals(exp_label)) 
			 {
				System.out.println("test passed"); 
			 }
			 else {
				 System.out.println("test failed");
			 }
			 //7)close the browser
			 //driver.close();
			 driver.quit();
	}

}
