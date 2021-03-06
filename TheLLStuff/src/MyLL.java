
public class MyLL {
	
	public StudentInfo frontOfList;
	public int numInList;
	
	
	public MyLL() {
		// Make sure the list is empty!
		frontOfList = null;
		numInList = 0;
	}
	
	
	public void addToFront(StudentInfo studentToAdd) {
		
		if (frontOfList == null) {
			// The list is empty!  So make the item the front of the list.
			studentToAdd.next = null; // Should already be null, but do this just in case!
			frontOfList = studentToAdd;
			numInList = 1;
			return;
		}
		
		// If I get to here, then I have at least one item already in the list.
		// Make the studentToAdd point to the current front item.
		// And then make the studentToAdd the new front item.
		studentToAdd.next = frontOfList;
		frontOfList = studentToAdd;
		numInList++;
		return;
		
	}
	
	
	public void addToRear(StudentInfo itemToAdd) {
		if(numInList == 0) {
			itemToAdd.next = null;
			frontOfList = itemToAdd;
			numInList++;
			return;
		} else {
			StudentInfo tempStudent = frontOfList;
			for(int i = 0; i < numInList - 1; i++) {
				tempStudent = tempStudent.next;
			}
			tempStudent.setNext(itemToAdd);
			numInList++;
			return;
		}
	}
	
	
	public void displayList() {
		
		if (frontOfList == null) {
			System.out.println("THE LIST IS EMPTY!");
			return;
		}
		
		// If we get to here, there is at least one item in the list.
		// Walk through the list from front to rear.
		System.out.println("The list contents from front to rear are:");
		StudentInfo currentStudent = frontOfList;
		for (int i = 1; i <= numInList; i++) {
			System.out.println("     " + currentStudent.firstName + " " + currentStudent.lastName);
			currentStudent = currentStudent.next;
		}
		return;
		
	}

}
