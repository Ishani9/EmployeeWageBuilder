public class EmployeeWageBuilder {
	//Global constants
	static final int PART_TIME = 1;
	static final int FULL_TIME = 2;
	String COMPANY;
	int WAGE_PER_HR;
	int MAX_DAYS;
	int MAX_HRS;
	
	public EmployeeWageBuilder(String COMPANY, int WAGE_PER_HR, int MAX_DAYS, int MAX_HRS) {
		this.COMPANY = COMPANY;
		this.WAGE_PER_HR = WAGE_PER_HR;
		this.MAX_DAYS = MAX_DAYS;
		this.MAX_DAYS = MAX_DAYS;
		this.MAX_HRS = MAX_HRS;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome To Employee Wage Calculator");
		
		EmployeeWageBuilder obj1 = new EmployeeWageBuilder("DMart", 20, 2, 10);
		EmployeeWageBuilder obj2 = new EmployeeWageBuilder("Reliance", 10, 4, 20);
		
		int wageForDMart = obj1.calculateEmpWage("DMart", 20, 2, 10);
		System.out.println("Total Employee Wage for company "+ obj1.COMPANY + " is: " +wageForDMart);
		
		int wageForReliance = obj2.calculateEmpWage("Reliance", 10, 4, 20);
		System.out.println("Total Employee Wage for company "+ obj2.COMPANY + " is: " +wageForReliance);
				
	}
	
	
	//Method to calculate employee wage
	public int calculateEmpWage(String name, int emp_wage_per_hr,int max_working_days,int max_hrs_in_month) {
		//variables
		COMPANY = name;
		int empHrs = 0;
		int total_empHrs = 0;
		int total_working_days = 0;
		int total_empWage = 0;
		
		//computation
		while(total_empHrs <= max_hrs_in_month && total_working_days < max_working_days) {
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
		
		if(total_empHrs >= max_hrs_in_month)
			total_empHrs = max_hrs_in_month;															
		
		total_empWage = total_empHrs * emp_wage_per_hr;
		return total_empWage;
				
	}
	
	
}