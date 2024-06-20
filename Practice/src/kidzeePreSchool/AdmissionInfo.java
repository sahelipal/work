package kidzeePreSchool;

public class AdmissionInfo {
	private String admissionNumber;
	private String childName;
	private String programName;
	private double programFee;
	private double admissionFee;
	public String getAdmissionNumber() {
		return admissionNumber;
	}
	public void setAdmissionNumber(String admissionNumber) {
		this.admissionNumber = admissionNumber;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	public String getProgramName() {
		return programName;
	}
	public void setProgramName(String programName) {
		this.programName = programName;
	}
	public double getProgramFee() {
		return programFee;
	}
	public void setProgramFee(double programFee) {
		this.programFee = programFee;
	}
	public double getAdmissionFee() {
		return admissionFee;
	}
	public void setAdmissionFee(double admissionFee) {
		this.admissionFee = admissionFee;
	}
	public AdmissionInfo(String admissionNumber, String childName, String programName, double programFee,
			double admissionFee) {
		super();
		this.admissionNumber = admissionNumber;
		this.childName = childName;
		this.programName = programName;
		this.programFee = programFee;
		this.admissionFee = admissionFee;
	}
	
	public double calculateTotalFee() {
		double totalfee=0;
		if(programFee<=0) {
			return -1;
		}
		if(!(programName.equalsIgnoreCase("Play group")||programName.equalsIgnoreCase("Junior")||programName.equalsIgnoreCase("Senior"))) 
		{
			return -1;
		}
		if(programName.equalsIgnoreCase("Play group")) {
			this.programFee=this.programFee-((this.programFee*10)/100);
			totalfee=this.programFee+getAdmissionFee();
			
		}
		else if(programName.equalsIgnoreCase("Junior")) {
			this.programFee=this.programFee-((this.programFee*15)/100);
			totalfee=this.programFee+admissionFee;
		}
		else if(programName.equalsIgnoreCase("Senior")) {
			this.programFee=this.programFee-((this.programFee*20)/100);
			totalfee=this.programFee+admissionFee;
		}
	
		//setProgramFee( this.programFee);
		return totalfee;
	}
	
}
