package day39;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogIn_ObjectClass
{
	WebDriver driver;
	
	//constructor
	LogIn_ObjectClass(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//locators
	By img_logo_loc=By.xpath("//img[@alt=\'company-branding\']");
	By txt_username_loc=By.name("username");
	By txt_password_loc=By.name("password");
	By btn_submit_loc=By.xpath("button[text()=\' Login \']");
	
	//actions
	
	public void setUserName(String username)
	{
		driver.findElement(txt_username_loc).sendKeys(username);
	}
	
	public void setPassword(String password)
	{
		driver.findElement(txt_password_loc).sendKeys(password);
	}
	
	public void clickSubmit()
	{
		driver.findElement(btn_submit_loc).click();
	}
	
	public boolean checkLogo()
	{
		boolean status=driver.findElement(img_logo_loc).isDisplayed();
		return status;
	}
	
	
	
}
