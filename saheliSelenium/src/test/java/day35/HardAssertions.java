package day35;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
  
	@Test
  void test()
	{
		//int x=10;
		//int y=15;
//		if(x==y) 
//		{
//			System.out.println("test passed");
//		}
//		else {
//			System.out.println("test failed");
//		}
		
		//Assert.assertEquals(x,y);
  
		//Assert.assertTrue(false);
	
		int a=10;
		int b=20;
		//Assert.assertEquals(actual,expected);
		//Assert.assertEquals(a>b,true);//flase
		
		
		
		String s1="abc";
		String s2="abc1";
		
		//Assert.assertEquals(s1,s2,"string are not equal");
		//Assert.assertNotEquals(s1,s2);
		
		
		if(false)
		{
			Assert.assertTrue(true);
		}
		else 
		{
			
			//Assert.assertTrue(false);
			Assert.fail();
		}
		
		
	}
}
