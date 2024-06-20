package Outreach;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PomBeCognizant 
{
	WebDriver driver;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//Constructor
	PomBeCognizant(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Becognizant
	
	//ProfileButton
	@FindBy(className= "_8ZYZKvxC8bvw1xgQGSkvvA==")WebElement profileButton;
	
	//Get Profile Details
	//UserName
	@FindBy(id="mectrl_currentAccount_primary") WebElement txt_username;
	//Email
	@FindBy(id="mectrl_currentAccount_secondary") WebElement txt_email;

	public void getProfileDetails() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(profileButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", profileButton);
		
		System.out.println("User Information:");
		Thread.sleep(4000);
		System.out.println(txt_username.getText());
		System.out.println(txt_email.getText());
		js.executeScript("arguments[0].click();", profileButton);
	}
	
	//oneCognizant
	@FindBy(xpath = "//div[text()='OneCognizant']") WebElement onecognizant;

	
	void switcToOnecognizant()
	
	{
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://onecognizant.cognizant.com");
	}
	
	
	public String getWindows() 
	{
		Set<String> windows = driver.getWindowHandles();
		List<String> listWindows = new ArrayList<String>(windows);
		String child = listWindows.get(1);
		return child;
	}
	
	
	
	
}
