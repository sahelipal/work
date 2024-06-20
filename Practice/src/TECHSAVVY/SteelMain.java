package TECHSAVVY;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
public class SteelMain {
	private Map<String,String>steelMap=new HashMap<>();
	
	public Map<String, String> getSteelMap() {
		return steelMap;
	}

	public void setSteelMap(Map<String, String> steelMap) {
		this.steelMap = steelMap;
	}
	
	public int findCountOfOrderIdsBasedOnTheSteelType(String steelType) 
	{
		int c=0;
		for(Map.Entry<String,String>entries:steelMap.entrySet()) {
			if(steelType.equalsIgnoreCase(entries.getValue())) {
				c++;
				
			}
		}
		if(c>0) {
			return c;
		}else {
			return -1;
		}
	
	}
	List<String>orderid=new ArrayList<>();
	public List<String> findOrderIdsBasedOnTheSteelType(String steelType)
	{
		for(Map.Entry<String,String>entries:steelMap.entrySet()) 
		{
			if(steelType.equalsIgnoreCase(entries.getValue()))
			{
			
				orderid.add(entries.getKey());
			}
			
		}
		return orderid;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SteelMain steelMain=new SteelMain();
		List<String>list1=new ArrayList<>();
		Map<String,String>map=new HashMap<>();
		System.out.println("Enter the number of records");
		int n=sc.nextInt();
		System.out.println("ENTER THE RECORDS");
		
		String [] records=new String[n];
		for(int i=0;i<n;i++) {
			records[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			String[]record=records[i].split(":");
			map.put(record[0],record[1]);
			steelMain.setSteelMap(map);
			
		}
		System.out.println("ENTER THE STEEL TYPE TO BE SEARCHED");
		String steelType=sc.next();
		int count=steelMain.findCountOfOrderIdsBasedOnTheSteelType(steelType);
		if(count<0) {
			System.out.println("not found");
		}else {
		System.out.println("THE ORDERIDS BASED ON "+steelType+" are "+count);
		}
		System.out.println("ENTER THE STEELTYPE TO IDDENTIFY THE ORDERIDS");
		String steelType1=sc.next();
		list1=steelMain.findOrderIdsBasedOnTheSteelType(steelType1);
		if(list1!=null&&list1.size()>=1) {
			System.out.print("ORDER IDS BASED ON THE"+steelType+"are: ");
			for(String str:list1) {
				
				System.out.println(str);
			}
		}
		else {
			System.out.println("not found id");
		}
		}

}
