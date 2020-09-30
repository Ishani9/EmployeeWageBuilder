package Hello;

import java.util.*;

public class EmployeeWageBuilder implements EmpWageBuilderInterface{
	//Global constants
	static final int PART_TIME = 1;
	static final int FULL_TIME = 2;
	
	//CREATING ARRAYLIST

	ArrayList<CompanyEmpWage> companyEmpWageList;
	
	
	//CONSTRUCTOR
	public EmployeeWageBuilder() {
		companyEmpWageList = new ArrayList<CompanyEmpWage>();		
	}
	
	//MAIN METHOD
	public static void main (String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		EmpWageBuilderInterface obj1 = new EmployeeWageBuilder();
		obj1.addCompanyEmpWage("DMart", 20, 2, 10);
		obj1.addCompanyEmpWage("Reliance", 10, 4, 20);
	
		obj1.computeEmpWage();
		System.out.println("Total wage for DMart is "+ obj1.getTotalWage("DMart"));
		System.out.println("Total wage for Reliance is "+ obj1.getTotalWage("Reliance"));
	}
	

	public void addCompanyEmpWage(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month) {
		companyEmpWageList.add(new CompanyEmpWage(company, emp_wage_per_hr, max_working_days, max_hrs_in_month));
	}
	
	public void computeEmpWage() {																			
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			companyEmpWageList.get(i).setTotalEmpWage(calculateEmpWage(companyEmpWageList.get(i)));	//CALLING CALCULATE METHOD
			System.out.println(companyEmpWageList.get(i));
		}
	}
	
	
	//Method to calculate employee wage
	public int calculateEmpWage( CompanyEmpWage obj) {
		int empHrs = 0;
		int total_empHrs = 0;
		int total_working_days = 0;
		int totalEmpWage = 0;
		List<Integer> dailyWages = new ArrayList<Integer>();
		
		//computation
		while(total_empHrs <= obj.MAX_HRS && total_working_days < obj.MAX_WORK_DAYS) {
			total_working_days++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			
			switch(empCheck) {
			case PART_TIME:
				empHrs = 8;
				break;
			case FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
				break;
			}
			
			total_empHrs += empHrs;
			System.out.println("Day : "+total_working_days+" Emp Hrs : "+empHrs );
			dailyWages.add(empHrs * obj.PER_HR_WAGE);
		}
		obj.setDailyEmpWage(dailyWages);	
		totalEmpWage = total_empHrs * obj.PER_HR_WAGE;
		return totalEmpWage;				
	}
	
	public int getTotalWage(String companyName) {
		int tWage = 0;
		for(int i = 0; i < companyEmpWageList.size(); i++) {
			if(companyEmpWageList.get(i).COMPANY.equalsIgnoreCase(companyName)) {
				tWage = companyEmpWageList.get(i).totalEmpWage;
			}
		}
		return tWage;
	}
		
}