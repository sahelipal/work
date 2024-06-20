package pracannotation;

import org.testng.annotations.*;

public class BeforeAndAfterMethod {
  
	@Test
	public void testmethod1() {
		System.out.println("this is test method1 for before and after class");
	}
	
	@Test
	public void testmethod2() {
		System.out.println("this is test method2 for before and after class");
	}
	
	@BeforeMethod
	public void before_method() {
		System.out.println("this is in  before method annotation for before and after class");
	}
	
	@AfterMethod
	public void after_method() {
		System.out.println("this is in  after method annotation for before and after class");
	}
	
	@BeforeClass
	public void before_class() {
		System.out.println("this is in  before class annotation for before and after class");
	}
	
	@AfterClass
	public void after_class() {
		System.out.println("this is in  after class annotation for before and after class");
	}
}
