package utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShot {
	 WebDriver driver;
	public ScreenShot(WebDriver driver) 
	{
		//super(driver);
		this.driver = driver;
		
	}

	public  void takeScreenShot(String name) throws IOException
	{
		String filePath="C:\\Users\\2332907\\eclipse-workspace\\Coursera\\ScreenShots\\"+name+".png";
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File(filePath);
		FileUtils.copyFile(SrcFile, DestFile);
	
	
	
	}
}
