package oops;
public class PrivateCons {
	private String name;
	private int age;
	public PrivateCons(String name,int age){
		this.name=name;
		this.age=age;
	}
	public PrivateCons()
	{
		name="saheli";
		age=23;
	}
	public void display() {
		System.out.println("name="+this.name);
		System.out.println("age="+this.age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrivateCons prac =new PrivateCons();
		prac.display();
		System.out.println("parameterized constructor");
		PrivateCons prac1=new PrivateCons("bhakti",45);
		System.out.println(prac1.name);
	}

}
