
public class MyLL {

	public StudentInfo frontOfList;
	public int numInList = 0;
	
	public void displayList() {
		if(numInList == 0) {
			System.out.println("THE LIST IS EMPTY!");
			return;
		}
		StudentInfo tempStudent = frontOfList;
		System.out.println("Here is the list as it is currently:");
		for(int i = 0; i < numInList; i++) {
			System.out.println(tempStudent.firstName + " " + tempStudent.lastName + " " + tempStudent.studentNumber);
			tempStudent = tempStudent.next;
		}
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
	
	public void addToFront(StudentInfo itemToAdd) {
		if(numInList == 0) {
			itemToAdd.next = null;
			frontOfList = itemToAdd;
			numInList++;
			return;
		} else {
			itemToAdd.next = frontOfList;
			frontOfList = itemToAdd;
			numInList++;
			return;
		}
	}
	
	public StudentInfo removeFromFront() {
		if(numInList == 0) {
			return null;
		} else {
			StudentInfo tempStudent = frontOfList;
			frontOfList = tempStudent.next;
			numInList--;
			return tempStudent;
		}
	}
	
	public StudentInfo removeFromBack() {
		if(numInList == 0) {
			return null;
		} else {
			StudentInfo tempStudent = frontOfList;
			for(int i = 1; i < numInList - 1; i++) {
				tempStudent = tempStudent.next;
			}
			StudentInfo returnStudent = tempStudent.next;
			tempStudent.setNext(null);
			numInList--;
			return returnStudent;
		}
	}
	
	public StudentInfo removeFromList(int listNum) {
		if(listNum > numInList) {
			return null;
		} else {
			StudentInfo tempStudent = frontOfList;
			for(int i = 1; i < listNum - 1; i++) {
				tempStudent = tempStudent.next;
			}
			StudentInfo returnStudent = tempStudent.next;
			tempStudent.setNext(returnStudent.next);
			numInList--;
			return returnStudent;
		}
	}
	
	public StudentInfo getItemInList(int item) {
		if(item > numInList) {
			return null;
		} else {
			StudentInfo tempStudent = frontOfList;
			for(int i = 0; i < item; i++) {
				tempStudent = tempStudent.next;
			}
			return tempStudent;
		}
	}
	
}
