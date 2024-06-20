package DDRelectronicManagement;
import java.util.Map;
import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class BatteryMain {
	private Map<String,Integer>batteryNameMap=new HashMap<>();
	
	public Map<String, Integer> getBatteryNameMap() {
		return batteryNameMap;
	}

	public void setBatteryNameMap(Map<String, Integer> batteryNameMap) {
		this.batteryNameMap = batteryNameMap;
	}
	
	public float findWattPowerBasedOnBatteryName(String batteryName) {
		float list=0;
		for(Map.Entry<String,Integer>entry:batteryNameMap.entrySet()) {
			String s=entry.getKey();
			if(s.equalsIgnoreCase(batteryName)) {
				list=entry.getValue();
			}
		}
		if(list>0) {
			return list;
		}
		else {
			return -1;
		}
	}
	public List<String>findHighestWattBatteries(){
		List<String>batteries=new ArrayList<>();
		int maxBattery=Collections.max(batteryNameMap.values());
		for(Map.Entry<String,Integer>entry:batteryNameMap.entrySet()) {
			if(entry.getValue()==maxBattery) {
				batteries.add(entry.getKey());
			}
		}
		return batteries;
	}
	public static void main(String[] args) {
		Map<String,Integer>map=new HashMap<>();
		List<String>list1=new ArrayList<>();
		BatteryMain batteryMain=new BatteryMain();
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
