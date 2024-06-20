package scoresAverage;
import java.util.*;
public class AverageScore {
	private static double calculateAverage(int[]num) {
		int sum=0;
		for(int n:num) {
			sum=sum+n;
		}
		double average=(double)sum/num.length;
		return average;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of inputs");
		int n=sc.nextInt();
		System.out.println("enter the elements");
		int[]num=new int[n];
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		double result=calculateAverage(num);
		System.out.printf("%.2f",result);
	}

}
