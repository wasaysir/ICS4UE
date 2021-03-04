/*
 * Muhammad Wasay Saeed
 * ICS4UO
 * MyStack program.
 * 24/02/2021
 */

public class MyStack{
	
	//Attributes
	
	public StudentInfo top;
	public int numInStack = 0;
	
	//Methods
	
	public void push(StudentInfo studentInput) {
		if(top == null) {
			top = studentInput; //Sets top as student parameter
		} else {
			//Sets student parameter's next student as top student and then makes the top student the student parameter.
			studentInput.next = top;
			top = studentInput; 
		}
		numInStack++;
	}
	
	public void displayStack() {
		if(top == null) {
			//Prints if Stack is null
			System.out.println("The stack is empty");
		}
		else {
			System.out.println("The stack contents from top to bottom are:");
			StudentInfo tempStudent = top; //Temporary iterable variable storing the value of Student as it goes through the Stack
			for(int i = 0; i < numInStack; i++) {
				System.out.println("    " + tempStudent.studentNumber + ": " + tempStudent.firstName + " " + tempStudent.lastName); //Prints Current Student's information
				tempStudent = tempStudent.next; //Sets value to next Student
			}
		}
		
	}
	
	public StudentInfo pop() {
		if(top == null) {
			return null; //Returns null if nothing in Stack
		} else {
			StudentInfo poppedStudent = top;
			top = top.next; //Removes top from the Stack by replacing it with the next Student in line.
			numInStack--;
			return poppedStudent; 
		}
	}
	
	public StudentInfo peek() {
		if(top == null) {
			return null;
		} else {
			return top;
		}
	}
}