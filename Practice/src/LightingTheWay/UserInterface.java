package LightingTheWay;
import java.util.*;
public class UserInterface {

	public static LightHouse extractDetails(String lightHouseDetails) {
		String[] details=lightHouseDetails.split(":");
		
		if(details.length==4) {
			return new LightHouse(details[0],Integer.parseInt(details[1]),details[2],Integer.parseInt(details[3]));
		}
		else {
			return null;
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details:");
		String lightHouseDetails=sc.nextLine();
		LightHouse lightHouse=extractDetails(lightHouseDetails);
		int flashes=lightHouse.calculateFlashesForGivenHours();
		if(flashes<0) {
			System.out.println("INVALID DETAILS");
		}else {
		System.out.println("Lighthouse location: "+lightHouse.getLocation());
		System.out.println("Height: "+lightHouse.getHeight());
		System.out.println("Light Type: "+lightHouse.getLightType());
		System.out.println("Hour: "+lightHouse.getHours());
		System.out.println("Flashes: "+lightHouse.calculateFlashesForGivenHours());
		}
	}

}
