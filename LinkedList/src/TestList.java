
public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyLL theLL = new MyLL();
		
		for(int i = 0; i < 100; i++) {
				theLL.addToRear(new StudentInfo(i, Integer.toString(i), Integer.toString(i)));
		}
		
		StudentInfo zeroethStudent = new StudentInfo(69696969, "Wasay", "Saeed");
		theLL.addToFront(zeroethStudent);
		
		theLL.displayList();
		
		/*
		System.out.println(theLL.frontOfList.getStudentNumber());
		System.out.println(theLL.getItemInList(23).getStudentNumber());
		theLL.displayList();
		*/
		
		theLL.removeFromList(7);
		theLL.displayList();
		
		theLL.removeFromFront();
		theLL.displayList();
		
		theLL.removeFromBack();
		theLL.displayList();
		}

}