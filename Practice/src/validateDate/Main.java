package validateDate;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int result=UserMain.validDate(str);
		if(result==1) {
			System.out.println("valid");
		}else {
			System.out.println("not valid");
		}
	}

}
