package IntroductionOfJava;
import java.util.*;
public class MovieTicketCalculation {

	public static void main(String[] args) {
		double totalcost;
		Scanner sc= new Scanner(System.in);
		System.out.println("no of tickets");
		int n=sc.nextInt();
	if(n<5||n>40) {
		System.out.println("Minimum of 5 and Maximum of 40 Tickets");
	}
	else if(n>=5 && n<=40) 
	{
		System.out.println("do you want refreshment");
		char ch=sc.next().charAt(0);
		System.out.println("do you have coupon");
		char ch1=sc.next().charAt(0);
		
		System.out.println("enter the circle");
		char ch2=sc.next().charAt(0);
		if(ch2!='k'||ch!='K'||ch!='q'||ch!='Q') {
			System.out.println("INPUT INVALID");
		}else {
			if(ch2=='k'||ch2=='K'||ch2=='q'||ch2=='Q') {
				if(ch2=='k'||ch2=='K') {
					totalcost=n*75;
				}
				else if(ch2=='q'||ch2=='Q') {
					totalcost=n*150;
				}
				else if(ch1=='y'||ch1=='Y') 
				{
			
				}
				
			}
		}
	
	}
}
}
