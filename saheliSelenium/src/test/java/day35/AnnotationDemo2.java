package day35;
import org.testng.annotations.*;

public class AnnotationDemo2 {
	@BeforeClass
	void login() 
	{
		System.out.println("Login...");
	}
  @Test(priority=1)
   void search() 
  {
	System.out.println("Search Test");  
  }
  @Test(priority=2)
  void advancedsearch()
  {
	  System.out.println("Advanced Search");
  }
  @AfterClass
  void logout() 
  {
	  System.out.println("Logout..");
  }
}
