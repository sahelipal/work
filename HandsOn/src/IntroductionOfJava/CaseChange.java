package IntroductionOfJava;
import java.util.*;

public class CaseChange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word");
		String str=sc.next();
		if(str.length()<3) {
			System.out.println("length is too short");
			return;
		}
		else if(str.length()>10) {
			System.out.println("length is too long");
			return;
		}
		else if(!str.matches("[a-zA-Z]+"))
		{
			StringBuilder sb=new StringBuilder();
			for(int i=0;i<str.length();i++) {
				char c=str.charAt(i);
				if(!Character.isLetter(c)) {
					sb.append(c);
				}
			}
			System.out.println("string should not contain "+sb.toString());
		}
		else {
			System.out.println("enter character");
			char ch=sc.next().charAt(0);
			
				StringBuilder sb=new StringBuilder();
				if(str.indexOf(Character.toLowerCase(ch))==-1||str.indexOf(Character.toLowerCase(ch))==-1) 
				{
					System.out.println(ch+" is not found");
				}
			
			else
			{
			char[]arr=str.toCharArray();
			StringBuilder sb1=new StringBuilder();
			for(char s:arr) 
			{
			if(Character.toLowerCase(s)==Character.toLowerCase(ch)) 
				{
					if(Character.isLowerCase(s)) 
					{
						sb1.append(Character.toUpperCase(s));
					}else 
					{
						sb1.append(Character.toLowerCase(s));
					}
				}
			else 
			{
			sb1.append(s);
			}
			
			}
			System.out.println(sb1.toString());
		}
		
	}
	}
}