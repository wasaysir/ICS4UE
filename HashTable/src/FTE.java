
public class FTE extends EmployeeInfo{

	//Attributes
	
	private double yearlySalary;
	
	//Constructors
	
	public FTE(int eN, String fName, String lName, double deductRate, double salary) {
		super(eN, fName, lName, deductRate);
		yearlySalary = salary;
	}
	
	public FTE(int eN, String fName, String lName, int gend, int workLocation, double deductRate, double salary) {
		super(eN, fName, lName, gend, workLocation, deductRate);
		yearlySalary = salary;
	}
	
	public double calcAnnualGrossIncome() {
		return yearlySalary;
	}
	
	public double calcAnnualNetIncome() {
		return (calcAnnualGrossIncome() * (1 - deductionsRate));
	}
	
}
