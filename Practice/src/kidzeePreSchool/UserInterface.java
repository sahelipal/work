package kidzeePreSchool;
import java.util.*;
public class UserInterface {
	public static AdmissionInfo extractDetails(String admissionDetails) 
	{
		String[]details=admissionDetails.split(":");
		if(details.length==5) {
			return new AdmissionInfo(details[0],details[1],(details[2]),Double.parseDouble(details[3]),Double.parseDouble(details[4]));
		}
		else 
		{
			return null;
		}
	}
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String admissionDetails=sc.nextLine();
		AdmissionInfo admissionInfo=extractDetails(admissionDetails);
		double fee=admissionInfo.calculateTotalFee();
		if(fee==-1) {
			System.out.println("invalid admission detaqils");
		}else {
		System.out.println("Admission Details");
		System.out.println("NUMBER:"+admissionInfo.getAdmissionNumber());
		System.out.println("CHILD NAME:"+admissionInfo.getChildName());
		System.out.println("PROGRAM NAME:"+admissionInfo.getProgramName());
		System.out.println("PROGRAM FEE:"+admissionInfo.getProgramFee());
		System.out.println("ADMISSION FEE:"+admissionInfo.getAdmissionFee());
		System.out.println("TOTAL FEE: "+fee);
		}
	}

}
