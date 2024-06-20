package greatBegin;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;
public class UserInterface {
	public static Event extractDetails(String eventdetails)throws ParseException  {
	String[]d=eventdetails.split(":");
	String s1=d[0];
	String s2=d[1];
	Date s3=new SimpleDateFormat("dd/MM/yyyy").parse(d[2]);
	Date s4=new SimpleDateFormat("dd/MM/yyyy").parse(d[3]);
	double s5=Double.parseDouble(d[4]);
	return new Event(s1,s2,s3,s4,s5);
	}
	
	public static void main(String[] args) throws ParseException {
	System.out.println("Enter Event Details");
	Scanner sc=new Scanner(System.in);
	String s=sc.next();
	Event e=UserInterface.extractDetails(s);
	double d=e.calculateAmountToBePaid();
	if(d==-1){
	    System.out.println("Invalid Event Details");
	}else{
	System.out.println("Event Id : "+e.getEventId());
	System.out.println("Event Type : "+e.getEventType());
	System.out.println("Date of Registration : "+e.getDateOfRegistration());
System.out.println("Date of Event : "+e.getDateOfEvent());
	System.out.println("Payment : "+e.getPayment());
	System.out.println("Amount to be paid by Customer : "+d);
	}
	}
}
