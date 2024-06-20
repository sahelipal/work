package flex;

public class EmployeeInfo {
	private String employeeId;
	private String employeeName;
	private String jobName;
	private int yearsOfExperience;
	private int workedHours;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	public void setYearsOfExperience(int yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	public int getWorkedHours() {
		return workedHours;
	}
	public void setWorkedHours(int workedHours) {
		this.workedHours = workedHours;
	}
	public EmployeeInfo(String employeeId, String employeeName, String jobName, int yearsOfExperience,
			int workedHours) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.jobName = jobName;
		this.yearsOfExperience = yearsOfExperience;
		this.workedHours = workedHours;
	}
	
	public double calculateSalary() 
	{
		double salary=0;
		if(yearsOfExperience<0||workedHours<0) {
			return 0;
		}
		else if(jobName.equalsIgnoreCase("Video Editor"))
		{
			if(yearsOfExperience<=2) {
				salary=(workedHours*15)+(workedHours*15*0.1);
			}
			if(yearsOfExperience<=5) {
				salary=(workedHours*15)+(workedHours*15*0.25);
			}
			if(yearsOfExperience<=6) {
				salary=(workedHours*15)+(workedHours*15*0.4);
			}
		}
		else if(jobName.equalsIgnoreCase("Teaching Assistant")) 
		{
				if(yearsOfExperience<=2) {
					salary=(workedHours*50)+(workedHours*50*0.1);
				}
				if(yearsOfExperience<=5) {
					salary=(workedHours*50)+(workedHours*50*0.25);
				}
				if(yearsOfExperience<=6) {
					salary=(workedHours*50)+(workedHours*50*0.4);
				}
			}
		else if(jobName.equalsIgnoreCase("Telecalling Executive")) 
		{
			if(yearsOfExperience<=2) {
				salary=(workedHours*25)+(workedHours*25*0.1);
			}
			if(yearsOfExperience<=5) {
				salary=(workedHours*25)+(workedHours*25*0.25);
			}
			if(yearsOfExperience<=6) {
				salary=(workedHours*25)+(workedHours*25*0.4);
			}
		}
			
		
		return salary;
	}
}
