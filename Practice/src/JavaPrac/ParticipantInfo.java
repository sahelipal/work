package JavaPrac;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import java.util.Map;
public class ParticipantInfo {
	private Map<String,Integer>participantMap=new HashMap<>();
	
	public Map<String, Integer> getParticipantMap() {
		return participantMap;
	}

	public void setParticipantMap(Map<String, Integer> participantMap) {
		this.participantMap = participantMap;
	}
  
	
	public int findTheTimeTakenByTheParticipant(String participantName) 
	{
		int list=0;
	   		for(Map.Entry<String,Integer>entry:participantMap.entrySet()) 
	   		{
	   			
	   			String s=entry.getKey();
	   			if(s.equalsIgnoreCase(participantName.toLowerCase())) {
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
	
	
	public List<String> findTheParticipantWithTheShortestTime(){
			List<String>winners=new ArrayList<>();
			int minTime=Collections.min(participantMap.values());
		for(Map.Entry<String,Integer>entry:participantMap.entrySet()){
			if(entry.getValue().equals(minTime)) {
				winners.add(entry.getKey());
			}
		}
			return winners;
	}
	public static void main(String[] args) {
		// TODO Auto-generated Value()method stub

	}

}
