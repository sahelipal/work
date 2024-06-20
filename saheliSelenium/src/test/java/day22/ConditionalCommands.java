package day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//logo displayed
		//WebElement logo=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
		//System.out.println(logo.isDisplayed());
		
		//display status of logo
		//boolean status=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img")).isDisplayed();
		//System.out.println(status);
		
		//isEnabled method
		//boolean st=driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).isEnabled();
		//System.out.println(st);
		
		//isSelected
		System.out.println("before slecetion");
		boolean mst=driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).isSelected();
		System.out.println(mst);
		boolean fst=driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).isSelected();
		System.out.println(fst);
		
		
		System.out.println("after select male");
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		boolean mst_after=driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).isSelected();
		boolean fst_after=driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).isSelected();
		
		System.out.println(mst_after);
		System.out.println(fst_after);
		
	}

}
