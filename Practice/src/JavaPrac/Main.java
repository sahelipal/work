package JavaPrac;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
//		UserMainCode code = new UserMainCode();
		String str=sc.nextLine();
		System.out.println(UserMainCode.compareLastWords(str));
		sc.close();
	}

}
