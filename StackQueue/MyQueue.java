/*
 * Muhammad Wasay Saeed
 * ICS4UO
 * MyQueue program.
 * 24/02/2021
 */

public class MyQueue{
	
	//Attributes
	
	public StudentInfo frontOfQueue;
	public int numInQueue = 0;
	
	//Methods
	
	public void enqueue(StudentInfo studentInput) {
		if(numInQueue == 0) {
			
			studentInput.next = null; //Sets student input's next as null (Safety precaution)
			frontOfQueue = studentInput; //Sets student input as front of queue
			numInQueue++;
			return;
			
		} else {
			
			StudentInfo tempStudent = frontOfQueue; //Temporary iterable variable that can go through all of queue
			for(int i = 1; i < numInQueue; i++) { //Iterates until it goes through the last Student in the Queue
				tempStudent = tempStudent.next;
			}
			tempStudent.setNext(studentInput); //Sets student input as the back of the queue.
			numInQueue++;
			return;
			
		}
	}
	
	public void displayQueue() {
		if(frontOfQueue == null) {
			System.out.println("The queue is empty!"); //Prints when queue isn't empty.
		}
		else {
			System.out.println("The queue contents from front to rear are:");
			StudentInfo tempStudent = frontOfQueue; //Temporary iterable variable storing the value of Student as it goes through the Queue
			for(int i = 0; i < numInQueue; i++) {
				System.out.println("    " + tempStudent.studentNumber + ": " + tempStudent.firstName + " " + tempStudent.lastName); //Prints Current Student's information
				tempStudent = tempStudent.next; //Sets value to next Student
			}
		}
	}
	
	public StudentInfo dequeue() {
		if(frontOfQueue == null) {
			return null; //Returns null if Queue has no students.
		} else {
			StudentInfo tempStudent = frontOfQueue;
			frontOfQueue = tempStudent.next; //Removes Student at front of queue
			numInQueue--;
			return tempStudent;
		}
	}
	
}