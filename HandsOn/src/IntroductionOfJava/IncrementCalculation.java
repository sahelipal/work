package IntroductionOfJava;
import java.util.*;
public class IncrementCalculation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("salary:");
		double salary=sc.nextInt();
		System.out.println("RATING");
		float rating=sc.nextInt();
		if(salary<=0||rating>5) {
			System.out.println("invalid input");
		}
		else {
			if(rating>=1 && rating<=3) {
				salary=salary*0.1;
				System.out.println();
			}
			else if(rating>=3.1 && rating<4) {
				salary=salary*0.25;
			}
			else if(rating>=4.1 && rating<=5) {
				salary=salary*0.3;
			}
		}
		System.out.println((int)salary);
	}

}
