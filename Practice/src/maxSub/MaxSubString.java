package maxSub;
import java.util.*;
import java.util.List;
public class MaxSubString {
	private static String findmaxSubString(String str) {
		int maxlength=0;
		String maxsubstring="";
		List<String>substrings=new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				substrings.add(str.substring(i,j));

			}
		}
		for(String s:substrings) {
			StringBuilder sb=new StringBuilder(s);
			StringBuilder rev =sb.reverse();
			String reverse=rev.toString();
			if(reverse.equals(s)) {
				if(s.length()>maxlength) {
					maxlength=s.length();
					maxsubstring=s;
				}
			}
		}
		return maxsubstring;
		
		
	}
	
//		return str.equals(new StringBuilder(str).reverse().toString());
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String str= sc.next();
	String st=findmaxSubString(str);
		
		System.out.println(st);

	}

}
