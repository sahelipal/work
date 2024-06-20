package duplicates;
import java.util.*;
public class Duplicates {
	private static boolean containsDuplicates(String str) {
		int c=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					c++;
				}
	
			}
		}
		if(c>0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		boolean result=containsDuplicates(str);
		if(result==true) {
			System.out.println("duplicate");
		}else {
			System.out.println("not duplicate");
		}

	}

}
