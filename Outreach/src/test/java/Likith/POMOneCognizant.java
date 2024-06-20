package Likith;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POMOneCognizant {
	
	WebDriver driver;
	TakesScreenshot ss;
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	public POMOneCognizant(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// Locators
	// search bar - oneCognizant
	
	@FindBy(className = "searchTopBar") WebElement searchIcon;
	@FindBy(id = "oneCSearchTop") WebElement searchTextBar;
	@FindBy(xpath = "//div[@class = 'appsResultText' and text() = 'Outreach']") WebElement outReachButton;
	
	// Actions 
	
	public void getSearchButton() {
		wait.until(ExpectedConditions.visibilityOf(searchIcon));
		searchIcon.click();
		searchTextBar.sendKeys("Outreach");
		outReachButton.click();
	}
	
	public void takeScreenshot(String name) throws IOException {
		ss = (TakesScreenshot) driver;
		//File src = searchIcon.getScreenshotAs(OutputType.FILE);
		File source =  ss.getScreenshotAs(OutputType.FILE);
		File target = new File("C:\\Users\\2332843\\OneDrive - Cognizant\\Desktop\\Java\\JavaDumps\\CAS_Project\\Screenshots\\OneCognizant\\"+name+".png");
		FileUtils.copyFile(source, target);
	}
	
}
