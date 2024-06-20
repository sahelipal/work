package day35;


import org.testng.annotations.*;

public class AllAnnotations {
	
	@BeforeSuite
	  void bs() 
	  {
		  System.out.println("before suite");
	  }
	  @AfterSuite
	  void as() 
	  {
		System.out.println("after suite");  
	  }
	  
	  @BeforeTest
	  void bt()
	  {
		System.out.println("this is before test method");  
	  }
	  @AfterTest
	  void at()
	  {
		System.out.println("this is after test method");  
	  }
	  
	  @BeforeClass
	  void bc()
	  {
		System.out.println("this is before class");  
	  }
	  @AfterClass
	  void ac()
	  {
		System.out.println("this is after class");  
	  }
	  
	  @BeforeMethod
	  void bm()
	  {
		System.out.println("this is before method");  
	  }
	  @AfterMethod
	  void am()
	  {
		System.out.println("this is after method");  
	  }
	  
	  @Test
	  void tm1()
	  {
		System.out.println("this is test method 1");  
	  }
	  @Test
	  void tm2()
	  {
		System.out.println("this is atest method 2");  
	  }
	  
}
