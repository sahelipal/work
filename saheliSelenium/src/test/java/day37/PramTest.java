package day37;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.*;


public class PramTest {
	
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
	public void openApp(String br,String link)
	{
		if(br.equals("chrome")) {
		driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
			}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(link);
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
	void testLogo()throws Exception
	{
		try
		{
			Thread.sleep(5000);
		boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		
		Assert.assertEquals(status,true);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
	}
  
  
  @Test(priority=2)
  public void testHonmePageTitle()
  {
	 Assert.assertEquals(driver.getTitle(),"OrangeHRM","Title is not matched");
	 
  }
  
  @AfterClass
  public void close()
  {
	 driver.close(); 
  }
  
}
