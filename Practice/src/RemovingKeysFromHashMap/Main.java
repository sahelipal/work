package RemovingKeysFromHashMap;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("entert the size");
		int size=sc.nextInt();
		System.out.println("enter the elements");
		HashMap<Integer,String>hm=new HashMap<>();
		for(int i=0;i<size;i++) 
		{
			int key=sc.nextInt();
			sc.nextLine();
			String value=sc.nextLine();
			hm.put(key, value);
			
		}
		System.out.println(UserMainCode.sizeOfResultandHashMap(hm));
	}
}
