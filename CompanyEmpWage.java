package Hello;

import java.util.*;

public class CompanyEmpWage {
	public final String COMPANY;
	public final int PER_HR_WAGE;
	public final int MAX_WORK_DAYS;
	public final int MAX_HRS;
	public int totalEmpWage;
	public List<Integer> dailyWages;
	
	public CompanyEmpWage(String COMPANY, int PER_HR_WAGE, int MAX_WORK_DAYS, int MAX_HRS) {
		this.COMPANY = COMPANY;
		this.PER_HR_WAGE = PER_HR_WAGE;
		this.MAX_WORK_DAYS = MAX_WORK_DAYS;
		this.MAX_HRS = MAX_HRS;
		dailyWages = new ArrayList<Integer>();
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	public void setDailyEmpWage(List<Integer> dailyWages) {
		this.dailyWages = dailyWages;
	}
	
	public String toString() {
		String str1= "Total Emp Wage for company '"+COMPANY+"' is : "+totalEmpWage;
		String str2 = "\nDaily wages : ";
		for(int i = 0; i < dailyWages.size(); i++) {
			str2 = str2 + "\n" + dailyWages.get(i) ;
		}
		String str = str1 + str2;
		
		return str;
	}
}
