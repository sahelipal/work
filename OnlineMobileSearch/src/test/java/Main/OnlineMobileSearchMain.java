package Main;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import DriverSetUp.DriverSetUp;
import Utility.ExcelUtils;
//import Utility.WritingData;
import ScreenShot.TakeScreenShot;

public class OnlineMobileSearchMain {
	
	
	
	public static void main(String[] args) throws IOException{
		
     	Scanner sc =new Scanner(System.in);
     	System.out.println("Enter the browser name:");
     	String browser=sc.nextLine();
     	
		//Launch Browser
  
     	WebDriver driver=DriverSetUp.driverSetUp(browser) ;
		
		String file=System.getProperty("user.dir")+"\\testdata\\test.xlsx";
		
		int row=0;
		int col=0;

		//Data sends from excel to search box of Amazon 
		String data=ExcelUtils.getCellData(file,"Input",row,col);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(data);
		
		
		
		
		
		System.out.println("Automate Search Mobile phones functionality on Online shopping Website :Amazon");
		
		
		
		//Click search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Get result string
		String first=driver.findElement(By.xpath("//span[contains(text(),'1-16')]")).getText();
		
		
		String[]words=first.split("[-\\s]");
		
		System.out.println("No of pages: "+words[0]+"-"+words[1]);
		
		
		
		String string_no_of_item=words[4].replace(",","");
		
		//Validate No of pages
		int start_page_no=Integer.parseInt(words[0]);
		int last_page_no=Integer.parseInt(words[1]);
		
		boolean result_No_of_pages=false;
		if(start_page_no>0 && last_page_no>0) 
		{
			if(start_page_no<=last_page_no) 
			{
				System.out.println("No of pages is validated");
				
				ExcelUtils.setCellData(file,"Output",row,0,"No of pages validation Passed");
				
				row=row+1;
			
			}
		}
		else 
		{
			System.out.println("No of pages is not validated");
			
			ExcelUtils.setCellData(file, "Output",row,0,"No of pages validation not Passed");
			row=row+1;
		}
		
		
		//Validate no of items
		System.out.println("No of items: "+words[4]);
		int no_of_items=Integer.parseInt(string_no_of_item);
		if(no_of_items>0) 
		{
			System.out.println("No of items is validated");
			
			
			
			ExcelUtils.setCellData(file, "Output",row,0,"No of items Validation Passed");
			row=row+1;
		}
		else 
		{
			
			System.out.println("No of items is not validated");
			
			
			ExcelUtils.setCellData(file, "Output",row,0,"No of items Validation not Passed");
			row=row+1;
		
		}
		
		
		//Validate search string
		String actual_searchstring=driver.findElement(By.xpath("//span[@class=\'a-color-state a-text-bold\']")).getText();
		String expected_searchstring="mobile smartphones under 30000";
		

		if(actual_searchstring.contains(expected_searchstring)) 
		{
			System.out.println("Search string is validated");
			
			ExcelUtils.setCellData(file, "Output",row,0,"Search string Validation Passed");
			row=row+1;
		}
		else 
		{
			System.out.println("Search string is not validated");
			ExcelUtils.setCellData(file, "Output",row,0,"Search string Validation Failed");
			row=row+1;
		}
		
		
		
		
		
		//Click on sort by option
		driver.findElement(By.id("a-autoid-0-announce")).click();
		List<WebElement>options=driver.findElements(By.cssSelector("li.a-dropdown-item"));
		
		//Print the number of items
		System.out.println("No of options in list: "+options.size());
		
		
		//Click on new arrivals
		driver.findElement(By.id("s-result-sort-select_4")).click();
		
		String new_arrv=driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']/span[2]")).getText();
		
		if(new_arrv.equals("Newest Arrivals")) 
		{
			System.out.println("Newest Arrivals option got selected correctly");
			
			
			ExcelUtils.setCellData(file, "Output",row,0,"Newest Arrivals Validation Passed");
			row=row+1;
		}
		else
		{
			System.out.println("“Newest Arrivals option got selected incorrectly");
			
			ExcelUtils.setCellData(file, "Output",row,0,"Newest Arrivals Validation Failed");
			row=row+1;

	    }
		//Taking Screenshot
		System.out.println("Screenshot has taken");
		TakeScreenShot.takeScreenShot();
		
		//Closing Driver
		System.out.println("Closing the browser.");
		driver.quit();
		
		

	}
	
	

}
