public class MyStack{
	
	//Attributes
	
	public StudentInfo top;
	public int numInStack = 0;
	
	//Methods
	
	public void push(StudentInfo student) {
		if(top == null) {
			top = student;
		} else {
			student.next = top;
			top = student;
		}
		numInStack++;
	}
	
	public void displayStack() {
		if(top == null) {
			System.out.println("The stack is empty");
		}
		else {
			System.out.println("The stack contents from top to bottom are:");
			StudentInfo tempStudent = top;
			for(int i = 0; i < numInStack; i++) {
				System.out.println("    " + tempStudent.studentNumber + ": " + tempStudent.firstName + " " + tempStudent.lastName);
				tempStudent = tempStudent.next;
			}
		}
		
	}
	
	public StudentInfo pop() {
		if(top == null) {
			return null;
		} else {
			StudentInfo poppedStudent = top;
			top = top.next;
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