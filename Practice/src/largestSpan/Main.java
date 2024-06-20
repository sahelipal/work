package largestSpan;
import  java.util.*;

public class Main {
//	public static int getLargestSpan(int[]number) {
//		int gap=0;
//	for(int i=0;i<number.length;i++) 
//	{
//		for(int j=i+1;j<number.length;j++) {
//			if(number[i]==number[j]) {
//				gap=j-i+1;
//			}
//		}
//	}
//	return gap;
//	
//	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[]number=new int[n];
		
		for(int i=0;i<n;i++) {
			number[i]=sc.nextInt();
		}
		//UserMainCode userMainCode=new UserMainCode();
		System.out.println(UserMainCode.getLargestSpan(number));
	}

}
