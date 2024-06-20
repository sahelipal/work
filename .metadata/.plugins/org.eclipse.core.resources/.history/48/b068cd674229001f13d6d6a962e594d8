package IdentifyCourses;

import java.util.List;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class POMSearch {

	WebDriver driver;
	TakesScreenshot ts;
	
	public POMSearch(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// locators
	
	// Searching web development courses
	@FindBy(xpath = "//input[@placeholder='What do you want to learn?']") WebElement searchBox;
	@FindBy(xpath = "//button[@class='nostyle search-button']/div") WebElement searchIcon;
	
	// course filters
	@FindBy(xpath = "//input[@id = 'cds-react-aria-17']") WebElement englishButton;
	@FindBy(xpath = "//input[@id = 'cds-react-aria-45']") WebElement beginnerButton;
	
	// course title
	@FindBy(xpath = "//h3[@class='cds-CommonCard-title css-6ecy9b']") List<WebElement> courseTitle;
	
	// course rating
	@FindBy(xpath = "//p[@class='css-2xargn']") List<WebElement> courseRating;
	
	// course duration
	@FindBy(xpath = "//div[@class='cds-CommonCard-metadata']/p") List<WebElement> courseDuration;
	
	
	// Languages
	@FindBy(xpath = "//div[@data-testid='search-filter-group-Language']//span[@class='cds-button-label' and contains(text(),'Show')]") WebElement showMoreOptions;
	@FindBy(xpath = "//div[@data-testid='search-filter-group-Language']//span[@class='cds-checkboxAndRadio-labelContent css-tvqrra']") List<WebElement> languageName;
	
	// Level
	@FindBy(xpath = "//div[@data-testid='search-filter-group-Level']//span[@class='cds-checkboxAndRadio-labelContent css-tvqrra']/span") List<WebElement> levelList;
	
	
	// methods
	
	// search method
	public void clickSearch() throws InterruptedException {
		
		searchBox.click();
		searchBox.sendKeys("Web development courses");
		Thread.sleep(1000);
		searchIcon.click();
		
	}
	
	// filter method
	public void clickFilter() throws InterruptedException {
		
		englishButton.click();
		beginnerButton.click();
		
	}
	
	// Displaying first two courses with name, total learning hours and rating
		
	public void courseDetails() {

		for(int i = 0; i < 2; i++) {
			System.out.println(courseTitle.get(i).getText());
			System.out.println(courseRating.get(i).getText());
			
			String[] duration = courseDuration.get(i).getText().replace(" ", "").split("·");
			System.out.println(duration[2]);
			System.out.println("---------------------------");
		}
	}
	
	
	// Displaying language and level with their total count
	
	public void displayLangAndLevel() throws InterruptedException {
		
		System.out.println("Total number of level's available : "+levelList.size());
		for(WebElement e : levelList) {
			System.out.println(e.getText());
		}
		
		System.out.println("---------------------------");
		
		Thread.sleep(2000);
		
		showMoreOptions.click();
		
		Thread.sleep(2000);
		
		System.out.println("Total number of language's available : "+languageName.size());
		for(WebElement e : languageName) {
			System.out.println(e.getText());
		}
		
		System.out.println("---------------------------");
		
		
	}
		
}
