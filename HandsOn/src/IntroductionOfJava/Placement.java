package IntroductionOfJava;

import java.util.Scanner;

public class Placement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("No of CSE:");
		int cse=sc.nextInt();
		System.out.println("NO OF ECE");
		int ece=sc.nextInt();
		System.out.println("NO OF MECH");
		int mech=sc.nextInt();
		if(cse<0||ece<0||mech<0) {
			System.out.println("INPUT INVALID");
		}
		else if(cse==ece && ece==mech && mech==cse) {
			System.out.println("no one has highest point");
		}
		else if(cse==ece && cse>mech){
			System.out.println("HIGHEST PLACEMENT");
			System.out.println("cse");
			System.out.println("ece");
		}
		else if(ece==mech && ece>cse){
			System.out.println("HIGHEST PLACEMENT");
			System.out.println("ece");
			System.out.println("mech");
		}
		else if(cse==mech && cse>ece){
			System.out.println("HIGHEST PLACEMENT");
			System.out.println("cse");
			System.out.println("mech");
		}
		else {	
		
		if(cse>ece && cse>mech) {
			System.out.println("HIGHEST PLACEMENT");
			System.out.println("cse");
		}
		else if(ece>mech&&ece>cse) {
			System.out.println("HIGHEST PLACEMENT");
			System.out.println("ece");
		}
		else if(mech>cse&&mech>ece) {
			System.out.println("HIGHEST PLACEMENT");
			System.out.println("mech");
		}
		}
	}

}
