package MalgudiVoyage;

public class TicketInfo {
	private int noOfTickets;
	private String coach;
	private String insurance;
	public int getNoOfTickets() {
		return noOfTickets;
	}
	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}
	public String getCoach() {
		return coach;
	}
	public void setCoach(String coach) {
		this.coach = coach;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public TicketInfo(int noOfTickets, String coach, String insurance) {
		super();
		this.noOfTickets = noOfTickets;
		this.coach = coach;
		this.insurance = insurance;
	}
	public double calculateTicketCost()
	{
		double cost=0;
		if(coach.equals("FirstAC")) {
			cost=noOfTickets*(2200+(2200*5/100)+(2200*4.5/100));
		}
		else if(coach.equals("SecondAC")) {
			cost=noOfTickets*(1700+(1700*5/100)+(1700*4.55/100));
		}
		else if(coach.equals("ThirdAC")) {
			cost=noOfTickets*(1200+(1200*5/100)+(1200*4.55/100));
		}
		else if(coach.equals("Sleeper")) {
			cost=noOfTickets*(520+(520*5/100)+(520*4.55/100));
		}
		else if(coach.equals("Unreserve")) {
			cost=noOfTickets*200;
		}else {
			return -1;
		}
		return cost;
	}
	
}

