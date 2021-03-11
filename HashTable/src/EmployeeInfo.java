
public class EmployeeInfo {

	// Attributes
	
	public int empNumber;
	public String firstName;
	public String lastName;
	public int gender; // 0 - male | 1 - female | 2 - other
	public int workLocation; // 0 - Mississauga | 1 - Ottawa | 2- Chicago
	double deductionsRate;
	
	
	// Constructors
	
	public EmployeeInfo() {
		empNumber = -1;
		firstName = "Foghorn";
		lastName = "Leghorn";
		gender = -1;
		workLocation = -1;
		deductionsRate = -1.0;
	}
	
	public EmployeeInfo(int eN, String fN, String lN, int gend, int workL, double dedRate) {
		
		empNumber = eN;
		firstName = fN;
		lastName = lN;
		gender = gend;
		workLocation = workL;
		deductionsRate = dedRate;
		
	}
	
	public EmployeeInfo(int eN, String fN, String lN, double dedRate) {
		
		empNumber = eN;
		firstName = fN;
		lastName = lN;
		gender = -1;
		workLocation = -1;
		deductionsRate = dedRate;
		
	}
	
}
