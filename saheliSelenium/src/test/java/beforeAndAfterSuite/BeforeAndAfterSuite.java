package beforeAndAfterSuite;

import org.testng.annotations.*;

public class BeforeAndAfterSuite {
  @Test
  public void test1()
  {
	  System.out.println("this is test1 annotaion");
  }
  
  @Test
  public void test2()
  {
	  System.out.println("this is test2 annotaion");
  }
  
  @BeforeMethod
  public void before_method()
  {
	  System.out.println("this is before method annotaion");
  }
  
  @AfterMethod
  public void after_method()
  {
	  System.out.println("this is after method annotaion");
  }
  
  @BeforeClass
  public void before_class()
  {
	  System.out.println("this is before class annotaion");
  }
  
  @AfterClass
  public void after_class()
  {
	  System.out.println("this is after class annotaion");
  }
  
  @BeforeTest
  public void before_test()
  {
	  System.out.println("this is before test annotaion");
  }
  
  @AfterTest
  public void after_test()
  {
	  System.out.println("this is after test annotaion");
  }
  
  @BeforeSuite
  public void before_suite()
  {
	  System.out.println("this is before suite annotaion");
  }
  @AfterSuite
  public void after_suite()
  {
	  System.out.println("this is after suite annotaion");
  }
  
}
