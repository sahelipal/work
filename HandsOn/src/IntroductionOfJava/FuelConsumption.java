package IntroductionOfJava;
import java.util.*;
public class FuelConsumption {
  
	public static void main(String[] args) {
		double consumption,miles,gallons,ans;
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of liters to fill the tank");
        int liter=sc.nextInt();
        if(liter<=0) {
        	System.out.println(liter+" is an INVALID INPUT");
        	
        }
        else {
        	System.out.println("Enter the distance covered");
            int distance=sc.nextInt();
            
            if(distance<=0) {
            	System.out.println(distance+" is an invalid input");
            }
            else {
            	consumption=(double)liter/distance*100;
            	miles=(double)distance*0.6214;
            	gallons=(double)liter*0.2642;
            	ans=(double)miles/gallons;
            	System.out.printf("Liters/100km:\n %.2f",consumption);
            	System.out.printf("\nMiles/gallons:\n %.2f",ans);
            	
            }
        }
	}

}
