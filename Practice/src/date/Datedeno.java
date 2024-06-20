package date;
import java.util.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Datedeno {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		DateTimeFormatter df= DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		System.out.println("Enter a date");
		Scanner sc=new Scanner(System.in);
		String myDate=sc.nextLine();
		LocalDate date2=LocalDate.parse(myDate,df);
		System.out.println(date2.getMonth());

	}

}
