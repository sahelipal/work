package IntroductionOfJava;
import java.util.*;
public class BillGeneration {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("no of pizzas");
		int pizza=sc.nextInt();
		System.out.println("no of puffs");
		int puffs=sc.nextInt();
		System.out.println("no of cool drinks");
		int drinks=sc.nextInt();
		System.out.println("bill details");
		System.out.println("pizzas: "+pizza);
		System.out.println("puffs: "+puffs);
		System.out.println("derinks: "+drinks);
		int sum=pizza*100+puffs*20+drinks*10;
		System.out.println("TOTAL PRICE: "+sum);
		System.out.println("ENJOY THE SHOW!!!");

	}

}
