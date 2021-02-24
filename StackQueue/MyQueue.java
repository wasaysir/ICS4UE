public class MyQueue{
	
	//Attributes
	
	public StudentInfo front;
	public int numInQueue = 0;
	
	//Methods
	
	public void enqueue(StudentInfo student) {
		if(numInQueue == 0) {
			student.next = null;
			front = student;
			numInQueue++;
			return;
		} else {
			StudentInfo tempStudent = front;
			for(int i = 1; i < numInQueue; i++) {
				tempStudent = tempStudent.next;
			}
			tempStudent.setNext(student);
			numInQueue++;
			return;
		}
	}
	
	public void displayQueue() {
		if(front == null) {
			System.out.println("The queue is empty!");
		}
		else {
			StudentInfo tempStudent = front;
			for(int i = 0; i < numInQueue; i++) {
				System.out.println(tempStudent.firstName + " " + tempStudent.lastName + ": " + tempStudent.studentNumber);
				tempStudent = tempStudent.next;
			}
		}
	}
	
	public StudentInfo dequeue() {
		if(front == null) {
			return null;
		} else {
			StudentInfo tempStudent = front;
			front = tempStudent.next;
			numInQueue--;
			return tempStudent;
		}
	}
	
}