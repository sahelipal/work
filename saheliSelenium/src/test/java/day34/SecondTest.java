package day34;

//in this code we are using priority so that the code follows the priority order
//and the code doesn't run the methods alphabetically
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SecondTest {

WebDriver driver;
	
@Test(priority=1)
public void openApp() {
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
}

@Test(priority=2)
public void login() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.findElement(By.name("username")).sendKeys("Admin");
	  driver.findElement(By.name("password")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
} 

@Test(priority=3)
public void close() {
	  driver.close();
}

}
