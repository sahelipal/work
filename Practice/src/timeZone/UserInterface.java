package timeZone;
import java.util.*;
public class UserInterface {
	public static TimeConverter extractDetails(String timeDetails) {
		String[]d=timeDetails.split(":");
		if(d.length==4) {
			return new TimeConverter(Integer.parseInt(d[0]),Integer.parseInt(d[1]),Integer.parseInt(d[2]),d[3]);
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE DETAILS");
		String timeDetails=sc.nextLine();
		TimeConverter tc=extractDetails(timeDetails);
		String result=tc.convertToGMT();
		if(result.equals("Eror")) {
			System.out.println("INVALId time details");
		}else {
			System.out.println("IST: "+timeDetails);
		System.out.println("GST: "+result);
		}

	}

}
