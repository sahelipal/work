import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Under3000 {

	public static void main(String[] args) {
		
		int c=0,d=0;
		
		//Launch Browser
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open URL
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		System.out.println("Automate Search Mobile phones functionality on Online shopping Website :Amazon");
		
		//Enter search text in search box
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile smartphones under 30000");
		
		//Click search button
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		
		//Get result string
		String first=driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[1]")).getText();
		
		
		String[]words=first.split("[-\\s]");
		System.out.println("No of pages: "+words[0]+"-"+words[1]);
		System.out.println("No of items: "+words[4]);
		String noi=words[4].replace(",","");
		if(Integer.parseInt(words[0])>0 &&Integer.parseInt(words[1])>0 && Integer.parseInt(noi)>0) {
			if(Integer.parseInt(words[0])<=Integer.parseInt(words[1])) {
				c++;
			}
		}
		
		
		String act_output=driver.findElement(By.xpath("//*[@id=\"search\"]/span[2]/div/h1/div/div[1]/div/div/span[3]")).getText();
		
		
		
		if(act_output.contains("mobile smartphones under 30000")) 
		{
			d++;	
		}
		
		//Validated the string
		if(c>0 && d>0) {
			System.out.println("The search string is validated");
		}else {
			System.out.println("the search string is not validated");
		}
		
		
		//Click on sort by option
		driver.findElement(By.xpath("//*[@id=\"a-autoid-0-announce\"]")).click();
		List<WebElement>options=driver.findElements(By.xpath("//*[@id=\"a-popover-2\"]/div/div/ul/li[@class=\"a-dropdown-item\"]"));
		
		//Print the number of items
		System.out.println("No of options in list: "+options.size());
		
		
		//Click on new arrivals
		driver.findElement(By.id("s-result-sort-select_3")).click();
		
		String new_arrv=driver.findElement(By.xpath("//*[@class=\"a-dropdown-prompt\"]")).getText();
		
		if(new_arrv.equals("Newest Arrivals")) {
			System.out.println("Newest Arrivals” option got selected correctly");
		}
		else {
			System.out.println("“Newest Arrivals” option got selected incorrectly");
	}
		
		
		driver.quit();
		
	}

}
