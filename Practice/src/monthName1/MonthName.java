package monthName1;
import java.util.*;
public class MonthName {
	private static String getMonthName(String str) {
		String[]dates=str.split("[:/-]+");
		int month=Integer.parseInt(dates[1]);
		String monthName="";
		if(month==1) {
			monthName="JANUARY";
		}
		if(month==2) {
			monthName="FEBRUARY";
		}
		if(month==3) {
			monthName="MARCH";
		}
		if(month==4) {
			monthName="APRIL";
		}
		if(month==5) {
			monthName="MAY";
		}
		if(month==6) {
			monthName="JUNE";
		}
		if(month==7) {
			monthName="JULY";
		}
		if(month==8) {
			monthName="AUGUST";
		}
		if(month==9) {
			monthName="SEPTEMBER";
		}
		if(month==10) {
			monthName="OCTOBER";
		}
		if(month==12) {
			monthName="NOVEMBER";
		}
		if(month==12) {
			monthName="DECEMBER";
		}
		return monthName;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String result=getMonthName(str);
		System.out.println(result);
	}

}
