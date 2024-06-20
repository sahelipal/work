package HamleysLaptop;
import java.util.*;
public class UserInterface {
public static LaptopInfo extractDetails(String laptopDetails) 
{
	String [] details=laptopDetails.split(":");
	if(details.length==4) 
	{
		
		return new LaptopInfo(details[0],details[1],details[2],Double.parseDouble(details[3]));
	}
	else {
		return null;
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter laptop details");
		String laptopDetails=sc.nextLine();
		
		LaptopInfo laptopInfo=extractDetails(laptopDetails);
		
		double price=laptopInfo.calculateLaptopCost();
		if(price<0) {
			System.out.println("INVALID DETAILS");
		}else {
		System.out.println("ID: "+laptopInfo.getLaptopId());
		System.out.println("NAME:"+laptopInfo.getBrandName());
		System.out.println("BRAND NAME: "+laptopInfo.getBrandName());
		System.out.println("COST: "+price);
		}
	}

}
