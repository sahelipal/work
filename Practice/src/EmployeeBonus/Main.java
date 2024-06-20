package EmployeeBonus;

import java.util.*;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		HashMap<Integer,String>dob=new LinkedHashMap<>();
		HashMap<Integer,Integer>sal=new LinkedHashMap<>();
		System.out.println("Enter the number of employee:");
		int n =sc.nextInt();
		for(int i=0;i<n;i++) {
			int id = sc.nextInt();
			dob.put(id,sc.next());
			sal.put(id,sc.nextInt());
			
		}
		TreeMap<Integer,Integer>res=UserMainCode.calculateRevisedSalary(dob,sal);
		Set<Integer>keys=res.keySet();
		for(Integer key:keys) {
			System.out.println(key);
			System.out.println(res.get(key));
		}
	}

}
