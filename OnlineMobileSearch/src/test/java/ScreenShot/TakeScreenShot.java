package ScreenShot;

import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import DriverSetUp.DriverSetUp;

public class TakeScreenShot {
	public static void takeScreenShot() throws IOException{
		String fileWithPath = "C:\\Users\\2332907\\eclipse-workspace\\OnlineMobileSearch\\src\\test\\java\\ScreenShot\\screenshot.png";
		WebDriver driver = DriverSetUp.driver;
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(fileWithPath);
		FileUtils.copyFile(SrcFile, DestFile);

	}

}
