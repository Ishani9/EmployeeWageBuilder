package Hello;

public class EmployeeWageBuilder {
	//Global constants
	static final int PART_TIME = 1;
	static final int FULL_TIME = 2;
	
	public int num = 0;
	public CompanyEmpWage[] companyEmpWageArray;
	
	
	//CONSTRUCTOR
	public EmployeeWageBuilder() {
		companyEmpWageArray = new CompanyEmpWage[5];
	}
	
	//MAIN METHOD
	public static void main (String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		EmployeeWageBuilder obj1 = new EmployeeWageBuilder();
		obj1.addCompanyEmpWage("DMart", 20, 2, 10);
		obj1.addCompanyEmpWage("Reliance", 10, 4, 20);
	
		obj1.computeEmpWage();			
	}
	
	
	public void addCompanyEmpWage(String company, int emp_wage_per_hr, int max_working_days, int max_hrs_in_month) {
		companyEmpWageArray[num] = new CompanyEmpWage(company, emp_wage_per_hr, max_working_days, max_hrs_in_month);
		num++;
	}
	
	
	public void computeEmpWage() {
		for(int i = 0; i < num; i++) {
			int temp = calculateEmpWage(companyEmpWageArray[i]);
			companyEmpWageArray[i].setTotalEmpWage(temp);
			System.out.println(companyEmpWageArray[i]);
		}
	}
	
	//Method to calculate employee wage
	public int calculateEmpWage( CompanyEmpWage obj) {
		int empHrs = 0;
		int total_empHrs = 0;
		int total_working_days = 0;
		int totalEmpWage = 0;
		
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
		}
			
		totalEmpWage = total_empHrs * obj.PER_HR_WAGE;
		return totalEmpWage;
				
	}
	
	
}