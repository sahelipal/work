package pracannotation;


import org.testng.annotations.*;

public class BeforeAndAfterClass {
	
	
  @Test
  public void test1() {
	  System.out.println("this is test 1 method in before and after class");
  }
  
  @Test
  public void test2() {
	  System.out.println("this is test 2 method in before and after class");
  }
  
  @BeforeMethod
  public void before_method() {
	  System.out.println("this is before method in before and after  class");
  }

  
  @AfterMethod
  public void after_method() {
	  System.out.println("this is after method in before and after class");
  }
}
