
public class TestHashTable {

	public static void main(String[] args) {
		MyHashTable theHT = new MyHashTable(10);
		
		FTE someFTE;
		PTE somePTE;
		EmployeeInfo removedEmp;
		
		//Adds 10 students to the hash table
		someFTE = (new FTE(556532, "Abraham", "Lincoln", 60000.0, 12.0));
		theHT.addToTable(someFTE);
		
		someFTE = (new FTE(789546, "George", "Washington", 75000.0, 12.0));
		theHT.addToTable(someFTE);
		
		someFTE = (new FTE(485623, "Barack", "Obama", 54000.0, 7.5));
		theHT.addToTable(someFTE);
		
		somePTE = (new PTE(259648, "Lyndon", "Johnson", 7.5, 15, 34, 48));
		theHT.addToTable(somePTE);
		
		//Prints Table
		System.out.println("Printing Hash Table:");
		theHT.displayTable();
		
		removedEmp = theHT.removeFromTable(789546);
		if(removedEmp == null) {
			System.out.println("That employee is not in the table");
		} else {
			System.out.println("Removed employee" + removedEmp.empNumber);
			if(removedEmp instanceof FTE) {
				removedEmp = (FTE) removedEmp;
			}
		}
		
		//Retrieving removed student number 66 from table, should print "Not in Table"
		System.out.println("Retrieving SN 66 from table, should print 'Student not in Table' and null");
		System.out.println("   " + theHT.getFromTable(785634));
		
		//Retrieving removed student number 66 from table, should print "Barack"
		System.out.println("Retrieving SN 66 from table, should print 'Barack");
		System.out.println("   " + theHT.getFromTable(485623).firstName);
		
		//Retrieving student number 42, should say True
		System.out.println("Determining if SN 42 is in table, should print 'true'");
		System.out.println("   " + theHT.isInTable(556532));
		
		//Retrieving student number 34, should say False
		System.out.println("Determining if SN 34 is in table, should print 'false'");
		System.out.println("   " + theHT.isInTable(123546));
		
		
		//Retrieving Part Time Employee Gross Income
		System.out.println("Determining Part Time Employee Income");
		System.out.println("   " + somePTE.calcAnnualGrossIncome());
		
	}
	
}
