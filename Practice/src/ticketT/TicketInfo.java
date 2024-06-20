package ticketT;

public class TicketInfo {
	
		private String pasengerName  ;
		private int noOfTickets  ;
		private String seatType  ;
		private String mobileNumber;
		private String insurance ;
		public String getPasengerName() {
			return pasengerName;
		}
		public void setPasengerName(String pasengerName) {
			this.pasengerName = pasengerName;
		}
		public int getNoOfTickets() {
			return noOfTickets;
		}
		public void setNoOfTickets(int noOfTickets) {
			this.noOfTickets = noOfTickets;
		}
		public String getSeatType() {
			return seatType;
		}
		public void setSeatType(String seatType) {
			this.seatType = seatType;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getInsurance() {
			return insurance;
		}
		public void setInsurance(String insurance) {
			this.insurance = insurance;
		}
		public TicketInfo(String pasengerName, int noOfTickets, String seatType, String mobileNumber, String insurance) {
			super();
			this.pasengerName = pasengerName;
			this.noOfTickets = noOfTickets;
			this.seatType = seatType;
			this.mobileNumber = mobileNumber;
			this.insurance = insurance;
		}
		public TicketInfo() {
			super();
		}

		public double getTicketCost(String seatType) {
			double ticketCost=0;
			if(seatType.equalsIgnoreCase("Sleeper")) {
				ticketCost=2200+2200*0.05+2200*0.045;
			}
			else if(seatType.equalsIgnoreCase("General")) {
				ticketCost=1700+1700*0.04+1700*0.045;
			}
			else if(seatType.equalsIgnoreCase("Unreserved")) {
				ticketCost=200;
			}
			else {
				return -1;
			}
			return ticketCost;
		}
		public double getTotalBookingCost()  {
			
			if(getTicketCost(seatType)==-1) {
				return -1;
			}
			if(insurance.equalsIgnoreCase("yes")) {
				return noOfTickets*49+getTicketCost(seatType);
			}
			else if(insurance.equalsIgnoreCase("no")) {
				return noOfTickets*getTicketCost(seatType);
			}
			else {
				return -1;
			}
			
		}
	
}
