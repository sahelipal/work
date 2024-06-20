package sportsClub;
import java.util.Map;
import java.util.List;
import java.util.*;
public class AthleteDetails {
	private Map<Double,String>athleteMap;
	
	public Map<Double, String> getAthleteMap() {
		return athleteMap;
	}

	public void setAthleteMap(Map<Double, String> athleteMap) {
		this.athleteMap = athleteMap;
	}
	public double findTimeTaken(String athleteName) {
		double time=0;
		for(Map.Entry<Double,String>entries:athleteMap.entrySet()) {
			if(entries.getValue().equalsIgnoreCase(athleteName)) {
				time=entries.getKey();
			}
		}
		return time;
	}
	public List<String>findThreeBestPerformers(){
		List<String>list=new ArrayList<>();
		int c=0;
		for(Map.Entry<Double,String>entries:athleteMap.entrySet()) {
			c++;
			if(c<=3) {
				list.add(entries.getValue());
			}
		}
		return list;
		
		
	}
	public static void main(String[] args) {
		AthleteDetails athObj = new AthleteDetails();
	
	Scanner sc = new Scanner(System.in);
	
	Map<Double,String> sMap = new TreeMap<Double,String>();
	
	System.out.println("Enter number of athlete to be added");
	int n = Integer.parseInt(sc.nextLine());
	
	System.out.println("Enter the athlete details(AthleteName: TimeTaken)");
	for(int i=0;i<n;i++) {
	String s = sc.nextLine();
	String[] strArr = s.split(":");
	sMap.put(Double.parseDouble(strArr[0]), strArr[1]);
	}
	athObj.setAthleteMap(sMap);
	System.out.println("Enter the athlete name");
	String name= sc.nextLine();
	if(athObj.findTimeTaken(name) == -1)
	System.out.println("Athlete "+name+" is not available");
	else
		System.out.println("Time taken by "+name + " is "+athObj.findTimeTaken(name));
	
	List<String> topList = athObj.findThreeBestPerformers();
	System.out.println("3 Best performers are");
	for(String s:topList) {
	System.out.println(s);
	}
	}

	}


