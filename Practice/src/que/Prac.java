package que;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class Prac {
	private Map<String,Double>eqMap=new HashMap<>();
	
	public Map<String, Double> getEqMap() {
		return eqMap;
	}

	public void setEqMap(Map<String, Double> eqMap) {
		this.eqMap = eqMap;
	}
	public int findcountQuakes(double lMag,double hMag) {
		int c=0;
		for(Map.Entry<String,Double>entries:eqMap.entrySet()) {
			if(entries.getValue()>=lMag&& entries.getValue()<=hMag) {
				c++;
			}
		}
		if(c>0) {
			return c;
		}else {
			return -1;
		}
	}
	public List<String> findAboveMax(){
		List<String>list=new ArrayList<>();
		for(Map.Entry<String,Double>entries:eqMap.entrySet()) {
			if(entries.getValue()>9) {
				list.add(entries.getKey());
			}
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 
		Prac obj=new Prac();
		Map<String,Double>map=new HashMap<>();
		
		System.out.println("enter the no of records");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the records");
		for(int i=0;i<n;i++) {
			String s=sc.nextLine();
			String []sd=s.split(":");
			map.put(sd[0],Double.parseDouble(sd[1]));
		}
		obj.setEqMap(map);
		System.out.println("enter the limits");
		double low=sc.nextDouble();
		double high=sc.nextDouble();
		int count=obj.findcountQuakes(low,high);
		if(count>=1) {
			System.out.println("number of quakes"+count);
		}else {
			System.out.println("no quakes found");
		}
		List<String>list1=obj.findAboveMax();
		if(list1.size()>=0) {
			System.out.println("quakes are");
			for(String i:list1) {
				System.out.println(i);
			}
		}else {
			System.out.println("no quakes found");
		}
		
		
	}

}
