package oops;
class A1{
	int a=5,b=2,c=3;
//	public A1(int a) {
//		
//	}
	public A1() {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public A1(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
}
class B1 extends A1{
	int z=5;
	int sum=0;
	public B1() {
		
	}
	public B1(int w,int x,int y,int z) {
		super(w,x,y);
		this.z=z;
		
	}
	public int sumofNum(){
		//this.sum=sum;
//		a=super.a;
//		b=super.b;
//		c=super.c;
		sum=a+b+c+z;
		return sum;
	}
}
public class PracSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B1 obj = new B1();
		System.out.println(obj.sumofNum());
       
	}

}
