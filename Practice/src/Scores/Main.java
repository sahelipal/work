package Scores;
import java.util.*;
class UserMainCode{
	public static boolean checkScores(int[] num,int n) {
		int count=0;
		for(int i=0;i<n-1;i++) {
			
			
			if(num[i]==100){
				int j=i+1;
			if(num[i]==num[j]) {
				count++;
			}
			
			}
		}
	

		if(count>0) {
			return true;
			
		}
		else {
			return false;
		}
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the count of element");
		int n=sc.nextInt();
		System.out.println("Enter the number of elements");
		int []num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		boolean result=UserMainCode.checkScores(num, n);
		System.out.println(result);
	}

}
