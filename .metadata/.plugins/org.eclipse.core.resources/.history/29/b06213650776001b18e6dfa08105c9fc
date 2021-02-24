
public class StudentInfo {
	
	// Attributes
	
	public int studentNumber;
	public String firstName;
	public String lastName;
	public double height; //in metres
	public double weight; //in kg
	public StudentInfo next; //pointer to next item in Linked List
	
	
	// Constructors
	
	public StudentInfo() {
		studentNumber = -1;
		firstName = "Foghorn";
		lastName = "Leghorn";
		height = -1.0;
		weight = -1.0;
		next = null;
	}
	
public StudentInfo(int sN, String firstName, String lastName) {
		
		studentNumber = sN;
		this.firstName = firstName;
		this.lastName = lastName;
		height = -1.0;
		weight = -1.0;
		next = null;
		
	}
	
	public StudentInfo(int sN, String firstName, String lastName, double h, double w) {
		
		studentNumber = sN;
		this.firstName = firstName;
		this.lastName = lastName;
		height = h;
		weight = w;
		next = null;
	}
	
	
	// Methods
	
	public int getStudentNumber() {
		return studentNumber;
	}
	
	public void setStudentNumber(int theSN) {
		studentNumber = theSN;
	}
	
	public void setNext(StudentInfo SI) {
		next = SI;
	}
	
	public double calcBMI() {
		double theBMI = weight / (height * height);
		return theBMI;
	}
	
	public void doSomething(String myStr) {
		System.out.println("hi there" + myStr);
	}
	
}
