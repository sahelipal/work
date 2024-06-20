package IntroductionOfJava;
import java.util.*;
public class DisplayeCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the digits");
		int[]numbers=new int[4];
		for(int i=0;i<4;i++) {
			numbers[i]=sc.nextInt();
		}
		for(int i=0;i<4;i++) {
			System.out.println(numbers[i]+"-"+(char)numbers[i]);
		}
		
	}

}
