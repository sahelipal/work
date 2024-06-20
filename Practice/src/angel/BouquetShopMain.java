package angel;
import java.util.*;

import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class BouquetShopMain {
	private Map<String,Integer>orderMap;
	
	public Map<String, Integer> getOrderMap() {
		return orderMap;
	}

	public void setOrderMap(Map<String, Integer> orderMap) {
		this.orderMap = orderMap;
	}
	
	public int findTotalCount(int startCount,int endCount) {
		int sum=0;
		for(Map.Entry<String,Integer>entries:orderMap.entrySet()) {
		if(entries.getValue()>=startCount && entries.getValue()<=endCount) {
			sum=sum+entries.getValue();
		}
		}
		if(sum>0) {
			return sum;
		}
		else {
			return -1;
		}
	}
	public List<String>findOrderId()
	{
		List<String>list=new ArrayList<>();
		for(Map.Entry<String,Integer>entries:orderMap.entrySet()) {
			if(entries.getValue()>=500) {
				list.add(entries.getKey());
			}
		}
		return list;
	}
	
	public static void main(String[] args) {

			// TODO Auto-generated method stub
			BouquetShopMain bouquet = new BouquetShopMain();
			List<String> list = new ArrayList<String>();
			Map<String,Integer> map = new HashMap<String,Integer>();
			Scanner sc =new Scanner(System.in); 
			System.out.println("Enter number of orders to be added");
			int n = sc.nextInt();
			System.out.println("Enter the orders(Order Id: Bouquet count)");
			String[] orderDetails = new String[n];
			for(int i=0;i<n;i++) {
				orderDetails[i] = sc.next();
			}
			for(int i=0;i<orderDetails.length;i++) {
				String[] a = orderDetails[i].split(":");
				map.put((a[0]), Integer.parseInt(a[1]));
				bouquet.setOrderMap(map);
			}
	 
			System.out.println("Enter the start and end count");
			int start = sc.nextInt();
			int end = sc.nextInt();
			int count = bouquet.findTotalCount(start, end);
			if(count>0) {
				System.out.println("The total count of bouquets are "+count);
			}else {
				System.out.println("No bouquents were found");
			}
			list = bouquet.findOrderId();
			if(list.size()>=1) {
				System.out.println("Order Id based on the bouquet count are ");
				for(String s:list) {
					System.out.println(s);
				}
			}else {
				System.out.println("No Order Id were found");
			}
		}
	}


