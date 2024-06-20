package MaxSubString;

import java.util.Scanner;

class UserMainCode{
	public static String extractMax(String str1,String delimeter) {
	String[] substrings = str1.split(delimeter);
	int maxlength=0;
	String maxsubstring="";
	for(String substring:substrings) {
		if(substring.length()>maxlength) {
			maxlength=substring.length();
			maxsubstring=substring;
		}
	}
	return maxsubstring;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the line");
		String str1=sc.nextLine();
		System.out.println("Enter the delimeter");
		String delimeter=sc.nextLine();
		System.out.println(UserMainCode.extractMax(str1, delimeter));
		sc.close();
	}

}
