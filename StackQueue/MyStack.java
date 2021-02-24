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
			System.out.println("The list is empty");
		}
		else {
			StudentInfo tempStudent = top;
			for(int i = 0; i < numInStack; i++) {
				System.out.println(tempStudent.firstName + " " + tempStudent.lastName + ": " + tempStudent.studentNumber);
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
		return top;
	}
}