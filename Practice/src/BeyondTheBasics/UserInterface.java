package BeyondTheBasics;
import java.util.*;
class Insurance{
	private String policyNumber;
	private String insuranceProvider;
	private double coverageAmount;
	private String coverageType;
	private int durationinYears;
	
	public String getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getInsuranceProvider() {
		return insuranceProvider;
	}
	public void setInsuranceProvider(String insuranceProvider) {
		this.insuranceProvider = insuranceProvider;
	}
	public double getCoverageAmount() {
		return coverageAmount;
	}
	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}
	public String getCoverageType() {
		return coverageType;
	}
	public void setCoverageType(String coverageType) {
		this.coverageType = coverageType;
	}
	public int getDurationinYears() {
		return durationinYears;
	}
	public void setDurationinYears(int durationinYears) {
		this.durationinYears = durationinYears;
	}
	public Insurance(String policyNumber, String insuranceProvider, double coverageAmount, String coverageType,
			int durationinYears) {
		super();
		this.policyNumber = policyNumber;
		this.insuranceProvider = insuranceProvider;
		this.coverageAmount = coverageAmount;
		this.coverageType = coverageType;
		this.durationinYears = durationinYears;
	}
	public double calculateMaturityAmount() {
		if(durationinYears<=0||coverageAmount<=0) {
			return-1;
		}
		else {
			
				double maturityAmount=coverageAmount;
				for(int i=0;i<durationinYears;i++) 
				{
				maturityAmount+=(maturityAmount*0.05);
				}
				return maturityAmount;
		}
	}
	
	
}
public class UserInterface {
	public static Insurance extractDetails(String insuranceDetails) {
		String[] details=insuranceDetails.split(":");
		//Insurance insurance =new Insurance();
		if(details.length==5) {
			return new Insurance(details[0],details[1],Double.parseDouble(details[2]),details[3],Integer.parseInt(details[4]));
			
		}
		else {
			return null;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the details");
		String insuranceDetails=sc.nextLine();
		//Insurance insurance = new Insurance()
		Insurance insurance =extractDetails(insuranceDetails);
		double maturityAmount=insurance.calculateMaturityAmount();
		if(maturityAmount<0) {
			System.out.println("Invalid Input");
		}
		else {
		System.out.println("Policy Number:"+insurance.getPolicyNumber());
		System.out.println("Insurance Provider:"+insurance.getInsuranceProvider());
		System.out.println("Coverage Amount:"+insurance.getCoverageAmount());
		System.out.println("Coverage Type:"+insurance.getCoverageType());
		System.out.println("Duration in Years:"+insurance.getDurationinYears());
	
		System.out.println("Maturity Amount:"+insurance.calculateMaturityAmount());
		}
		
	}	

}
