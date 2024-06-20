package RealChampions;
import java.util.*;
import java.util.Map;
public class ParticipantInfo {
	private Map<String,Integer>participantMap=new HashMap<>();
	
	public Map<String, Integer> getParticipantMap() {
		return participantMap;
	}

	public void setParticipantMap(Map<String, Integer> participantMap) {
		this.participantMap = participantMap;
	}
	public int findTheTimeTakenByTheParticipant(String participantName) {
		int time=0;
		for(Map.Entry<String,Integer>entries:participantMap.entrySet()) {
			if(participantName.equalsIgnoreCase(entries.getKey())) {
				time=entries.getValue();
			
			}
		}
		if(time>0) {
			return time;
		}
		else {
			return -1;
		}
	}
	public List<String>finfTheParticipantWithTheShortestTime(){
		List<String>winners=new ArrayList<>();
		int minTime=Collections.min(participantMap.values());
		for(Map.Entry<String,Integer>entries:participantMap.entrySet()) {
			if(minTime==entries.getValue()) {
				minTime=entries.getValue();
				winners.add(entries.getKey());
			}
		}
		return winners;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParticipantInfo participant=new ParticipantInfo();
		List<String>list1=new ArrayList<>();
		Map<String,Integer>map=new HashMap<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of records");
		int n=sc.nextInt();
		System.out.println("Enter the records(ParticipantName:TimeTaken):");
		String[] participantDetails=new String[n];
		sc.nextLine();
		for(int i=0;i<n;i++) {
			participantDetails[i]=sc.nextLine();
		}
		for(int i=0;i<participantDetails.length;i++) {
			String[]a=participantDetails[i].split(":");
			map.put(a[0],Integer.parseInt(a[1]));
			participant.setParticipantMap(map);
			
		}
		System.out.println("Enter the name to be searched");
		String search=sc.nextLine();
		int value=participant.findTheTimeTakenByTheParticipant(search);
		if(value>0) {
			System.out.println(value);
		}
		else {
			System.out.println(search+"INVALID NAME");
		}
		list1=participant.finfTheParticipantWithTheShortestTime();
		System.out.println("Participant name with shortest time");
		for(String str:list1) {
			System.out.println(str);
		}
		
	}

}
