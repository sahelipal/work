package IdentifyCourses;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class POMForm {
	
	WebDriver driver;
	TakesScreenshot ts;
	
	public POMForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// locators 
	
	@FindBy(xpath = "//a[text()='For Enterprise']") WebElement forEnterpriseOption;
	@FindBy(xpath = "//a[text()='For Campus']") WebElement forCampusOption;
	
	// Form constraints and submit
	@FindBy(id = "FirstName") WebElement firstName;
	@FindBy(id = "LastName") WebElement lastName;
	@FindBy(id = "Email") WebElement email;
	@FindBy(id = "Phone") WebElement phoneNumber;
	@FindBy(id = "Institution_Type__c") WebElement institutionType;
	@FindBy(id = "Company") WebElement institutionName;
	@FindBy(id = "Title") WebElement jobRole;
	@FindBy(id = "Department") WebElement department;
	@FindBy(id = "What_the_lead_asked_for_on_the_website__c") WebElement description;
	@FindBy(id = "Country") WebElement country;
	@FindBy(id = "State") WebElement state;
	@FindBy(id = "ValidMsgEmail")WebElement errorMsg;
	
	@FindBy(xpath = "//button[@type='submit']") WebElement submitButton;
	
	// methods
	
	// moving towards the form
	public void getCampusForm() throws InterruptedException {
		
		forEnterpriseOption.click();
		System.out.println("Clicking on for Enterprise Option");
		Thread.sleep(1000);
		forCampusOption.click();
		System.out.println("Clicking on for Campus Option");
//		Thread.sleep(5000);
		
	}
	
	// entering the details in the form
	public void fillForm(String fName, String lastName, String email, String phoneNumber,
						 String institutionType, String institutionName, String jobRole, String department,
						 String description, String country, String state) throws InterruptedException {
		
		firstName.sendKeys(fName);
//		Thread.sleep(1000);
		this.lastName.sendKeys(lastName);
//		Thread.sleep(1000);
		this.email.sendKeys(email);
//		Thread.sleep(1000);
		this.phoneNumber.sendKeys(phoneNumber);
//		Thread.sleep(1000);
		
		
		Select s1 = new Select(this.institutionType);
		s1.selectByValue(institutionType);
//		Thread.sleep(1000);
		
		this.institutionName.sendKeys(institutionName);
//		Thread.sleep(1000);
		
		Select s2 = new Select(this.jobRole);
		s2.selectByValue(jobRole);
//		Thread.sleep(1000);
		
		Select s3 = new Select(this.department);
		s3.selectByValue(department);
//		Thread.sleep(1000);
		
		Select s4 = new Select(this.description);
		s4.selectByValue(description);
//		Thread.sleep(1000);
		
		Select s5 = new Select(this.country);
		s5.selectByValue(country);
		
		Select s6 = new Select(this.state);
		s6.selectByValue(state);
		
		Thread.sleep(1000);
		
		submitButton.click();
		
		String msg = errorMsg.getText();
		System.out.println(msg);

		
	}
	
}

