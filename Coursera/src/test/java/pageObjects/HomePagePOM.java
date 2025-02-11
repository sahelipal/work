package pageObjects;



import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;




public class HomePagePOM extends BasePage
{
	WebDriver driver;
	
	public HomePagePOM(WebDriver driver)
	{
		super(driver);
		
	}
	
	//Locator of search box
	@FindBy(xpath="//input[@role=\"textbox\"]")WebElement searchBox;
	
	//Locator of search button
	@FindBy(xpath="//button[@class='nostyle search-button']//div")WebElement searchButton;
	
	
	//Locator of chdeckboxes
	//For english language checkbox
	@FindBy(xpath = "//span[@id=\"cds-react-aria-17-label-text\"]/span")
	WebElement englishLanguage;
	//For beginner level checkbox
	@FindBy(xpath = "//span[text()='Beginner']")
	WebElement beginnerLevel;
	
	
	//Locators of suggested courses
	@FindBy(xpath = "//a[@data-click-key='search.search.click.search_card']/h3")
	List<WebElement> courses;
	
	//Locator of ratings of courses
	@FindBy(xpath = "//p[@class='css-2xargn']")
	List<WebElement> courses_ratings;
	
	//Locator of duration of courses
	@FindBy(xpath = "//div[@class='cds-CommonCard-metadata']/p")
	List<WebElement> courses_duration;
	
	
		
	//Locator of more language button	
	@FindBy(xpath = "//button[@data-track-component='expand_filter_items_button_language']")
	WebElement moreLanguageButton;
		
	
	//Locator of languages list
	@FindBy(xpath = "//div[@data-testid=\"search-filter-group-Language\"]//span[contains(@id,'cds-react-aria')]")
	List<WebElement> languagesList;
	
	//Locators of levels list
	@FindBy(xpath = "//div[@data-testid=\"search-filter-group-Level\"]//span[contains(@id,\"cds-react-aria-\")]")
	List<WebElement> levelsList;
		
	//Locator for going back to home page
	@FindBy(xpath = "//div[@class=\"css-o1szhl\"]")
	WebElement homePage;
		
		
		
		//Action methods
		
		//Giving input in searchbox
		public void input() throws InterruptedException 
		{
		searchBox.click();
		searchBox.sendKeys("Web Development Course");
		searchButton.click();
		
	    }
		
		//Click Checkboxes
		public void checkBoxes() throws InterruptedException 
		{
			englishLanguage.click();
			Thread.sleep(3000);
			beginnerLevel.click();
		}
	
	
	//Displaying details of first two courses
	public void displayDataofSearchCourses() {
		 List<WebElement> searchedDatas = courses;
		 List<WebElement> ratings= courses_ratings;
		 List<WebElement> learningDurations=courses_duration ;
		 System.out.println("The searched course is : ");
		 int count =0;
		 
	     for (WebElement element : searchedDatas) 
	     {
			  if(count<2)
			  {
				System.out.println(element.getText());
				 System.out.println("The Rating for this course is : ");
				 System.out.println(ratings.get(count).getText());
				 System.out.println("The searched course Learning Duration is : ");
				 System.out.println(learningDurations.get(count).getText().split(" · ")[2]);
				 count++;
				
			}
			else 
			{
				break;
			}
		 
	   }
	}
	
	
	//Languages list
	public void daiplayLanguages()
	{
		moreLanguageButton.click();
		List<WebElement> list = languagesList;
		System.out.println("------------------------------------");
		System.out.println("Total Language available "+ list.size());
		System.out.println("Languages are: ");
		for(WebElement ele : list) {
			System.out.println(ele.getText());
		}
	}
	
	//Displaying levels
	public void daiplayLevels()
	{

		List<WebElement> list = levelsList;
		System.out.println("------------------------------------");
		System.out.println("Total Levels available "+ list.size());
		System.out.println("Levels are: ");
		for(WebElement ele : list)
		{
			System.out.println(ele.getText());
		}
	}
	
	//For going back to the home page
	public void backToHomePage()
	{
		homePage.click();
	}
	
	
}