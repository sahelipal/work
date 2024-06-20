package dayOfWeek;
import java.util.*;
import java.text.SimpleDateFormat;
public class DayOfWeek {
	private static String getDay(String str) {
		try {
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		Date date=dateFormat.parse(str);
		SimpleDateFormat dayFormat=new SimpleDateFormat("EEEE");
		return dayFormat.format(date);
		}
		catch(Exception e) {
			return "invalid";
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String day=getDay(str);
		System.out.println(day);
	}

}
