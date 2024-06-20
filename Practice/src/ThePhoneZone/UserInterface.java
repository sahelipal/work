package ThePhoneZone;
import java.util.*;
public class UserInterface {
	
	public static MobileInfo extractDetails(String mobileDetails) {
		String[]details=mobileDetails.split(":");
		if(details.length==4) {
			
			return new MobileInfo(details[0],details[1],details[2],Double.parseDouble(details[3]));
		}
		else {
			return null;
		}
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the details");
		String mobileDetails=sc.nextLine();
	
		MobileInfo mobileInfo=extractDetails(mobileDetails);
		double price=mobileInfo.calculateMobilePriceToBePaid();
		if(price==-1) {
			System.out.println("INVALID DETAILS");
		}else {
		System.out.println("Mobile Details");
		System.out.println("MOBILE NAME:"+mobileInfo.getMobileName());
		System.out.println("IMEI NUMBER: "+mobileInfo.getImeiNumber());
		System.out.println("BRAND:"+mobileInfo.getMobileBrand());
		System.out.println("PRICE:"+mobileInfo.getMobilePrice());
		System.out.println("AMOUNT TO BE PAID:"+price);
		}
		
	}

}
