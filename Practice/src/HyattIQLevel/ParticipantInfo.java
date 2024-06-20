package HyattIQLevel;
import java.util.*;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class ParticipantInfo {
	private Map<String,Integer>participantMap = new HashMap<>();
	
	public Map<String, Integer> getParticipantMap() {
		return participantMap;
	}

	public void setParticipantMap(Map<String, Integer> participantMap) {
		this.participantMap = participantMap;
	}
	public int findTheIQLevelforGivenParticipantName(String participantName) 
	{
		int n=0;
		for(Map.Entry<String,Integer>entry:participantMap.entrySet()) {
			String str=entry.getKey();
			
			if(participantName.equalsIgnoreCase(str)) {
				
				 n=entry.getValue();
			}
		}
		if(n>0) {
			return n;
		}
		else {
			return -1;
		}

	}
	public List<String> findTheHighestIQLevel(){
		List<String>winners=new ArrayList<>();
		int maxIQ=Collections.max(participantMap.values());
		for(Map.Entry<String,Integer>entry:participantMap.entrySet()) {
			if(entry.getValue()==maxIQ) {
				maxIQ=entry.getValue();
				winners.add(entry.getKey());
			}
		}
		return winners;
	}
	public static void main(String[] args) {
		ParticipantInfo pi = new ParticipantInfo();
		Scanner sc = new Scanner(System.in); 
		Map<String,Integer> participantMap = new HashMap<>();
		System.out.println("Enter number of records to be added:");
		int num = sc.nextInt();
		String[] records = new String[num]; 
		System.out.println("Enter the participant records(Participant name: IQ level)");
		sc.nextLine();
		for(int i =0;i<num;i++) {
			records[i]=sc.nextLine();
		}
		for(int i=0;i<records.length;i++) {
			String[] keyValue = records[i].split(":");
			String key = keyValue[0];
			int value = Integer.parseInt(keyValue[1]);
			participantMap.put(key, value);
		}
		pi.setParticipantMap(participantMap);

		System.out.println("Enter the participant's name to be searched");
		String search = sc.nextLine();
		int iqSearch = pi.findTheIQLevelforGivenParticipantName(search);
		System.out.println(iqSearch);
		System.out.println("Participant name with the highest IQ level are");
		List<String> highest = pi.findTheHighestIQLevel();
		for(String s:highest) {
			System.out.println(s);
		}
		


	}

	}


