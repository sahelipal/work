package employee;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.time.LocalDate;
public class UserMain {
	public TreeMap<Integer,Integer> calculateRevisedSalary(HashMap<Integer,String>hm1,HashMap<Integer,Integer>hm2){
		
		TreeMap<Integer,Integer>map=new TreeMap<>();
		for(Map.Entry<Integer,String>entries:hm1.entrySet()) {
			int id=entries.getKey();
			String dob=entries.getValue();
			int sal=hm2.get(id);
			
			
			String[]d=dob.split("-");
			
			LocalDate date1=LocalDate.of(2014,9,01);
			LocalDate date2=LocalDate.of(Integer.parseInt(d[2]),Integer.parseInt(d[1]),Integer.parseInt(d[0]));
			Period period=Period.between(date2, date1);
			int age=period.getYears();
			int bonus=0;
			if(age>=25 &&age<=30) {
				 bonus=(int)(sal*0.2);
				 map.put(id,sal+bonus);
			}
			if(age>=31 &&age<=60) {
				 bonus=(int)(sal*0.3);
				 map.put(id,sal+bonus);
			}
			
		}
		return map;
	}
	
	
	
}
