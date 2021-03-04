
public class TestHashTable {

	public static void main(String[] args) {
		MyHashTable theHT = new MyHashTable(10);
		
		StudentInfo someStudent;
		StudentInfo removedStudent;
		
		someStudent = (new StudentInfo(5, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(12, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(26, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(33, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(42, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(55, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(66, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(78, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(18, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		theHT.displayTable();
		
		System.out.println(theHT.getFromTable(26).firstName);
		
		removedStudent = theHT.removeFromTable(66);
		
		theHT.displayTable();
		
		System.out.println(theHT.getFromTable(66));
		
		System.out.println(theHT.isInTable(42));
		
		System.out.println(theHT.isInTable(34));
		
	}
	
}
