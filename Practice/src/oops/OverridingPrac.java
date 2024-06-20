package oops;
class Bank {
	double roi() {
		return 100.0;
	}
}
class ICICI extends Bank{
	double roi() {
		return 101.5;
	}
}
class IDBI extends Bank{
	double roi() {
		return 102.5;
	}
}
public class OverridingPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Bank bk=new Bank();//parent class
		//System.out.println(bk.roi());//o/p:100.0
		
		ICICI bk=new ICICI();
		//System.out.println(bk.roi());//o/p:101.5
		
		//IDBI bk=new IDBI();
		//System.out.println(bk.roi());//o/p:102.5
	
	}

}
