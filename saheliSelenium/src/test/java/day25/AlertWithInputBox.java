package day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithInputBox {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[3]/button")).click();
		
		Alert alertWindow=driver.switchTo().alert();
		System.out.println(alertWindow.getText());
		alertWindow.sendKeys("welcome");
		alertWindow.accept();
		//validation
		String act_op=driver.findElement(By.xpath("//*[@id=\"result\"]")).getText();
		String exp_op="You entered: welcome";
		if(exp_op.equals(act_op)) {
			System.out.println("test passed");
		}
		else {
			System.out.println("test failed");
		}

	}

}
