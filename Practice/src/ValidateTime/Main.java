package ValidateTime;

import java.util.Scanner;

class UserMainCode{
	public static int  validateTime(String time) {
		String regex="(0?[1-9]||1[0-2]:[0-5][0-9][]?[aApP][Mm])";
		if(time.matches(regex)) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the time");
		String time=sc.nextLine();
		int result=UserMainCode.validateTime(time.toLowerCase());
		if (result==1) {
			System.out.println("Valid Time");
		}
		else {
			System.out.println("Invalid Time");
		}
	}

}

//String regex="(1[0-2]|0?[1-9]):[0-5][0-9][ ]?[apAP][mM]";
