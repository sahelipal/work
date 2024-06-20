package day35.pack1;

import org.testng.annotations.*;

public class Class1 {
  @Test
  void abc() 
  {
	  System.err.println("this is abc from class 1");
  }
  @BeforeTest
  void m()
  {
	System.out.println("this is before test method");  
  }
//  @BeforeSuite
//  void bs() 
//  {
//	  System.out.println("before suite");
//  }
//  @AfterSuite
//  void as() 
//  {
//	System.out.println("after suite");  
//  }
}
