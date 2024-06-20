package sumSquares;
import java.util.*;
public class SquaresOfDigits {
	private static int sumSquaresOfDigits(int num) {
		int digit,sum=0;
		while(num>0) {
			digit=num%10;
			sum=sum+(digit*digit);
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=sumSquaresOfDigits(num);
		System.out.println(sum);

	}

}
