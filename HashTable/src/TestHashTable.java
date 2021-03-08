
public class TestHashTable {

	public static void main(String[] args) {
		MyHashTable theHT = new MyHashTable(10);
		
		StudentInfo someStudent;
		StudentInfo removedStudent;
		
		//Adds 10 students to the hash table
		someStudent = (new StudentInfo(5, "Abraham", "Lincoln"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(12, "Donald", "Trump"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(26, "Barack", "Obama"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(33, "Ronald", "Reagan"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(42, "George", "Washington"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(55, "George", "Bush"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(66, "Richard", "Nixon"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(78, "Woodrow", "Wilson"));
		theHT.addToTable(someStudent);
		
		someStudent = (new StudentInfo(18, "Andrew", "Garfield"));
		theHT.addToTable(someStudent);
		
		//Prints Table
		System.out.println("Printing Hash Table:");
		theHT.displayTable();
		
		//Gets student with SN 26, should be "Barack"
		System.out.println("Printing first name of student with SN 26, should be 'Barack'");
		System.out.println(theHT.getFromTable(26).firstName);
		
		//Removes student with SN 66, should be Richard Nixon
		removedStudent = theHT.removeFromTable(66);
		System.out.println("Printing first name of student with SN 66, removed from table, should be Richard");
		System.out.println(removedStudent.firstName);
		
		System.out.println("Printing Hash Table");
		theHT.displayTable(); //Should not have Richard Nixon in this table
		
		//Retrieving removed student number 66 from table, should print "Not in Table"
		System.out.println("Retrieving SN 66 from table, should print 'Student not in Table' and null");
		System.out.println(theHT.getFromTable(66));
		
		//Retrieving student number 42, should say True
		System.out.println("Determining if SN 42 is in table, should print 'true'");
		System.out.println(theHT.isInTable(42));
		
		//Retrieving student number 34, should say False
		System.out.println("Determining if SN 34 is in table, should print 'false'");
		System.out.println(theHT.isInTable(34));
		
	}
	
}
