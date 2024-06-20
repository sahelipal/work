package unique;
import java.util.*;
public class Unique {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n= sc.nextInt();
		int count=0,r;
		int temp=n;
		boolean result=true;
		while(n>0) {
			n=n/10;
			count++;
		}
	
		int[]digits=new int[count];
		int in=0;
		while(temp>0) {
			r=n%10;;
			digits[in++]=r;
			temp=temp/10;
		}
		for(int i=0;i<count;i++) {
			for(int j=0;j<count;j++) {
				if(digits[i]==digits[j]) {
					result=false;
				}
			}
		}
		if(result==false) {
			System.out.println("not unique");
		}else {
			System.out.println("unique");
		}
		
	}

}
