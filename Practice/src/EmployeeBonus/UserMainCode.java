package EmployeeBonus;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class UserMainCode {
	public static TreeMap<Integer,Integer> calculateRevisedSalary(HashMap<Integer,String>hm1,HashMap<Integer,Integer>hm2) 
	{
		Set<Integer>set=hm1.keySet();
		TreeMap<Integer,Integer>map=new TreeMap<>();
		for(int k:set) {
			String dob=hm1.get(k);
			int sal=hm2.get(k);
			String []dates=dob.split("-");
			
			LocalDate date1=LocalDate.of(2014,9,01);
			LocalDate date2=LocalDate.of(Integer.parseInt(dates[2]),Integer.parseInt(dates[1]),Integer.parseInt(dates[0]));
			Period period=Period.between(date2,date1);	
			int age=period.getYears();
			int bonus=0;
			if(age>=25 && age<=30) {
				bonus= (int)(sal*0.2);
				map.put(k, sal+bonus);
			}
			if(age>=31 && age<=60) {
				bonus= (int)(sal*0.3);
				map.put(k, sal+bonus);
			}
			if(sal<5000) {
				
				map.put(k, -100);
			}
			if(age<25 || age>60) {
						
				map.put(k, -200);
			}
			if(sal<5000) {
				if(age<25 || age>60){
				map.put(k, -100);
				}
			}
			
			
		}
		
		return map;
	}
}
