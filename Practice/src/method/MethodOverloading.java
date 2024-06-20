package method;

public class MethodOverloading {
	int x,y;
	double d;
	void sum() {
		x=10;
		y=20;
		System.out.println(x+y);
	}
	void sum(int a,int b) {
		x=a;
		y=b;
		System.out.println(x*y);
	}
	void sum(int a,double b) {
		x=a;
		d=b;
		System.out.println(x+d);
	}
	void sum(double b,int a) {
		x=a;
		d=b;
		System.out.println(x+d );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading mo =new MethodOverloading();
		mo.sum();
		mo.sum(100,200);
		mo.sum(10.5,10);
		mo.sum(10,20.5);
	}

}
