package Prac2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Collections;


public class Application {
private Map<String,Integer>batteryNameMap=new HashMap<>();
	
	public Map<String, Integer> getBatteryNameMap() {
		return batteryNameMap;
	}

	public void setBatteryNameMap(Map<String, Integer> batteryNameMap) {
		this.batteryNameMap = batteryNameMap;
	}
	
	
	
public float findWattPowerBasedOnBatteryName(String batteryName) {
	float watt=0;
	for(Map.Entry<String,Integer>entries:batteryNameMap.entrySet()) {
		if(batteryName.equalsIgnoreCase(entries.getKey())) {
			watt=entries.getValue();
		}
	}
	if(watt>0) {
		return watt;
	}
	else {
		return -1;
	}
}

public List<String>findHighestWattBatteries(){
	List<String>list=new ArrayList<>();
	int maxwatt=Collections.max(batteryNameMap.values());
	for(Map.Entry<String,Integer>entries:batteryNameMap.entrySet()) {
		if(entries.getValue()==maxwatt) {
			list.add(entries.getKey());
		}
	}
	return list;
}
	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<>();
		List<String>list1=new ArrayList<>();
		Application batteryMain=new Application();
		Scanner sc=new Scanner(System.in);
		System.out.println("no of records");
		int n=sc.nextInt();
		System.out.println("entry the records");
		String[] records=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			records[i]=sc.nextLine();	
		}
		
		for(int i=0;i<records.length;i++) {
				String[]record=records[i].split(":");
				map.put(record[0],Integer.parseInt(record[1]));
				batteryMain.setBatteryNameMap(map);
				
			}
		System.out.println("enter the battery name needs to be searched");
		String batteryName=sc.nextLine();
		int watt=(int)batteryMain.findWattPowerBasedOnBatteryName(batteryName); 
		if(watt>0) {
		System.out.println("power is: "+watt);
		}else {
			System.out.println(batteryName+" is an invalid battery name");
		}
		list1=batteryMain.findHighestWattBatteries();
		if(list1!=null&&list1.size()>0) {
			System.out.println("highest power");
			for(String str:list1) {
				System.out.println(str);
			}
		}else {
			System.out.println("not found");
		}

	}

}
