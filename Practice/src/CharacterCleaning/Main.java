package CharacterCleaning;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		System.out.println("Enter a characterele");
	char character =sc.next().charAt(0);
		System.out.println(UserMainCode.removeCharacter(str,character));
		sc.close();
	}

}
