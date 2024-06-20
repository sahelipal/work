package oops;

public class StaticExample {
	static int a=10;
	int b=20;//non-static
	static void m1() {
		 System.out.println("this is m1 static method");
	}
	void m2() {
		System.out.println("this is m2 non-static method");
	}
	void m() {
		System.out.println("this is m non static method");
		System.out.println(a);
		System.out.println(b);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(a);
		 StaticExample se =new StaticExample();	
		 se.m();
	}

}
