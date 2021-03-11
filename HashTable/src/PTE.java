
public class PTE extends EmployeeInfo{

	//Attributes
	
	private double hourlyWage;
	private double hoursPerWeek;
	private double weeksPerYear;
	
	//Constructors
	
	public PTE(int eN, String fName, String lName, double deductRate, double wage, double hours, double weeks) {
		super(eN, fName, lName, deductRate);
		hourlyWage = wage;
		hoursPerWeek = hours;
		weeksPerYear = weeks;
	}
	
	public PTE(int eN, String fName, String lName, int gend, int workLocation, double deductRate, double wage, double hours, double weeks) {
		super(eN, fName, lName, gend, workLocation, deductRate);
		hourlyWage = wage;
		hoursPerWeek = hours;
		weeksPerYear = weeks;
	}
	
	public double calcAnnualGrossIncome() {
		return (hourlyWage * hoursPerWeek * weeksPerYear);
	}
	
	public double calcAnnualNetIncome() {
		return (calcAnnualGrossIncome() * (1 - deductionsRate));
	}
	
}
