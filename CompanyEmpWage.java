package Hello;

public class CompanyEmpWage {
	public final String COMPANY;
	public final int PER_HR_WAGE;
	public final int MAX_WORK_DAYS;
	public final int MAX_HRS;
	public int totalEmpWage;
	
	public CompanyEmpWage(String COMPANY, int PER_HR_WAGE, int MAX_WORK_DAYS, int MAX_HRS) {
		this.COMPANY = COMPANY;
		this.PER_HR_WAGE = PER_HR_WAGE;
		this.MAX_WORK_DAYS = MAX_WORK_DAYS;
		this.MAX_HRS = MAX_HRS;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	public String toString() {
		return "Total Emp Wage for company '"+COMPANY+"' is : "+totalEmpWage;
	}
}
