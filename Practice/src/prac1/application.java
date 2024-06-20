package prac1;
import java.util.*;


public class application {
	public static Prac extractDetails(String details) {
		String [] d=details.split(":");
		if(d.length==5) {
			return new Prac(d[0],d[1],Double.parseDouble(d[2]),d[3],Integer.parseInt(d[4]));
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the details");
		String insuranceDetails=sc.nextLine();
		//Insurance insurance = new Insurance()
		Prac insurance =extractDetails(insuranceDetails);
		double maturityAmount=insurance.calculateMaturityAmount();
		if(maturityAmount<0) {
			System.out.println("Invalid Input");
		}
		else {
		System.out.println("Policy Number:"+insurance.getPolicyNumber());
		System.out.println("Insurance Provider:"+insurance.getInsuranceProvider());
		System.out.println("Coverage Amount:"+insurance.getCoverageAmount());
		System.out.println("Coverage Type:"+insurance.getCoverageType());
		System.out.println("Duration in Years:"+insurance.getDurationInYears());
	
		System.out.println("Maturity Amount:"+insurance.calculateMaturityAmount());
		
		}
	}

}
 class Prac{
	private String policyNumber;
	private String insuranceProvider;
	private double coverageAmount;
	private String coverageType;
	private int durationInYears;
	
	public void  setPolicyNumber(String policyNumber) {
		this.policyNumber=policyNumber;
	}
	public String getPolicyNumber() {
		return policyNumber;
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
	public int getDurationInYears() {
		return durationInYears;
	}
	public void setDurationInYears(int durationInYears) {
		this.durationInYears = durationInYears;
	}
	
	public Prac(String policyNumber,String insuranceProvider,double coverageAmount,String coverageType,int durationInYears) {
		this.policyNumber=policyNumber;
		this.insuranceProvider = insuranceProvider;
		this.coverageAmount = coverageAmount;
		this.coverageType = coverageType;
		this.durationInYears = durationInYears;
				
	}
	public double calculateMaturityAmount() {
		double maturityAmount=coverageAmount;
		if(durationInYears<=0||coverageAmount<0) {
			return -1;
		}
		else {
//			double maturityAmount=coverageAmount;
			for(int i=1;i<=durationInYears;i++) {
				maturityAmount=maturityAmount+(maturityAmount*0.05);
			
			}
			
			
		}
		return maturityAmount;
		
	}
}
