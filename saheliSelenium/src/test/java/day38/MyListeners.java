package day38;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListeners implements ITestListener
{
	public void onTestStart(ITestResult result) 
	{
		System.out.println("test is started");
	}
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test is failed");
	}
	
	
	public void onTestSkipped(ITestResult result) 
	{
		System.out.println("test is skipped");
	}
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("test is succeed");
	}
	
	public void onTestFinish(ITestContext context) 
	{
		System.out.println("test is finished");
	}
}
