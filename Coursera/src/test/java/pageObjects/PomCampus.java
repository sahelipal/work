package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PomCampus extends BasePage
{
	WebDriver driver;
	
	public PomCampus(WebDriver driver)
	{
		super(driver);
		
	}
	
	
	//Locator of For Enterprise
	@FindBy(xpath="//a[text()=\"For Enterprise\"]")WebElement forEnterprise;
	
	//Locator of For Campus
	@FindBy(xpath="//a[text()=\"For Campus\"]")WebElement forCampus;
	
	//Locators to fill the form
	
	//Locator of name input
	@FindBy(id="FirstName")WebElement firstname;
	//Locator of name input
	@FindBy(id="LastName")WebElement lastname;
	//Locator of name input
	@FindBy(id="Email")WebElement Email;
	//Locator of name input
	@FindBy(id="Phone")WebElement phoneNumber;
	//Locator of name input
	@FindBy(id="Institution_Type__c")WebElement institutionType;
	//Locator of name input
	@FindBy(id="Company")WebElement institutionName;
	//Locator of name input
	@FindBy(id="Title")WebElement jobRole;
	//Locator of name input
	@FindBy(id="Department")WebElement Department;
	//Locator of name input
	@FindBy(id="What_the_lead_asked_for_on_the_website__c")WebElement Description;
	//Locator of name input
	@FindBy(id="Country")WebElement Country;
	//Locator of name input
	@FindBy(id="State")WebElement state;
	//Locator of submit button
	@FindBy(xpath="//button[text()='Submit']")WebElement submitButton;
	//Locator of submit button
	@FindBy(id="ValidMsgEmail")WebElement errorMessage;
	
	
	
			
	
	//Click on For Enterprise
	public void clickOnEnterpriseCampus() throws InterruptedException 
	{
		forEnterprise.click();
		Thread.sleep(3000);
		System.out.println("It's clicking on enterprise");
		forCampus.click();
		Thread.sleep(3000);
		System.out.println("It's clicking on campus");
	}
	
	//Fill the form 
	public void fillingForm(String fname,String lname,String email,String phonenumber,String institutiontype,String institutionname,String jobrole,String department,String description,String country,String stateName) 
	{
		firstname.sendKeys(fname);
		lastname.sendKeys(lname);
		Email.sendKeys(email);
		phoneNumber.sendKeys(phonenumber);
		
		Select select1=new Select(institutionType);
		select1.selectByVisibleText(institutiontype);
		
		institutionName.sendKeys(institutionname);
		
		Select select3=new Select(jobRole);
		select3.selectByVisibleText(jobrole);
		
		Select select4=new Select(Department);
		select4.selectByVisibleText(department);
		
		Select select5=new Select(Description);
		select5.selectByVisibleText(description);
		
		Select select6=new Select(Country);
		select6.selectByVisibleText(country);
		
		Select select7=new Select(state);
		select7.selectByVisibleText(stateName);
		
		submitButton.click();
		String errormessage=errorMessage.getText();
		System.out.println(errormessage);
		
	}
	

}