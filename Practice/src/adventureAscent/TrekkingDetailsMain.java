package adventureAscent;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
public class TrekkingDetailsMain {
	private Map<String,Integer>detailsMap;
	
	
	public Map<String, Integer> getDetailsMap() {
		return detailsMap;
	}


	public void setDetailsMap(Map<String, Integer> detailsMap) {
		this.detailsMap = detailsMap;
	}
	
	public int findCountOfMountainsBasedOnThePeakPoint(int minimumPeak,int maximumPeak) 
	{
		int count=0;
		for(Map.Entry<String,Integer>entries:detailsMap.entrySet()) {
			if(entries.getValue()>=minimumPeak && entries.getValue()<=maximumPeak) {
				count++;
			}
		}
		if(count==0) {
			return -1;
		}else {
			return count;
		}
	}
	public List<String> findMountainBasedonPeakPoint(int peakPoint){
				List<String>res=new ArrayList<>();
	{
		for(Map.Entry<String,Integer>entries:detailsMap.entrySet()) 
		{
			if(entries.getValue()<=peakPoint) {
				res.add(entries.getKey());
			}
		}
	return res;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
