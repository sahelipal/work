package MalgudiVoyage;
import java.util.*;
public class UserInterface {
	public static TicketInfo extractDerails(String ticketDetails) {
		String[]details=ticketDetails.split(":");
		if(details.length==3) {
			return new TicketInfo(Integer.parseInt(details[0]),details[1],details[2]);
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the passenger details");
		String str=sc.nextLine();
		System.out.println("Passenger Details");
		System.out.println("Number of tickets:");
		System.out.println("coach:");
		System.out.println("insurance");
	}

}
