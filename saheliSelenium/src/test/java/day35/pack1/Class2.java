package day35.pack1;

import org.testng.annotations.*;

public class Class2 {
  @Test
  void xyz() 
  {
	  System.out.println("this is xyz from class2");
  }
  @AfterTest
  void n() 
  {
	  System.out.println("this after test method");
  }
  
  
}
