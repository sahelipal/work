package pracannotation;

import org.testng.annotations.*;

public class BeforeAndAfterTest
{
  @Test
  public void test1() 
  {
	  System.out.println("this is test1 annotation");
  }
  
  @Test
  public void test2() 
  {
	  System.out.println("this is test2 annotation");
  }
  
  @BeforeClass
  public void before_class() 
  {
	  System.out.println("this is before class annotation");
  }
  
  @AfterClass
  public void after_class() 
  {
	  System.out.println("this is after class annotation");
  }

  @BeforeMethod
  public void before_method() 
  {
	  System.out.println("this is before method annotation");
  }
  @AfterMethod
  public void after_method() 
  {
	  System.out.println("this is after method annotation");
  }
  @BeforeTest
  public void before_test_annotation() 
  {
	  System.out.println("this is before test annotation");
  }

  @AfterTest
  public void after_test_annotation() 
  {
	  System.out.println("this is after test annotation");
  }









}
