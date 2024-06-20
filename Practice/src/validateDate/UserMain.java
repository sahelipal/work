package validateDate;
import java.util.Date;
import java.text.SimpleDateFormat;
public class UserMain {
	public static int validDate(String str) {
	String date="^(0?[1-9]|[12]\\d|3?[01])[/](1[0-2]|0?[1-9])[/]\\d{4}$";
	if(str.matches(date)) {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		sdf.setLenient(false);
	try {
		Date d1=sdf.parse(str);
		return 1;
	}
	catch(Exception e) {
		return -1;
	}
	}
	return -1;
}
}