package Hello;

public interface EmpWageBuilderInterface {
	
	public void addCompanyEmpWage(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month);
	public void computeEmpWage();
	public int calculateEmpWage( CompanyEmpWage obj);

}
