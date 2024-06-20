package prac;



class A{
	void display() {
		System.out.println("hi");
	}
}
class B extends A{
	void display() {
		System.out.println("hi2");
	}
	void work() {
		super.display();
	}
}


public class SaHE {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		
		b.display();
		b.work();
		
	}

}
