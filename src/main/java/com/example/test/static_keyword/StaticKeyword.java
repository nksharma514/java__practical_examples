package com.example.test.static_keyword;

public class StaticKeyword {

	public static void main(String[] args) {
		
		
		Student s1 = new Student(11, "Naren");
		Student s2 = new Student(22, "Raju");
		
		s1.disply();
		s2.disply();
		
		
		

	}

}

class Student{			// Class with Student Name
	int id;					// Instant Variable
	String name;
	static String college = "IETE";		// Static Variable (it will be same for all and memory takes only once)
	
	// constructor
	
	Student(int i, String n){
		
		id = i;
		name = n;
		
	}
		
	// method to display the values
		
	void disply() {
		System.out.println(id +" " + name + " " + college);
	}
		
			
}