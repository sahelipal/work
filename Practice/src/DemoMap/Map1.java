package DemoMap;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Map1 {
	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	Map<Integer,String>hashMap=new HashMap<>();
	System.out.println("ENTER THE NO OF POLICY");
	int num=sc.nextInt();
	sc.nextLine();
	for(int i=1;i<=num;i++) {
		System.out.println("enter the id");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name");
		String name=sc.nextLine();
		
		hashMap.put(id,name);
	}
	TreeMap<Integer,String>sortedMap=new TreeMap<>(hashMap);
	for(Integer key:sortedMap.keySet()) {
		System.out.println(key+":"+sortedMap.get(key));
	}
	sc.close();
	}
}
