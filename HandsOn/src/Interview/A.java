package Interview;

import java.io.FileNotFoundException;
import java.io.IOException;

class B{
	 void display()throws IOException 
	 {
		System.out.println("hello1");
	}
}
 class C extends B{
	 
	 void display()
	{
		//throw new 	NullPointerException("exception");
		System.out.println("hello2");
	 }
 }



public class A {

	public static void main(String[] args) {
		C c=new C();
		c.display();

	}

}
