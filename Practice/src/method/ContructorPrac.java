package method;

public class ContructorPrac {
	
	int x,y;
	String name;
	
//	ContructorPrac(){
//		x=100;
//		y=200;
//		name="saheli";
//	}
	ContructorPrac(int a,int b,String str){
		x=a;
		y=b;
		name=str;
	}
	void displayData() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(name);
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ContructorPrac cd = new ContructorPrac();
		ContructorPrac cd= new ContructorPrac(10,20,"Welcome");
		cd.displayData();
	}

}
