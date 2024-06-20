package recruitmentWorld;
import java.util.*;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
public class RecruitmentOfficeMain {
	private Map<String,String>recruitmentMap;
	
	public Map<String, String> getRecruitmentMap() {
		return recruitmentMap;
	}

	public void setRecruitmentMap(Map<String, String> recruitmentMap) {
		this.recruitmentMap = recruitmentMap;
	}
	
	public int findCountOfRecruitmentBasedOnTheOffice(String officeName)
	{
		int count=0;
		for(Map.Entry<String,String>entries:recruitmentMap.entrySet()) 
		{
			if(officeName.equalsIgnoreCase(entries.getValue())) {
				count++;
			}
		}
		if(count>0) {
			return count;
		}else {
			return -1;
		}
	}
	public List<String>findRecruitmentIdsBasedOnTheOfficeName(String officeName){
		List<String>ids=new ArrayList<>();
		for(Map.Entry<String,String>entries:recruitmentMap.entrySet()) 
		{
			if(officeName.equalsIgnoreCase(entries.getValue())) {
				ids.add(entries.getKey());
			}
		}
		return ids;
	}
	public static void main(String[] args)
	{
		Map<String,String>map=new HashMap<>();
		List<String>list1=new ArrayList<>();
		RecruitmentOfficeMain rm=new RecruitmentOfficeMain();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of record");
		int n=sc.nextInt();
		System.out.println("Enter the records");
		
		
		String []records=new String[n];
		for(int i=0;i<n;i++) 
		{
			records[i]=sc.next();
		}
		for(String s:records) 
		{
			String[]record=s.split(":");
			map.put(record[0],record[1]);
			rm.setRecruitmentMap(map);
		}
		System.out.println("Enter the office name to be searched");
		String officeName=sc.next();
		int count=rm.findCountOfRecruitmentBasedOnTheOffice(officeName);
		if(count==0||count<0) 
		{
			System.out.println("no recruitment ids wre found for "+officeName);
		}else {
			System.out.println("recruitment ids based on"+officeName+"are"+count);
		}
		
		System.out.println("enter office name to show recruitment ids");
		String str1=sc.next();
		list1=rm.findRecruitmentIdsBasedOnTheOfficeName(str1);
		if(list1.size()>=1&&list1!=null)
		{
			for(String str:list1) 
			{
				
				System.out.println(str);
			}
		}
		else 
		{
			System.out.println("no ids are found");
		}
	}
}

