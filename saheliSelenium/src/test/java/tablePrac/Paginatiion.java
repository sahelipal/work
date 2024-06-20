package tablePrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paginatiion 
{

	public static void main(String[] args)
	{
			// TODO Auto-generated method stub
			WebDriver driver=new ChromeDriver();
			driver.get("https://testautomationpractice.blogspot.com/");
			
			List<WebElement>rows=driver.findElements(By.xpath("//table[@id=\"productTable\"]//tbody/tr"));
			int row=rows.size();
			
			List<WebElement>list=driver.findElements(By.xpath("//ul[@class=\"pagination\"]/li"));
			int page=list.size();
			for(int p=1;p<=page;p++) 
			{
				 
				
					if(page==1) 
					{
						for(int r=1;r<=row;r++) 
						{
						String data=driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr["+r+"]")).getText();
						System.out.println(data);
						}
					}
					
					else 
					{
						
						for(int r=1;r<=row;r++) 
						{
							
						String data=driver.findElement(By.xpath("//table[@id=\"productTable\"]/tbody/tr["+r+"]")).getText();
						System.out.println(data);
						driver.findElement(By.xpath("//ul[@class=\"pagination\"]/li/a[text()="+p+"]")).click();
						}
					}
				}
			}
		}
		
		


