/*
 * Muhammad Wasay Saeed
 * ICS4UO
 * TestStackQueue program.
 * 24/02/2021
 */

public class TestStackQueue {

	public static void main(String[] args) {

		MyStack theS = new MyStack();
		MyQueue theQ = new MyQueue();
		
		
		StudentInfo someStudent;
		StudentInfo removedStudent;
		
		
// STACK
		System.out.println("\n\nTESTING THE STACK STUFF");
		
		//Testing Stack Functions with empty stack
		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
		theS.peek();
		theS.pop();
		
		//Adding 100 items to stack
		for(int i = 0; i < 100; i++) {
			theS.push(new StudentInfo(i, Integer.toString(i), Integer.toString(i)));
		}
		
		//Testing Display function
		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
		
		//Testing peek function
		theS.peek();
		
		//Testing pop function
		removedStudent = theS.pop();
		if (removedStudent == null) {
			System.out.println("\npopped item is null");
		}
		else {
			System.out.println("\npopped item is " + removedStudent.firstName);
			System.out.println("attribute next has value " + removedStudent.next);
		}
		
		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
		
// QUEUE
		System.out.println("\n\nTESTING THE QUEUE STUFF");
		
		//Testing Queue Functions with empty queue
		System.out.println("\nAbout to display the queue (top to bottom)!");
		theQ.displayQueue();
		theQ.dequeue();
	
		//Adding 100 items to queue
		for(int i = 0; i < 100; i++) {
			theQ.enqueue(new StudentInfo(i, Integer.toString(i), Integer.toString(i)));
		}
		
		//Testing Display function
		System.out.println("\nAbout to display the queue (top to bottom)!");
		theQ.displayQueue();
		
		
		//Testing dequeue function
		removedStudent = theQ.dequeue();
		if (removedStudent == null) {
			System.out.println("\npopped item is null");
		}
		else {
			System.out.println("\npopped item is " + removedStudent.firstName);
			System.out.println("attribute next has value " + removedStudent.next);
		}
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		


	}  // end main

}

