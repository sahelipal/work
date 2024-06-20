package method;
class Pen{
	String color;
	String type;
	public void write(){
		System.out.println("hello...");
	}
	public void printColor() {
		System.out.println(this.color);
	}
}

class Student{
	String name;
	int age;
	public void printInfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
//	Student(String name,int age){
//		this.name=name;
//		this.age=age;
//	}
	
	Student(Student s2){
		this.name=s2.name;
		this.age=s2.age;
		
	}
	Student(){
		
	}
}
public class OOPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Pen pen1 = new Pen();
//		pen1.write();
//		
//		pen1.color="blue";
//		pen1.type="gel";
//		Pen pen2 =new Pen();
//		pen2.color="black";
//		pen2.type="ballpoint";
//		pen1.printColor();
//		pen2.printColor();
		
		
//		Student info=new Student("aman",24);
////			info.age=23;
////		 info.name="saheli";
//	info.printInfo();
		
		Student s1=new Student();
		s1.name="aman";
		s1.age=24;
		
		Student s2=new Student(s1);
		s2.printInfo();
	}

}
