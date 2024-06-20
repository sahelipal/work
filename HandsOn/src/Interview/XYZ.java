package Interview;

public class XYZ extends ABC {
	XYZ(){
		super();
		System.out.println("default contructor of child");
	}
	XYZ(int a){
		super(a);
		System.out.println("contructor of child");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		XYZ x=new XYZ();
		XYZ x2=new XYZ(10);
		x.hello();

	}

}
