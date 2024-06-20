package method;

public class CobstructorOverloading {
	int x,y,z;
	double d;
	CobstructorOverloading(){
		x=10;
		y=20;		
	}
	CobstructorOverloading(int a,int b){
		x=a;
		y=b;
	}
	CobstructorOverloading(int a,double b){
		x=a;
		d=b;
	}
	CobstructorOverloading(double b,int a){
		x=a;
		d=b;
	}
	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CobstructorOverloading co=new CobstructorOverloading(100,200);
		co.display();
	}

}
