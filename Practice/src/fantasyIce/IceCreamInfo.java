package fantasyIce;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class IceCreamInfo {
	private Map<String,Integer>IceCreamMap;
	
	
	public Map<String, Integer> getIceCreamMap() {
		return IceCreamMap;
	}


	public void setIceCreamMap(Map<String, Integer> iceCreamMap) {
		IceCreamMap = iceCreamMap;
	}

	public List<String>filterIceCreamForGivenPriceRange(int start,int end){
		List<String>name=new ArrayList<>();
		for(Map.Entry<String,Integer>entries:IceCreamMap.entrySet()) {
			if(entries.getValue()>start && entries.getValue()<end) {
				name.add(entries.getKey());
			}
		}
		return name;
	}
	public Map<String,Integer>findTheCheapestIceCream(){
		Map<String,Integer>cheap=new HashMap<>();
		int cheapest=Collections.min(IceCreamMap.values());
		for(Map.Entry<String,Integer>entries:IceCreamMap.entrySet()) {
			if(entries.getValue()==cheapest) {
				cheap.put(entries.getKey(),entries.getValue());
			}
		}
		return cheap;
	}
	public static void main(String[] args) {
		
		
		
			Scanner sc=new Scanner(System.in);
			IceCreamInfo c=new IceCreamInfo();
			Map<String,Integer> cMap = new HashMap<String,Integer>();
			System.out.println("Enter the number of IceCream details to be added ");
			int n=sc.nextInt();
			System.out.println("Enter the IceCream details(IceCreamName:Price)");
			String [] studentDetails = new String[n];
			for(int i=0;i<n;i++) 
			{
				studentDetails[i] = sc.next();
			}
			for(int i=0;i<studentDetails.length;i++) 
			{
				String[] a = studentDetails[i].split(":");
				cMap.put(a[0], Integer.parseInt(a[1]));
			}
			c.setIceCreamMap(cMap);
			System.out.println("Enter a range to filter the IceCream details.");
			int start=sc.nextInt();
			int end=sc.nextInt();
			List<String> list1=c.filterIceCreamForGivenPriceRange(start,end);
			if(list1.size()>0)
			{
				System.out.println("IceCream available within the price range $."+start+" and $."+end+" are");
				for(int i=0;i<list1.size();i++){
					System.out.println(list1.get(i));
				} 
			}else
			{
				System.out.println("No IceCream available within the price range $."+start+" and $."+end);
			}
			System.out.println("The IceCream with the lowest price is");
			Map<String,Integer> pop=c.findTheCheapestIceCream();
			for(Map.Entry<String,Integer> entry:pop.entrySet())
			{
				System.out.println(entry.getKey()+ " - $."+entry.getValue());
			}
	}

}
