package method;

public class StaticExample {
	static int a=10;
	int b=20;
	static void m1() {
		System.out.println("this is m1 static method");
		
	}
	void m2() {
		System.out.println("this is non static method");
	}
	
	
	void m() {
		System.out.println(a);
		System.out.println(b);
		
		m1();
		m2();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(a);// a is static variable
		//System.out.println(b);//incorrect
		m1();
		//m2();//incorrect
		//non static methods can access non-static method
		StaticExample se=new StaticExample();
		se.m2();
		se.m();
		 
	}

}
