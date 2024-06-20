package discountRate;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class UserMain {
	public static ArrayList<String>calculateDiscount(HashMap<String,String>hm1,HashMap<String,Integer>hm2)
	{
	
		ArrayList<String>list1=new ArrayList<>();
		double dis=0;
		for(Map.Entry<String,String>entries:hm1.entrySet())
		{
		
		
				int tranAmount=hm2.get(entries.getKey());
				String [] arr=entries.getValue().split("-");
				
				
				LocalDate date1=LocalDate.of(2015,01,01);
				LocalDate date2=LocalDate.of(Integer.parseInt(arr[2]),Integer.parseInt(arr[1]),Integer.parseInt(arr[0]));
				Period period=Period.between(date2,date1);	
				int years=period.getYears();
				
				
				if(tranAmount>=20000&& years>=5) {
					  dis=tranAmount*(0.2);
				}
				if(tranAmount>=20000&& years<5) {
					  dis=tranAmount*(0.1);
				}
				if(tranAmount<20000&& years>=5) {
					  dis=tranAmount*(0.15);
				}
				if(tranAmount<20000&& years<5) {
					  dis=tranAmount*(0.05);
				}
				list1.add(entries.getKey()+":"+(int)dis);
			}
			return list1;
			
			
		}
	}

