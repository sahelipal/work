package tablePrac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		for(int row=2;row<=6;row++)
		{
			for(int col=1;col<=4;col++) {
				
		String data=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td["+col+"]")).getText();
		if(data.equals("3000") )
		{
			
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]//td[2]")).getText();
			System.out.println(author);
			
		}
		}
		
		}
	}

}
