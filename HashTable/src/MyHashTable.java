import java.util.*;

public class MyHashTable {

	// ATTRIBUTES
	// buckets is an array of Arraylists that hold references to StudentInfo objects.
	
	public ArrayList<EmployeeInfo>[] buckets;
	
	@SuppressWarnings("unchecked")
	public MyHashTable(int numBuckets) {
		//Makes a hash table (open hashing/closed addressing) as an array, with length numBuckets, of Arraylists.
		
		//Creates array of Arraylists.
		buckets = new ArrayList[numBuckets];
		
		//Instantiates ArrayList for each element in array.
		for (int i = 0; i < numBuckets; i++) {
			buckets[i] = new ArrayList<EmployeeInfo>();
		}
		
	}
	
	// METHODS
	
	public int hashFunction(int employeeNumber) {
		return (employeeNumber % buckets.length); //Student number modulo number of buckets
	}
	
	public void addToTable(EmployeeInfo currentEmployee) {
		if(currentEmployee != null) {
			int employeeBucket = hashFunction(currentEmployee.empNumber);
			buckets[employeeBucket].add(currentEmployee);
			return;
		}
	}
	
	public EmployeeInfo removeFromTable(int employeeNumber) {
		int employeeBucket = hashFunction(employeeNumber);
		for(int i = 0; i < buckets[employeeBucket].size(); i++) {
			if(buckets[employeeBucket].get(i).empNumber == employeeNumber) {
				return buckets[employeeBucket].remove(i);
			}
		}
		System.out.println("Employee not in table");
		return null;
	}
	
	public EmployeeInfo getFromTable(int employeeNumber) {
		int employeeBucket = hashFunction(employeeNumber);
		for(int i = 0; i < buckets[employeeBucket].size(); i++) {
			if(buckets[employeeBucket].get(i).empNumber == employeeNumber) {
				return buckets[employeeBucket].get(i);
			}
		}
		System.out.println("Employee not in table");
		return null;
	}
	
	public boolean isInTable(int employeeNumber) {
		if(getFromTable(employeeNumber) == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void displayTable() {
		EmployeeInfo currentEmployee;
		for(int i = 0; i < buckets.length; i++) {
			System.out.println("Contents for bucket " + i);
			if (buckets[i].size() == 0) {
				System.out.println("   No items in this bucket");
			} else {
				for (int j = 0; j < buckets[i].size(); j++) {
					currentEmployee = buckets[i].get(j);
					System.out.println("   " + currentEmployee.empNumber + ": " + currentEmployee.firstName + " " + currentEmployee.lastName);
				}
			}
		}
	}
}
