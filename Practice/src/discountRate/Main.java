package discountRate;
import java.util.*;

import EmployeeBonus.UserMainCode;
public class Main {

	public static void main(String[] args) {
		HashMap<String,String>dor=new HashMap<>();
		HashMap<String,Integer>amount=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of records");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			String id=sc.next();
			dor.put(id,sc.next());
			amount.put(id, sc.nextInt());
		}
		ArrayList<String>res=UserMain.calculateDiscount(dor,amount);
		Collections.sort(res);
		for(String key:res) {
			System.out.println(key);
			
		}
		
	}

}
