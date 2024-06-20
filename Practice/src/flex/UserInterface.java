package flex;
import java.util.*;
public class UserInterface {
	public static EmployeeInfo extractDetails(String employeeDetails) {
		String [] details=employeeDetails.split(":");
		if(details.length==5) {
			return new EmployeeInfo(details[0],details[1],details[2],Integer.parseInt(details[3]),Integer.parseInt(details[4]));
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Employee details");
		String employeeDetails=sc.nextLine();
		EmployeeInfo ei=extractDetails(employeeDetails);
		double salary=ei.calculateSalary();
		if(salary<=0) {
			System.out.println("invalid employee details");
		}
		else {
		System.out.println("id: "+ei.getEmployeeId());
		System.out.println("name: "+ei.getEmployeeName());
		System.out.println("job name: "+ei.getJobName());
		System.out.println("years of experience: "+ei.getYearsOfExperience());
		System.out.println("worked hours: "+ei.getWorkedHours());
		System.out.println("salary amount: $"+salary);
		}
		
	}

}
