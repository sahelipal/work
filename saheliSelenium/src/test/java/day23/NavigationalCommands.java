package day23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_8k1t2xrrb6_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=155055&hvtargid=kwd-82189528107688:loc-90&hydadcr=14452_2334185");
		System.out.println(driver.getCurrentUrl());
		
		
		driver.navigate().to("https://www.flipkart.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		System.out.println("flipkart "+driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println("amazon "+driver.getCurrentUrl());
		
		driver.navigate().refresh();
	
	}

}
