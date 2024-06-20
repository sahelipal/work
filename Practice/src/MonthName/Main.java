package MonthName;

import java.util.Scanner;

class UserMainCode{
	public static String getMethodName(String date) {
		String[]months=date.split("-");
		if(Integer.parseInt(months[1])==1) {
			return "JANUARY";
		}
		if(Integer.parseInt(months[1])==2) {
			return "FEBRUARY";
		}
		if(Integer.parseInt(months[1])==3) {
			return "MARCH";
		}
		if(Integer.parseInt(months[1])==4) {
			return "APRIL";
		}
		if(Integer.parseInt(months[1])==5) {
			return "MAY";
		}
		if(Integer.parseInt(months[1])==6) {
			return "JUNE";
		}
		if(Integer.parseInt(months[1])==7) {
			return "JULY";
		}
		if(Integer.parseInt(months[1])==8) {
			return "AUGUST";
		}
		if(Integer.parseInt(months[1])==9) {
			return "SEPTEMBER";
		}
		if(Integer.parseInt(months[1])==10) {
			return "OCTOBER";
		}
		if(Integer.parseInt(months[1])==11) {
			return "NOVEMBER";
		}
		if(Integer.parseInt(months[1])==12) {
			return "DECEMBER";
		}
		
		
		else {
			return null;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the date:");
		String date=sc.nextLine();
		
		String result=UserMainCode.getMethodName(date);
		System.out.println(result);
	}

}
