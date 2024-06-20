package STRINGFINDER;
import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("mainstring");
	String str=sc.next();
	System.out.println("str1");
	String str1=sc.next();
	System.out.println("str2");
	String str2=sc.next();
	int result=UserMianCode.stringFinder(str,str1,str2);
	if(result==1) {
		System.out.println("yes");
	}
	else {
		System.out.println("no");
	}

	}

}
