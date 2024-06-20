package Likith;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMBeCognizant {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor) driver;
	TakesScreenshot ss;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	public POMBeCognizant(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	// Locators
	
	// BeCognizant
	@FindBy(className = "_8ZYZKvxC8bvw1xgQGSkvvA==") WebElement profileButton;
	@FindBy(id = "mectrl_currentAccount_primary") WebElement txt_username;
	@FindBy(id = "mectrl_currentAccount_secondary") WebElement txt_email;
	
	// OneCognizant
	@FindBy(xpath = "//div[text()='OneCognizant']") WebElement oneCognizant;
	
	
	// Actions
	
	// To retrieve profile details
	public void getProfileDetails() throws InterruptedException {
		
		wait.until(ExpectedConditions.visibilityOf(profileButton));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", profileButton);
		
		System.out.println("User Information");
		Thread.sleep(4000);
		System.out.println(txt_username.getText());
		System.out.println(txt_email.getText());
		
	}
	
	// To click on oneCognizant
	public void oneCognizantClick() {
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://onecognizant.cognizant.com/Home");
	
	}	
	
	// Retrieving the window id's 
	public String getWindows() {
		
		Set<String> windows = driver.getWindowHandles();
		List<String> listWindows = new ArrayList<String>(windows);
		String parent = listWindows.get(0);
		String child = listWindows.get(1);
		
		
		return child;
	}
	
	public void takeScreenshot(String name) throws IOException {
		ss= (TakesScreenshot) driver;
		File source =  ss.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\2332843\\OneDrive - Cognizant\\Desktop\\Java\\JavaDumps\\CAS_Project\\Screenshots\\BeCognizant\\"+name+".png");
		FileUtils.copyFile(source, target);
	}
	
	
}
