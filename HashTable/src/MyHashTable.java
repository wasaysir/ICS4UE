import java.util.*;

public class MyHashTable {

	// ATTRIBUTES
	// buckets is an array of Arraylists that hold references to StudentInfo objects.
	
	public ArrayList<StudentInfo>[] buckets;
	
	@SuppressWarnings("unchecked")
	public MyHashTable(int numBuckets) {
		//Makes a hash table (open hashing/closed addressing) as an array, with length numBuckets, of Arraylists.
		
		//Creates array of Arraylists.
		buckets = new ArrayList[numBuckets];
		
		//Instantiates ArrayList for each element in array.
		for (int i = 0; i < numBuckets; i++) {
			buckets[i] = new ArrayList<StudentInfo>();
		}
		
	}
	
	// METHODS
	
	public int hashFunction(int studentNumber) {
		return (studentNumber % buckets.length); //Student number modulo number of buckets
	}
	
	public void addToTable(StudentInfo currentStudent) {
		if(currentStudent != null) {
			int studentBucket = hashFunction(currentStudent.studentNumber);
			buckets[studentBucket].add(currentStudent);
			return;
		}
	}
	
	public StudentInfo removeFromTable(int studentNumber) {
		int studentBucket = hashFunction(studentNumber);
		for(int i = 0; i < buckets[studentBucket].size(); i++) {
			if(buckets[studentBucket].get(i).studentNumber == studentNumber) {
				return buckets[studentBucket].remove(i);
			}
		}
		System.out.println("Student not in table");
		return null;
	}
	
	public StudentInfo getFromTable(int studentNumber) {
		int studentBucket = hashFunction(studentNumber);
		for(int i = 0; i < buckets[studentBucket].size(); i++) {
			if(buckets[studentBucket].get(i).studentNumber == studentNumber) {
				return buckets[studentBucket].get(i);
			}
		}
		System.out.println("Student not in table");
		return null;
	}
	
	public boolean isInTable(int studentNumber) {
		if(getFromTable(studentNumber) == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void displayTable() {
		StudentInfo currentStudent;
		for(int i = 0; i < buckets.length; i++) {
			System.out.println("Contents for bucket " + i);
			if (buckets[i].size() == 0) {
				System.out.println("   No items in this bucket");
			} else {
				for (int j = 0; j < buckets[i].size(); j++) {
					currentStudent = buckets[i].get(j);
					System.out.println("   " + currentStudent.studentNumber + ": " + currentStudent.firstName + " " + currentStudent.lastName);
				}
			}
		}
	}
}
