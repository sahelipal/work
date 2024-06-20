package nameShrink;
import java.util.*;
public class NameShrinking {
	public static String shrinkName(String str) {
		String[]words=str.split("\s+");
		StringBuilder sb=new StringBuilder();
		for(String s:words) {
			//StringBuilder sb=new StringBuilder();
			sb.append(s.charAt(0));
		}
		return sb.toString();
	}
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a string");
			String str=sc.nextLine();
			String s=shrinkName(str);
			System.out.println(s);
			
	}

}
